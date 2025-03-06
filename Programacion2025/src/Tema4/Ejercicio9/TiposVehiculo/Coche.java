package Tema4.Ejercicio9.TiposVehiculo;

public class Coche extends Vehiculo {
    private int numPuertas;

    Coche(String marca, String modelo, int anio , int numPuertas) {
        super(marca, modelo, anio);
        this.numPuertas = numPuertas;
    }

    @Override
    void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Numero de puertas: " + numPuertas);
    }


}
