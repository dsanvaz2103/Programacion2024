package Tema5.Ejercicios;

import Tema4.Ejercicio3.Persona.Persona;

import java.util.SortedSet;
import java.util.TreeSet;

public class Ejercicio5 {
    public static void main(String[] args) {
        SortedSet<Persona> personas = new TreeSet<>();
        Persona persona1 = new Persona("Fran", 20);
        Persona persona2 = new Persona("Juan", 30);
        Persona persona3 = new Persona("Fran", 10);
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
