package Tema3;

import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String contrasenia;
		String intento;
		boolean respuesta;
		System.out.println("Jugador1: Introduzca la contrasenia que quieras: ");
		contrasenia = scan.nextLine();
		do {
			System.out.println("Jugador 2: Intenta acertar la contrasenia:  ");
			intento = scan.nextLine();
			respuesta = contraseniaAcertada(contrasenia, intento);
			compararTamanio(contrasenia, intento);
		} while (respuesta != true);
		System.out.println("Contrasenia Acertada: ");
		scan.close();
	}
	
	public static boolean contraseniaAcertada(String contrasenia ,  String respuesta) {
		boolean resultado = true;
		if(contrasenia.equals(respuesta)) {
			resultado = true;
		}else {
			resultado = false;
		}
		return resultado;
		
	}
	
	public static void compararTamanio(String contrasenia1 , String contrasenia2) {
		int comparacion;
		System.out.print("Diferencia de caracteres: ");
		comparacion = contrasenia1.compareTo(contrasenia2);
		System.out.println(contrasenia1.compareTo(contrasenia2));
		if (comparacion == 0) {
			System.out.println("Contrasenia principal es igual que Respuesta");
		}else if (comparacion < 0) {
			System.out.println("Contrasenia principal es menor que Respuesta");
		}else {
			System.out.println("Contrasenia principal es mayor que Respuesta");
		}
	}
}
