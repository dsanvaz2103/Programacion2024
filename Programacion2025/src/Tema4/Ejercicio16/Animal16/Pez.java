package Tema4.Ejercicio16.Animal16;
import Tema4.Ejercicio16.Interface.Nadador;

public class Pez extends Animal16 implements Nadador {

    public Pez(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Respiran por las branquias");
    }

    @Override
    public String moverse() {
        return " nadanado";
    }

    @Override
    public void nadar() {
        System.out.println("Nadando...");
    }
}
