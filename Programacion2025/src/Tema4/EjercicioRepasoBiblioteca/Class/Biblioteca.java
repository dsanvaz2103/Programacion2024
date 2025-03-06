package Tema4.EjercicioRepasoBiblioteca.Class;

public class Biblioteca{
    private Libro[] libros;
    private int cantidadLibros;

    public Biblioteca(int capacidadMaxima) {
        this.libros = new Libro[capacidadMaxima];
        this.cantidadLibros = 0;
    }

    public void agregarLibro(Libro libro) {
        if (cantidadLibros < libros.length) {
            libros[cantidadLibros] = libro;
            cantidadLibros++;
        } else {
            System.out.println("La biblioteca está llena");
        }
    }

    public void mostrarLibros() {
        if (cantidadLibros == 0) {
            System.out.println("No hay libros en la biblioteca");
            return;
        }
        for (int i = 0; i < cantidadLibros; i++) {
            libros[i].mostrarInfo();
        }
    }

    public void prestarLibro(String titulo) {
        boolean encontrado = false;
        for (int i = 0; i < cantidadLibros && !encontrado; i++) {
            if (libros[i].getTitulo().equals(titulo)) {
                encontrado = true;
                if (libros[i].isDisponible()) {
                    libros[i].setDisponible(false);
                    System.out.println("El libro '" + titulo + "' ha sido prestado");
                } else {
                    System.out.println("El libro '" + titulo + "' no está disponible para préstamo");
                }
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el libro con título: " + titulo);
        }
    }
}
