Algoritmo operacionSegun
	//Definimos las variables 
	Definir operacionSeleccionada como Cadena;
	Definir variable1 Como Entero;
	Definir variable2 como Entero;
	Definir operacionSuma Como Entero;
	Definir operacionResta Como Entero;
	Definir operacionMultiplicacion Como Entero;
	Definir operacionDivision Como Real;
	
	//Creamos un menu para que pueda seleccionar el usuario
	Escribir "Selecciona el tipo de operacion que quieres realizar";
	Escribir " 1.Suma";
	Escribir " 2.Resta";
	Escribir " 3.Multiplicacion";
	Escribir " 4.Division";
	Leer opcionMenu;
	//Creamos la variables
	Escribir "Escribe el valor 1";
	Leer variable1;
	Escribir  "Escribe el valor 2";
	Leer variable2;
	Segun opcionMenu Hacer
		Caso 1:
			operacionSuma = variable1 + variable2;
			Escribir variable1 " + " , variable2 ," = " , operacionSuma;
		Caso 2:
			Leer variable2;
			operacionResta = variable1 - variable2;
			Escribir variable1 " - " , variable2 ," = " , operacionResta;
		Caso 3:
			operacionMultiplicacion  = variable1 * variable2;
			Escribir variable1 " * " , variable2 ," = " , operacionMultiplicacion;
		Caso 4:
			operacionDivision = variable1 / variable2;
			Escribir variable1 " / " , variable2 ," = " , operacionDivision;
		De Otro Modo:
			Escribir "opcion no seleccionada correctamente";
	Fin Segun
FinAlgoritmo
