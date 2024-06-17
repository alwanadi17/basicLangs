import pymysql
import sys

def connectDb():
    conn = None

    try:
        conn = pymysql.connect(
            user = 'py',
            password = 'py',
            host = 'localhost',
            database = 'lib'
        )

    except pymysql.Error:
        print("Error: fail to connect to MySQL server")
        sys.exit(1)

    print("connection success")

    return conn
