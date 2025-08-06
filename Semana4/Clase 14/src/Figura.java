public class Figura {
    //atributos
    private String color;

    //constructor
    public Figura(){}

    public Figura(String color){
        this.color = color;
    }

    //getter y setter
    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    //metodos
    public void area(){
        System.out.println("Esta funcion calcula el area de la figura.");
    }

    public void perimetro(){
        System.out.println("Esta funcion calcula el perimetro de la figura.");
    }
}

/*SUBCLASES
* 1. Rectangulo
* ancho, largo
* area, perimetro
* 2. Triangulo
* lado1, lado2, lado 3
* area, perimetro, tipoTriangulo
* 3. Circulo
* radio
* area, perimetro, diametro
* */
