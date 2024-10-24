Algoritmo mayorMenor
	//Definimos las variables 
	Definir numero1 Como Real;
	Definir numero2 Como Real;
	Escribir "Escribe el primer numero";
	Leer numero1;
	Escribir "Escribe el segundo numero";
	Leer numero2;
	Si numero1 < numero2 Entonces
		Escribir numero2 ," es mayor que " , numero1;
	SiNo
		
		Si numero1 > numero2 Entonces
			Escribir numero1 ," es mayor que " , numero2
		SiNo
			
			Si numero1 = numero2 Entonces
				Escribir numero1, " y " , numero2 , " son iguales";
			FinSi
			
		FinSi
		
	Fin Si
FinAlgoritmo
