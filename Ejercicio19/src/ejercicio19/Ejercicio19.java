/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author 1DAW2425-04
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 , n2 , n3;
        System.out.println("Escribe tres numeros");
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        n3 = scan.nextInt();
        System.out.println("Numero de mayor a menor: ");
        if(n1 > n2 && n1 > n3){
            if(n2 > n3){
                System.out.println(n1 + " , " + n2 + " , " + n3);
            }else{
                System.out.println(n1 + " , " + n3 + " , " + n2);
            }
        }else if (n2 > n1 && n2 > n3) {
            if (n3 > n1) {
                System.out.println(n2 + " , " + n3 + " , " + n1);
            }else{
                System.out.println(n2 + " , " + n1 + " , " + n3);
            }
        }else if (n3 > n1 && n3 > n2) {
            if (n1 > n2) {
                System.out.println(n3 + " , " + n1 + " , " + n2);
            }else{
                System.out.println(n3 + " , " + n2 + " , " + n1);
            }
        }
    }
    
}
