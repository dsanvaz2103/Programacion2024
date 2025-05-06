package Tema6;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Crear un ArrayList con 5 elementos
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(Integer.valueOf(10));
        lista.add(Integer.valueOf(20));
        lista.add(Integer.valueOf(30));
        lista.add(Integer.valueOf(40));
        lista.add(Integer.valueOf(50));

        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar un índice al usuario
            System.out.print("Introduce un índice (0 a 4): ");
            int indice = scanner.nextInt();

            // Mostrar el valor en la posición indicada
            System.out.println("El valor en la posición " + indice + " es: " + lista.get(indice));

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: El índice está fuera del rango permitido (0 a 4).");
        } catch (Exception e) {
            System.out.println("Error: Debes introducir un número entero válido.");
        }

        scanner.close();
    }
}
