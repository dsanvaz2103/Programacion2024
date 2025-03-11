package Tema4.Ejercicio9.TiposVehiculo;

public class Motocicleta extends Vehiculo {
    private boolean tieneSidecar;

    public Motocicleta(String marca, String modelo, int anio , boolean tieneSidecar) {
        super(marca, modelo, anio);
        this.tieneSidecar = tieneSidecar;
    }

    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Numero de puertas: " + tieneSidecar);
    }
}
