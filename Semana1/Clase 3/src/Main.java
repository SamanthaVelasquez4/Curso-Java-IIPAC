//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Variables
        double numero1=15.5, numero2=20.5, resultado, areaCirculo;
        int radio=6, cont=1, cont2=0;

        //CONSTANTE -> Se escriben en mayusculas
        final double PI = 3.14159;

        //operadores aritmeticos
        resultado = numero1 + numero2;
        System.out.println("Suma = "+ resultado);

        resultado = numero1 - numero2;
        System.out.println("Resta = "+ resultado);

        areaCirculo = PI*radio*radio;
        System.out.println("El area de circulo con radio "+radio+" es igual a "+areaCirculo);

        cont ++; //incremento
        System.out.println(cont);
        cont ++;
        cont ++;
        System.out.println(cont);
        cont --; //decremento
        System.out.println(cont);

        //operadores de comparacion
        System.out.println(numero1 == numero2); //false
        System.out.println('a' != 'a'); //false
        System.out.println(10 < 5); //false
        System.out.println(10 > 5); //verdadero

        //operadores de asignacion
        cont2 = cont2 + 1; //cont2 = 0 + 1 = 1
        cont2 = cont2 + 1; // cont2 = 2
        cont2 += 1; //3
        cont2 *= 5; //15
        cont2 -= 3; //12
        cont2 /= 4; //3  cont2 = cont2 / 4
        System.out.println(cont2);

        //operadores logicos
        boolean banderaAnd= true && (10>5) && true && true; //verdadero
        boolean banderaOr= (5>10) || false || false || false || false; //falso

        System.out.println("And: "+banderaAnd+" Or: "+banderaOr);

        boolean negacion = !true;
        System.out.println(negacion);

    }
}