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
        int edad = 0;
        int max = 0 , min = 0;
        while(edad >= 0){
            
        System.out.print("Introduzca tu edad: ");
        edad  = scan.nextInt();
        if (edad > edad) {
                max = edad;
        }else{
            min = edad;
        }
        }System.out.println("Edad maxima " + max + " Edad minima  " + min);
        
    }
    
}
