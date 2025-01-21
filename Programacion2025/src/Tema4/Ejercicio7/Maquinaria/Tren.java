package Tema4.Ejercicio7.Maquinaria;

import Tema4.Ejercicio7.Personal.Maquinista;

public class Tren {
    private Locomotora locomotora;
    private int numeroVagonetas;
    private Maquinista maquinista;
    private Vagon vagon;

    public Tren(Locomotora locomotora, int numeroVagonetas,Vagon vagon, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.numeroVagonetas = numeroVagonetas;
        this.vagon = vagon;
        this.maquinista = maquinista;
    }

    public Locomotora getLocomotora() {
        return locomotora;
    }

    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }

    public int getNumeroVagonetas() {
        return numeroVagonetas;
    }

    public void setNumeroVagonetas(int numeroVagonetas) {
        this.numeroVagonetas = numeroVagonetas;
    }

    public Maquinista getMaquinista() {
        return maquinista;
    }

    public void setMaquinista(Maquinista maquinista) {
        this.maquinista = maquinista;
    }

    public Vagon getVagon() {
        return vagon;
    }

    public void setVagon(Vagon vagon) {
        this.vagon = vagon;
    }
}
