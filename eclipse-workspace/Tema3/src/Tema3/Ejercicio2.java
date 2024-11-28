package Tema3;

public class Ejercicio2 {

	public static void main(String[] args) {
		 int[] enteros;
		    enteros = new int[11];
		    enteros[0] = 20;
		    enteros[1] = 22;
		    enteros[2] = 23;
		    enteros[3] = 24;
		    enteros[4] = 25;
		    enteros[5] = 26;
		    enteros[6] = 27;
		    enteros[7] = 28;
		    enteros[8] = 29;
		    enteros[9] = 30;
		    enteros[10] = 31;
		    System.out.println(enteros);
		    
		    int t1[], t2[] = null;
		    t1 = new int[5];
		    t1[0] = 10;
		    System.out.println(t1);
		    System.out.println(t1[0]);
		    t1[1] = 11;
		    System.out.println(t2);
		    t2 = t1;
		    System.out.println(t2);
		    t1 = null;
		    System.out.println(t1);
		    t2 = new int[5];
		    metodo(enteros);
		    System.out.println(enteros[0]);
		}

		    static void metodo(int[] x) {
		        System.out.println(x);
		        x[0] = 33;
	}
}

