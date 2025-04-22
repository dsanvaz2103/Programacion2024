package Tema5.Ejercicios.Ejercici13;

import java.util.*;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese un texto:");
        String texto = scanner.nextLine();

        // Crear Map para almacenar palabras y sus frecuencias
        Map<String, Integer> frecuencias = new HashMap<>();

        // Limpiar y procesar el texto
        String textoProcesado = texto.toLowerCase()
                .replaceAll("[^\\w\\s]", "")  // Eliminar signos de puntuación
                .trim();                      // Eliminar espacios al inicio y fin

        // Dividir en palabras y contar frecuencias
        String[] palabras = textoProcesado.split("\\s+");

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                frecuencias.put(palabra,
                        frecuencias.getOrDefault(palabra, 0) + 1);
            }
        }

        // Ordenar las palabras alfabéticamente
        List<String> palabrasOrdenadas = new ArrayList<>(frecuencias.keySet());
        Collections.sort(palabrasOrdenadas);

        // Mostrar resultados
        System.out.println("\nFrecuencia de palabras:");
        for (String palabra : palabrasOrdenadas) {
            System.out.printf("%s: %d%n", palabra, frecuencias.get(palabra));
        }
    }
}
