package Tema4.Ejercicio16.Main;

import Tema4.Ejercicio12.Animales2.Animal3;
import Tema4.Ejercicio12.Animales2.Gato;
import Tema4.Ejercicio12.Animales2.Pajaro;
import Tema4.Ejercicio12.Animales2.Perro;
import Tema4.Ejercicio16.Animal16.Pez;

public class Main {
    public static void main(String[] args) {
        Animal3[] animals = {new Perro("Jorge",22),new Pez("JUAN",34),new Pajaro("Perez",23)};
        animals[0].hacerSonido();
        animals[1].hacerSonido();
        animals[3].hacerSonido();

        for (int i = 0; i < animals.length; i++) {

        }
    }
}
