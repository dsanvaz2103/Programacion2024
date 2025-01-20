package Tema4.ActividadAmplizacion;

public class Gestor {
    private String nombre;
    private String telefono;
    protected double importeMaximoAutorizado;

    public Gestor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximoAutorizado = 10000;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setTelefono(String nuevoTelefono) {
        this.telefono = nuevoTelefono;
    }
    public double getImporteMaximoAutorizado() {
        return importeMaximoAutorizado;
    }

    public String getTelefono() {
        return telefono;
    }
}
