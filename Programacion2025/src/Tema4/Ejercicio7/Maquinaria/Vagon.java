package Tema4.Ejercicio7.Maquinaria;

public class Vagon {
    private int id;
    private String cargaMaximaKilos;
    private String cargaActualKilos;
    private String tipoMercancia;

    public Vagon(int id, String cargaMaximaKilos, String cargaActualKilos, String tipoMercancia) {
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

    public String getCargaMaximaKilos() {
        return cargaMaximaKilos;
    }

    public void setCargaMaximaKilos(String cargaMaximaKilos) {
        this.cargaMaximaKilos = cargaMaximaKilos;
    }

    public String getCargaActualKilos() {
        return cargaActualKilos;
    }

    public void setCargaActualKilos(String cargaActualKilos) {
        this.cargaActualKilos = cargaActualKilos;
    }

    public String getTipoMercancia() {
        return tipoMercancia;
    }

    public void setTipoMercancia(String tipoMercancia) {
        this.tipoMercancia = tipoMercancia;
    }
}
