import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variables
        Scanner scNum = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);

        LinkedList<Persona> personas = new LinkedList<>();
        int opcion=0;
        Persona persona = new Persona();

        System.out.println("----------REGISTRO DE PERSONAS-------------\n");
        do{
            System.out.println("------------MENU-------------");
            System.out.println("1. Crear\n2. Ver lista de personas\n3. Borrar persona\n4. Salir");
            System.out.print("Ingrese su opcion: ");
            opcion = scNum.nextInt();

            switch (opcion){
                case 1: //crear
                    persona = crearPersona();
                    personas.add(persona);
                    System.out.println(persona.nombre+" creada correctamente.");
                    break;
                case 2: //ver lista de personas
                    imprimirLista(personas);
                    break;
                case 3: //borrar
                    System.out.println("Ingrese el id de la persona: ");
                    String id = scString.next();
                    if(eliminarPorId(personas, id)){
                        System.out.println("Persona eliminada correctamente");
                    }else{
                        System.out.println("No se encontró persona con el id: "+id);
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

            System.out.println("-----------------------------------------\n");
        }while(opcion!=4);

    }

    public static Persona crearPersona(){
        Scanner scString = new Scanner(System.in);

        System.out.println("*Creacion de nuevo registro*");
        System.out.println("Ingrese el id: ");
        String id = scString.next();

        System.out.println("Ingrese el nombre: ");
        String nombre = scString.next();

        System.out.println("Ingrese el apellido: ");
        String apellido = scString.next();

        System.out.println("Ingrese el genero (M o F): ");
        String genero = scString.next();

        System.out.println("Ingrese el fecha de nacimiento (yyyy-MM-dd): ");
        String fechaNacimiento = scString.next();

        Persona persona = new Persona(id, nombre,apellido, fechaNacimiento, genero);

        return persona;
    }

    public static void imprimirLista(LinkedList<Persona> lista){
        for (Persona persona : lista) {
            System.out.println(persona);
        }
    }

    public static boolean eliminarPorId(LinkedList<Persona> lista, String id){
        for(Persona p : lista ) {
            if (p.id.equals(id)) {
                return lista.remove(p);
            }
        }
        return false;
    }
}