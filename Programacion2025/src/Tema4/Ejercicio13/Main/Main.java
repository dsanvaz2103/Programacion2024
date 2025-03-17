package Tema4.Ejercicio13.Main;
import Tema4.Ejercicio13.utils.MatematicasUtils;

public class Main {
    public static void main(String[] args) {
        MatematicasUtils matematicas = new MatematicasUtils();
        try {
            // Área de un círculo
            System.out.println("Área del círculo: " +
                    matematicas.calcularAreaCirculo(5));

            // Perímetro de un rectángulo
            System.out.println("Perímetro del rectángulo: " +
                    matematicas.calcularPerimetroRectangulo(4, 6));

            // Verificar si un número es primo
            System.out.println("¿Es 17 primo? " +
                    matematicas.esPrimo(17));

            // Calcular factorial
            System.out.println("Factorial de 5: " +
                    matematicas.factorial(5));

            // Redondear un número
            System.out.println("3.14159 redondeado a 3 decimales: " +
                    matematicas.redondearDecimal(3.14159, 3));

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
