public class Circulo extends Figura {
    //atributo
    private double radio;

    //constructor
    public Circulo(){}

    public Circulo(double radio){
        this.radio = radio;
    }

    //getter y setters


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if(radio>0){
            this.radio = radio;
        }else{
            System.out.println("No se permiten numeros menores que 0");
        }

    }

    //metodos
    public double diametro(){
        return 2*this.radio;
    }

    @Override
    public void area() {
        System.out.println("El area es: "+ (Math.PI*this.radio*this.radio));
    }

    @Override
    public void perimetro() {
        System.out.println("El area es: "+ (2*Math.PI*this.radio));
    }
}
