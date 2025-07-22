import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //BUCLES O CICLOS

        /* FOR
        * Imprimir los números del 1 al 5.
        * */
        /*System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");*/

        for (int i=0; i<=20; i+=2){ //i = i +2
            System.out.println(i);
        }

        //Tabla de multiplicar del 7
        System.out.println("Tabla de multiplicar del 7");
        for (int cont=1; cont<=10; cont++){
            System.out.println("7 x "+cont+" = "+(7*cont));
        }

        System.out.println("Fin del ciclo for");

        /* WHILE
        * Pedir un numero positivo al usuario.
        * */
        Scanner scannerNum = new Scanner(System.in);

        System.out.println("Ingrese un numero positivo: ");
        double numero = scannerNum.nextDouble();

        while (numero<0){
            System.out.println("Numero inválido");
            System.out.println("Ingrese un numero positivo: ");
            numero = scannerNum.nextDouble();
        }

        //USANDO DO WHILE
        /*double numero;
        do{
            System.out.println("Ingrese un numero positivo: ");
            numero = scannerNum.nextDouble();
        }while(numero<0);*/



        /* Ejemplo del FOR usando WHILE
        int contador = 1;

        while(contador<=10){
            System.out.println(contador);
            contador++;
        }*/
        System.out.println("Fin del ciclo while");

        /* DO WHILE
        * Mostrar un menú hasta que el usuario elija salir (opción 3).
        * */
        int opcion;
        do{
            System.out.println("----------MENU---------");
            System.out.println("1. Sumar\n2. Restar\n3. Salir");
            opcion = scannerNum.nextInt();

            double num1, num2;
            switch(opcion){
                case 1: //SUMAR
                    System.out.println("Ingrese dos numeros: ");
                    num1 = scannerNum.nextDouble();
                    num2 = scannerNum.nextDouble();
                    System.out.println("Resultado = "+ (num1+num2));
                    break;
                case 2: //resta
                    System.out.println("Ingrese dos numeros: ");
                    num1 = scannerNum.nextDouble();
                    num2 = scannerNum.nextDouble();
                    System.out.println("Resultado = "+ (num1-num2));
                    break;
                case 3: //SALIR
                    System.out.println("Gracias por usar el programa");
                default:
                    System.out.println("Opcion incorrecta");
            }
        }while(opcion!=3);

        System.out.println("Fin del ciclo do... while");

    }
}
