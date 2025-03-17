package Tema4.Ejercicio4;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    // Constructor por defecto
    public Hora() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    // Constructor con parámetros
    public Hora(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    // Getters
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    // Setters con validación
    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("La hora debe estar entre 0 y 23");
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        } else {
            throw new IllegalArgumentException("Los minutos deben estar entre 0 y 59");
        }
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        } else {
            throw new IllegalArgumentException("Los segundos deben estar entre 0 y 59");
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    // Meodo para sumar segundos
    public Hora sumarSegundos(int segundos) {
        int totalSegundos = (hora * 3600 + minuto * 60 + segundo) + segundos;

        int nuevaHora = (totalSegundos / 3600) % 24;
        int nuevoMinuto = (totalSegundos % 3600) / 60;
        int nuevoSegundo = totalSegundos % 60;

        return new Hora(nuevaHora, nuevoMinuto, nuevoSegundo);
    }
}
