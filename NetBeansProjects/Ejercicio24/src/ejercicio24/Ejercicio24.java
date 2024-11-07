/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

import java.util.Scanner;

/**
 *
 * @author David Sánchez Vázquez
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduzca tu edad: ");
        int edad = scan.nextInt();
        int max = edad , min = edad;
        while(edad != -1){
        if (max < edad) {
                max = edad;
        }
        if(min > edad){
            min = edad;
        }
        System.out.print("Introduzca tu edad: ");
        edad  = scan.nextInt();
        }System.out.println("Edad maxima " + max + " Edad minima  " + min);
        
    }
    
}
