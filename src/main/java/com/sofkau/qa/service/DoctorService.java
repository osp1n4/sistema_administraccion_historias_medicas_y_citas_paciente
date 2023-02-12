package com.sofkau.qa.service;

import com.sofkau.qa.repository.DoctorRepository;
import com.sofkau.qa.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class DoctorService implements IDoctorService{

@Autowired
    DoctorRepository doctorRepository;
@Autowired
private PacienteRepository pacienteRepository;

    @Override
    public PacienteRepository agregarPaciente(PacienteRepository pacienteRepository) {
        doctorRepository.listaPaciente().put(doctorRepository.clave(),pacienteRepository);
        return agregarPaciente(pacienteRepository);
    }

    @Override
    public PacienteRepository eliminarPaciente(PacienteRepository pacienteRepository) {
        doctorRepository.listaPaciente().remove(doctorRepository.clave(), pacienteRepository);
        return eliminarPaciente(pacienteRepository);
    }

    public HashMap<String, PacienteRepository> listar(){

        return doctorRepository.listaPaciente();
    }

    @Override
    public PacienteRepository actualizarInformacionPaciente(PacienteRepository pacienteRepository) {

        return (PacienteRepository) doctorRepository.listaPaciente().values().stream();
    }
}
