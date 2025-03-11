package Tema4.Ejercicio10.Main;

import Tema4.Ejercicio10.Figura.Circulo;
import Tema4.Ejercicio10.Figura.Figura;
import Tema4.Ejercicio10.Figura.Rectangulo;

public class Main {
    public static void main(String[] args) {

        Figura[] figuras = new Figura[2];

        figuras[0] = new Circulo("Circulo", 2.3);
        figuras[1] = new Rectangulo("Rectangulo", 2.0,3.0);
        for (int i = 0; i < figuras.length; i++) {
            System.out.println(figuras[i].calcularArea());
            figuras[i].mostrarInformacion();
        }
    }
}
