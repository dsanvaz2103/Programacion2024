package Tema4.Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Introduce la hora (formato HH MM SS):");
            String[] partesHora = scanner.nextLine().split(" ");

            int hora = Integer.parseInt(partesHora[0]);
            int minuto = Integer.parseInt(partesHora[1]);
            int segundo = Integer.parseInt(partesHora[2]);

            System.out.println("Introduce el número de segundos a sumar:");
            int n = Integer.parseInt(scanner.nextLine());

            Hora tiempoInicial = new Hora(hora, minuto, segundo);
            System.out.println("\nSecuencia de horas:");
            System.out.println(tiempoInicial.toString());

            Hora tiempoActual = tiempoInicial;
            for (int i = 1; i <= n; i++) {
                tiempoActual = tiempoActual.sumarSegundos(1);
                System.out.println(tiempoActual.toString());
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
