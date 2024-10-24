Algoritmo sumaPar
	n = 0
	cont = 0
	
	para i = 1 hasta 100 hacer
		si i mod 2 = 0 entonces
			n = n + i
			cont = cont + 1
		fin si
	fin para
	
	mostrar "Suma de números pares: ", n
	mostrar "Cantidad de números pares: ", cont
FinAlgoritmo
