package Tema4.Ejercicio17.Vehiculos;

public class Car extends Vehiculos {

    int numeroPuertas;

    public Car(String licencePlate, String brand, int year, FuelType fuelType,int numeroPuertas) {
        super(licencePlate, brand, year, fuelType);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public double calcularteSpeed() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }Car coche = (Car) obj;
        if (this.numeroPuertas == coche.numeroPuertas && super.equals(coche)){
            return true;
        }
        return false;
    }
}


