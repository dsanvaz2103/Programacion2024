package Tema5.Ejercicios.Ejercicio7;

import Tema4.Ejercicio3.Persona.Persona;

import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("David", "Vazquez", 20);
        Persona persona2 = new Persona("Jose", "Ramirez", 20);
        Persona persona3 = new Persona("Jose", "Dominguez", 22);
        SortedSet<Persona> personas = new TreeSet<>();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        for (Persona p : personas) {
            System.out.println(p);
        }

        Set<Persona> personal = new TreeSet<>();
        personal.add(persona1);
        personal.add(persona2);
        personal.add(persona3);
        for (Persona p : personal) {
            System.out.println(p);
        }
        // Primera persona del conjunto con Set no te lo permite utilizando el first()
        Iterator<Persona> iterator = personas.iterator();
        while (iterator.hasNext()) {
            System.out.println("Primero" + iterator.next());
        }
        //    System.out.println(personal.first());
        SortedSet<Persona> personal2 = new TreeSet<>();
        personal2.add(persona1);
        personal2.add(persona2);
        personal2.add(persona3);
        for (Persona p : personal2) {
            System.out.println(p);
        }
        System.out.println(personal2.first());
    }
}
