package Tema4.Ejercicio12.Animales2;

public abstract class Animal3 {
    protected String nombre;
    protected int edad;

    public Animal3(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    public  void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    public abstract void hacerSonido();
    public abstract String moverse();

}
