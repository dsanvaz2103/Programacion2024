package Tema4.ExamenTema4DavidSanchez.Class;

// Ejemplo de ENCAPSULACIÓN con atributos privados y métodos getter/setter

public class Persona {
    private String nombre;
    private int edad;
    private Genero genero;

    // Contador de instancias como variable estática
    private static int contadorInstancias = 0;

    // Generamos un constructor para representar todos los atributos

    public Persona(String nombre, int edad, Genero genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        incrementarContador();
    }

    // Metodo por defecto que contenga solo el nombre
    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 15;
        this.genero = Genero.Masculino;
    }

    // Metodo para incrementar el contador
    private static void incrementarContador() {
        contadorInstancias++;
    }

    // Metodo para obtener el contador de instancias
    public static int getContadorInstancias() {
        return contadorInstancias;
    }

    // Generacion de getter and setter de todos los atributos anteriores

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    // Metodo personalizado del toString en el cual utilizamos el @Overide para sobreescribirlo

    @Override
    public String toString() {
        String esMayor = edad >= 18 ? "mayor de edad" : "menor de edad";
        // Si la edad es mayor de 18 devolvera la variable mayor edad y si no simplemente devuelve edad
        return "Nombre: " + nombre + "\nEdad: " + esMayor + "\nGenero: " + genero;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Mismo objeto
        // Castin
        Persona p1 = (Persona) obj;
        // Comparar dos objetos Persona en función de su nombre y edad.
        if (this.nombre.equals(p1.nombre) && this.edad == p1.edad) {
            return true;
        }
        return false;
    }
}
