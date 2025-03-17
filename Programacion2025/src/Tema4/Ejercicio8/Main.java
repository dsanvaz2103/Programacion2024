package Tema4.Ejercicio8;

import Tema4.Ejercicio8.Calculadora.CalculadoraBasica;

public class Main {
    public static void main(String[] args) {
        // Uso directo de los métodos estáticos
        double suma = CalculadoraBasica.sumar(5, 3);
        double producto = CalculadoraBasica.multiplicar(4, 2);

        System.out.println("Suma: " + suma);
        System.out.println("Producto: " + producto);
    }
}
