public class Rectangulo extends Figura {
    //atributos
    private double ancho, largo;

    //constructor
    public Rectangulo(){}

    public Rectangulo(double ancho, double largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    //getters y setters

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        if(ancho>0){
            this.ancho = ancho;
        }else{
            System.out.println("No se permiten numeros menores que 0");
        }

    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        if(largo>0){
            this.ancho = largo;
        }else{
            System.out.println("No se permiten numeros menores que 0");
        }
    }

    //metodos

    @Override
    public void area() {
        System.out.println("El area es: "+ (this.ancho*this.largo));
    }

    @Override
    public void perimetro() {
        System.out.println("El area es: "+ (2*(this.ancho+this.largo)));
    }
}
