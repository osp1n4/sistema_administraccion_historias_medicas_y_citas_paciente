package com.sofkau.qa.repository;

import com.sofkau.qa.repository.model.Cita;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CitaRepository {

    public List<Cita> citas;

    public CitaRepository() {
        this.citas = new ArrayList<>();
    }

}
