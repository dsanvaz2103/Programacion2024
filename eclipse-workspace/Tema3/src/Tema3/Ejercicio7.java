package Tema3;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num2;
		int num;
		System.out.print("Escribe cuantos numeros deseas introducir: ");
		num2 = scan.nextInt();
		int[] tabla = new int[num2];
		for (int j = 0; j < tabla.length; j++) {
			System.out.print("Escribe un numero para que sea almacenado: ");
			num = scan.nextInt();
			tabla[j] = num;
		}
		for (int i = tabla.length -1; i > 0; i--) {
			System.out.println(tabla[i] );
		}
		scan.close();
	}
}
