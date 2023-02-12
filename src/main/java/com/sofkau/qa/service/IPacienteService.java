package com.sofkau.qa.service;

import com.sofkau.qa.repository.model.Paciente;

import java.util.List;

public interface IPacienteService {

    List<Paciente> obtenerPaciente();
    Paciente registrarPaciente(Paciente paciente);
}
