def main():

    print("="*30)
    print("Kalkulator sederhana (+-*/)")
    print("="*30)

    a = float(input("Masukkan angka pertama: "))
    op = input("input operator(+-*/):")
    b = float(input("Masukkan angka kedua: "))

    res = float()
    if op == '+':
        res = a+b
    elif op == '-':
        res = a-b
    elif op == '*':
        res = a*b
    elif op == '/':
        res = a/b

    print("{} {} {} = {:.2f}".format(a,op,b,res))

    return

if __name__ == "__main__":
    main()