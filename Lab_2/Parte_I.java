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
        int horas, s = 0;
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
           normal = (horas-aux)*base;
           s=1;
        }
        total=normal+extra;
        
        System.out.println("El sueldo en las primeras 40 horas es $"+base+" por hora.");
        if(s==1){
            System.out.println("Se trabajaron "+aux+" horas extras.");
        }else{
            System.out.println("No se trabajaron horas extra.");
        }
        System.out.println("El pago normal es: "+normal);
        if(s==1){
            System.out.println("El pago extra es: "+extra);
        }else{
            System.out.println("No hay pago extra.");
        }
        System.out.println("El pago total es: "+total);
        
    }
    
}