public class Futbolista extends Persona {
    //atributos
    private int numeroCamisa;
    private String posicion;
    private String equipo;

    //constructor
    public Futbolista(){}

    public Futbolista(int id, String nombre, String apellido, String fechaNacimiento, int numeroCamisa, String posicion, String equipo) {
        super(id, nombre, apellido, fechaNacimiento);
        this.numeroCamisa = numeroCamisa;
        this.posicion = posicion;
        this.equipo = equipo;
    }

    //getters y setters

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    //metodos
    public void jugarPartido(){
        System.out.println("Jugando partido...");
    }

    public void entrenar(int minutos){
        System.out.println("Entrenando por "+minutos+" min");
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "numeroCamisa=" + numeroCamisa +
                ", posicion='" + posicion + '\'' +
                ", equipo='" + equipo + '\'' +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
