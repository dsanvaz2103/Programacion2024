package Tema4.ExamenTema4DavidSanchez.Main;

import Tema4.ExamenTema4DavidSanchez.Class.*;

public class Main {
    public static void main(String[] args) {
        //SOBRECARGA  En el caso de calificacion ahí era una rata que basicamente te producia una sobreescritura
        // SOBREESCRIBE : Ejemplo de sobre escritura en la clase Persona utilizando el @Overide
        // para sobreescribir el metodo toString
        // Ejemplo de ENCAPSULACIÓN en la clase Persona con atributos privados y métodos getter/setter
        // Ejemplo de HERENCIA en la clase Estudiante
        // Ejemplo de INTERFAZ en la clase Evaluable
        // Ejemplo de CLASE ABSTRACTA en la clase Curso

        // Creación de objetos Persona
        Persona persona1 = new Persona("Ana", 25, Genero.Femenino);
        Persona persona2 = new Persona("Juan", 30, Genero.Masculino);

        // Creación de objetos Estudiante
        Estudiante estudiante1 = new Estudiante("María", 22, Genero.Otro,
                "M001", "Ingeniería");
        Estudiante estudiante2 = new Estudiante("Carlos", 23, Genero.Otro,
                "M002", "Matemáticas");

        // Creación de cursos
        CursoPresencial curso1 = new CursoPresencial("Programación Java");
        CursoPresencial curso2 = new CursoPresencial("Base de Datos", 60);

        // Creación y uso de Academia
        Academia academia = new Academia(5, 5);
        academia.agregarEstudiante(estudiante1);
        academia.agregarEstudiante(estudiante2);
        academia.agregarCurso(curso1);
        academia.agregarCurso(curso2);

        // Listado de estudiantes y cursos
        academia.listarEstudiantesYCursos();


        // Demostración del contador de instancias
        System.out.println("\nNúmero total de personas creadas: " +
                Persona.getContadorInstancias());

        // Demostración de modificación de parámetros
        modificarParametros(persona1, 35);

        System.out.println("\nEdad actualizada con exito");
        System.out.println("Edad actual de persona1: " + persona1.getEdad());

        System.out.println("\nComparación de personas:");
        System.out.println("¿persona1.equals(persona2)? " +
                persona1.equals(persona2));
    }

    // Metodo para demostrar modificación de parámetros
    public static void modificarParametros(Persona persona, int nuevaEdad) {
        // Modificación de variable primitiva (no persistente fuera del metodo)
        int edadOriginal = nuevaEdad;
        System.out.println("Valor original de la variable primitiva: " + edadOriginal);

        // Modificación de atributo del objeto (persistente)
        persona.setEdad(nuevaEdad);
        System.out.println("Edad modificada del objeto: " + persona.getEdad());

        // Demostración de que la variable primitiva no se mantiene
        nuevaEdad = 40;
        System.out.println("Valor final de la variable primitiva: " + nuevaEdad);
    }
}

