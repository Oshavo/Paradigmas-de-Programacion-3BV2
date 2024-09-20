package lab2_i;

/**
 *
 * @author escom
 */
import java.util.Scanner;
public class Lab2_I {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aux = 0;
        int horas;
        double base,total;
        double extra=0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresa las horas trabajadas: ");
        horas=lector.nextInt();
        System.out.println("Ingresa el sueldo base: ");
        base=lector.nextDouble();
        
        double normal=horas*base;
        if(horas>40){
           aux = horas-40;
           extra = aux*(base*1.5);
        }
        total=normal+extra;
        
        System.out.println("El sueldo en las primeras 40 horas es $"+base+" por hora.");
        System.out.println("Se trabajaron "+aux+" horas extras.");
        System.out.println("El pago normal es: "+normal);
        System.out.println("El pago extra es: "+extra);
        System.out.println("El pago total es: "+total);
        
    }
    
}