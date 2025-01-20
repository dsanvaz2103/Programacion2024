package Tema4.ActividadAmplizacion;

public class CuentaCorriente {
    public static String dni;
    public static String nombre;
    public static double saldo;
    private String banco;
    private Gestor gestor;

    // Constructor con DNI y saldo inicial
    public CuentaCorriente(String dni, double saldoInicial, String nombre) {
        this.dni = dni;
        this.saldo = saldoInicial;
        this.nombre = nombre;
        this.banco = "Banco Nacional";
    }

    // Constructor con DNI, nombre y saldo inicial
    public CuentaCorriente(String dni, String nombre, double saldoInicial) {
        this(dni, saldoInicial);
        this.nombre = nombre;
    }

    public CuentaCorriente(String dni, double saldoInicial) {

    }

    // Método para sacar dinero
    public static void retirarDinero(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Saldo actual: " + cantidad);
        }else{
            System.out.println("No hay suficiente dinero");
        }
    }

    // Método para ingresar dinero
    public static void depositarDinero(double cantidad) {
        saldo += cantidad;
    }

    // Método para mostrar información de la cuenta
    public void mostrarInformacion() {
        System.out.println("Datos de la cuenta:");
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Banco: " + banco);
    }

    public void modificarBanco() {
        System.out.println("Datos de la cuenta:");
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Saldo: $" + saldo);
    }

    public String getDni(String s) {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo(double saldo) {
        return CuentaCorriente.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }
}
