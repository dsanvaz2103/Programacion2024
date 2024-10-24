Algoritmo calificacion
	Definir nota Como Entero;
	Escribir  "Escribe una nota";
	Leer nota;
	Segun nota Hacer
		1 , 2 , 3 , 4:
			Escribir nota , "  Insuficiente";
		5:
			Escribir nota , " Suficiente";
		6:
			Escribir nota , " Bien";
		7 , 8:
			Escribir nota , " Notable";
		9 , 10:
			Escribir nota , " Sobresaliente";
		De Otro Modo:
			Escribir nota ,  "Nota incorrecta";
	Fin Segun
FinAlgoritmo
