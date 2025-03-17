package Tema4.Ejercicio2;

public class Fiesta {
    public static void main(String[] args) {
        // Crear una nueva instancia de Persona
        Persona persona = new Persona("Juan");

        // Mostrar la referencia del objeto
        System.out.println("Referencia del objeto: " + persona);

        // Mostrar el contenido del objeto usando toString()
        System.out.println("Contenido del objeto: " + persona.toString());

        // Mostrar el nombre usando el getter
        System.out.println("Nombre de la persona: " + persona.getNombre());
    }
}
