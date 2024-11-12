
import java.util.Scanner;

//Clase base
class Empleado{
    private String nombre;
    private String id;
    private double salarioBase;
    
    public Empleado(String nombre, String id, double salarioBase){
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    
    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }
    
    public double calcularSalario(){
        return salarioBase;
    }
}

//Clase derivada de Empleado
class EmpleadoTiempoCompleto extends Empleado{
    public EmpleadoTiempoCompleto(String nombre, String id, double salarioBase){
        super(nombre, id, salarioBase);
    }
    
    @Override
    public double calcularSalario(){
        return getSalarioBase() * 1.10;
    }
} 

//Clase derivada de Empleado
class EmpleadoMedioTempo extends Empleado{
    public EmpleadoMedioTempo(String nombre, String id, double salarioBase) {
        super(nombre, id, salarioBase);
    }
    
    @Override
    public double calcularSalario(){
        return getSalarioBase() * 0.50;
    }
}

//Clase derivada de Empleado
class EmpleadoPorHoras extends Empleado{
    private int horasTrabajadas;
    private static final double TARIFA_POR_HORA = 15.0;
    
    public EmpleadoPorHoras(String nombre, String id, double salarioBase) {
        super(nombre, id, salarioBase);
    }
    
    public void setHorasTrabajadas(int horas){
        this.horasTrabajadas = horas;
    }
    
    @Override
    public double calcularSalario(){
        return horasTrabajadas * TARIFA_POR_HORA;
    }
}

//Clase principal
public class Main{
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingresa el nombre del empleado de tiempo completo: ");
        String nombre = lector.nextLine();
        System.out.println("Ingresa su id: ");
        String id = lector.nextLine();
        System.out.println("Ingresa su salario base: ");
        double salario = lector.nextDouble();
        lector.nextLine();
        Empleado empleado1 = new EmpleadoTiempoCompleto(nombre, id, salario);
        
        
        System.out.println("\nIngresa el nombre del empleado de medio tiempo: ");
        nombre = lector.nextLine();
        System.out.println("Ingresa su id: ");
        id = lector.nextLine();
        System.out.println("Ingresa su salario base: ");
        salario = lector.nextDouble();
        lector.nextLine();
        Empleado empleado2 = new EmpleadoMedioTempo(nombre, id, salario);
        
        
        System.out.println("\nIngresa el nombre del empleado por horas: ");
        nombre = lector.nextLine();
        System.out.println("Ingresa su id: ");
        id = lector.nextLine();
        System.out.println("Ingresa sus horas trabajadas: ");
        int horas = lector.nextInt();
        EmpleadoPorHoras empleado3 = new EmpleadoPorHoras(nombre, id, 0);
        empleado3.setHorasTrabajadas(horas);
        
        lector.close();

        System.out.println("\nSalario de " + empleado1.getNombre() + ": $" + empleado1.calcularSalario());
        System.out.println("Salario de " + empleado2.getNombre() + ": $" + empleado2.calcularSalario());
        System.out.println("Salario de " + empleado3.getNombre() + ": $" + empleado3.calcularSalario());
    }
}