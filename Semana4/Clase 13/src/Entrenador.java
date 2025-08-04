public class Entrenador extends Persona {

    //constructor
    public Entrenador(){}

    public Entrenador(int id, String nombre, String apellido, String fechaNacimiento) {
        super(id, nombre, apellido, fechaNacimiento);
    }

    //metodos
    public void dirigirPartido(){
        System.out.println("Dirigiendo partido...");
    }

    public void dirigirEntrenamiento(){
        System.out.println("Dirigiendo entrenamiento...");
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
