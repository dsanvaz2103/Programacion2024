/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg14;

import java.util.Scanner;

/**
 *
 * @author 1DAW2425-04
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int primerTrimestre;
        int segundoTrimestre;
        int tercerTrimestre;
        int notaFinal;
        float notaExpediente;
        float nota;
        System.out.print("Escribe la nota final del 1º Trimestre: ");
        primerTrimestre = scan.nextInt();
        System.out.print("Escribe la nota final del 2º Trimestre: ");
        segundoTrimestre = scan.nextInt();
        System.out.print("Escribe la nota final del 3º Trimestre: ");
        tercerTrimestre = scan.nextInt();
        nota = (primerTrimestre + segundoTrimestre + tercerTrimestre) / 3f;
        notaFinal = (int)nota;
        System.out.println("Nota boletin: " + notaFinal );
        System.out.println("Nota Expediente academico " + nota);
        
    }
    
}
