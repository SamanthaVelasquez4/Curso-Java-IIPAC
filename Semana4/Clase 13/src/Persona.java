import java.time.LocalDate;
import java.time.Period;

public class Persona {
    //atributos
    protected int id;
    protected String nombre;
    protected String apellido;
    protected LocalDate fechaNacimiento;

    //constructor
    public Persona(){}

    public Persona(int id, String nombre, String apellido, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
    }

    //getter y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(String fecha) {
        this.fechaNacimiento = LocalDate.parse(fecha);
    }

    //metodos
    public int edad(){
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(this.fechaNacimiento, fechaActual);
        return periodo.getYears();
    }

    public void concentrarse(){
        System.out.println("Contrandose...");
    }

    public void viajar(String ciudad){
        System.out.println("Viajando a "+ciudad);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
