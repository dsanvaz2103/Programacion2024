package Tema5.Ejercicios.Ejercicio6;

import Tema4.Ejercicio3.Persona.Persona;

import java.util.Comparator;

public class CompararApellido implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        return (o1.getApellido().compareTo(o2.getApellido()));
    }
}
