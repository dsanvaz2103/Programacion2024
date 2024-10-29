/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

import java.util.Scanner;

/**
 *
 * @author 1DAW2425-04
 */
public class Ejercicio9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int lluvia;
        int tarea;
        int biblioteca;
        boolean estaLloviendo = false;
        boolean tareaTerminada = false;
        boolean irBiblioteca = false;
        
        System.out.println(" 1 es = a que si esta lloviendo ");
        System.out.println(" 2 es = a que no esta lloviendo");
        System.out.print("¿Esta lloviendo? ");
        lluvia = scan.nextInt();
        System.out.println(" 1 es = a que no has hecho la tarea ");
        System.out.println(" 2 es = a que si has hecho la tarea ");
        System.out.print("¿Hiciste la tarea? ");
        tarea = scan.nextInt();
        System.out.println(" 1 es = a que no vas a la biblioteca ");
        System.out.println(" 2 es = a que si vas a la biblioteca ");
        System.out.print("¿Vas a ir a la biblioteca? ");
        biblioteca = scan.nextInt();
        
        System.out.println("Lloviendo = " + (estaLloviendo = lluvia > 1));
        System.out.println("Tarea = " + (tareaTerminada = tarea > 1));
        System.out.println("Biblioteca = " + (irBiblioteca = biblioteca > 1));
        /**
         * Lo primero si esta lloviendo o no esta lloviendo en esta primera condicion devuelve true 
         * segundo si en lo primero te devuelve true y la tarea no esta hecha pero si vas a la biblioteca te devuelve true 
         * entonces se cumple que la primera es true y la segunda true se cumple ambas
         * en caso de que la segunda no se cumpla y sea false pues tiene otra condicion que es que si no esta lloviendo y que la tarea esta hecha te devuelve true y si puedes salir tambien
         */
        System.out.println("¿Puedes salir? " +(((estaLloviendo == true || estaLloviendo == false) && (tareaTerminada == false && irBiblioteca == true) || (estaLloviendo == true && tareaTerminada == true))));
        
        
    }
}
