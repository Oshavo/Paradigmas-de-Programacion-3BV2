while True:
    fact = 1
    num = (int(input("Ingresa el numero para calcular su factorial: ")))
    if num >=0:
        break
    else:
        print("Error: Ingresa un numero positivo")

for i in range (1, num+1):
    fact = fact * i

print("El factorial de ",num," es ",fact)
