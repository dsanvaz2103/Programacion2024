package Tema4.Ejercicio9.TiposVehiculo;

public class Coche extends Vehiculo {
    private int numPuertas;

    public Coche(String marca, String modelo, int anio , int numPuertas) {
        super(marca,modelo,anio);
        this.numPuertas = numPuertas;
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Numero de puertas: " + numPuertas);
    }


}
