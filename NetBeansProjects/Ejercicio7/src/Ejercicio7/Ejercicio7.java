/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

import java.util.Scanner;

/**
 *
 * @author 1DAW2425-04
 */
public class Ejercicio7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int edad;
        
        System.out.println("Introduzca su edad ");
        edad = scan.nextInt();
        System.out.println("Edad: " + (edad >= 18));
        /*
        boolean mayorEdad = false;
        if (edad >= 18){
            System.out.println("Eres mayor de edad ");
            mayorEdad = true;
        }else{
            System.out.println("Eres menor de edad ");
            mayorEdad = false;
        }
        */
    }
}
