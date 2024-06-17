import initdb
import os

def dashboard():
    os.system("cls")
    print("="*20)
    print("BOOKS")
    print("1. add book")
    print("2. list book")
    print("3. update book")
    print("4. delete book")
    print("="*20)
    print("5. authors' books")
    print("="*20)
    print("6. books categories")
    print("="*20)
    print("0. exit\n")

    return userInput()

def userInput():
    n = int
    try:
        n = int(input("Masukkan pilihan anda: "))
    except Exception as e:
        print(e)

    return n


def main():

    db = initdb.connectDb()
    cur = db.cursor()
    userIn = int
    while userIn != 0:
        userIn = dashboard()

        if (userIn == 1):
            pass
        elif (userIn == 2):
            pass
        elif (userIn == 3):
            pass
        elif (userIn == 4):
            pass
        elif (userIn == 5):
            pass
        elif (userIn == 6):
            pass
        elif (userIn == 0):
            break
        else:
            print("Masukkan input yang tersedia!")

        db.commit()

    cur.close()
    db.close()
    return 0

main()