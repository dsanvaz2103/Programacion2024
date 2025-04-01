package Tema5.EjerciciosRepaso;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> naturales = new HashSet<>();
        naturales.add(1);
        naturales.add(2);
        naturales.add(3);
        naturales.add(4);
        System.out.println(naturales);
        System.out.println(naturales.hashCode());

        Set<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println(primeNumbers);

        boolean result = naturales.containsAll(primeNumbers);
        System.out.println(result);
    }
}
