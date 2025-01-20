package Tema4.Ejercicio4;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    public int incrementoSegundos(int segundos) {
        segundo = segundo + segundos;
            if (segundo > 59) {
                segundo = 0;
                minuto++;
            }else if (minuto > 59) {
                minuto = 0;
                hora++;
            }else if (hora > 24) {
                hora = 0;
            }
        return segundo;
    }

    public void mostrarHora() {
        System.out.println("Hora: " + hora + ":" + minuto + ":" + segundo);
    }
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
}
