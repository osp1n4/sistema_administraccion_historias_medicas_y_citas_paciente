package com.sofkau.qa.service;


import com.sofkau.qa.repository.PacienteRepository;
import com.sofkau.qa.repository.model.Paciente;

public interface IDoctorService {

  public PacienteRepository agregarPaciente(PacienteRepository pacienteRepository);
  public PacienteRepository eliminarPaciente(PacienteRepository pacienteRepository);
  public PacienteRepository actualizarInformacionPaciente(PacienteRepository pacienteRepository);

}
