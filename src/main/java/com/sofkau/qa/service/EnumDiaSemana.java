package com.sofkau.qa.service;

import com.sofkau.qa.repository.model.Cita;

import java.util.LinkedList;
import java.util.List;

public enum EnumDiaSemana {
    LUNES("08:00","17:00"),
    MARTES("08:00","17:00"),
    MIERCOLES("08:00","17:00"),
    JUEVES("08:00","17:00"),
    VIERNES("08:00","15:00");

    private String horarioEntrada;
    private String horarioSalida;
    private List<Cita> agenda;
   private EnumDiaSemana() {

    }

    EnumDiaSemana(String horarioEntrada, String horarioSalida) {
        this.horarioEntrada = horarioEntrada;
        this.horarioSalida = horarioSalida;
        this.agenda = new LinkedList<>();
    }

    public String horarioEntrada() {
        return horarioEntrada;
    }

    public EnumDiaSemana setHorarioEntrada(String horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
        return this;
    }

    public String horarioSalida() {
        return horarioSalida;
    }

    public EnumDiaSemana setHorarioSalida(String horarioSalida) {
        this.horarioSalida = horarioSalida;
        return this;
    }

    @Override
    public String toString() {
        return "EnumDiaSemana{" +
                "horarioEntrada='" + horarioEntrada + '\'' +
                ", horarioSalida='" + horarioSalida + '\'' +
                ", agenda=" + agenda +
                '}';
    }
}
