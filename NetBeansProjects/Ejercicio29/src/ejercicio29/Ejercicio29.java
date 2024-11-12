/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio29;

/**
 *
 * @author David Sánchez Vázquez
 */
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int multiplicacion;
        for (int i = 1; i <= 10; i++) {
              System.out.println("-------------");
              System.out.println("| " + "Tabla: " + i + " | ");
              System.out.println("-------------");
            for (int j = 0; j <= 10; j++) {
                multiplicacion = i * j;
                System.out.println(i + " * " + j + " = " + multiplicacion); 
            }
        }

    }
    
}
