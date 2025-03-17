package Tema4.Ejercicio5;

public class ContadorObjeto {
    // Atributo estático para contar los objetos totales
    private static int totalObjetos = 0;

    // Constructor que incrementa el contador cada vez que se crea un objeto
    public ContadorObjeto() {
        totalObjetos++;
    }

    // Metodo estático para mostrar el total de objetos creados
    public static void mostrarTotalObjetos() {
        System.out.println("Se han creado " + totalObjetos + " objetos hasta el momento.");
    }
}
