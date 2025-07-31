import java.time.LocalDate;
import java.time.Period;

public class Persona {
    //atributos
    String id;
    String nombre;
    String apellido;
    LocalDate fechaNacimiento;
    String genero;

    //constructor
    //Constructor por defecto
    public Persona(){
        System.out.println("Se creo un objeto clase");
    }

    //constructor por parametros
    public Persona(String id, String nombre, String apellido, String fechaNacimiento, String genero){
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
        this.apellido = apellido;
    }

    public Persona(String id) {
        this.id = id;
    }

    public Persona(String id, String nombre, String apellido, String fechaNacimiento){
        this.id = id;
        this.nombre = nombre;
        this.genero = "M";
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
        this.apellido = apellido;
    }

    //metodos
    public void saludar(){
        System.out.println("Hola mi nombre es "+this.nombre);
    }

    public int edad(){
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(this.fechaNacimiento, fechaActual);
        return periodo.getYears();
    }

    @Override
    public String toString(){
        return "[id: "+this.id+", nombre completo: "+this.nombre+" "+
                this.apellido+", fecha nacimiento: "+this.fechaNacimiento+", edad: "+
                edad()+", genero: "+this.genero+"]";
    }

}
