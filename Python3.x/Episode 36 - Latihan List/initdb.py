import mysql.connector
import sys

conn = None
cur = None
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

def connCursor():
    cur = conn.cursor()
    
def closeDb():
    cur.close()
    conn.close()