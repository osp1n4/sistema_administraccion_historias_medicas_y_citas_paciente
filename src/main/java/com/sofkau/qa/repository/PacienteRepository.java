package com.sofkau.qa.repository;
import com.sofkau.qa.repository.model.Paciente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PacienteRepository {

public List<Paciente> pacientes;

    public PacienteRepository() {
        this.pacientes = new ArrayList<>();
    }

    public  void agregarPaciente(Paciente paciente){
        pacientes.add(paciente);
    }

    public void listarPaciente(){
        pacientes.stream().forEach(paciente -> System.out.println(paciente.nombre()));
    }

    public List<Paciente> getPacientes(){
        this.listarPaciente();
        return pacientes;
    }

}
