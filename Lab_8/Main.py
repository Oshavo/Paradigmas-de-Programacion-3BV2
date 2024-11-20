from abc import ABC, abstractmethod

# Clase Abstracta Vehiculo
class Vehiculo(ABC):
    def __init__(self, marca, modelo, año):
        self.marca = marca
        self.modelo = modelo
        self.año = año

    @abstractmethod
    def encender(self):
        pass

    @abstractmethod
    def apagar(self):
        pass

    @abstractmethod
    def describir(self):
        pass


# Subclase Auto
class Auto(Vehiculo):
    def encender(self):
        print("El auto esta encendiendo.")

    def apagar(self):
        print("El auto se ha apagado.\n")

    def describir(self):
        print(f"Este es un auto de marca {self.marca}, modelo {self.modelo}, del año {self.año}.")


# Subclase Motocicleta
class Motocicleta(Vehiculo):
    def encender(self):
        print("La motocicleta esta encendiendo.")

    def apagar(self):
        print("La motocicleta se ha apagado.\n")

    def describir(self):
        print(f"Esta es una motocicleta de marca {self.marca}, modelo {self.modelo}, del año {self.año}.")


# Subclase Camion
class Camion(Vehiculo):
    def encender(self):
        print("El camion esta encendiendo.")

    def apagar(self):
        print("El camión se ha apagado.\n")

    def describir(self):
        print(f"Este es un camion de marca {self.marca}, modelo {self.modelo}, del año {self.año}.")


# Programa Principal
def main():
    vehiculos = []

    while True:
        print("\nSeleccione el tipo de vehiculo a agregar:")
        print("1. Auto")
        print("2. Motocicleta")
        print("3. Camion")
        print("4. Salir")

        opcion = int(input("Opcion: "))

        if opcion == 4:
            break

        if opcion not in [1, 2, 3]:
            print("Opcion no valida. Intente nuevamente.")
            continue

        marca = input("Ingrese la marca: ")
        modelo = input("Ingrese el modelo: ")
        año = int(input("Ingrese el año: "))

        if opcion == 1:
            vehiculos.append(Auto(marca, modelo, año))
        elif opcion == 2:
            vehiculos.append(Motocicleta(marca, modelo, año))
        elif opcion == 3:
            vehiculos.append(Camion(marca, modelo, año))

    print("\n--- Mostrando informacion de los vehiculos ---")
    for vehiculo in vehiculos:
        vehiculo.encender()
        vehiculo.describir()
        vehiculo.apagar()

if __name__ == "__main__":
    main()
