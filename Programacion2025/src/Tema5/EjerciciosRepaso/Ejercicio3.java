package Tema5.EjerciciosRepaso;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio3 {
    public static void main(String[] args) {
        TreeSet<Integer> conjunto  = new TreeSet<>();
        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);
        conjunto.add(4);
        conjunto.add(20);
        conjunto.add(5);
        conjunto.add(6);
        System.out.println(conjunto);
        for (Integer i : conjunto) {
            System.out.println(i);
        }
        System.out.println("\n Inverso \n");
        Iterator<Integer> iterator = conjunto.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
