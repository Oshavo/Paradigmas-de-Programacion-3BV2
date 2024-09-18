package lab2_iii;

/**
 *
 * @author escom
 */
import java.util.Scanner;
import java.math.*;
public class Lab2_III {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        double potencia;
        int n = 0, s=0, k=0;
        Scanner lector = new Scanner(System.in);
        do{
            System.out.println("Ingrese el numero: ");
            num = lector.nextInt();
            if(num<=0){
                System.out.println("Ingrese un numero valido");
            } else {
                n=1;
            }
        } while(n==0);
        
        while(s == 0){
            potencia=Math.pow(2, k);
            if(potencia>num){
                System.out.println("La potencia de 2 mas cercana a "+num+" es "+(k-1));
                s=1;
            }
            k++;
        }
        
    }
    
}
