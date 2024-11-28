package Tema3;

public class SumarNumerosNaturales {

	public static void main(String[] args) {
		int naturales[] = {1,2,3,4,5};
		int suma = 0;
		for (int x : naturales) {
			System.out.println(x);
			suma = suma +  x;
			System.out.println("Suma : " + suma + " + " + x  + " = " + suma);
		}
	}

}
