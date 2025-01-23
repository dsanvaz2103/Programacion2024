package Tema4.Ejercicio7.Maquinaria;

public class Vagon {
    private int id;
    private int cargaMaximaKilos;
    private int cargaActualKilos;
    private String tipoMercancia;

    public Vagon(int id, int cargaMaximaKilos, int cargaActualKilos, String tipoMercancia) {
        this.id = id;
        this.cargaMaximaKilos = cargaMaximaKilos;
        this.cargaActualKilos = cargaActualKilos;
        this.tipoMercancia = tipoMercancia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCargaMaximaKilos() {
        return cargaMaximaKilos;
    }

    public void setCargaMaximaKilos(int cargaMaximaKilos) {
        this.cargaMaximaKilos = cargaMaximaKilos;
    }

    public int getCargaActualKilos() {
        return cargaActualKilos;
    }

    public void setCargaActualKilos(int cargaActualKilos) {
        this.cargaActualKilos = cargaActualKilos;
    }

    public String getTipoMercancia() {
        return tipoMercancia;
    }

    public void setTipoMercancia(String tipoMercancia) {
        this.tipoMercancia = tipoMercancia;
    }
}
