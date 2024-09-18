def main():
    while True:
        # Menú de opciones
        print("1 - Area de un cuadrado")
        print("2 - Area de un rectángulo")
        print("3 - Perímetro de un cuadrado")
        print("4 - Perimetro de un rectángulo")
        print("5 - Area de un triangulo rectángulo")
        print("6 - Salir")
        opcion = int(input("¿Que formula deseas ingresar? "))
       
        if opcion == 6:
            print("Saliendo...")
            break
       
        # Variables para las dimensiones
        base = 0
        altura = 0
       
        if opcion == 1:
            base = float(input("Introduce la longitud del lado del cuadrado: "))
            areaCuadrado = base * base
            print(f"Area del cuadrado: {areaCuadrado * 100} cm²")
       
        elif opcion == 2:
            base = float(input("Introduce la base del rectangulo: "))
            altura = float(input("Introduce la altura del rectangulo: "))
            areaRectangulo = base * altura
            print(f"Area del rectangulo: {areaRectangulo * 100} cm²")
       
        elif opcion == 3:
            base = float(input("Introduce la longitud del lado del cuadrado: "))
            perimetroCuadrado = base * 4
            print(f"Perimetro del cuadrado: {perimetroCuadrado * 100} cm")
       
        elif opcion == 4:
            base = float(input("Introduce la base del rectangulo: "))
            altura = float(input("Introduce la altura del rectangulo: "))
            perimetroRectangulo = (base * 2) + (altura * 2)
            print(f"Perimetro del rectangulo: {perimetroRectangulo * 100} cm")
       
        elif opcion == 5:
            base = float(input("Introduce la base del triangulo: "))
            altura = float(input("Introduce la altura del triangulo: "))
            areaTriangulo = (base * altura) / 2
            print(f"Area del triangulo: {areaTriangulo * 100} cm²")
       
        else:
            print("Opcion invalida, por favor elige una opción entre 1 y 6.")

if __name__ == "__main__":
    main()
