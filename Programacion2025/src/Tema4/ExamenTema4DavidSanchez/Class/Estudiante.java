package Tema4.ExamenTema4DavidSanchez.Class;

// Ejemplo de HERENCIA
public class Estudiante extends Persona {
    private String matricula;
    private String carrera;

    public Estudiante(String nombre , int edad, Genero genero , String matricula, String carrera) {
        // Utilizamos el super para obtener los atributos de la clase padre colocandolo siempre
        // en la cabeza ya que puede llegar a dar error
        super(nombre,edad,genero);
        this.matricula = matricula;
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + "\nCarrera: " + carrera + "\n" + super.toString();
    }
}
