package com.sofkau.qa.repository;

import com.sofkau.qa.repository.model.Cita;
import org.springframework.stereotype.Repository;

@Repository
public class CitaRepository extends Cita {


    public CitaRepository() {
    }

    public CitaRepository(String duracionConsulta, String horarioCita, PacienteRepository pacienteRepository) {
        super(duracionConsulta,horarioCita);
        pacienteRepository.nombre();
        pacienteRepository.cc_paciente();
    }
}
