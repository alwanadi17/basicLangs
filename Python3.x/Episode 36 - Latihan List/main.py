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

    while True:

        title = input("Judul: ")
        author = input("Penulis: ")

        newBook = [title, author]

        print(f"{title}\t | {author}")

        isClose = input("Apakah ingin simpan dan keluar? (y/n): ")
        if isClose == 'y':
            break

    return newBook

def saveBook(bookList, db):
    cur = db.cursor()

    for book in bookList:
        sql = ("INSERT INTO books(title, author) VALUES (%s, %s)")
        val = (book[0], book[1])

        cur.execute(sql, val)

    db.commit()

    print(cur.rowcount, "record inserted.")
    cur.close()

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
        if (userIn == 2):
            pass
        if (userIn == 3):
            pass
        if (userIn == 4):
            pass

    db.close()

if __name__ == '__main__':
    main()
