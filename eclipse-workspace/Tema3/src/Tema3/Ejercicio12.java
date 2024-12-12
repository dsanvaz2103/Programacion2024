package Tema3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] tabla = new int[5];
		int numero;
		int resultado;
		
		System.out.print("Escribe un numero que creas que este: ");
		numeroAleatorio(tabla);
		Arrays.sort(tabla);
		System.out.println(Arrays.toString(tabla));
		
		numero = scan.nextInt();
		//Busqueda lineal.
		resultado = busqueda(numero , tabla);
		
		//Imprimir resultado
		imprimirResultado(resultado);
		System.out.println("La posicion es: " + resultado);
		
		//Invocar busqueda binaria de la clase java.utils.Arrays
		resultado = Arrays.binarySearch(tabla,numero);
		
		//Imprimir resultado de nuevo y vemos si es el mismo que con la busqueda lineal
		imprimirResultado(resultado);
		System.out.println("La posicion es: " + resultado);
		
		scan.close();
	}
	
	/**
	 * 
	 * @param num numero que introduce el usuario.
	 * @param a array que recorremos para comprabar que coincide con el numero introduciado.
	 * @return devuelve -1 si no existe en el array el numero introducido por el usuario.
	 */
	public static int busqueda(int num,int[] a) {
	for (int j = 0; j < a.length; j++) {
		if (num == a[j]) {
			return j;
		}
	}
	return -1;
	}
	
	/**
	 * Imprime resultado
	 * @param resultado
	 */
	public static void imprimirResultado(int resultado) {
		if (resultado == -1) {
			System.out.println("El numero seleccionado no se encuentra en el array ");
		}else {
			System.out.println("El numero ha sido encontrado");
		}
	}
	
	/**
	 * Te introduce numero aleatorios en el array que hayamos creado
	 * @param tabla el array de la funcion
	 */
	public static void numeroAleatorio(int[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random()*100)+1;
		}
	}
}
