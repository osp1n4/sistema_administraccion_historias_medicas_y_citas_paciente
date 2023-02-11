package com.sofkau.qa.repository;

import com.sofkau.qa.repository.model.Cita;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public enum DiaSemanaRepository {
    LUNES("08:00","17:00"),
    MARTES("08:00","17:00"),
    MIERCOLES("08:00","17:00"),
    JUEVES("08:00","17:00"),
    VIERNES("08:00","17:00");

    private String horarioEntrada;
    private String horarioSalida;
    private List<Cita> agenda;
   private DiaSemanaRepository() {

    }

    DiaSemanaRepository(String horarioEntrada, String horarioSalida) {
        this.horarioEntrada = horarioEntrada;
        this.horarioSalida = horarioSalida;
        this.agenda = new LinkedList<>();
    }

    public String horarioEntrada() {
        return horarioEntrada;
    }

    public DiaSemanaRepository setHorarioEntrada(String horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
        return this;
    }

    public String horarioSalida() {
        return horarioSalida;
    }

    public DiaSemanaRepository setHorarioSalida(String horarioSalida) {
        this.horarioSalida = horarioSalida;
        return this;
    }

    @Override
    public String toString() {
        return "DiaSemanaRepository{" +
                "horarioEntrada='" + horarioEntrada + '\'' +
                ", horarioSalida='" + horarioSalida + '\'' +
                ", agenda=" + agenda +
                '}';
    }
}
