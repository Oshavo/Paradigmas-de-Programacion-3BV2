# biblioteca.py
from libro import Libro

class Biblioteca:
    def __init__(self):
        self.libros = []  # Colección de libros

    def agregar_libro(self, libro):
        self.libros.append(libro)

    def buscar_libro_por_isbn(self, isbn):
        for libro in self.libros:
            if libro.isbn == isbn:
                return libro
        return None

    def prestar_libro(self, isbn):
        libro = self.buscar_libro_por_isbn(isbn)
        if libro and libro.estado == "disponible":
            libro.prestar()
            return True
        return False

    def devolver_libro(self, isbn):
        libro = self.buscar_libro_por_isbn(isbn)
        if libro and libro.estado == "prestado":
            libro.devolver()
            return True
        return False

    def mostrar_libros(self):
        for libro in self.libros:
            print(libro)
