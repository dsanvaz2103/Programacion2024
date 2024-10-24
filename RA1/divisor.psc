Algoritmo divisor
	Escribir "Ingrese el numero:"
	Leer n
	Escribir "Ingrese el divisor:"
	Leer m
	Si n MOD m = 0 Entonces
		Escribir m," es divisor exacto de ", n, "."
	SiNo
		Escribir "El resto de dividir ", n " por ", m, " es: ", n MOD m
	FinSi
FinAlgoritmo
