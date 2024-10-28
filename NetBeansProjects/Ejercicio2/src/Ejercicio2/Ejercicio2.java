/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author 1DAW2425-04
 */
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int edad;
        System.out.println("Introduzca tu edad: ");
        System.out.print("Edad actual: ");
        edad = scan.nextInt();
        System.out.println("Edad que cumpliras el año que viene es: " + (edad + 1));
        
    }
}
