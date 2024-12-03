package Tema3;

public class Ejercicio5 {
	public static void main(String[] args) {
		int b[] = {1 ,3, 5, 6, 7};
		int x;
		x = suma(b);
		System.out.println(x);	
	}
	
	public static int suma(int[] a) {
		int suma = 0;
		for (int i = 0; i < a.length; i++) {
			suma = suma + a[i];	
		}
		return suma;
	}
}
