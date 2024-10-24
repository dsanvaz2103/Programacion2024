Algoritmo sumaParesImpares
	Definir n Como Entero;
	Definir suma1 Como Entero;
	Definir suma2 Como Entero;
	n = 0
	Repetir
		Escribir "Introduce un numero par o impar"
		Leer n;
		si n mod 2 = 0 entonces
			suma1 = suma1 + n;
		SiNo
			suma2 = suma2 + n
		fin si
	Hasta Que n <=  0 
	Escribir "Suma de números pares: ", suma1;
	Escribir "Suna de numeros impares: ", suma2;
FinAlgoritmo
