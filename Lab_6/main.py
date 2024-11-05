# main.py
from biblioteca import Biblioteca
from libro import Libro

biblioteca = Biblioteca()
    
while True:
    print("\n--- Menu de Biblioteca ---")
    print("1. Agregar libro")
    print("2. Mostrar libros")
    print("3. Prestar libro")
    print("4. Devolver libro")
    print("5. Salir")
    opcion = input("Elige una opcion: ")

    if opcion == "1":
        titulo = input("Introduce el titulo del libro: ")
        autor = input("Introduce el autor del libro: ")
        isbn = input("Introduce el ISBN del libro: ")
        biblioteca.agregar_libro(Libro(titulo, autor, isbn))
        print("Libro agregado con exito.")

    elif opcion == "2":
        print("\n--- Lista de libros en la biblioteca ---")
        biblioteca.mostrar_libros()

    elif opcion == "3":
        isbn = input("Introduce el ISBN del libro a prestar: ")
        if biblioteca.prestar_libro(isbn):
            print("Libro prestado con exito.")
        else:
            print("El libro no esta disponible para prestamo o no existe.")

    elif opcion == "4":
        isbn = input("Introduce el ISBN del libro a devolver: ")
        if biblioteca.devolver_libro(isbn):
            print("Libro devuelto con exito.")
        else:
            print("El libro no estaba prestado o no existe.")

    elif opcion == "5":
        print("Saliendo del programa...")
        break

    else:
        print("Opcion no valida, intenta de nuevo.")
