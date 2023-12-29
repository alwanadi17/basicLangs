import mysql.connector
import sys

def connect():
    conn = None
    cur = None

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

        # build cursor
        cur = conn.cursor()

    except mysql.connector.Error:
        print("Error: fail to connect to MySQL server")
        sys.exit(1)

    print("connection success")
