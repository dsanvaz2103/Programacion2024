package Tema4.Ejercicio16.Animal16;
import Tema4.Ejercicio16.Interface.Volador;

public class Pajaro extends Animal16 implements Volador{
    String piar = "PioPio";

    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido(){
        System.out.println(piar);
    }

    @Override
    public String moverse() {
        return "Vuela por el aire";
    }

    @Override
    public void volar(){
        System.out.println("Vuela rapido");
    }
}
