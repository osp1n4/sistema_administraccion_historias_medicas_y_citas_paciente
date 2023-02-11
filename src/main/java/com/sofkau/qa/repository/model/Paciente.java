package com.sofkau.qa.repository.model;

public abstract class  Paciente {
    private String cc_paciente;
    private String nombre;


    public Paciente() {
    }

    public Paciente(String cc_paciente, String nombre) {
        this.cc_paciente = cc_paciente;
        this.nombre = nombre;
    }

    public String cc_paciente() {
        return cc_paciente;
    }

    public Paciente setCc_paciente(String cc_paciente) {
        this.cc_paciente = cc_paciente;
        return this;
    }

    public String nombre() {
        return nombre;
    }

    public Paciente setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "cc_paciente='" + cc_paciente + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
