Algoritmo parImpar
	//Definimos las variables 
	Definir numeroParImpar Como Entero;
	Escribir "Escribe un numero";
	Leer numeroParImpar;
	// MOD es un comando de pseint que te calcula el resto de la division
	// En esta condicion dice que si el numero escrito por pantalla al dividirse entre dos el resto es 0 
	// Significa que el numero es par
	Si (numeroParImpar MOD 2)  = 0 Entonces
		Escribir " El numero " , numeroParImpar , " Es Par";
	SiNo
		Escribir " El numero " , numeroParImpar , " Es Impar";
	Fin Si
FinAlgoritmo
