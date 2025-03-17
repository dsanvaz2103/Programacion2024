package Tema4.Ejercicio17.Vehiculos;


public class Motorcycle extends Vehiculos {

    public Motorcycle(String marca, String modelo, int anio, FuelType fuelType) {
        super(marca, modelo, anio, fuelType);
    }

    @Override
    public double calcularteSpeed() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
