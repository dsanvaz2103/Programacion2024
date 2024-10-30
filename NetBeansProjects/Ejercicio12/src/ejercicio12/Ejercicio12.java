/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author 1DAW2425-04
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int valorAbsoluto;
        System.out.print("Escribe un numero para que te muestre el valor absoluto del mismo: ");
        num = scan.nextInt();
        valorAbsoluto = num > 0 ? num : (-1) * num;
        System.out.println("Valor absoluto: " +  valorAbsoluto);
        
    }
    
}
