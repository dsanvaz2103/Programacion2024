Algoritmo anioBisiesto
	//Definimos las variables 
	Definir numeroBisiesto Como Entero;
	Escribir "Escribe un numero";
	Leer numeroBisiesto;
	// MOD es un comando de pseint que te calcula el resto de la division
	// En esta condicion dice que si el numero escrito por pantalla al dividirse entre dos el resto es 0 
	Si ((numeroBisiesto MOD 4)  = 0 y no (numeroBisiesto MOD 100) = 0) o ((numeroBisiesto MOD 400)  = 0) Entonces
		Escribir " El numero " , numeroBisiesto , " Es Bisiesto ";
	SiNo
		Escribir " El numero " , numeroBisiesto , " No es Bisiesto "
	Fin Si
FinAlgoritmo
