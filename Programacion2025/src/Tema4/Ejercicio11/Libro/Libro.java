package Tema4.Ejercicio11.Libro;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int anioPublicacion;

    // Constructor que inicializa todos los atributos
    public Libro(String titulo, String autor, String isbn, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
    }


    @Override
    public String toString() {
        return String.format(
                "Título: %s, Autor: %s, ISBN: %s, Año: %d",
                titulo, autor, isbn, anioPublicacion
        );
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Libro)) return false;

        Libro otroLibro = (Libro) obj;
        return isbn.equals(otroLibro.isbn);
    }
}
