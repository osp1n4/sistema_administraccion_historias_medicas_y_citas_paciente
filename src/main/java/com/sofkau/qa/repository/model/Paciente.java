package com.sofkau.qa.repository;

public abstract class  Paciente {
    private  String id_paciente;
    private String cc;
    private String nombre;
    private String historiaMedica;

    public Paciente() {
    }

    public Paciente(String id_paciente, String cc, String nombre, String historiaMedica) {
        this.id_paciente = id_paciente;
        this.cc = cc;
        this.nombre = nombre;
        this.historiaMedica = historiaMedica;
    }

    public String id_paciente() {
        return id_paciente;
    }

    public Paciente setId_paciente(String id_paciente) {
        this.id_paciente = id_paciente;
        return this;
    }

    public String cc() {
        return cc;
    }

    public Paciente setCc(String cc) {
        this.cc = cc;
        return this;
    }

    public String nombre() {
        return nombre;
    }

    public Paciente setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String historiaMedica() {
        return historiaMedica;
    }

    public Paciente setHistoriaMedica(String historiaMedica) {
        this.historiaMedica = historiaMedica;
        return this;
    }

}
