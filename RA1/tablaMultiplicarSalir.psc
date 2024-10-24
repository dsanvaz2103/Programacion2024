Algoritmo sin_titulo
	Definir n Como Entero;
	Repetir
		Escribir "ponme un numero para mostrar la tabla"
		Leer n;
		contador = 0 
		contador = contador + 1
		Escribir "quieres salir?"
		Leer num;
		Si n >= 0 && num = "no"  Entonces
			Para contador = 0 Hasta 10 Hacer
				multiplicacion = n * contador
				Escribir n , " * " , contador " = " multiplicacion
			FinPara
		SiNo
			Escribir "Este numero no tiene tabla";
		FinSi
	Hasta Que num = "salir"
FinAlgoritmo
