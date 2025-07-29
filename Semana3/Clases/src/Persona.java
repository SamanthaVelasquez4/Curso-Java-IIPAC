public class Persona {
    //atributos
    String id;
    String nombre;
    String apellido;
    String fechaNacimiento;
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
        this.fechaNacimiento = fechaNacimiento;
        this.apellido = apellido;
    }

    public Persona(String id) {
        this.id = id;
    }

    public Persona(String id, String nombre, String apellido, String fechaNacimiento){
        this.id = id;
        this.nombre = nombre;
        this.genero = "M";
        this.fechaNacimiento = fechaNacimiento;
        this.apellido = apellido;
    }


}
