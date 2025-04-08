package Tema5.Ejercicios.Ejercicio6;

import Tema4.Ejercicio3.Persona.Persona;

import java.util.SortedSet;
import java.util.TreeSet;

public class Ejercicio6 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("David","Vazquez",20);
        Persona persona2 = new Persona("Jose","Ramirez",20);
        Persona persona3 = new Persona("Jose","Dominguez",22);
        SortedSet<Persona> personas = new TreeSet<>();


        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        for (Persona p: personas) {
            System.out.println(p);
        }
        CompararApellido compararApellido = new CompararApellido();
        SortedSet<Persona> personasPorApellido = new TreeSet<>(compararApellido);
        personasPorApellido.addAll(personas);
        for (Persona s: personasPorApellido){
            System.out.println(s);
        }


    }
}
