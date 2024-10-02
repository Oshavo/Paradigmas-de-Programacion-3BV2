aux=0
horas=0
s=0
extra=0
horas = int(input("Ingresa las horas trabajadas: "))
base = float(input("Ingresa el sueldo base: "))

normal = horas*base
if horas>40:
    aux = horas-40
    extra = aux*(base*1.5)
    normal = (horas-aux)*base
    s=1
total=normal+extra

print("El sueldo en las primeras 40 horas es $",base," por hora.")
if s==1:
    print("Se trabajaron ",aux," horas extra.")
else:
    print("No se trabajaron horas extra.")
print("El pago normal es: $",normal)
if s==1:
    print("El pago extra es: $",extra)
else:
    print("No hay pago extra.")
print("El pago total es: $",total)