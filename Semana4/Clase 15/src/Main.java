import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.InputMismatchException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //variables
        Scanner scNumber = new Scanner(System.in);
        boolean bandera = true;

        do{
            try{
                System.out.println("Ingrese una fecha: ");
                String fecha = scNumber.next();
                LocalDate fecha1 = LocalDate.parse(fecha);

                System.out.println("Se guardo la fecha en formato fecha");
                bandera = false;
            }catch(DateTimeParseException e){
                System.out.println("Ingrese la fecha en el formato yyyy-mm-d");
                scNumber.next();
            }
        }while(bandera);


        scNumber.close();
    }
}