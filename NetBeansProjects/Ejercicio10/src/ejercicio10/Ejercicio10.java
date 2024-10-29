/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author David Sánchez Vázquez
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final float kilosPrecioManzana = 2.35f;
        final float kilosPrecioPeras = 1.95f;
        float semestreKgManzanas1;
        float semestreKgManzanas2;
        float semestreKgManzanas3;
        float semestreKgPeras1;
        float semestreKgPeras2;
        float semestreKgPeras3;
        double importeTotalSemestre1;
        double importeTotalSemestre2;
        double importeTotalSemestre3;
        double importeTotal;
        //Primersemestre
        System.out.println("Cuantos kilos de manzanas vende en 1º semestre? ");
        semestreKgManzanas1 = scan.nextFloat();
        System.out.println(semestreKgManzanas1 + " Kg " );
        System.out.println("Cuantos kilos de peras vende en 1º semestre? ");
        semestreKgPeras1 = scan.nextFloat();
        System.out.println(semestreKgPeras1 + " Kg ");
        //Segundo semestre
        System.out.println("Cuantos kilos de manzanas vende en 2º semestre? ");
        semestreKgManzanas2 = scan.nextFloat();
        System.out.println(semestreKgManzanas2 + " Kg " );
        System.out.println("Cuantos kilos de peras vende en 2º semestre? ");
        semestreKgPeras2 = scan.nextFloat();
        System.out.println(semestreKgPeras2 + " Kg ");
        //Tercer semestre
        System.out.println("Cuantos kilos de manzanas vende en 3º semestre? ");
        semestreKgManzanas3 = scan.nextFloat();
        System.out.println(semestreKgManzanas3 + " Kg " );
        System.out.println("Cuantos kilos de peras vende en 3º semestre? ");
        semestreKgPeras3 = scan.nextFloat();
        System.out.println(semestreKgPeras3 + " Kg ");
        
        importeTotalSemestre1 = (kilosPrecioManzana * semestreKgManzanas1) + (kilosPrecioPeras * semestreKgPeras1);
        importeTotalSemestre2 = (kilosPrecioManzana * semestreKgManzanas2) + (kilosPrecioPeras * semestreKgPeras2);
        importeTotalSemestre3 = (kilosPrecioManzana * semestreKgManzanas3) + (kilosPrecioPeras * semestreKgPeras3);
        importeTotal = importeTotalSemestre1 + importeTotalSemestre2;
        importeTotal += importeTotalSemestre3;
        System.out.println("Importe total Semestre 1: " + importeTotalSemestre1 + " $ ");
        System.out.println("Importe total Semestre 2: " + importeTotalSemestre2 + " $ ");
        System.out.println("Importe total Semestre 3: " + importeTotalSemestre3 + " $ ");
        System.out.println("Importe total " + importeTotal + " $ ");
    }
    
}
