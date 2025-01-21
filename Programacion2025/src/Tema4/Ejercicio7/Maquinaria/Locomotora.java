package Tema4.Ejercicio7.Maquinaria;

import Tema4.Ejercicio7.Personal.Mecanico;

public class Locomotora {
    private String matricula;
    private String potenciaMotor;
    private String fechaFabricacacion;
    private Mecanico mecanico;

    public Locomotora(String matricula, String potenciaMotor, String fechaFabricacacion, Mecanico mecanico) {
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

    public String getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(String potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public String getFechaFabricacacion() {
        return fechaFabricacacion;
    }

    public void setFechaFabricacacion(String fechaFabricacacion) {
        this.fechaFabricacacion = fechaFabricacacion;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }
}
