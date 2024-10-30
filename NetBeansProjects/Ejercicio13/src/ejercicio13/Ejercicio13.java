/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;



/**
 *
 * @author 1DAW2425-04
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Primero realizamos la multiplicacion entonces seria 10 * 10 = 20 y como no es mayor a 20 la primera 
         * es false entonces como ya no se cumple una de las dos condiciones es falso debido a asignar el &&
        */
        System.out.println(10 + 5 * 2 >20 && 4 == 4);
        /**
         * Con que se cumpla una de las  dos es true en este caso la multiplicacion coincide en que 3 * 2 es igual a 6
         */
        System.out.println(!(7 + 3 > 10) || 3 * 2 <= 6);
        System.out.println(10 / 2 + 3 * 5 == 19 && true);
        /**
         * como x es cinco y es con el simbolo += seria x + (3 * 2) que seria = 11
         */
        int x = 5; 
        x += 3 * 2;
        System.out.println(x);
        /**
         * Como se cumple la primera que al ser !b es decir es igual a True ya que b es igual a false y 
         * como se cumple una de las dos condiciones es TRUE
         */
        boolean b = false; 
        b = !b || 7 % 2 == 1;
        System.out.println(b);
    }
    
}
