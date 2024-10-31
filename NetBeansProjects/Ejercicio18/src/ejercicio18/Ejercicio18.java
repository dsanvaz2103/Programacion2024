/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author 1DAW2425-04
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double casiCero;
        System.out.print("Escriba un numero que sea decimal para saber si es un casi 0 o no: ");
        casiCero = scan.nextDouble();
        if (casiCero == 0.0 || casiCero <= -1.0 || casiCero >= 1.0 ){
            System.out.println(casiCero + " No es un casi cero ");
        }else{
            System.out.println(casiCero + " Es un casi cero");
        }
    }
    
}
