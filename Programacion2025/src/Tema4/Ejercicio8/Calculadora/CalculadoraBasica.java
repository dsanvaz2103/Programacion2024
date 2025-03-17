package Tema4.Ejercicio8.Calculadora;

public class CalculadoraBasica {
    // Los atributos son privados y estáticos
    private static double resultado;

    // Métodos públicos y estáticos
    public static double sumar(double a, double b) {
        resultado = a + b;
        return resultado;
    }

    public static double restar(double a, double b) {
        resultado = a - b;
        return resultado;
    }

    public static double multiplicar(double a, double b) {
        resultado = a * b;
        return resultado;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        resultado = a / b;
        return resultado;
    }
}
