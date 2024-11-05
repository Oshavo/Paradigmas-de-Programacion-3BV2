package biblioteca;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menu de Biblioteca ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Mostrar libros");
            System.out.println("3. Prestar libro");
            System.out.println("4. Devolver libro");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el titulo del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Introduce el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Introduce el ISBN del libro: ");
                    String isbn = scanner.nextLine();
                    biblioteca.agregarLibro(new Libro(titulo, autor, isbn));
                    System.out.println("Libro agregado con exito.");
                    break;

                case 2:
                    System.out.println("\n--- Lista de libros en la biblioteca ---");
                    biblioteca.mostrarLibros();
                    break;

                case 3:
                    System.out.print("Introduce el ISBN del libro a prestar: ");
                    String isbnPrestar = scanner.nextLine();
                    if (biblioteca.prestarLibro(isbnPrestar)) {
                        System.out.println("Libro prestado con exito.");
                    } else {
                        System.out.println("El libro no esta disponible para prestamo o no existe.");
                    }
                    break;

                case 4:
                    System.out.print("Introduce el ISBN del libro a devolver: ");
                    String isbnDevolver = scanner.nextLine();
                    if (biblioteca.devolverLibro(isbnDevolver)) {
                        System.out.println("Libro devuelto con exito.");
                    } else {
                        System.out.println("El libro no estaba prestado o no existe.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida, intenta de nuevo.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }
}
