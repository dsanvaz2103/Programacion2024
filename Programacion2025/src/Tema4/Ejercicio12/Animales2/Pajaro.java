package Tema4.Ejercicio12.Animales2;

public class Pajaro extends Animal3 {
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

    public String volar(){
        return piar;
    }
}
