package ProyectoTema5;

import ProyectoTema5.utils.Juego;
import ProyectoTema5.utils.Juegos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Proyecto7 {
    public static void main(String[] args) {
        List<Juego> juegos = new ArrayList<>();
        Juego juego = new Juego("Dark Souls",Juegos.ACCION,10000,9.5);
        Juego juego3 = new Juego("GTA5",Juegos.ACCION,10000,7.5);
        Juego juego1 = new Juego("Minecraft",Juegos.AVENTURA,10000,2.5);
        Juego juego2 = new Juego("Asseto",Juegos.SIMULACION,10000,8);
        juegos.add(juego);
        juegos.add(juego1);
        juegos.add(juego2);
        juegos.add(juego3);

        System.out.println("\nRanking ordenado por Puntuacion Media");
        for(Juego p: juegos) {
            System.out.println(p);
        }

    }
}
