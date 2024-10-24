Algoritmo mcd
	Definir a Como Entero;
	Definir b Como Entero;
	Definir resto Como Entero;
	Definir temp Como Entero;
    
    Escribir  "Ingrese el primer número: ";
    Leer a;
    Escribir "Ingrese el segundo número: ";
    Leer b;
    
    Mientras  b <> 0 Hacer
        temp = b;
        b = a MOD b;
        a = temp;
        
        SI a == 0 
            Escribir "El MCD es: ", b;
		FinSi
	FinMientras
		
FinAlgoritmo
