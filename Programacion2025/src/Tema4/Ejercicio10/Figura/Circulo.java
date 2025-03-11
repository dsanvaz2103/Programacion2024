package Tema4.Ejercicio10.Figura;

public class Circulo extends Figura{

    double radio;

    public Circulo(String nombre , double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double area = Math.PI * (radio*radio);
        return area;
    }

}
