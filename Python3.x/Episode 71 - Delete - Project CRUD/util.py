import initdb

db = initdb.connectDb()
cur = db.cursor()

def getWriters(cur):
    
    sql = "SELECT * FROM writers"
    cur.execute(sql)
    
    return cur

def getBooks(cur):

    sql = "SELECT * FROM books"
    cur.execute(sql)

    return cur

def getCategories(cur):

    sql = "SELECT * FROM categories"
    cur.execute(sql)

    return cur

def showWriter():
    tup = getWriters(cur)

    for i in tup:
        print(f"- {i[1]}")

def showCategories():
    tup = getCategories(cur)

    for i in tup:
        print(f"- {i[1]}")

def showBooks():
    tup = getBooks(cur)

    for i in tup:
        print(f"- {i[1]}")

def addWriter(name:str):

    sql = "INSERT INTO writers(name) VALUES (%s)"

    cur.execute(sql, name)

def addCategory(genre:str):

    sql = "INSERT INTO categories(genre) VALUES (%s)"

    cur.execute(sql, genre)

def addBooks(title:str):

    sql = "INSERT INTO books(title) VALUES (%s)"

    cur.execute(sql, title)

def deleteBooks(book_id:int):
    
    sql = "DELETE FROM books WHERE book_id = (%i)"

    cur.execute(sql, book_id)

def deleteWriters(writer_id:int):
    
    sql = "DELETE FROM writers WHERE writer_id = (%i)"

    cur.execute(sql, writer_id)

def deleteCategories(category_id:int):
    
    sql = "DELETE FROM categories WHERE category_id = (%i)"

    cur.execute(sql, category_id)

def updateBookWriter(book_id:int, writer_id:int):

    tup = [book_id, writer_id]

    sql = """
        UPDATE bookwriter
        SET writer_id = (%s)
        WHERE book_id = (%s)
    """

    cur.execute(sql, tup)

def updateBookCategory(book_id:int, category_id:int):

    tup = [book_id, category_id]

    sql = """
        UPDATE bookcategory
        SET category_id = (%s)
        WHERE book_id = (%s)
    """

    cur.execute(sql, tup)

def getWriterBook(writer_id:int):

    sql = """
        SELECT b.title, c.genre FROM bookwriter bw
        JOIN bookcategory bc ON (bw.book_id = bc.book_id)
        JOIN books b ON (bc.book_id = b.book_id)
        JOIN categories c ON (bc.category_id = c.category_id)
        WHERE bw.writer_id = (%i)
    """

    cur.execute(sql, writer_id)

def getCategoryBook(category_id:int):

    sql = """
        SELECT b.title, w.name FROM bookwriter bw
        JOIN bookcategory bc ON (bw.book_id = bc.book_id)
        JOIN books b ON (bc.book_id = b.book_id)
        JOIN writers w ON (bw.writer_id = w.writer_id)
        WHERE bc.category_id = (%i)
    """

    cur.execute(sql, category_id)

# def addWriter(cur):
    

# def viewBooks(db):
#     cur = db.cursor()

#     cur.execute()

#     cur.close()


# def getWriter(db):
#     ret = None

#     return ret

# def addWriter(db):

#     cur = db.cursor()

#     writer = input("input writer's name: ")

#     sql = "INSERT INTO writers(name) VALUES (%s)"
#     cur.execute(sql, writer)
#     print("Writer is successfully inserted.")

#     sql = "SELECT writers.name FROM writers"
#     cur.execute(sql)
#     for i,x in enumerate(cur):
#         print(f"{i+1}. {x[0]}")
                
#     db.commit()
#     cur.close()


# def addCategory(db):

#     cur = db.cursor()

#     genre = input("input genre: ")

#     sql = "INSERT INTO categories(genre) VALUE (%s)"
#     cur.execute(sql, genre)
#     print("Category is successfully inserted.")

#     sql = "SELECT categories.genre AS Genre FROM categories"
#     cur.execute(sql)
#     for i,x in enumerate(cur):
#         print(f"{i+1}. {x[0]}")

#     db.commit()
#     cur.close()



# def addBook(db):
#     cur = db.cursor()
#     sql = ""

#     writers = []
#     genres = []

#     title = input("input title: ")

#     print("Choose writers:")
#     sql = "SELECT name FROM writers"
#     cur.execute(sql)

#     # choose writers
#     for i, name in enumerate(cur):
#         print(f"{i+1}. {name}")

#     # choose genres
    