Algoritmo funcionConcatenar
	Definir n , i Como Cadena;
	Leer i;
	Escribir "Escribe tu nombre";
	Leer n;
	espacioBlanco = concatenaConEspacio(i, n)
FinAlgoritmo

Funcion concatenarConEspacios <- concatenaConEspacio(a,b)
	espacio = " ";
	salida = Concatenar(a,Concatenar(espacio , b))
	Escribir salida;
FinFuncion
	