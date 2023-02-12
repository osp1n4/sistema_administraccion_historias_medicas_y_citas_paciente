package com.sofkau.qa.repository.model;

public abstract class Persona {
    private String cc_persona;
    private String nombre;

    public Persona() {
    }

    public Persona(String cc_persona, String nombre) {
        this.cc_persona = cc_persona;
        this.nombre = nombre;
    }

    public String cc_persona() {
        return cc_persona;
    }

    public Persona setCc_persona(String cc_persona) {
        this.cc_persona = cc_persona;
        return this;
    }

    public String nombre() {
        return nombre;
    }

    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "cc_persona='" + cc_persona + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
