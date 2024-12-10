package Tema3;

import java.util.Arrays;

public class Ejercicio10 {

	public static void main(String[] args) {
		int[] m = new int[10];
		Arrays.fill(m , 3);
		System.out.println(Arrays.toString(m));
		Arrays.fill(m , 5,9,2);
		System.out.println(Arrays.toString(m));
	}

}
