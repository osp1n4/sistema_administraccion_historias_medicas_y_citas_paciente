package com.sofkau.qa.controller;

import com.sofkau.qa.repository.DoctorRepository;
import com.sofkau.qa.repository.PacienteRepository;
import com.sofkau.qa.repository.model.Paciente;
import com.sofkau.qa.service.DoctorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/doctor")
public class DoctorController {
    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private DoctorService doctorService;

    public DoctorController() {
        this.doctorRepository = new DoctorRepository();
    }

    @GetMapping("/lista/buses")
    public ResponseEntity listaPacientes(){
        return new ResponseEntity(doctorService.listar(), HttpStatus.FOUND);
    }

    @PostMapping("/agregar")
    public ResponseEntity agregarPaciente(@RequestBody PacienteRepository pacienteRepository){

       return new ResponseEntity(doctorService.agregarPaciente(pacienteRepository),HttpStatus.CREATED);
    }
}
