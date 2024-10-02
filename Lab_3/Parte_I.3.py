while True:
    num = int(input("Ingrese el numero: "))
    if num<=0:
        print("Ingrese un numero válido")
    else:
        break

k=0
s=0
while s==0:
    potencia = (2**k)
    if potencia>num:
        print("La potencia de 2 mas cercana a ",num," es ",(k-1))
        s=1
    k+=1
