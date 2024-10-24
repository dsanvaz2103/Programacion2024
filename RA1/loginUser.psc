Algoritmo loginUser
	//Definimos las variables 
	Definir user como Cadena;
	Definir password como Cadena;
	user = "dsv";
	password = "cat";
	
	Escribir "Introduce tu usuario";
	Escribir user1;
	Leer user1;
	
	Escribir "Introduce tu contrasenia";
	Escribir password1;
	Leer password1;
	
	Si user1 = user y password1 = password Entonces
		Escribir "El usuario ", user1 " es correcto";
	SiNo
		Escribir "El usuario o la contrasenia no es correcto";
	Fin Si
	
FinAlgoritmo
