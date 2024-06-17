import mysql.connector
import sys

def connectDb():
    # build connection

    #build conn
    try:
        conn = mysql.connector.connect(
            user = 'py',
            password = 'py',
            host = 'localhost',
            port = 3306,
            database = 'book_list'
        )

    except mysql.connector.Error:
        print("Error: fail to connect to MySQL server")
        sys.exit(1)

    print("connection success")
    return conn

def dashboard():
    print("="*20)
    print("BOOKS")
    print("1. add book")
    print("2. list book")
    print("3. update book")
    print("4. delete book")
    print("0. exit")

def addBook():

    print("="*20)
    print("ADD BOOK")

    bookList = []
    while True:

        title = input("Judul: ")
        author = input("Penulis: ")

        newBook = [title, author]
        bookList.append(newBook)

        for i,book in enumerate(bookList):
            print(f"{i+1}| {book[0]}\t\t\t | {book[1]}")

        isClose = input("Apakah ingin keluar? (y/n): ")
        if isClose == 'y':
            break

    return bookList

def saveBook(bookList, db):
    cur = db.cursor()

    for book in bookList:
        sql = ("INSERT INTO books(title, author) VALUES(%s,%s)")
        val = (book[0], book[1])

        cur.execute(sql, val)

    db.commit()
    viewBook(db)
    cur.close()

def viewBook(db):

    cur = db.cursor()

    cur.execute("SELECT * FROM books")

    for i,book in enumerate(cur):
        print(f"{i+1}| {book[0]}\t | {book[1]}")

    cur.close()

def deleteBook(db):
    viewBook(db)

def userInput():
    n = int
    try:
        n = int(input("Masukkan pilihan anda: "))
    except Exception as e:
        print(e)

    return n

def main():
    db = connectDb()
    userIn = int
    while userIn != 0:
        dashboard()
        userIn = userInput()

        if (userIn == 1):
            saveBook(addBook(), db)
        elif (userIn == 2):
            print()
            print("="*20)
            print("View BOOK")
            viewBook(db)
        elif (userIn == 3):
            pass
        elif (userIn == 4):
            deleteBook(db)
        elif (userIn == 0):
            pass
        else:
            print("Masukkan input yang tersedia!")

    db.close()

if __name__ == '__main__':
    main()
