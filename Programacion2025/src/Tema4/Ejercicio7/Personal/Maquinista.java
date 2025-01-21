package Tema4.Ejercicio7.Personal;

public class Maquinista {
    private String nombre;
    private String dni;
    private int sueldo;
    private String rango;

    public enum rango {
       maquinistaNovato,maquinista,maquinistaEsperimentado,maquinistaJefe
    }
    public Maquinista(String nombre, String dni, int sueldo, rango rango) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.rango = rango.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
}
