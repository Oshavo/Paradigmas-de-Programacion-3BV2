# libro.py
class Libro:
    def __init__(self, titulo, autor, isbn):
        self.titulo = titulo
        self.autor = autor
        self.isbn = isbn
        self.estado = "disponible"  # Estado inicial

    def prestar(self):
        if self.estado == "disponible":
            self.estado = "prestado"

    def devolver(self):
        if self.estado == "prestado":
            self.estado = "disponible"

    def __str__(self):
        return f"Título: {self.titulo}, Autor: {self.autor}, ISBN: {self.isbn}, Estado: {self.estado}"
