package Tema4.Ejercicio11.Main;

import Tema4.Ejercicio11.Libro.Libro;

public class Main {
    public static void main(String[] args) {
        // Crear varios objetos Libro
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "978-84-376-0493-9", 1605);
        Libro libro2 = new Libro("Don Quijote", "Miguel de Cervantes", "978-84-376-0493-9", 2000); // Mismo ISBN
        Libro libro3 = new Libro("La Odisea", "Homero", "978-84-376-0494-6", -800);

        // Imprimir cada libro usando toString()
        System.out.println("Libros:");
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());

        // Comparar libros con mismo ISBN
        System.out.println("\nComparación de libros:");
        System.out.println("¿libro1.equals(libro2)? " + libro1.equals(libro2)); // Debería ser true

        // Comparar libros con ISBN diferentes
        System.out.println("¿libro1.equals(libro3)? " + libro1.equals(libro3)); // Debería ser false
    }
}
