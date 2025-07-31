import java.time.LocalDate;
import java.time.Period;

public class Persona {
    //atributos
    private int id;
    private String contrasena;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private char genero;

    //constructor
    //Constructor por defecto
    public Persona(){
        System.out.println("Se creo un objeto clase");
    }

    //constructor por parametros
    public Persona(int id, String nombre, String apellido, String fechaNacimiento, char genero){
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
        this.apellido = apellido;
    }

    public Persona(int id) {
        this.id = id;
    }

    public Persona(int id, String nombre, String apellido, String fechaNacimiento){
        this.id = id;
        this.nombre = nombre;
        this.genero = 'M';
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
        this.apellido = apellido;
    }

    //GETTER & SETTERS

    public int getId() {
        return id;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public char getGenero() {
        return genero;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
    }

    public void setGenero(char genero) {
        if(genero == 'M' || genero == 'F'){
            this.genero = genero;
        }else{
            System.out.println("El genero es incorrecto solo se permite M o F");
        }
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
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", contrasena='" + contrasena + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", genero=" + genero +
                '}';
    }
}