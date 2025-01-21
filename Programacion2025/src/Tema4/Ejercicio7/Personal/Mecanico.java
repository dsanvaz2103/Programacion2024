package Tema4.Ejercicio7.Personal;

public class Mecanico {
    private String nombre;
    private int telefono;
    private String especialidad;

    public enum especialidad{
        frenos,hidraulica,electricidad,motor
    }

    public Mecanico(String nombre, int telefono, especialidad especialidad){
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
