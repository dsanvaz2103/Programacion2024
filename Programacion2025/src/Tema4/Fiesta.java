package Tema4;

import Ejericicio6.Sexo;

import java.util.Scanner;

public class Fiesta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona persona1 = new Persona();
        persona1.saludar();
        persona1.cumplirAnios();
        persona1.crecer(0.3);
        System.out.println(persona1);
        Persona pepe = new Persona();
        Persona paco = new Persona();
        Persona persona4 = new Persona("Juana",23,1.60, Sexo.Masculino);
        Persona persona5 = new Persona("Pepa");
        Persona persona6 = new Persona("JuanAntonio");
        Persona persona7 = new Persona("Davilito",21,1.80,Sexo.NoBinario);
        pepe.setNombre("Jose");
        pepe.setEdad(-1);
        pepe.setEstatura(1.60);
        pepe.setApellido("Sánchez");
        System.out.println(pepe.getNombre());
        System.out.println(pepe.getEdad());
        System.out.println(pepe.getEstatura());
        System.out.println(pepe.getApellido());
    }
}
