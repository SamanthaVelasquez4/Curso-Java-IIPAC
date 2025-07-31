public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setId(1);
        persona.setNombre("Sam");
        persona.setContrasena("123");
        persona.setGenero('F');
        persona.setFechaNacimiento("2003-02-16");

        System.out.println(persona.toString());
    }
}