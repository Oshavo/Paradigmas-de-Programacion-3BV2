import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Clase Abstracta Vehiculo
abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public abstract void encender();
    public abstract void apagar();
    public abstract void describir();
}

// Subclase Auto
class Auto extends Vehiculo {
    public Auto(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }

    @Override
    public void encender() {
        System.out.println("El auto esta encendiendo.");
    }

    @Override
    public void apagar() {
        System.out.println("El auto se ha apagado.\n");
    }

    @Override
    public void describir() {
        System.out.println("Este es un auto de marca " + marca + ", modelo " + modelo + ", del año " + año + ".");
    }
}

// Subclase Motocicleta
class Motocicleta extends Vehiculo {
    public Motocicleta(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }

    @Override
    public void encender() {
        System.out.println("La motocicleta esta encendiendo.");
    }

    @Override
    public void apagar() {
        System.out.println("La motocicleta se ha apagado.\n");
    }

    @Override
    public void describir() {
        System.out.println("Esta es una motocicleta de marca " + marca + ", modelo " + modelo + ", del año " + año + ".");
    }
}

// Subclase Camion
class Camion extends Vehiculo {
    public Camion(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }

    @Override
    public void encender() {
        System.out.println("El camion esta encendiendo.");
    }

    @Override
    public void apagar() {
        System.out.println("El camion se ha apagado.\n");
    }

    @Override
    public void describir() {
        System.out.println("Este es un camion de marca " + marca + ", modelo " + modelo + ", del año " + año + ".");
    }
}

// Programa Principal
public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        List<Vehiculo> vehiculos = new ArrayList<>();

        while (true) {
            System.out.println("\nSeleccione el tipo de vehiculo a agregar:");
            System.out.println("1. Auto");
            System.out.println("2. Motocicleta");
            System.out.println("3. Camion");
            System.out.println("4. Salir");
            int opcion = lector.nextInt();
            lector.nextLine(); // Limpiar el buffer

            if (opcion == 4) {
                break;
            }

            System.out.print("Ingrese la marca: ");
            String marca = lector.nextLine();
            System.out.print("Ingrese el modelo: ");
            String modelo = lector.nextLine();
            System.out.print("Ingrese el año: ");
            int año = lector.nextInt();
            lector.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    vehiculos.add(new Auto(marca, modelo, año));
                    break;
                case 2:
                    vehiculos.add(new Motocicleta(marca, modelo, año));
                    break;
                case 3:
                    vehiculos.add(new Camion(marca, modelo, año));
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        }

        System.out.println("\n--- Mostrando informacion de los vehiculos ---");
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.encender();
            vehiculo.describir();
            vehiculo.apagar();
        }

        lector.close();
    }
}