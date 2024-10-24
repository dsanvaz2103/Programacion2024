/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author 1DAW2425-04
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        short numero = 32767;
        System.out.println("Numero de serie " + numero);
        numero++; 
        //Al sumarle vuelve a -32768
        System.out.println("Numero al sumarle 1 " + numero);
    }
    
}
