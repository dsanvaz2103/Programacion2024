/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author 1DAW2425-04
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num1;
        int num2;
        double mediaAritmetica;
        
        System.out.println("Introduzca un numero oara calcular la media aritmetica");
        num1 = scan.nextInt();
        System.out.println("Introduzca otro numero para realizar la media aritmetica");
        num2 = scan.nextInt();
        
        mediaAritmetica = (num1 + num2) / 2;
        
        System.out.println("Media aritmetica: ");
        System.out.println(" " + " " + num1 + " + " + num2);
        System.out.println("---------" + " = " + mediaAritmetica );
        System.out.println("    2    ");
    }
    
}
