/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author 1DAW2425-04
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n1;
        int n2;
        int mayorMenor;
        
        System.out.println("Escribe el primer numero ");
        n1 = scan.nextInt();
        System.out.println("Escribe el segundo numero ");
        n2 = scan.nextInt();
        mayorMenor = n1 > n2 ? n1 : n2;
        System.out.println("Numero mayor es: " + mayorMenor);
        
    }
    
}
