package Tema5.EjerciciosRepaso;

import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        String alumno = "Alumno1";
        String alumno2 = "Alumno2";
        String alumno3 = "Alumno3";
        String[] alumnos = {alumno, alumno2, alumno3};
        set.add(null);
        set.add(alumno);
        set.add(null);
        System.out.println(set);

        for (String alum : set) {
            System.out.println(alum);
        }

        Iterator<String> it = set.iterator();
        String s;
        while (it.hasNext()) {
            s = it.next();
            System.out.println(s);
            it.remove();
        }
    }
}
