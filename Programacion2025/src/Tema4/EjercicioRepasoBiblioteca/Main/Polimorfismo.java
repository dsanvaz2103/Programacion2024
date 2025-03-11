package Tema4.EjercicioRepasoBiblioteca.Main;

import Tema4.EjercicioRepasoBiblioteca.Animales.Animal;
import Tema4.EjercicioRepasoBiblioteca.Animales.Gato;
import Tema4.EjercicioRepasoBiblioteca.Animales.Pajaro;
import Tema4.EjercicioRepasoBiblioteca.Animales.Perro;

import java.util.Scanner;

public class Polimorfismo {
    public static void main(String[] args) {
        Animal animal = new Perro();
        animal = new Gato();
        animal = new Pajaro();
    }
}
