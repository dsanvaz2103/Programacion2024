package Tema4.EjercicioRepasoBiblioteca.Main;

import Tema4.EjercicioRepasoBiblioteca.Class.Biblioteca;
import Tema4.EjercicioRepasoBiblioteca.Class.Libro;

public class Main {
    public static void main(String[] args) {
        // Crear biblioteca con capacidad para 10 libros
        Biblioteca biblioteca = new Biblioteca(10);

        // Crear y agregar libros
        Libro libro1 = new Libro("Don Quijote", "Miguel de Cervantes", 1605);
        Libro libro2 = new Libro("La Odisea", "Homero", 800);
        Libro libro3 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1954);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        // Mostrar libros inicialmente
        System.out.println("=== Catálogo Inicial ===");
        biblioteca.mostrarLibros();

        // Intentar prestar un libro
        System.out.println("\nPrestando 'Don Quijote':");
        biblioteca.prestarLibro("Don Quijote");

        // Mostrar estado después del préstamo
        System.out.println("\n=== Catálogo Actualizado ===");
        biblioteca.mostrarLibros();
    }
}
