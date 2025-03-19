package Tema4.EjerciciosRepaso.Ejercicio18;

public class Bombilla {
    private boolean encendida;
    private boolean estadoAnterior;

    public Bombilla() {
        this.encendida = false;
        this.estadoAnterior = false;
    }

    public boolean estaEncendida() {
        return encendida;
    }

    public void encender() {
        this.estadoAnterior = true;
        this.encendida = true;
    }

    public void apagar() {
        this.estadoAnterior = false;
        this.encendida = false;
    }

    public void restaurarEstado() {
        this.encendida = estadoAnterior;
    }
}
