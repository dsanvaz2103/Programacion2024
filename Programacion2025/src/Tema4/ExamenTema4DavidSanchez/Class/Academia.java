package Tema4.ExamenTema4DavidSanchez.Class;

// Ejemplo de COMPOSICIÓN
public class Academia {
    private Estudiante[] estudiantes;
    private Curso[] cursos;
    private int indiceEstudiantes;
    private int indiceCursos;

    // Constructor
    public Academia(int maxEstudiantes, int maxCursos) {
        // Recoge la capacidad de estudiantes y cursos en el constructor
        estudiantes = new Estudiante[maxEstudiantes];
        cursos = new Curso[maxCursos];
        indiceEstudiantes = 0;
        indiceCursos = 0;
    }

    // Metodo para agregar un nuevo estudiante a la academia
    public void agregarEstudiante(Estudiante estudiante) {
        if (indiceEstudiantes < estudiantes.length) {
            estudiantes[indiceEstudiantes++] = estudiante;
        }
    }

    public void eliminarEstudiante(Estudiante estudiante) {
        for (int i = 0; i < indiceEstudiantes; i++) {
            if (estudiantes[i].equals(estudiante)) {
                // Desplazamos los elementos para cerrar el hueco
                System.arraycopy(estudiantes, i + 1, estudiantes, i,
                        indiceEstudiantes - i - 1);
                indiceEstudiantes--;
                break;
            }
        }
    }

    public void agregarCurso(Curso curso) {
        if (indiceCursos < cursos.length) {
            cursos[indiceCursos++] = curso;
        }
    }

    public void eliminarCurso(Curso curso) {
        for (int i = 0; i < indiceCursos; i++) {
            if (cursos[i] == curso) {
                System.arraycopy(cursos, i + 1, cursos, i,
                        indiceCursos - i - 1);
                indiceCursos--;
                break;
            }
        }
    }

    public void listarEstudiantesYCursos() {
        System.out.println("\n Lista de Estudiantes ");
        for (int i = 0; i < indiceEstudiantes; i++) {
            System.out.println(estudiantes[i].toString());
        }

        System.out.println("\n Lista de Cursos ");
        for (int i = 0; i < indiceCursos; i++) {
            cursos[i].mostrarInfoCurso();
        }
    }
}
