package Tema3;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		/*
		 * Introducir por teclado dos
		 *  frases e indicar cuál de ellas es la más corta, es decir, la que
		 *   contiene menos caracteres.
		 */
		Scanner scan = new Scanner(System.in);
		String frase1;
		String frase2;
		int comparacion;
		System.out.print("Introduce la primera frases para comparar cual es más corta: ");
		frase1 = scan.nextLine();
		System.out.print("Introduce la segunda frases para comparar cual es más corta: ");
		frase2 = scan.nextLine();
		
		// Probar metodo comparteTo
		comparacion = frase1.compareTo(frase2);
		System.out.println(frase1.compareTo(frase2));
		if (comparacion == 0) {
			System.out.println(frase1 + "es igual " + frase2);
		}else if (comparacion < 0) {
			System.out.println(frase1 + "es menor que " + frase2);
		}else {
			System.out.println(frase1 + "es mayor que " + frase2);
		}
		scan.close();
	}

}
