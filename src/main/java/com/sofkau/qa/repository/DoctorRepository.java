package com.sofkau.qa.repository;

public class DoctorRepository {
    private String id_medico;
    private final String nombre = "Ramiro Fernandez";

    public DoctorRepository(String id_medico) {
        this.id_medico = id_medico;
    }

    public String id_medico() {
        return id_medico;
    }

    public DoctorRepository setId_medico(String id_medico) {
        this.id_medico = id_medico;
        return this;
    }

    public String nombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "DoctorRepository{" +
                "id_medico='" + id_medico + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
