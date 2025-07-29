import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona(); //instanciar y crear un objeto

        //System.out.println("Hola mi nombre es "+persona1.nombre);

        persona1.id = "0801-6598-59684";
        persona1.nombre = "Marcos";
        persona1.apellido = "Gutierrez";
        persona1.genero = "M";
        persona1.fechaNacimiento = "2000-12-25"; //yyyy-MM-dd

        System.out.println("Hola mi nombre es "+persona1.nombre);

        Persona persona2 = new Persona("0801-2581-54852", "Juana", "Gonzales", "2003-12-08", "F");
        System.out.println("Hola mi nombre es "+persona2.nombre);

        Persona persona3 = new Persona("06596-1656");

        LocalDate fechaNacimiento = LocalDate.parse("2003-12-03");
        System.out.println(fechaNacimiento);

        LocalDate fechaActual = LocalDate.now();

        Period periodo = Period.between(fechaNacimiento, fechaActual);
        System.out.println(periodo.getYears());
    }
}