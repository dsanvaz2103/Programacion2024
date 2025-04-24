package ProyectoTema5.utils;

import Tema4.Ejercicio17.Vehiculos.Vehiculos;
import Tema4.Ejercicio3.Persona.Persona;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Juego implements Comparable<Juego>{

    String nombre;
    Juegos categoria;
    int numeroDescargas;
    double puntuacionMedia;
    public Juego(String nombre, Juegos categoria, int numeroDescargas, double puntuacionMedia) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.numeroDescargas = numeroDescargas;
        this.puntuacionMedia = puntuacionMedia;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "nombre='" + nombre + '\'' +
                ", categoria=" + categoria +
                ", numeroDescargas=" + numeroDescargas +
                ", puntuacionMedia=" + puntuacionMedia +
                '}';
    }


    @Override
    public int compareTo(Juego o) {
        if (this.categoria.equals(o.categoria)) {
            return Double.compare(this.getPuntuacionMedia(), o.getPuntuacionMedia());
        }else {
            return this.categoria.compareTo(o.categoria);
        }
    }

    public Juegos getCategoria() {
        return categoria;
    }

    public double getPuntuacionMedia() {
        return puntuacionMedia;
    }
}
