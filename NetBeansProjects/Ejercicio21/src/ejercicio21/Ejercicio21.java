/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author David Sánchez Vázquez
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mesAnio;
        System.out.println("Dime que mes quieres saber ");
        mesAnio = scan.nextInt();
        String diaMesAnio = switch (mesAnio) {
            case 1  -> "Enero: 28 dias";
            case 2  -> "Febrero: 29 dias";
            case 3  -> "Marzo : 31 dias";
            case 4  -> "Abril : 30 dias";
            case 5  -> "Mayo : 31 dias";
            case 6  -> "Junio: 30 dias";
            case 7  -> "Julio: 31 dias";
            case 8  -> "Agosto: 31 dias";
            case 9  -> "Septiembre: 30 dias";
            case 10 -> "Octubre: 31 dias";
            case 11 -> "Noviembre: 30 dias";
            case 12 -> "Diciembre: 31 dias";
            default -> "Error";
        };
        System.out.println(diaMesAnio);
    }
    
    
}
