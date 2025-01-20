package Tema4.Ejericicio6;

import static Tema4.Ejericicio6.Sexo.*;

public class Persona {
    public static void main(String[] args) {
        //Creacion de objetos
        Tema4.Persona persona1 = new Tema4.Persona("David", 23, 1.83, Masculino);
        Tema4.Persona persona2 = new Tema4.Persona("Adrian", 21, 1.8, NoBinario);
        Tema4.Persona persona3 = new Tema4.Persona("Alejandra", 18, 1.5, Femenino);
        //Imprimir por pantalla
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
    }
}
