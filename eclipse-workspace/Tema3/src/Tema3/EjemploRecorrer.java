package Tema3;


public class EjemploRecorrer {
	public static void main(String[] args) {
		//Crear array de 5 posiciones tipo caracter
		
		//Recorrer el array para inicializar 
		//cada posicion con la letra 'a'
		
		char[] letra = new char[5];
		
		for(int i = 0; i < letra.length; i ++) {
			letra[i] = 'a';
			System.out.println(i + " " + letra[i]);
		}

	}

}
