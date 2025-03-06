package Tema4.Ejercicio9.TiposVehiculo;

public class Motocicleta extends Vehiculo {
    private boolean tieneSidecar;

    Motocicleta(String marca, String modelo, int anio , boolean tieneSidecar) {
        super(marca, modelo, anio);
        this.tieneSidecar = tieneSidecar;
    }
}
