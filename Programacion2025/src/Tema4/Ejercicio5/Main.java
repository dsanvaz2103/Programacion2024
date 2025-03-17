package Tema4.Ejercicio5;
import Tema4.Ejercicio5.ContadorObjeto;
public class Main {
    public static void main(String[] args) {
        // Crear varios objetos y mostrar el total después de cada creación
        ContadorObjeto obj1 = new ContadorObjeto();
        ContadorObjeto.mostrarTotalObjetos(); // Mostrará 1

        ContadorObjeto obj2 = new ContadorObjeto();
        ContadorObjeto.mostrarTotalObjetos(); // Mostrará 2

        ContadorObjeto obj3 = new ContadorObjeto();
        ContadorObjeto.mostrarTotalObjetos(); // Mostrará 3
    }
}
