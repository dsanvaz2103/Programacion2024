Algoritmo multiplicarCero
	Definir n Como Entero;
	Repetir
		Escribir "ponme un numero para mostrar la tabla"
		Leer n;
		contador = 0 
		contador = contador + 1
		Si n >= 1   Entonces
			Para contador = 0 Hasta 10 Hacer
				multiplicacion = n * contador
				Escribir n , " * " , contador " = " multiplicacion
			FinPara
		SiNo
			Escribir "Salir";
		FinSi
	Hasta Que n <= 0
FinAlgoritmo
