package com.sofkau.qa.service;

import com.sofkau.qa.repository.DoctorRepository;
import com.sofkau.qa.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService implements IDoctorService{

@Autowired
    DoctorRepository doctorRepository;

    @Override
    public PacienteRepository agregarPaciente(PacienteRepository pacienteRepository) {
        doctorRepository.listaPaciente().put(doctorRepository.clave(), pacienteRepository);
        return agregarPaciente(pacienteRepository);
    }

    @Override
    public PacienteRepository eliminarPaciente(PacienteRepository pacienteRepository) {
        return null;
    }

    @Override
    public PacienteRepository actualizarInformacionPaciente(PacienteRepository pacienteRepository) {
        return null;
    }
}
