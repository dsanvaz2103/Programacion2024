package Tema4.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Crear una nueva persona
        Persoma persona = new Persoma("Juan", 25, 1.75);

        // Mostrar estado inicial
        System.out.println("Estado inicial:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Estatura: " + persona.getEstatura() + "m");

        // Cumplir años
        persona.cumplirAños();
        System.out.println("\nDespués de cumplir años:");
        System.out.println("Edad: " + persona.getEdad());

        // Crecer 5 cm
        persona.crecer(0.05);
        System.out.println("\nDespués de crecer 5 cm:");
        System.out.println("Estatura: " + persona.getEstatura() + "m");
    }
}
