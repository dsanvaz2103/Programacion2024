package Tema3;

public class EjemploString {

	public static void main(String[] args) {
		
		//Conversion
		int i = 65;
		char a = (char)i;
		System.out.println(a);
		
		// No nos pide conversion ya que el int ocupa 4 byte mientras que el char ocupa 2
		// Por eso si queremos pasar un entero a char si tienes que hacer una conversion
		
		i = a;
		System.out.println(i);
		
		System.out.println("Hola \"Fr\tan\" ");

		System.out.println(" \"Fran\" ");
		//Convertir int a String
		
		int j = 123;
		String s = String.valueOf(j);
		System.out.println(s);
		
		//Comparar cadenas
		String cad1 = "Hola";
		String cad2 = "Hola";
		System.out.println(cad1 == cad2);
		
		int e1 = 1;
		int e2 = 1;
		System.out.println(e1 == e2);
		
		// Comparar cad1 y cad2 con equals
		
		System.out.println(cad1.equals(cad2));
		
		String cad3 = "Pepa";
		String cad4 = "Josefa";
		int comparacion;
		// Probar metodo comparteTo
		// Cadenas iguales
		comparacion = cad1.compareTo(cad2);
		// Cadena invocante menor devuelve un numero negativo
		comparacion = cad4.compareTo(cad3);
		// Cadena invocante mayor devuelve un numero positivo
		comparacion = cad3.compareTo(cad4) ;
		
		if (comparacion == 0) {
			System.out.println("La cadena es igual");
		}else if (comparacion < 0) {
			System.out.println("La primera es menor");
		}else {
			System.out.println("La primera es mayor");
		}
		
		// Te devuelve la posicion del array en la que se encuentr la palabra Fran
		System.out.println("Hola Fran".indexOf("Fran"));
		
		System.out.println("Hola".isEmpty());
		System.out.println("".isEmpty());
		//Busca si existe la cadena en el Array
		System.out.println("Hola Fran".contains("Fran"));
		// Remplaza cadenas
		System.out.println("asdf".replace("a", "B"));
		System.out.println("aaaff".split("b"));
	}

}
