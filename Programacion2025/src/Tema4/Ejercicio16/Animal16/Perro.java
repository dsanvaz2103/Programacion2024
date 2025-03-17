package Tema4.Ejercicio16.Animal16;
import Tema4.Ejercicio16.Interface.Corredor;

public class Perro extends Animal16 implements Corredor {
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

    @Override
    public void correr() {
        System.out.println("Corre mucho");
    }
}
