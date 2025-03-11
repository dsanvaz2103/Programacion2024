package Tema4.Ejercicio10.Figura;

public class Rectangulo extends Figura{
    double base;
    double altura;

    public Rectangulo(String nombre , double base , double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area = (base*altura)/2;
        return area;
    }
}
