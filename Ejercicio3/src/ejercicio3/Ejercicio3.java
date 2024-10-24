/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author 1DAW2425-04
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int anioActual;
        int fechaNacimiento;
        int edad;
        
        System.out.println("Escribe el anio actual ");
        anioActual = scan.nextInt();
        System.out.println("Escribe la fecha de nacimiento ");
        fechaNacimiento = scan.nextInt();
        
        edad = fechaNacimiento - anioActual;
        
        System.out.println("Tienes " + edad + " Anios ");
        
    }
    
}
