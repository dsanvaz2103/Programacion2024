package Tema3;

public class Ejercicio13 {

	public static void main(String[] args) {
		int[] tabla1 = {1,2,3,4,5};
		int[] tabla2 = {1,2,3,4,5};
		boolean resultado;
		resultado = compararArrays(tabla1, tabla2);
		System.out.println(resultado);
	}
	
	public static boolean compararArrays(int[] a , int[] b){
		boolean resultado = true;
		int i = 0;
		while(i < a.length && resultado == true) {
			if (a[i] != b[i] || a.length != b.length) {
				resultado = false;
			}
			i++;
		}
		return resultado;
	}
}
