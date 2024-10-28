/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author David Sánchez Vázquez
 */
public class Ejercicio1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numero1; 
        System.out.println("Introduzca un numero que deseas escribir: ");
        System.out.print("Numero: ");
        numero1 = scan.nextInt();
        System.out.println("El numero escrito es :" + numero1);
    }
}
