/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;

import java.util.Scanner;

/**
 *
 * @author David Sánchez Vázquez
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 1;
        int cuadrado;
        while (num != 0){
            System.out.println("Numero 0 si quieres salir ");
            System.out.print("Introduzca un numero:");
            num = scan.nextInt();
            if(num % 2 == 0){
                System.out.println(num + " Es par");
            }else{
                System.out.println(num + " Es impar");
            }
            if (num > 0) {
                System.out.println("El numero es positivo");
            }else{
                System.out.println("El numero es negativo");
            }
            cuadrado = num * num;
            System.out.println("Cuadrado es: " + cuadrado);
        }
        System.out.println("Salir");
    }
}
