package Tema4.EjerciciosRepaso.Deportes;

public class EntrenamientoFutbol extends Entrenamiento implements Compite{
    private String entrenador;
    //Constructor
    public EntrenamientoFutbol(String entrenador) {
        this.entrenador = entrenador;
    }
    @Override
    public String compite() {
        return "El futbolista está compitiendo en un partido";
    }
    @Override
    public String entrenar() {
        return "Entrenando Futbol";
    }
}
