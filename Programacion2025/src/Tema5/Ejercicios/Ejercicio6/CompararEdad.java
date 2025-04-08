package Tema5.Ejercicios.Ejercicio6;

import Tema4.Ejercicio3.Persona.Persona;

import java.util.Comparator;

public class CompararEdad implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        if (o1.compareTo(o2)== 0){
            return 0;
        } else if (o1.compareTo(o2)>0) {
            return 1;
        }else {
            return -1;
        }
    }
}
