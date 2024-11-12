/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio28;

import java.util.Scanner;

/**
 *
 * @author 1DAW2425-04
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();
        
        // Verificar si el número es positivo
        if (numero < 0) {
            System.out.println("Por favor, ingrese un número entero positivo.");
        } else {
            long factorial = 1;
            
            // Calcular el factorial usando un bucle for
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
    }
    
}
