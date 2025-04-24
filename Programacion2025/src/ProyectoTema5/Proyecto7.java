package ProyectoTema5;

import ProyectoTema5.utils.Juego;
import ProyectoTema5.utils.Juegos;
import ProyectoTema5.utils.Juegos2;

import java.util.*;
import java.util.stream.Collectors;


public class Proyecto7 {
    public static void main(String[] args) {
        TreeSet<Juego> juegos  = new TreeSet<>();

        // Crear juegos existentes
        Juego juego1 = new Juego("Dark Souls", Juegos.ACCION, 10000, 9.5);
        Juego juego2 = new Juego("GTA5", Juegos.ACCION, 10000, 7.5);
        Juego juego3 = new Juego("Minecraft", Juegos.AVENTURA, 10000, 2.5);
        Juego juego4 = new Juego("Assetto Corsa", Juegos.SIMULACION, 10000, 8);
        Juego juego5 = new Juego("Tetris", Juegos.PUZZLE, 10000, 8.9);

        // Nuevos juegos añadidos
        Juego juego6 = new Juego("FIFA 23", Juegos.DEPORTES, 15000, 8.2);
        Juego juego7 = new Juego("Age of Empires IV", Juegos.ESTRATEGIA, 5000, 9.0);
        Juego juego8 = new Juego("Fortnite", Juegos.ACCION, 30000, 8.4);
        Juego juego9 = new Juego("The Witcher 3", Juegos.AVENTURA, 12000, 9.7);
        Juego juego10 = new Juego("Rocket League", Juegos.DEPORTES, 8000, 8.8);

        // Añadir juegos a la lista
        juegos.add(juego1);
        juegos.add(juego2);
        juegos.add(juego3);
        juegos.add(juego4);
        juegos.add(juego5);
        juegos.add(juego6);
        juegos.add(juego7);
        juegos.add(juego8);
        juegos.add(juego9);
        juegos.add(juego10);
        System.out.println("\nRanking ordenado por Puntuacion Media");
        System.out.println("\n Inverso \n");
        Iterator<Juego> iterator = juegos.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
