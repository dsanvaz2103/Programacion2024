package Tema6.Ejercicio8;

public class ComprobadorDeTemperatura {

    public static void comprobadorDeTemperatura(int temperatura) throws TemperaturaFueraDeRangoException {
        if (temperatura >= 50 || temperatura <= -10) {
            throw new TemperaturaFueraDeRangoException("La tempera  esta fuera del rango");
        }else {
            System.out.println("La  temperatura esta dentro del rango");
        }
    }

}
