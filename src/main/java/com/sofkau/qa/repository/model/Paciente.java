package com.sofkau.qa.repository.model;

public class  Paciente extends Persona {
    private String edad;

    public Paciente() {
    }

    public Paciente(String cc_persona, String nombre, String edad) {
        super(cc_persona, nombre);
        this.edad = edad;
    }

    public String edad() {
        return edad;
    }

    public Paciente setEdad(String edad) {
        this.edad = edad;
        return this;
    }
}
