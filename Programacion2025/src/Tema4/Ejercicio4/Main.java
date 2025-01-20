package Tema4.Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hora horaDia = new Hora(12,23,45);
        System.out.print("Introduzca los segundos que quieres añadir ");
        int segundos = sc.nextInt();
        System.out.println(horaDia.incrementoSegundos(segundos));
        horaDia.mostrarHora();
    }
}
