package Tema4.EjerciciosRepaso;

import Tema4.EjerciciosRepaso.Deportes.Compite;
import Tema4.EjerciciosRepaso.Deportes.Deportista;
import Tema4.EjerciciosRepaso.Deportes.EntrenamientoFutbol;
import Tema4.EjerciciosRepaso.Deportes.Furbolista;

public class Main {
    public static void main(String[] args) {
        // Crear dos futbolistas
        Deportista f1 = new Furbolista("Juan", 25, "Fútbol", "Delantero" , 3);
        Deportista f2 = new Furbolista("María", 28, "Fútbol", "Defensora", 3);

        // Modificar valores usando setters
        f1.setEdad(26);

        // Crear y usar EntrenamientoFutbol
        EntrenamientoFutbol entrenamiento = new EntrenamientoFutbol(f1);
        entrenamiento.entrenar();

        // Verificar si implementa Compite usando instanceof
        if (entrenamiento instanceof Compite) {
            System.out.println(((Compite) entrenamiento).compite());
        }

        // Mostrar información
        System.out.println(f1.toString());
        System.out.println("Total de deportistas creados: " + Deportista.totalDeportistas());

        // Demostración de paso por valor y referencia
        modificarEdad(f1.getEdad());  // Paso por valor
        f1.setEdad(27);              // Modificación directa del objeto

        System.out.println("Edad final de f1: " + f1.getEdad());
    }

    // Metodo para demostrar paso por valor
    public static void modificarEdad(int edad) {
        edad = edad + 1;  // Esto solo modifica la copia local del valor
    }
}
