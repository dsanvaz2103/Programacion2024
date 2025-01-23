package Tema4.Ejercicio7.Maquinaria;

import Tema4.Ejercicio7.Personal.Mecanico;

public class Locomotora {
    private String matricula;
    private int potenciaMotor;
    private int fechaFabricacacion;
    private Mecanico mecanico;

    public Locomotora(String matricula, int potenciaMotor, int fechaFabricacacion, Mecanico mecanico) {
        this.matricula = matricula;
        this.potenciaMotor = potenciaMotor;
        this.fechaFabricacacion = fechaFabricacacion;
        this.mecanico = mecanico;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public int getFechaFabricacacion() {
        return fechaFabricacacion;
    }

    public void setFechaFabricacacion(int fechaFabricacacion) {
        this.fechaFabricacacion = fechaFabricacacion;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }
}
