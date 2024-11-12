#Clase base
class Animal:
    def __init__(self, edad):
        self.edad = edad
        self._color = None #Atributo privado

    def hacer_sonido(self):
        print("El animal hace un sonido")

    def comer(self):
        print("El animal esta comiendo")

    def set_color(self, color):
        self._color = color

    def get_color(self):
        return self._color

#Clase derivada
class Perro(Animal):
    def hacer_sonido(self):
        print("El perro ladra")

    def comer(self):
        print("El perro esta comiendo croquetas")

#Clase derivada
class Gato(Animal):
    def hacer_sonido(self):
        print("El gato maulla")

    def comer(self):
        print("El gato esta comiendo pescado")

#Clase derivada
class Pajaro(Animal):
    def hacer_sonido(self):
        print("El pajaro canta")

    def comer(self):
        print("El pajaro esta comiendo alpiste")

#Funcion principal
def main():
    miAnimal = Animal(5)
    miAnimal.hacer_sonido()
    miAnimal.comer()

    miPerro = Perro(7)
    miPerro.hacer_sonido()
    miPerro.comer()
    miPerro.set_color("Marron")
    print("Color del perro: ", miPerro.get_color())

    miGato = Gato(3)
    miGato.hacer_sonido()
    miGato.comer()
    miGato.set_color("Blanco")
    print("Color del gato: ", miGato.get_color())

    miPajaro = Pajaro(1)
    miPajaro.hacer_sonido()
    miPajaro.comer()
    miPajaro.set_color("Amarillo")
    print("Color del pajaro: ", miPajaro.get_color())

if __name__ == "__main__":
    main()
