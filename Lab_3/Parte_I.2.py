abs = int(input("Ingrese la coordenada x: "))
ord = int(input("Ingrese la coordenada y: "))

if abs==0 and ord==0:
    print("El punto con coordenadas (",abs,",",ord,") se encuentra en el Origen")
elif ord==0:
    print("El punto con coordenadas (",abs,",",ord,") se encuentra en el Eje x")
elif abs==0:
    print("El punto con coordenadas (",abs,",",ord,") se encuentra en el Eje y")
elif abs>0:
    if ord>0:
        print("El punto con coordenadas (",abs,",",ord,") se encuentra en el Primer cuadrante")
    else:
        print("El punto con coordenadas (",abs,",",ord,") se encuentra en el Cuarto cuadrante")
elif ord>0:
    print("El punto con coordenadas (",abs,",",ord,") se encuentra en el Segundo cuadrante")
else:
    print("El punto con coordenadas (",abs,",",ord,") se encuentra en el Tercer cuadrante")