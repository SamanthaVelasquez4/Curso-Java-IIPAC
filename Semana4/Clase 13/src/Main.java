public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona(1,"Juan","Mendez","2000-12-25");
        Futbolista futbolista = new Futbolista(5,"Maria","Gonzales","2005-01-14",5,"Defensa","Warriors");
        Entrenador entrenador = new Entrenador(3,"Mario","Funez","1990-04-22");
        Equipo equipo = new Equipo("Warriors", persona, 10);

        persona.concentrarse();
        futbolista.viajar("Madrid");
        System.out.println(futbolista.getId());
        futbolista.entrenar(100);
        entrenador.dirigirEntrenamiento();

        System.out.println(equipo.toString());

        System.out.println(equipo.getDuenio().getNombre());

    }
}