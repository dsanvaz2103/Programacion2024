/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miprimerproyecto;

import java.util.Scanner;

/**
 *
 * @author David Sánchez 
 */
public class MiPrimerProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String usuario;
        String password;
        int numero1 ;
        int numero2;
        int operacionSuma;
        System.out.println(" Introduce tu nombre de usuario ");
        usuario = scan.next();  
        System.out.println(" Introduce tu contrasenia ");
        password = scan.next();
        if ("David".equals(usuario) && "dsv".equals(password)) {
            System.out.println("Hola " + usuario);
            System.out.println("Introduzca un numero ");
            numero1 = scan.nextInt();
            System.out.println("Introduzca otro numero ");
            numero2 = scan.nextInt();
            operacionSuma = numero1 + numero2;
            System.out.println(" Suma " + ": " + numero1 + " + " + numero2 + " = " + operacionSuma);
            
        }else{
            System.out.println(" Usuario o contrasenias no correctos ");
        }
            
    }
}
