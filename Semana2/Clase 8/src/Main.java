import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //FUNCIONES
        /*bienvenida();

        int numero = sinParConRet();
        System.out.println(numero);

        conParSinRet(25.6,5.9);

        if(conParConRet(1,20)){
            System.out.println("Si se hizo la division");
        }else{
            System.out.println("No se hizo la division");
        }*/


        //EJERCICIO CALCULADORA

        //variables
        Scanner scannerNum = new Scanner(System.in);


        System.out.println("--------MENU-------");
        System.out.println("1. Suma\n2. Resta\n3. Multiplicacion\n4. Division");
        int opcion = scannerNum.nextInt();

        switch(opcion){
            case 1: //suma
                suma(scannerNum);
                break;
            case 2: //resta
                resta(scannerNum);
                break;
            case 3: //multiplicacion
                multiplicacion(scannerNum);
                break;
            case 4: //suma
                division(scannerNum);
                break;
        }
    }

    //DEFINICION DE FUNCIONES
    public static void bienvenida(){ //funcion SIN parametros y SIN retorno
        System.out.println("Bienvenido al programa!");
    }

    public static int sinParConRet(){
        return 10;
    }

    public static void conParSinRet(double num1, double num2){
        System.out.println(num1-num2);
    }

    public static boolean conParConRet(double num1, double num2){
        if(num2==0){
            return false;
        }else{
            System.out.println(num1/num2);
            return true;
        }
    }

    public static void suma(Scanner scannerNum){
        System.out.println("Ingrese dos numeros: ");
        double num1 = scannerNum.nextDouble();
        double num2 = scannerNum.nextDouble();
        System.out.println("Resultado= "+ (num1+num2));
    }

    public static void resta(Scanner scannerNum){
        System.out.println("Ingrese dos numeros: ");
        double num1 = scannerNum.nextDouble();
        double num2 = scannerNum.nextDouble();
        System.out.println("Resultado= "+ (num1-num2));
    }

    public static void multiplicacion(Scanner scannerNum){
        System.out.println("Ingrese dos numeros: ");
        double num1 = scannerNum.nextDouble();
        double num2 = scannerNum.nextDouble();
        System.out.println("Resultado= "+ (num1*num2));
    }

    public static void division(Scanner sc){
        System.out.println("Ingrese dos numeros: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        boolean b = conParConRet(num1, num2);
        if(!b){
            System.out.println("Error en la division");
        }
    }

}