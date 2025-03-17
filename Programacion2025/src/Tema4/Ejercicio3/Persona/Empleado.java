package Tema4.Ejercicio3.Persona;

public class Empleado extends Persona{
    private double salario;
    /*private String nombre; //Sobre escribe en la la superclase*/
    @Override// significa: sustituye un metodo de la superclase
    void mostrarDatos() {
        //Te coge los datos de el metodo mostrarDatos de la clase Persona
        super.mostrarDatos();
        System.out.println(salario);
    }
    Empleado(double salario){
        this.salario = salario;
        // para referenciar el nombre
        super.setNombre(nombre);
        this.nombre = nombre;
    }
    double getSalario(){
        return salario;
    }
}
