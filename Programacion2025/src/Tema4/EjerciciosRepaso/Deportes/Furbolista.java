package Tema4.EjerciciosRepaso.Deportes;

public class Furbolista extends Deportista{
    private String posicion;
    private int golesMarcados;

    public Furbolista(String nombre, int edad, String deporte,String posicion,int golesMarcados) {
        super(nombre,edad,deporte);
        this.posicion = posicion;
        this.golesMarcados = golesMarcados;
    }

    public static int anotarGoles(int golesMarcados) {
        return golesMarcados++;
    }

    @Override
    public String toString() {
        return "Futbolista " + " Nombre " + super.getNombre() + " Edad " + super.getEdad() + " Deporte " + super.getDeporte() + " Posicion: " + posicion + ", Goles Marcados: " + golesMarcados;
    }
}
