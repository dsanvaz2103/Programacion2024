package Tema3;

public class EjemploImprimirArray {
	public static void main(String[] args) {
		int tablas[] = {2,4,6,8,10};
		//Imprimir la referencia
		System.out.println(tablas);
		//Imprimir contenido
		System.out.print("{ ");
		for (int i = 0; i < tablas.length - 1; i++) {
			System.out.print(tablas[i]);
			System.out.print(" , ");
		}
		System.out.println(" }");
		//Imprimir contenido con for-each
		System.out.println("for-each");
		for (int x : tablas) {
			System.out.println(x);
		}
	}
}
