package Tema4.Ejercicio7.Maquinaria;

import Tema4.Ejercicio7.Personal.Maquinista;

public class Tren {
    private Locomotora locomotora;
    private int numVagones;
    private Maquinista maquinista;
    private Vagon[] vagones;

    public Tren(Locomotora locomotora,Vagon vagon, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.vagones = new Vagon[5];
        this.maquinista = maquinista;
    }

    public void enganchaVagon (int cargaMax, int cargaActual, String mercancia) {
        if (numVagones >= 5) {
            System.out.println("El tren no admite más vagones");
        } else {
            Vagon v = new Vagon (numVagones, cargaMax, cargaActual, mercancia);
            vagones [numVagones] = v; //el vagón pasado ocupa el último lugar
            numVagones++; //ahora tenemos un vagón más enganchado al tren
        }
    }

    public Locomotora getLocomotora() {
        return locomotora;
    }

    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }

    public int getNumVagones() {
        return numVagones;
    }

    public void setNumVagones(int numVagones) {
        this.numVagones = numVagones;
    }

    public Maquinista getMaquinista() {
        return maquinista;
    }

    public void setMaquinista(Maquinista maquinista) {
        this.maquinista = maquinista;
    }

    public Vagon[] getVagones() {
        return vagones;
    }

    public void setVagones(Vagon[] vagones) {
        this.vagones = vagones;
    }
}
