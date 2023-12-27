# temperature convert program
print("Fahrenheit to kelvin")
fahr = float(input("Input temperature in fahrenheit: "))

celc = 5/9*(fahr-32)
kelv = 5/9*(fahr-32)+273
print("Fahrenheit:", fahr)
print("Celcius:", celc)
print("Kelvin:", kelv)

print()
fahr = (9/5*celc)+32
print("Kelvin:", kelv)
print("Fahrenheit:", fahr)