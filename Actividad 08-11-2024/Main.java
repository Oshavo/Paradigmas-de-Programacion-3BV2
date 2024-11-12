// Clase base
class Animal{
    protected int edad;
    private String color;
    public Animal (int e){
        edad = e;
    }
    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
    public void comer(){
        System.out.println("El animal esta comiendo");
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
}

// Clase derivada
class Perro extends Animal{
    public Perro(int e){
        super(e);
    }
    public void setEdad (int e){
        edad = e;
    }
    @Override
    public void hacerSonido(){
        System.out.println("El perro ladra");
    }
    @Override
    public void comer(){
        System.out.println("El perro esta comiendo croquetas");
    }
}

//Clase derivada
class Gato extends Animal{
    public Gato(int e){
        super(e);
    }
    public void setEdad (int e){
        edad = e;
    }
    @Override
    public void hacerSonido(){
        System.out.println("El gato maulla");
    }
    @Override
    public void comer(){
        System.out.println("El gato esta comiendo pescado");
    }
}

//Clase derivada
class Pajaro extends Animal{
    public Pajaro(int e){
        super(e);
    }
    public void setEdad (int e){
        edad = e;
    }
    @Override
    public void hacerSonido(){
        System.out.println("El pajaro canta");
    }
    @Override
    public void comer(){
        System.out.println("El pajaro esta comiendo alpiste");
    }
}

public class Main{
    public static void main(String[] args){
        Animal miAnimal = new Animal(5);
        miAnimal.hacerSonido();
        miAnimal.comer();
        
        Perro miPerro = new Perro(7);
        miPerro.hacerSonido();
        miPerro.comer();
        miPerro.setColor("Marron");
        System.out.println("Color del perro: " + miPerro.getColor());
        
        Gato miGato = new Gato(3);
        miGato.hacerSonido();
        miGato.comer();
        miGato.setColor("Blanco");
        System.out.println("Color del gato: " + miGato.getColor());
        
        Pajaro miPajaro = new Pajaro(1);
        miPajaro.hacerSonido();
        miPajaro.comer();
        miPajaro.setColor("Amarillo");
        System.out.println("Color del pajaro " + miPajaro.getColor());
    }
}