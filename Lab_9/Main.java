import java.util.Scanner;

// Excepcion para depositos invalidos
class DepositoInvalidoException extends Exception{
    public DepositoInvalidoException(String mensaje){
        super(mensaje);
    }
}

// Excepcion para retiros invalidos
class RetiroInvalidoException extends Exception{
    public RetiroInvalidoException(String mensaje){
        super(mensaje);
    }
}

// Excepcion para fondos insuficientes
class FondosInsuficientesException extends Exception{
    public FondosInsuficientesException(String mensaje){
        super(mensaje);
    }
}

// Clase Cuenta Bancaria
class cuentaBancaria{
    private String numeroCuenta;
    private double saldo;
    
    public cuentaBancaria(String numeroCuenta, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    public void depositar(double cantidad) throws DepositoInvalidoException{
        if (cantidad<0){
            throw new DepositoInvalidoException("El monto a depositar no puede ser negativo.");
        }
        saldo += cantidad;
    }
    
    public void retirar(double cantidad) throws RetiroInvalidoException, FondosInsuficientesException{
        if (cantidad<0){
            throw new RetiroInvalidoException("El monto a retirar no puede ser negativo.");
        }
        if (cantidad>saldo){
            throw new FondosInsuficientesException("Fondos insuficientes para realizar el retiro.");
        }
        saldo -= cantidad;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public String getnumeroCuenta(){
        return numeroCuenta;
    }
}

// Programa Principal
public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el numero de cuenta: ");
        String num = lector.nextLine();
        System.out.println("Ingrese el saldo inicial: ");
        double saldo = lector.nextDouble();
        
        cuentaBancaria cuenta = new cuentaBancaria(num, saldo);
        boolean s = true;
        
        while(s){
            System.out.println("\n--- Menu ---");
            System.out.println("1. Depositar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opcion: ");
            int opc = lector.nextInt();
            
            try{
                switch(opc){
                    case 1:
                        System.out.println("Ingrese la cantidad a depositar: ");
                        double deposito = lector.nextDouble();
                        cuenta.depositar(deposito);
                        System.out.println("Deposito exitoso. Saldo actual: $"+cuenta.getSaldo());
                        break;
                    case 2:
                        System.out.println("Ingrese la cantidad a retirar: ");
                        double retiro = lector.nextDouble();
                        cuenta.retirar(retiro);
                        System.out.println("Retiro exitoso. Saldo actual: $"+cuenta.getSaldo());
                        break;
                    case 3:
                        System.out.println("Saldo actual: $"+cuenta.getSaldo());
                        break;
                    case 4:
                        s = false;
                        System.out.println("Hasta luego.");
                        break;
                    default:
                        System.out.println("Opcion no valida. Intente de nuevo.");
                }
            } catch (DepositoInvalidoException e){
                System.out.println("Error: "+e.getMessage());
            } catch (RetiroInvalidoException e){
                System.out.println("Error: "+e.getMessage());
            } catch (FondosInsuficientesException e){
                System.out.println("Error: "+e.getMessage());
            }
        }
        
        lector.close();
    }
}