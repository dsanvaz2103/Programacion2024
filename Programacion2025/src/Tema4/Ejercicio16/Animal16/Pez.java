package Tema4.Ejercicio16.Animal16;
import Tema4.Ejercicio16.Interface.Nadador;

public class Pez extends Animal16 implements Nadador {

    public Pez(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {

    }

    @Override
    public String moverse() {
        return "";
    }
}
