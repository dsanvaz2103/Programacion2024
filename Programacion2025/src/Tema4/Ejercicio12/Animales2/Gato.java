package Tema4.Ejercicio12.Animales2;

public class Gato extends Animal3 {
    String mauyar = "Miau";

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido(){
        System.out.println(mauyar);
    }

    @Override
    public String moverse() {
        return "Se desliza sigilosamente";
    }
}
