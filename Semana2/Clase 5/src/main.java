import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //CONDICIONALES

        /* IF
        * Pide al usuario su edad e imprime si puede votar o no.*/
        Scanner scannerEntero = new Scanner(System.in);

        /*System.out.println("Ingrese su edad: ");
        int edad = scannerEntero.nextInt();

        if(edad>=18){
            System.out.println("Puedes votar");
        }
        System.out.println("Fin del programa\n");*/

        /*IF, ELSE
        * Pide un número e indica si es positivo o negativo.*/
        /*System.out.println("Ingrese un numero: ");
        double numero = scannerEntero.nextDouble();

        if(numero>=0){
            System.out.println("Numero positivo");
        }else{
            System.out.println("Numero negativo");
        }
        System.out.println("Fin del programa\n");*/

        /*IF, ELSE IF, ELSE
        * Pide una nota (0–100) y muestra la calificación en letras:
        * 90-100: A
        * 80-89: B
        * 70-79: C
        * 60-69: D
        * 0-59: F*/
        System.out.println("Ingrese la calificacion: ");
        double calificacion = scannerEntero.nextDouble();

        if(calificacion<=100 && calificacion>=90){
            System.out.println("A+");
        }else if (calificacion == 80){
            System.out.println("La calificacion es igual a 80");
        }else if (calificacion<=89 && calificacion>=80){
            System.out.println("B+");
        }else if (calificacion<=79 && calificacion>=70){
            System.out.println("C");
        }else if (calificacion<=69 && calificacion>=60){
            System.out.println("D");
        }else if (calificacion<=59 && calificacion>=0){
            System.out.println("F");
        }else{
            System.out.println("Calificacion fuera de rango (0 - 100)");
        }



        /*SWITCH
        * El usuario escribe un número (1 al 12) y el programa imprime el
        * mes correspondiente.*/
        /*System.out.println("Ingrese un numero (1-12): ");
        int mes = scannerEntero.nextInt();

        switch (mes){
            case 1: //mes == 1
                System.out.println("Enero");
                break;
            case 2: //mes == 2
                System.out.println("Feb");
                break;
            case 3: //mes == 3
                System.out.println("Mar");
                break;
            case 4: //mes == 4
                System.out.println("Abr");
                break;
            case 5: //mes == 5
                System.out.println("May");
                break;
            case 6: //mes == 6
                System.out.println("Jun");
                break;
            case 7: //mes == 7
                System.out.println("Jul");
                break;
            case 8: //mes == 8
                System.out.println("Ago");
                break;
            case 9: //mes == 9
                System.out.println("Sept");
                break;
            case 10: //mes == 10
                    System.out.println("Oct");
                break;
            case 11: //mes == 11
                System.out.println("Nov");
                break;
            case 12: //mes == 12
                System.out.println("Dic");
                break;
            default:
                System.out.println("Numero fuera de rango");
        }*/

        scannerEntero.close();
    }
}
