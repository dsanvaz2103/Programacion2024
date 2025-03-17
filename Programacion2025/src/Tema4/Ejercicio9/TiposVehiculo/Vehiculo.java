package Tema4.Ejercicio9.TiposVehiculo;

import Tema4.Ejercicio17.Vehiculos.FuelType;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
   public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    void mostrarDetalles(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Anio: " + anio);
    }

}
