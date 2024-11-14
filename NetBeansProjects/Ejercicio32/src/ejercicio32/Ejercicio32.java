/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;

/**
 *
 * @author David Sánchez Vázquez
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(maximo(10,20));
    }
    
    public static int maximo (int x, int y) {
        return x > y ? x : y;
    }
}
