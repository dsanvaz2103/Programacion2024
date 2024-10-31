/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author 1DAW2425-04
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int num1;
        System.out.print("Introduzca un numero: ");
        num1 = scan.nextInt();
        if(num1 % 2 == 0){
            System.out.println("El numero " + num1 + " Es par");
        }else{
            System.out.println("El numero " + num1 + " Es impar");
        }
        
    }
    
}
