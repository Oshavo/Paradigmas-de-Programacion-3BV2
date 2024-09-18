package lab2;

/**
 *
 * @author escom
 */
import java.util.Scanner;
public class Lab2_II {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int abs, ord;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la coordenada x: ");
        abs = lector.nextInt();
        System.out.println("Ingrese la coordenada y: ");
        ord = lector.nextInt();
        
        if(abs==0 && ord==0){
            System.out.println("El punto con coordenadas ("+abs+","+ord+") se encuentra en el Origen x,y");
        }else if(ord==0){
            System.out.println("El punto con coordenadas ("+abs+","+ord+") se encuentra en el Eje x");
        }else if(abs==0){
            System.out.println("El punto con coordenadas ("+abs+","+ord+") se encuentra en el Eje Y");
        } else if(abs>0){
            if(ord>0){
                System.out.println("El punto con coordenadas ("+abs+","+ord+") se encuentra en el Primer cuadrante");
            } else {
                System.out.println("El punto con coordenadas ("+abs+","+ord+") se encuentra en el Cuarto cuadrante");
            }
        } else if(ord>0){
            System.out.println("El punto con coordenadas ("+abs+","+ord+") se encuentra en el Segundo cuadrante");
        } else {
            System.out.println("El punto con coordenadas ("+abs+","+ord+") se encuentra en el Tercer cuadrante");
        }

    }
    
}
