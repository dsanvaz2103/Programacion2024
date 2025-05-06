package Tema6.Ejercicio7;

public class ValidarContrasena {
     // Metodo que valida la contraseña y lanza una excepción si no es válida
     public static void validarContrasena(String contrasena) throws ContrasenaInvalidaException {
         if (contrasena.length() < 8) {
             throw new ContrasenaInvalidaException("La contraseña debe tener al menos 8 caracteres.");
         }
         boolean tieneMayuscula = false;
         for (char c : contrasena.toCharArray()) {
             if (Character.isUpperCase(c)) {
                 tieneMayuscula = true;
                 break;
             }
         }
         if (!tieneMayuscula) {
             throw new ContrasenaInvalidaException("La contraseña debe contener al menos una letra mayúscula.");
         }
     }
}
