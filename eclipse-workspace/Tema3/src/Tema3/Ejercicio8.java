package Tema3;

public class Ejercicio8 {
	public static void main(String[] args) {
		int[] t = {1,2,34,56,7,7};
		System.out.println("El numero maximo es: " + maximo(t));
	}
	public static int maximo(int t []) {
		int max = t[0];
		
		for (int i = 0; i < t.length; i++) {
			if (t[i] > max) {
				max = t[i];
			}
		}
		return max;
		
	}
}
