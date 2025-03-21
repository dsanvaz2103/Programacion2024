package Tema4.ExamenTema4DavidSanchez.Class;

public class CursoPresencial  extends Curso {
    private static  double notaBase = 6.5;

    // Constructor que llama al constructor de la clase padre
    public CursoPresencial(String nombreCurso, int duracionHoras) {
        super(nombreCurso, duracionHoras);
    }

    // Implementación del metodo abstracto mostrarInfoCurso
    @Override
    public void mostrarInfoCurso() {
        System.out.println("Curso Presencial:");
        System.out.println("Nombre: " + nombreCurso);
        System.out.println("Duración en horas: " + duracionHoras);
    }


    // Constructor alternativo sin especificar duración
    public CursoPresencial(String nombre) {
        super(nombre, 6); // Duración predeterminada de 6 horas
    }

    // Implementación del metodo calificar() con lógica simple
    @Override
    public double calificar() {
        // Creamos un Array para simular la calificacion de notas
        double[] notas = {85.5, 92.0, 88.0, 76.5};
        double suma = 0;
        for(double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }
}
