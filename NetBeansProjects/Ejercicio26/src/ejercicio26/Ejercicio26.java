/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

import java.util.Scanner;

/**
 *
 * @author David Sánchez Vázquez
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Escribe el numero de veces que quieres escribir la palabra Eco");
        num = scan.nextInt();
        int i;
        for (i = 0; i < num; i++) {
            System.out.println("Eco");
        }
    }
    
}
