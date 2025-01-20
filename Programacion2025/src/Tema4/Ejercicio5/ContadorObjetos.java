package Tema4.Ejercicio5;

public class ContadorObjetos {
    static int totalObjetos = 0;
    ContadorObjetos(){
        totalObjetos++;
    }
    public static void mostrarTotalObjetos(){
        System.out.println(totalObjetos);
    }

}
