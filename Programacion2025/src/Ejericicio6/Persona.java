package Ejericicio6;

import static Ejericicio6.Sexo.*;

public class Persona {
    public static void main(String[] args) {
        //Creacion de objetos
        Tema4.Persona persona1 = new Tema4.Persona("David", 23, 1.83, Masculino);
        Tema4.Persona persona2 = new Tema4.Persona("Adrian", 21, 1.8, NoBinario);
        Tema4.Persona persona3 = new Tema4.Persona("Alejandra", 18, 1.5, Femenino);

        //Imprimir por pantalla
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getEstatura());
        System.out.println(persona1.getSexo());
        System.out.println(persona2.getNombre());
        System.out.println(persona2.getEdad());
        System.out.println(persona2.getEstatura());
        System.out.println(persona2.getSexo());
        System.out.println(persona3.getNombre());
        System.out.println(persona3.getEdad());
        System.out.println(persona3.getEstatura());
        System.out.println(persona3.getSexo());
    }
}
