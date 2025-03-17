package Tema4.Ejercicio1;

public class Persoma {
    private String nombre;
    private int edad;
    private double estatura;

    // Constructor
    public Persoma(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    // Metodo para cumplir años
    public void cumplirAños() {
        this.edad++;
    }

    // Metodo para crecer
    public void crecer(double incremento) {
        this.estatura += incremento;
    }
}
