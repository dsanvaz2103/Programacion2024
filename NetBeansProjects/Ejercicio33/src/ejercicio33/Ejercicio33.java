/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio33;

import java.util.Scanner;

/**
 *
 * @author David Sánchez Vázquez
 */
public class Ejercicio33 {

    public static void main(String[] args) {
        System.out.println(maximo(10,20, 15));
    }
    
    public static int maximo (int x, int y) {
        return x > y ? x : y;
    }
    
    public static int maximo (int x, int y ,int z){
        if(x > y && x > z){
            return x;
        }else{ 
            if (y > x && y > z) {
                return y;
            }else{
                return z;
            }
          }
        }
        
    }   
