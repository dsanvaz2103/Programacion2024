package Tema5.EjerciciosRepaso;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Libros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> libros = new HashSet<>();
        String libro1 = "El Quijote";
        String libro2 = "El Gato Con Botas";
        libros.add(libro1);
        libros.add(libro2);
        System.out.println(libros);

        int opc;
        do {
            System.out.println("Marque la opcion");
            System.out.println("1. Mostrar Libros");
            System.out.println("2. Agregar Libro");
            System.out.println("3. Eliminar Libro");
            System.out.println("4. Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1: {
                    System.out.println(libros);
                    break;
                }
                case 2: {
                    String libroNuevo;
                    System.out.println("Introduzca el nombre del libro");
                    libroNuevo = sc.next();
                    if (libros.add(libroNuevo)) {
                        System.out.println("Libro agregado");
                    } else {
                        System.out.println("No se puede agregar el libro");
                    }
                    break;
                }
                case 3: {
                    Iterator<String> it = libros.iterator();
                    String libroNuevo;
                    System.out.println("Introduzca el nombre del libro que quiere eliminar");
                    libroNuevo = sc.next();
                    while (it.hasNext()) {
                        libroNuevo = it.next();
                        if (libros.equals(libroNuevo)) {
                            it.remove();
                        }
                    }
                }
            }
        } while (opc != 4);
        System.out.println("Libros definitivos: " + libros);
    }
}
