# Mi porfolio de la unidad UT4

## Ejercicio de clases:

1. Clases
2. Objetos
3. Interfaces
4. Características de la POO
5. Herencia

## Clases:

● Modelar el mundo real

● Plantilla

● Propiedad

Comportamiento

● Datos + Código

● Atributos y Métodos

● Tipo de dato

En la clase debemos de componerla de la siguiente manera:

Creamos la clase con su nombre, para enlazar los atributos y metodos de una clase padre o heredarla debenos de utilizar el extend.

(class (Ejemplo) extend (clasePadre)){

"Atributos, constructoes y metodos"

}

## Herencia: this y this():

La palabra reservada this hace referencia a la propia clase.

De esta forma podemos acceder a atributos dentro de un método,
aunque hayan sido ocultados por variables locales homónimas.

Tambien si utilizamos el this() que se utiliza para referenciar a un constructor para reciclar codigo por ejemplo:


## Herencia: super y super():

### Super clase vehiculo:

public class Vehiculo {

private String marca;

private String modelo;

private int anio;

public Vehiculo(String marca, String modelo, int anio) {

this.marca = marca;

this.modelo = modelo;

this.anio = anio;

}

    void mostrarDetalles(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Anio: " + anio);
    }
}

## Clase Coche :

public class Coche extends Vehiculo {

private int numPuertas;

    public Coche(String marca, String modelo, int anio , int numPuertas) {
        super(marca, modelo, anio);
        this.numPuertas = numPuertas;
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Numero de puertas: " + numPuertas);
    }


}

Utilizamos el super() para llamar y coger los atributos de la superclase.

Y el super se utiliza para referenciar a metodos.

## @Override:

Se utiliza para sobre escribir el codigo y contenido.

@Override

public void mostrarDetalles(){

super.mostrarDetalles();

System.out.println("Numero de puertas: " + numPuertas);

}

## Polimorfismo:

Super clase figura:

Sub clases circulo y rectangulo

Los objetos de la subclase son también objetos de la superclase.

        Figura[] figuras = new Figura[2];

        figuras[0] = new Circulo("Circulo", 2.3);
        figuras[1] = new Rectangulo("Rectangulo", 2.0,3.0);

## toString():

¿Qué hace?

● Convierte un objeto en una representación de cadena

¿Para qué se usa?

● Proporciona una representación legible del objeto para poder imprimirlo

Ejemplo de salida

● Persona@1a2b3c4d

¿Cómo podríamos utilizarlo para imprimir nuestros objetos personalizados?

    public class Libro {
        private String titulo;
        private String autor;
        private String isbn;
        private int anioPublicacion;
        @Override
        public String toString() {
            return String.format(
            "Título: %s, Autor: %s, ISBN: %s, Año: %s",
            titulo, autor, isbn, anioPublicacion
        );
    }

## equals()

Sirve para comparar si dos objetos son equivalentes en
términos de contenido, no solo si son el mismo objeto en
memoria.A diferencia del "==" se utiliza para comparar objetos y el "==" 
para variables primitivas y comparar mediante referencias.


