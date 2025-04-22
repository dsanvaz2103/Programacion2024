package Tema5.Ejercicios.Ejercicio9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        list.add("Juan");
        list.add("Lucas");
        list.add("Lucia");
        list.add("David");
        list.add("Elena");
        list.add("Francisco");
        list.add("Gaspar");
        mostrarPersonas(list);

        // ANIADIR USUARIO DE LA LISTA
        String persona;
        System.out.println("Introduce un nuevo nombre");
        persona = sc.nextLine();
        list.add(persona);
        System.out.println(list);

        // ELIMINAR USUARIO DE LA LISTA
        String personaEliminada;
        System.out.println("Introduce un nombre que quieras eliminar");
        personaEliminada = sc.nextLine();
        if (list.contains(personaEliminada)){
            list.remove(personaEliminada);
        }else {
            System.out.println(personaEliminada + " No existe");
        }
        System.out.println("Numero de personas: " + list.size());
    }

    private static void mostrarPersonas(List<String> list) {
        for (String p: list){
            System.out.println(p);
        }
    }
}
