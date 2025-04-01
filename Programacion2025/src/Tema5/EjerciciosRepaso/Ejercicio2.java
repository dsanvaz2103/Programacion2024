package Tema5.EjerciciosRepaso;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ejercicio2 {
 public static void main(String[] args) {
     Set<String> nombres = new LinkedHashSet<>();
     nombres.add("Jose");
     nombres.add("Paula");
     nombres.add("James");
     System.out.println(nombres);
     System.out.println("Tamanio: " + nombres.size());
     boolean agregar = nombres.add("Juan");
     System.out.println(agregar);
     System.out.println(nombres);
     System.out.println("Tamanio: " + nombres.size());
     nombres.add(null);
     System.out.println(nombres);
     for(String alumno: nombres){
         System.out.println("D." + alumno + "\n");
     }

     System.out.println("HasSet" + "\n");

     Set<String> nombres2 = new HashSet<>();
     nombres.addAll(nombres2);
 }
}
