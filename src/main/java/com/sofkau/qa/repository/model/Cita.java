package com.sofkau.qa.repository.model;

import java.util.UUID;

public abstract class Cita {
    private String id_cita;
    private String duracionConsulta;
    private String horarioCita;

    public Cita() {
    }

    public Cita(String duracionConsulta, String horarioCita) {
        this.id_cita = String.valueOf(UUID.randomUUID());
        this.duracionConsulta = duracionConsulta;
        this.horarioCita = horarioCita;
    }

    public String id_cita() {
        return id_cita;
    }

    public Cita setId_cita(String id_cita) {
        this.id_cita = id_cita;
        return this;
    }

    public String duracionConsulta() {
        return duracionConsulta;
    }

    public Cita setDuracionConsulta(String duracionConsulta) {
        this.duracionConsulta = duracionConsulta;
        return this;
    }

    public String horarioCita() {
        return horarioCita;
    }

    public Cita setHorarioCita(String horarioCita) {
        this.horarioCita = horarioCita;
        return this;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "id_cita='" + id_cita + '\'' +
                ", duracionConsulta='" + duracionConsulta + '\'' +
                ", horarioCita='" + horarioCita + '\'' +
                '}';
    }
}
