package com.sofkau.qa.repository;

import com.sofkau.qa.repository.model.Paciente;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;

@Repository
public class DoctorRepository {

    private final int id_medico = 1039455774;
    private final String nombre = "Ramiro Fernandez";
    private HashMap<String,PacienteRepository> listaPaciente;
    private String clave = String.valueOf(UUID.randomUUID());

    public DoctorRepository() {
        this.listaPaciente = new HashMap<>();
        listaPaciente.put(clave,new PacienteRepository("142334","Emilia"));

    }

    public int id_medico() {
        return id_medico;
    }

    public String nombre() {
        return nombre;
    }

    public HashMap<String, PacienteRepository> listaPaciente() {
        return listaPaciente;
    }

    public DoctorRepository setListaPaciente(HashMap<String, PacienteRepository> listaPaciente) {
        this.listaPaciente = listaPaciente;
        return this;
    }

    public String clave() {
        return clave;
    }

    public DoctorRepository setClave(String clave) {
        this.clave = clave;
        return this;
    }

    @Override
    public String toString() {
        return "DoctorRepository{" +
                "id_medico=" + id_medico +
                ", nombre='" + nombre + '\'' +
                ", listaPaciente=" + listaPaciente +
                ", clave='" + clave + '\'' +
                '}';
    }
}
