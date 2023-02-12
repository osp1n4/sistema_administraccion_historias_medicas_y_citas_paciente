package com.sofkau.qa.repository.model;

public class Doctor extends Persona {

    private String horarioDisponible;

    public Doctor() {
    }

    public Doctor(String cc_persona, String nombre, String horarioDisponible) {
        super(cc_persona, nombre);
        this.horarioDisponible = horarioDisponible;
    }

    public String horarioDisponible() {
        return horarioDisponible;
    }

    public Doctor setHorarioDisponible(String horarioDisponible) {
        this.horarioDisponible = horarioDisponible;
        return this;
    }
}
