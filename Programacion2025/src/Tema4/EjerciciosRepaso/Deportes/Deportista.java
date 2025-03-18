package Tema4.EjerciciosRepaso.Deportes;

import Tema4.Ejercicio17.Vehiculos.Vehiculos;

public class Deportista extends Entrenamiento implements Compite{

    private String nombre;
    private int edad;
    private String deporte;
    private static int totalDeportistas;

    public static int totalDeportistas(){
        return  totalDeportistas;
    }

    public Deportista(String nombre, int edad, String deporte){
        this.nombre = nombre;
        this.edad = edad;
        this.deporte = deporte;
    }

    @Override
    public String toString(){
        return nombre + " " + edad + " " + deporte;
    }

    @Override
    public String compite() {
        return "Compite";
    }

    @Override
    public String entrenar() {
        return "";
    }

    public void modificarEdad(int edad){
        edad = edad + 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

}
