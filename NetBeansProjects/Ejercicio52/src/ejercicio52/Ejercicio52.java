/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio52;

import java.util.Scanner;

/**
 *
 * @author David Sánchez Vázquez
 */
public class Ejercicio52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("Escribe un numero para que te lo lea como primo o no: ");
        num = scan.nextInt();
        System.out.println(esPrimo(num
        ));
    }
    
    public static boolean esPrimo(int n){
        boolean esPrimo = true;
        int i = 2;
        if (n < 2){
            esPrimo = false;
        }
        while(i < n && esPrimo){
            if (n % i == 0) {
                esPrimo = false;
            }
            i++;
        }
        return esPrimo;
    }
    
}
