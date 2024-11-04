// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Biblioteca ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Mostrar libros");
            System.out.println("3. Prestar libro");
            System.out.println("4. Devolver libro");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Introduce el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Introduce el ISBN del libro: ");
                    String isbn = scanner.nextLine();
                    biblioteca.agregarLibro(new Libro(titulo, autor, isbn));
                    System.out.println("Libro agregado con éxito.");
                    break;

                case 2:
                    System.out.println("\n--- Lista de libros en la biblioteca ---");
                    biblioteca.mostrarLibros();
                    break;

                case 3:
                    System.out.print("Introduce el ISBN del libro a prestar: ");
                    String isbnPrestar = scanner.nextLine();
                    if (biblioteca.prestarLibro(isbnPrestar)) {
                        System.out.println("Libro prestado con éxito.");
                    } else {
                        System.out.println("El libro no está disponible para préstamo o no existe.");
                    }
                    break;

                case 4:
                    System.out.print("Introduce el ISBN del libro a devolver: ");
                    String isbnDevolver = scanner.nextLine();
                    if (biblioteca.devolverLibro(isbnDevolver)) {
                        System.out.println("Libro devuelto con éxito.");
                    } else {
                        System.out.println("El libro no estaba prestado o no existe.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }
}
