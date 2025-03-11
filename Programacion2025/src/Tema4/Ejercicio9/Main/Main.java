package Tema4.Ejercicio9.Main;

import Tema4.Ejercicio9.TiposVehiculo.Coche;
import Tema4.Ejercicio9.TiposVehiculo.Motocicleta;

public class Main {

    public static void main(String[] args) {
        // Crear objetos con valores específicos
        Coche miCoche = new Coche("Toyota", "Corolla", 4,4);
        Motocicleta miMotocicleta = new Motocicleta("Honda", "CBR500R", 500,true);

        System.out.println("=== Detalles del Coche ===");
        miCoche.mostrarDetalles();

        System.out.println("\n=== Detalles de la Motocicleta ===");
        miMotocicleta.mostrarDetalles();
    }

}
