package Tema4.Persona;

import Tema4.Sexo.Sexo;

public class Fiesta {
    public static void main(String[] args) {
        Persona pepe = new Persona();
        Persona p = new Persona("Fran", (byte) 30,1.9);
        System.out.println(p);
        pepe.setSexo(Sexo.HOMBRE);
        pepe.setNombre("Pepito");
        System.out.println("El sexo de " + pepe.getNombre() + " es "+ pepe.getSexo());

        Empleado empleado = new Empleado(1000);
        System.out.println("Empleado de " + empleado.getNombre() + " es "+ empleado.getSexo());
        System.out.println("Empleado: " + empleado.getSalario());
        empleado.mostrarDatos();

    }
}
