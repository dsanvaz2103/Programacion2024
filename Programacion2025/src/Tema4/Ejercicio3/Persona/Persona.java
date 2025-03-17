package Tema4.Ejercicio3.Persona;

import Tema4.Ejercicio6.Sexo.Sexo;

public class Persona {
    // Atributos
    protected String nombre;
    protected byte edad;
    protected double estatura;
    protected Sexo sexo;

    void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
        System.out.println("Sexo: " + sexo);
    }
    // Métodos
    public Persona(String nombre, byte edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        else{
            Persona p = (Persona) obj;
            return this.nombre.equals(p.nombre)
                    && this.edad == p.edad
                    && this.estatura == p.estatura
                    && this.sexo.equals(p.sexo);
        }
    }
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estatura=" + estatura +
                ", sexo=" + sexo +
                '}';
    }

    public Persona() {
        this.edad = 7;
    }

    void metodo() {
        int edad = 8;
        System.out.println(this.edad);
    }
    void saludar () {
        System.out.println("Hola soy " + nombre);
    }
    void cumplirAnyos() {
        edad ++;
    }
    void crecer (double incremento) {
        estatura = estatura + incremento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    /**
     * @return the estatura
     */
    public double getEstatura() {
        return estatura;
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

}
