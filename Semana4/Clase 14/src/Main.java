//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Figura figura = new Figura("Verde");

        Figura rectangulo = new Rectangulo(5,10);

        Figura circulo = new Circulo(10.2);

        Figura[] figuras =  new Figura[3];

        figuras[0] = circulo;
        figuras[1] = figura;
        figuras[2] = rectangulo;

        for(Figura objeto : figuras){
            objeto.perimetro();
        }
    }
}