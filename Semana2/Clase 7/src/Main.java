import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*ARREGLOS
        * length -> Saber el tamaño de un arreglo
        * */

        int[] numerosPrimos = new int[5]; //creacion del arreglo
        numerosPrimos[0] = 1; //[1, null, null, null ,null]

        //System.out.println(numerosPrimos[0]);

        numerosPrimos[1] = 3;
        numerosPrimos[2] = 5;
        numerosPrimos[3] = 7;
        numerosPrimos[4] = 11; //[1, 3, 5, 7, 11]

        /*for (int i=0; i<5; i++){
            System.out.println(numerosPrimos[i]);
        }*/

        numerosPrimos[0] = 17; //cambiar elemento

        /*for (int i=0; i<5; i++){
            System.out.println(numerosPrimos[i]);
        }

        System.out.println("Tamaño del arreglo: "+numerosPrimos.length);*/

        //buscar
        for ( int i=0; i<numerosPrimos.length; i++){
            if(numerosPrimos[i]==5){
                System.out.println("El arreglo contienen el numero");
                break;
            }
        }

        /*LINKED LISTS
        Inicializarlo: LinkedList<String> nombreArreglo = new LinkedList<>();
        * add(elemento) -> Agrega al final
        * add(index, elemento) -> Inserta en una posición específica
        * get(index) -> Obtiene un elemento por índice
        * set(index, elemento) -> Reemplaza el elemento en el índice dado
        * remove(index) ->	Elimina por índice
        * remove(objeto) ->	Elimina la primera ocurrencia del objeto
        * contains(objeto) -> Verifica si existe el objeto
        * size()-> Devuelve el tamaño
        * isEmpty() -> Verifica si está vacía
        * clear() -> Elimina todos los elementos
        * */

        LinkedList<String> alumnos = new LinkedList<>(); //creacion de linked list

        alumnos.add("Ana"); //index=0
        alumnos.add("Denis"); //index=1
        alumnos.add("Eliza");
        alumnos.add("Juan");
        alumnos.add(2, "Marcos");
        alumnos.add(5, "Maria");
        System.out.println(alumnos);

        System.out.println(alumnos.get(0));
        alumnos.set(3, "Elisa");
        alumnos.add("Marcos");
        System.out.println(alumnos);
        alumnos.remove(5);
        alumnos.remove("Marcos");
        System.out.println(alumnos);

        System.out.println(alumnos.contains("Juan"));
    }
}