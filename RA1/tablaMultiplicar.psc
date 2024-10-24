Algoritmo tablaMultiplicar
	Definir n Como Entero;
	Repetir
		Escribir "ponme un numero para mostrar la tabla"
		Leer n;
		contador = 0 
		contador = contador + 1 
		Si n <= 10 Entonces
			Para contador = 0 Hasta 10 Hacer
				multiplicacion = n * contador
				Escribir n , " * " , contador " = " multiplicacion
			FinPara
		SiNo
			Escribir "Este numero no tiene tabla";
		FinSi
	Hasta Que n > 10
FinAlgoritmo
