/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1DAW2425-04
 */
package programacion.ut2;

import java.util.Scanner;

public class EntradaDatos {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String animal;
           System.out.println(" Selecciona tu animal favorito: ");
            animal = scan.next();   
        if ("Perro".equals(animal) || ("Gato".equals(animal)) ||  ("Raton".equals(animal)) || 
                ("Canario".equals(animal)) || ("Coballa".equals(animal)) || 
                ("Marcos".equals(animal)) || ("Alberto".equals(animal))){
            
            System.out.println("El animal " + animal + " Es un animal domestico");
        }else{
            System.out.println("El animal " + animal + "  No es un animal domestico" );
        }
    }
    
}
