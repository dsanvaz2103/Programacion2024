Algoritmo calculadoraModulo
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
// llamamos a la funcion creada fuera del Algoritmo 
	
	Si operacionSeleccionada = "+" o operacionSeleccionada = "1" Entonces
		operaciones = suma(variable1 , variable2 , operacionSeleccionada);
		Escribir operaciones;
	SiNo
		Si operacionSeleccionada = "-" o operacionSeleccionada = "2" Entonces
			operaciones = resta(variable1 , variable2 , operacionSeleccionada);
			Escribir operaciones;
		SiNo
			Si operacionSeleccionada = "*" o operacionSeleccionada = "3" Entonces
				operaciones = multiplicacion(variable1 , variable2 , operacionSeleccionada);
				Escribir operaciones;
			SiNo
				Si operacionSeleccionada = "/" o operacionSeleccionada = "4" Entonces
					operaciones = division(variable1 , variable2 , operacionSeleccionada);
					Escribir operaciones;
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo

// Creamos la funcion 
Funcion calcsum <- suma(numero1,numero2,operacionSelect)
	operacionSuma = numero1 + numero2;
	Escribir numero1 " + " , numero2 ," = " , operacionSuma;
FinFuncion

Funcion calcrest <- resta(numero1,numero2,operacionSelect)
	operacionResta = numero1 - numero2;
	Escribir numero1 " - " , numero2 ," = " , operacionResta;
FinFuncion

Funcion calcmult <- multiplicacion(numero1,numero2,operacionSelect)
	operacionMultiplicacion  = numero1 * numero2;
	Escribir numero1 " * " , numero2 ," = " , operacionMultiplicacion;
FinFuncion
Funcion calcrdiv <- division(numero1,numero2,operacionSelect)
	operacionDivision = numero1 / numero2;
	Escribir numero1 " / " , numero2 ," = " , operacionDivision;	
FinFuncion


