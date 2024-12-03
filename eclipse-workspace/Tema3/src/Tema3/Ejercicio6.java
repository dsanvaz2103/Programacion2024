package Tema3;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		int[] tabla = new int[10];
		for (int i = 0; i < tabla.length; i++) {
			System.out.print("Escribe un numero para que sea almacenado: ");
			num = scan.nextInt();
			tabla[i] = num;
			System.out.println(tabla[i]);
		}
		scan.close();
	}
}
