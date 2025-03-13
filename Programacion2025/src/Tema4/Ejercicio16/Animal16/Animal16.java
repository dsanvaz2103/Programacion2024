package Tema4.Ejercicio16.Animal16;

public abstract class Animal16 {
    protected String nombre;
    protected int edad;

    public Animal16(String nombre, int edad) {
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
