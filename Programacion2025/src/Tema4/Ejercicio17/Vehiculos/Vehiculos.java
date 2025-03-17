package Tema4.Ejercicio17.Vehiculos;

public abstract class Vehiculos implements Maintenance{

    String licencePlate;
    String brand;
    int year;
    FuelType fuelType;
    static int vehiculoCount;

    // Getter and setter

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public static int getVehiculoCount() {
        return vehiculoCount;
    }

    public static void setVehiculoCount(int vehiculoCount) {
        Vehiculos.vehiculoCount = vehiculoCount;
    }

    //Constructor
    public Vehiculos(String licencePlate, String brand, int year, FuelType fuelType) {
        this.licencePlate = licencePlate;
        this.brand = brand;
        this.year = year;
        this.fuelType = fuelType;
    }

    public abstract double calcularteSpeed();

    public String getVehiculoInfo() {
        System.out.println("Vehiculo ID: " + vehiculoCount);
        return "Vehiculo ID: " + vehiculoCount;
    }

    public String Mantenimiento() {
        System.out.println("Mantenimiento");
        return "Mantenimiento";
    }

    public int totalDeVehiculos() {
        System.out.println("Total de vehiculos: " + vehiculoCount);
        return vehiculoCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Mismo objeto
        Vehiculos vehiculo = (Vehiculos) obj;
        // Comparar atributos
        if (this.brand.equals(vehiculo.brand) && this.licencePlate.equals(vehiculo.licencePlate)
        && this.year == vehiculo.year && this.fuelType.equals(vehiculo.fuelType)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vehiculos{" +
                "licencePlate='" + licencePlate + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", fuelType=" + fuelType +
                '}';
    }

    @Override
    public String nextMaintenanceDate(){
        year = year + 5;
        return "Fecha de mantenimiento: " + year;
    }

}
