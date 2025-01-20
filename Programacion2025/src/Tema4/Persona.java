package Tema4;

import Ejericicio6.Sexo;

public class Persona {
        //Atributos
        private Sexo sexo;
        private String nombre;
        private int edad;
        private double estatura;
        String apellido;
        //Todos los metodos

        public Persona(String nombre, int edad, double estatura , Sexo sexo) {
            this.nombre = nombre;
            this.sexo = sexo;
            this.edad = edad;
            this.estatura = estatura;
        }

        Persona(String nombre) {
            this.nombre = nombre;
        }
        public Persona(){
            this.nombre = "Anonimo";
            this.edad = 18;
            this.estatura = 1.70;
        }
        void metodo() {
            int edad = 0;
            this.edad = 8;
            System.out.println(edad);
            System.out.println(this.edad);
        }
        void cumplirAnios(){
            edad ++;
            System.out.println(edad);
        }
        void saludar(){
            System.out.println("Hola soy " + nombre);
        }
        void crecer(double incremento) {
            estatura = estatura + incremento;
            System.out.println(estatura);
        }

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
            if (edad > 0) {
                this.edad = edad;
            }else{
                System.out.println("El edad es mayor que 0");
            }
        }

        public double getEstatura() {
            return estatura;
        }

        public void setEstatura(double estatura) {
            this.estatura = estatura;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public Sexo getSexo() {
            return sexo;
        }

        public void setSexo(Sexo sexo) {
            this.sexo = sexo;
        }
}
