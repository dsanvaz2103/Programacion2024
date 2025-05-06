package Tema6.Ejercicio8;

import java.util.Scanner;

import static Tema6.Ejercicio8.ComprobadorDeTemperatura.comprobadorDeTemperatura;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        try {
            System.out.println("Ingrese la temperatura que presenta ahora mismo en el hambiente");
            n = sc.nextInt();
            comprobadorDeTemperatura(n);
        }catch (TemperaturaFueraDeRangoException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
