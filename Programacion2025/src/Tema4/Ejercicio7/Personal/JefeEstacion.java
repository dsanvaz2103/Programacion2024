package Tema4.Ejercicio7.Personal;

public class JefeEstacion {

    private String nombre;
    private String dni;
    private String fechaNombradoJefe;

    public JefeEstacion(String nombre,String dni, String fechaNombradoJefe){
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNombradoJefe = fechaNombradoJefe;
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

    public String getFechaNombradoJefe() {
        return fechaNombradoJefe;
    }

    public void setFechaNombradoJefe(String fechaNombradoJefe) {
        this.fechaNombradoJefe = fechaNombradoJefe;
    }
}
