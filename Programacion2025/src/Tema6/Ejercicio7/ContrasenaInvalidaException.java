package Tema6.Ejercicio7;

public class ContrasenaInvalidaException extends Exception {
    // Excepción personalizada
    public ContrasenaInvalidaException(String mensaje) {
        super(mensaje);
    }
}
