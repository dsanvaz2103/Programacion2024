package Tema4.Ejercicio13.utils;

public final class MatematicasUtils {

    // Constante PI como atributo final privado
    private static final double PI = Math.PI;

    // Metodo para calcular el área de un círculo
    public static double calcularAreaCirculo(double radio) {
        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser negativo");
        }
        return PI * Math.pow(radio, 2);
    }

    // Metodo para calcular el perímetro de un rectángulo
    public static double calcularPerimetroRectangulo(double largo, double ancho) {
        if (largo < 0 || ancho < 0) {
            throw new IllegalArgumentException("Las dimensiones no pueden ser negativas");
        }
        return 2 * (largo + ancho);
    }

    // Metodo para determinar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Metodo para calcular el factorial de un número
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("No se puede calcular el factorial de un número negativo");
        }

        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Metodo para redondear un número a decimales específicos
    public static double redondearDecimal(double numero, int decimales) {
        if (decimales < 0) {
            throw new IllegalArgumentException("El número de decimales no puede ser negativo");
        }

        double multiplicador = Math.pow(10, decimales);
        return Math.round(numero * multiplicador) / multiplicador;
    }
}
