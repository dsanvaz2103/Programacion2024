Algoritmo operacionesMatematicas
	
	//Definimos las variables 
		Definir operacionSeleccionada como Cadena;
		Definir variable1 Como Entero;
		Definir variable2 como Entero;
		Definir operacionSuma Como Entero;
		Definir operacionResta Como Entero;
		Definir operacionMultiplicacion Como Entero;
		Definir operacionDivision Como Entero;
		
	//Creamos la variables
		Escribir "Escribe el valor 1";
		Leer variable1;
		
	//Creamos un menu para que pueda seleccionar el usuario
		Escribir "Selecciona el tipo de operacion que quieres realizar";
		Escribir " 1.Suma";
		Escribir " 2.Resta";
		Escribir " 3.Multiplicacion";
		Escribir " 4.Division";
		Leer operacionSeleccionada;
		
	//Creamos la variables
		Escribir  "Escribe el valor 2";
		Leer variable2;
		
	//Aqui le mandamos a nuestro prograna que vaya comparando mediante condicionales que operacion hemos realizado y cual debe ejecutar 
	//Te lee tanto la opcion seleccionada te lee simbolo y numeros de la opcion	

	Si operacionSeleccionada = "+" o operacionSeleccionada = "1" Entonces
		operacionSuma = variable1 + variable2;
		Escribir variable1 " + " , variable2 ," = " , operacionSuma;
	SiNo
		Si operacionSeleccionada = "-" o operacionSeleccionada = "2" Entonces
			operacionResta = variable1 - variable2;
			Escribir variable1 " - " , variable2 ," = " , operacionResta;
		SiNo
			Si operacionSeleccionada = "*" o operacionSeleccionada = "3" Entonces
				operacionMultiplicacion  = variable1 * variable2;
				Escribir variable1 " * " , variable2 ," = " , operacionMultiplicacion;
			SiNo
				Si operacionSeleccionada = "/" o operacionSeleccionada = "4" Entonces
					operacionDivision = variable1 / variable2;
					Escribir variable1 " / " , variable2 ," = " , operacionDivision;
				SiNo
					Escribir "Sintax  Error";
				FinSi
			FinSi
		FinSi
	FinSi

FinAlgoritmo
