package Tema6.Ejercicio7;

import java.util.Scanner;

import static Tema6.Ejercicio7.ValidarContrasena.validarContrasena;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce una contraseña: ");
            String contrasena = scanner.nextLine();

            try {
                validarContrasena(contrasena);
                System.out.println("Contraseña válida.");
            } catch (ContrasenaInvalidaException e) {
                System.out.println("Error: " + e.getMessage());
                throw e; // Relanzamos la excepción
            }

        } catch (ContrasenaInvalidaException e) {
            System.out.println("La excepción ha sido capturada nuevamente en el segundo bloque catch.");
        }

        scanner.close();
    }
}
