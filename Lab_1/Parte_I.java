/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parte1;

import java.util.Scanner;

/**
 *
 * @author escom
 */
public class Parte1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            // Menú de opciones
            System.out.println("1 - Area de un cuadrado");
            System.out.println("2 - Area de un rectangulo");
            System.out.println("3 - Perimetro de un cuadrado");
            System.out.println("4 - Perimetro de un rectángulo");
            System.out.println("5 - Area de un triangulo rectangulo");
            System.out.println("6 - Salir");
            System.out.print("¿Que formula deseas ingresar? ");
            
            // Leer la opción del usuario
            opcion = scanner.nextInt();
            
            // Variables para las dimensiones
            float base = 0, altura = 0;
            
            switch (opcion) {
                case 1:
                    System.out.print("Introduce la longitud del lado del cuadrado: ");
                    base = scanner.nextFloat();
                    float areaCuadrado = base * base;
                    System.out.println("Area del cuadrado: " + areaCuadrado*100 + "cm²");
                    break;
                case 2:
                    System.out.print("Introduce la base del rectangulo: ");
                    base = scanner.nextFloat();
                    System.out.print("Introduce la altura del rectangulo: ");
                    altura = scanner.nextFloat();
                    float areaRectangulo = base * altura;
                    System.out.println("Area del rectangulo: " + areaRectangulo*100 + "cm²");
                    break;
                case 3:
                    System.out.print("Introduce la longitud del lado del cuadrado: ");
                    base = scanner.nextFloat();
                    float perimetroCuadrado = base * 4;
                    System.out.println("Perimetro del cuadrado: " + perimetroCuadrado*100 + "cm");
                    break;
                case 4:
                    System.out.print("Introduce la base del rectangulo: ");
                    base = scanner.nextFloat();
                    System.out.print("Introduce la altura del rectangulo: ");
                    altura = scanner.nextFloat();
                    float perimetroRectangulo = (base * 2) + (altura * 2);
                    System.out.println("Perimetro del rectangulo: " + perimetroRectangulo*100 + "cm");
                    break;
                case 5:
                    System.out.print("Introduce la base del triangulo: ");
                    base = scanner.nextFloat();
                    System.out.print("Introduce la altura del triangulo: ");
                    altura = scanner.nextFloat();
                    float areaTriangulo = (base * altura) / 2;
                    System.out.println("Area del triangulo: " + areaTriangulo*100 + "cm²");
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida, por favor elige una opción entre 1 y 6.");
                    break;
            }
            
        } while (opcion != 6);

        
    }
    
}
