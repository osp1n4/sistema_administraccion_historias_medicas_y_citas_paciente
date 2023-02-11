package com.sofkau.qa.repository;

import com.sofkau.qa.repository.model.Paciente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PacienteRepository extends Paciente {

    private List<String> historialMedico;

    public PacienteRepository() {
        this.historialMedico = new ArrayList<>();
    }
    public PacienteRepository(String cc_paciente, String nombre) {
        super(cc_paciente, nombre);
        this.historialMedico = new ArrayList<>();
    }

    public List<String> historialMedico() {
        return historialMedico;
    }

    public PacienteRepository setHistorialMedico(List<String> historialMedico) {
        this.historialMedico = historialMedico;
        return this;
    }

    @Override
    public String toString() {
        return "PacienteRepository{" +
                "historialMedico=" + historialMedico +
                '}';
    }
}
