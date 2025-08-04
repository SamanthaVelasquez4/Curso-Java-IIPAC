public class Equipo {
    //atributos
    private int id;
    private String nombre;
    private Persona duenio;

    //constructor
    public Equipo(){}

    public Equipo(String nombre, Persona duenio, int id) {
        this.nombre = nombre;
        this.duenio = duenio;
        this.id = id;
    }

    //getters y setters

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

    public Persona getDuenio() {
        return duenio;
    }

    public void setDuenio(Persona duenio) {
        this.duenio = duenio;
    }

    //metodo

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", duenio=" + duenio.toString() +
                '}';
    }
}
