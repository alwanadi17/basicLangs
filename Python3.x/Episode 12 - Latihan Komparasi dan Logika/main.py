def case1():
    print("Case 1: input angka yang berada di antara 0-5 dan 8-11\n")
    a = int(input("input angka: "))

    if a in range(0,6) or a in range(8,12):
        print("angka {} memenuhi syarat\n".format(a))
    else:
        print("angka {} tidak memenuhi syarat".format(a))

    return

def case2():
    print("Case 2: input angka yang tidak berada di antara 0-5 dan 8-11\n")
    a = int(input("input angka: "))

    if a not in range(0,6) and a not in range(8,12):
        print("angka {} memenuhi syarat\n".format(a))
    else:
        print("angka {} tidak memenuhi syarat".format(a))

    return

def main():
    case1()
    case2()

    return

if __name__ == "__main__":
    main()