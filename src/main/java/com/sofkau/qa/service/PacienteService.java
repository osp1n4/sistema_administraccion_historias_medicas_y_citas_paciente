package com.sofkau.qa.service;

import com.sofkau.qa.repository.PacienteRepository;
import com.sofkau.qa.repository.model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService implements IPacienteService{

    @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    public List<Paciente> obtenerPaciente() {

        return pacienteRepository.getPacientes();
    }

    @Override
    public Paciente registrarPaciente(Paciente paciente) {
        Paciente nuevoPaciente = new Paciente(paciente.cc_persona(), paciente.nombre(), paciente.edad());
        this.pacienteRepository.agregarPaciente(nuevoPaciente);
        return nuevoPaciente;
    }
}
