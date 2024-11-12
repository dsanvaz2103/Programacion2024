/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

import java.util.Scanner;

/**
 *
 * @author 1DAW2425-04
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean valido = false;

        while (!valido) {
            System.out.print("Ingrese un número entero: ");
            
            // Leemos el número como int
            int numero = entrada.nextInt();

            // Verificamos si el número está dentro del rango [1, 100]
            if (numero >= 1 && numero <= 100) {
                // Usamos el operador % para calcular el resto de la división por 2
                if (numero % 2 == 0) {
                    System.out.println(numero + " es par");
                } else {
                    System.out.println(numero + " es impar");
                }
                
                // Si el número está en el rango, marcamos como válido y salimos del bucle
                valido = true;
            } else {
                System.out.println("Número fuera del rango [1, 100]. Por favor, ingrese un número entre 1 y 100.");
            }

            // Si no estamos dentro del rango, pedimos otro número
        }

        entrada.close();
    }
    
}
