Algoritmo tipoTriangulo 
	
	Definir lado1 Como Real;
	Definir lado2 Como Real;
	Definir lado3 Como Real;
	
	Escribir "Lado 1";
	Leer lado1;
	Escribir "Lado 2";
	Leer lado2;
	Escribir "Lado 3";
	Leer lado3;
	
	Si  lado1 + lado2 > lado3 y lado1 + lado3 > lado2 y lado2 + lado3 > lado1 Entonces
		Escribir "Es un triangulo";
		Si lado1 = lado2 y lado1 = lado3 y lado2 = lado3  Entonces
			Escribir "El triangulo es Equilatero"
		SiNo
			Si lado1 = lado2 o lado3 = lado1 o lado2 = lado3 Entonces
				Escribir " El triangulo es Isosceles";
			SiNo
				Escribir " El triangulo es Escaleno"
			FinSi
		Fin Si
	SiNo
		Escribir "No es un triangulo";
	Fin Si
	
FinAlgoritmo
