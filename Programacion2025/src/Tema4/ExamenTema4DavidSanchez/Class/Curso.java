package Tema4.ExamenTema4DavidSanchez.Class;

// Ejemplo de CLASE ABSTRACTA
public abstract class Curso implements Evaluable {
    // Utilizo el protected para asi poder utilizar las variables de la clase vecina
    protected String nombreCurso;
    protected int duracionHoras;

    public Curso(String nombreCurso, int duracionHoras) {
        this.nombreCurso = nombreCurso;
        this.duracionHoras = duracionHoras;
    }

    public abstract void mostrarInfoCurso();


}
