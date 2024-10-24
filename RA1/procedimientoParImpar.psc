Algoritmo procedimientoParImpar
	//Definimos las variables 
	Definir numeroParImpar Como Entero;
	Definir parImpar Como Entero;
	Escribir "Escribe un numero";
	Leer numeroParImpar;
	num(numeroParImpar)
FinAlgoritmo

Funcion num(numParImpar)
	// MOD es un comando de pseint que te calcula el resto de la division
	// En esta condicion dice que si el numero escrito por pantalla al dividirse entre dos el resto es 0 
	// Significa que el numero es par
	Si (numParImpar MOD 2)  = 0 Entonces
		Escribir  " El numero " , numParImpar , " Es Par";
	SiNo
		Escribir  " El numero " , numParImpar , " Es Impar";
	Fin Si
	Escribir parImpar;
FinFuncion