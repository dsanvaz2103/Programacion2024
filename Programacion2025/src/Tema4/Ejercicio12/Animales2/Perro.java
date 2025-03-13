package Tema4.Ejercicio12.Animales2;

public class Perro extends Animal3 {
    String ladrar = "Guau";

    public Perro(String nombre, int edad) {
        super(nombre,edad);
    }

    @Override
    public void hacerSonido(){
        System.out.println(ladrar);
    }

    @Override
    public String moverse() {
        return "Corre en cuatro patas";
    }
}
