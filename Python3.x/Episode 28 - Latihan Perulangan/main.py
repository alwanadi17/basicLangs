import math

def main():

    len = int(input("Input panjang ketupat: "))
    if len%2: len += 1
    print()

    for i in range(math.floor(len/2)):
        for k in range(math.floor(len/2)-i-1, 0, -1):
            print(" ", end="")        
        for j in range(len):
            if j <= i*2:
                print("*", end="")
        print()

    len -= 1
    for i in range(math.floor(len/2)):
        for k in range(len):
            if k <= i:
                print(" ", end="")        
        for j in range(len-i, 0, -1):
            if j > i+2:
                print("*", end="")
        print()

    return

if __name__ == "__main__":
    main()
    print()