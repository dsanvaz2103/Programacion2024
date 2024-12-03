package Tema3;

public class Ejercicio4 {

	public static void main(String[] args) {
		int tablas[] = new int[10];
		int suma = 0;
		for (int i = 0; i < tablas.length; i++) {
			tablas[i] = (int) (Math.random()*100)+1;
			System.out.println(tablas[i]);
			suma = (suma += tablas[i]);
		}
		System.out.println(suma);
	}

}
