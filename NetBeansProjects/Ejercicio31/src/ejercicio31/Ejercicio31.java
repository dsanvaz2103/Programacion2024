/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio31;

/**
 *
 * @author David Sánchez Vázquez
 */
public class Ejercicio31 {

   public static void main(String[] args) {
        variosSaludos(suma(2,3));
        System.out.println(suma(2,3)+2);
    }
    public static void variosSaludos(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Hola");
        }
    }
    
    public static int suma (int x, int y) {
        int resultado;
        resultado = x + y;
        return resultado;
    }
    
}
