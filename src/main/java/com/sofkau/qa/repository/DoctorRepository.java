package com.sofkau.qa.repository.model;

public class Doctor {
    private String id_medico;
    private final String nombre = "Ramiro Fernandez";

    public Doctor(String id_medico) {
        this.id_medico = id_medico;
    }

    public String id_medico() {
        return id_medico;
    }

    public Doctor setId_medico(String id_medico) {
        this.id_medico = id_medico;
        return this;
    }

    public String nombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id_medico='" + id_medico + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
