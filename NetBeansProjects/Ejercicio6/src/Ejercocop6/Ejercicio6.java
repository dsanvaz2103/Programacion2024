/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercocop6;

import java.util.Scanner;

/**
 *
 * @author David Sánchez Vázquez
 */
public class Ejercicio6 {
    
    public static void main(String[] args){
        
// Importamos el scaner scan
        Scanner scan = new Scanner(System.in);
        
// Declaramos variables
        double radio;
        double longitud;
        double area;
        
// Pedimos por pantalla el radio mediante un sout
        System.out.println("Introduzca el radio del circulo para calcular la longitud y el area del circulo: ");
// Leemos el radop 
        System.out.print("Radio: ");
        radio = scan.nextDouble();
// Creamos las operaciones y las imprimimos con el resultado por pantalla
        longitud = 2 * Math.PI * radio;
        System.out.println("Longitud es : " + " 2 " + " * " + " π " + " * " + radio + " = " + longitud);
        area = Math.PI * radio * 2;
        System.out.println("Area es : " + " π " + " * " + radio + " * " + " 2 " + " = " + area);
    }
    
}
