/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author David Sánchez Vázquez
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe tu nota: ");
        nota = scan.nextInt();
        String notaExamen = switch (nota) {
            case 0, 1, 2, 3, 4 -> "Insuficiente";
            case 5 -> "Suficiente";
            case 6 -> "Bien";
            case 7,8 -> "Notable";
            case 9,10 -> "Sobresaliente";
            default -> "Error";
        };
        System.out.println("La nota es: " + notaExamen);
    }
    
}
