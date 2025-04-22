package Tema5.Ejercicios.Ejercicio12;

import java.util.*;

public class Ejercicio12 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        m.put("Clave", "Entrada");
        m.put("ent", "Número entero");
        m.put("int", "Número enterto");
        m.put("int", "Nuevo");
        m.put("dec", "Número decimal");
        m.put("cad","Cadena");
        m.put("log","Lógico");
        m.put("bucle","Estructura repetición");
        if (m.containsKey("int")) {
            m.remove("int");
        }
        System.out.println(m);


        Iterator<Map.Entry<String,String>> it = m.entrySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        if (m.containsKey("ent")) {
            m.put(null,null);
        }
        for (String s : m.keySet()) {
            System.out.println(s + " : " + m.get(s));
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce que opcion desea escoger");
        System.out.println("1. HasMap");
        System.out.println("2. LinkedHashMap");
        System.out.println("3. TreeMap");
        String op = sc.nextLine();
        switch (sc.nextInt()) {
            case 1:
                m = new HashMap<>();
            case 2:
                m = new LinkedHashMap<>();
            case 3:
                m = new TreeMap<>();
        }
    }
}
