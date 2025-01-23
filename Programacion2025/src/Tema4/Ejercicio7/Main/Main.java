package Tema4.Ejercicio7.Main;

import Tema4.Ejercicio7.Maquinaria.Locomotora;
import Tema4.Ejercicio7.Maquinaria.Tren;
import Tema4.Ejercicio7.Maquinaria.Vagon;
import Tema4.Ejercicio7.Personal.JefeEstacion;
import Tema4.Ejercicio7.Personal.Maquinista;
import Tema4.Ejercicio7.Personal.Mecanico;

public class Main {
    public static void main(String[] args) {
        Mecanico mecanico1 = new Mecanico("Juan",63727273, Mecanico.especialidad.motor);
        Mecanico mecanico2 = new Mecanico("Luis",63722343, Mecanico.especialidad.electricidad);
        Mecanico mecanico3 = new Mecanico("Mariano",65422343, Mecanico.especialidad.frenos);
        Mecanico mecanico4 = new Mecanico("David",654456743, Mecanico.especialidad.hidraulica);
        Maquinista maquinista1 = new Maquinista("Lucia","24321342N",1345, Maquinista.rango.maquinistaNovato);
        Maquinista maquinista2 = new Maquinista("Martin","223451342N",1500, Maquinista.rango.maquinista);
        Maquinista maquinista3 = new Maquinista("Luisa","23521342N",1750, Maquinista.rango.maquinistaEsperimentado);
        Maquinista maquinista4 = new Maquinista("Fran","233454342N",2000, Maquinista.rango.maquinistaJefe);
        JefeEstacion jefe = new JefeEstacion("Maria","2453235L","23/04/2005");
        Locomotora locomotora = new Locomotora("2321WSR",1200,21,mecanico1);
        Vagon vagon = new Vagon(23,5,4,"Mercancia peligrosa");
        Vagon vagon2 = new Vagon(21,10,8,"Mercancias pesadas");
        Vagon vagon3 = new Vagon(22,5,4,"Transporte de pasajeros");
        Tren tren = new Tren(locomotora,vagon3,maquinista3);
    }
}
