while True:
    dividendo = (int(input("Ingresa el numero a dividir (Dividendo): ")))
    aux = dividendo
    cont = 0
    divisor = (int(input("Ingresa el numero por el cual se divide (Divisor): ")))
    if dividendo<0 or divisor<0:
        print("Error: Ingresa numeros positivos")
    elif divisor==0:
        print("Error: No puedes dividir entre 0")
    else:
        break
    
while True:
  aux=aux-divisor
  cont+=1
  if aux < divisor:
    break
  elif aux == divisor:
    cont+=1
    break

print("El resultado de dividir ",dividendo," entre ",divisor," es igual a ",cont)
