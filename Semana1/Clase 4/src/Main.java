import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Salida y entrada de datos
        System.out.println("Salida de datos");
        /*
         * next()-> Solo lee una palabra
         * nextLine()-> Lee una oracion
         * nextInt()-> Lee un numero entero
         * nextDouble()-> Lee un numero decimal
         * nextFloat()-> Lee un numero flotante
         * nextBoolean()
         * nextShort()
         * */

        Scanner scannerNumber = new Scanner(System.in); //crear el scanner
        Scanner scannerString = new Scanner(System.in);

        //Pide al usuario su nombre y muéstrale un saludo.
        System.out.println("Ingresa tu numbre: ");
        String nombre = scannerString.nextLine(); //Para leer una palabra

        System.out.println("Digite un numero: ");
        int numero = scannerNumber.nextInt(); //10/n

        System.out.println("Hola "+nombre+" ¡Bienvenid@ al programa! El numero que digitaste fue: "+ numero);

        System.out.println("Dame una oracion: ");
        String oracion = scannerString.nextLine();
        /*EXPLICACION DE ERROR CON SCANNER
        *nextLine()-> lee hasta el salto de linea \n 
        *nextInt()->Solo lee el numero*/
        System.out.println(oracion);


        //Pide dos números y muestra la suma.
        double num1, num2;

        System.out.println("Ingresa dos numeros: ");
        num1 = scannerNumber.nextDouble();
        num2 = scannerNumber.nextDouble();

        System.out.println("La suma de los numeros es: "+ (num1 + num2));

        scannerNumber.close();
        scannerString.close();
    }
}
