package Tema4.Ejercicio12.Main;
import Tema4.Ejercicio12.Animales2.Animal3;
import Tema4.Ejercicio12.Animales2.Gato;
import Tema4.Ejercicio12.Animales2.Pajaro;
import Tema4.Ejercicio12.Animales2.Perro;

public class Main {
    public static void main(String[] args) {
        Animal3[] animals = {new Perro("Jorge",22),new Gato("JUAN",34),new Pajaro("Perez",23)};
        animals[0].hacerSonido();
        animals[1].hacerSonido();
        animals[3].hacerSonido();
        for (int i = 0; i < animals.length; i++) {

        }
    }
}
