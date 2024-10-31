/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author 1DAW2425-04
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Escribe el primer numero:  ");
        num1 = scan.nextInt();
        System.out.print("Escribe el segundo numero:  ");
        num2 =  scan.nextInt();
        if(num1 == num2){
            System.out.println(num1 + " = " + num2);
        }else{
            if(num1 > num2){
                System.out.println(num1 + " > " + num2);
            }else{
                System.out.println(num1 + " < " + num2);
            }
        }
    }
    
}
