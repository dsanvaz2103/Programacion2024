/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author 1DAW2425-04
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número decimal: ");
        
        // Leemos el número como double para mantener la precisión de decimales
        double numero = entrada.nextDouble();

        // Redondeamos al entero más próximo usando Math.round()
        int redondeo = (int) Math.round(numero);

        // Mostramos el resultado en español
        System.out.println("\nEl número redondeado es: " + redondeo);

        entrada.close();
    }
}
