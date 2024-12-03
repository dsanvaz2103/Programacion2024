package Tema3;

public class Ejercicio3 {

	public static void main(String[] args) {
		double sueldos[] = { 1800 , 1200 , 2000 , 1200 , 900};
		for (int i = 0; i < sueldos.length; i++) {
			System.out.print(sueldos[i]);
			sueldos[i] = sueldos[i] + 0.10 * sueldos[i];
			System.out.println( " + " + " 10% " + " = " + sueldos[i] +  "\n");
		}
	}

}
