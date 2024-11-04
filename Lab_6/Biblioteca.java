// Biblioteca.java
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public Libro buscarLibroPorISBN(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public boolean prestarLibro(String isbn) {
        Libro libro = buscarLibroPorISBN(isbn);
        if (libro != null && libro.getEstado().equals("disponible")) {
            libro.prestar();
            return true;
        }
        return false;
    }

    public boolean devolverLibro(String isbn) {
        Libro libro = buscarLibroPorISBN(isbn);
        if (libro != null && libro.getEstado().equals("prestado")) {
            libro.devolver();
            return true;
        }
        return false;
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}
