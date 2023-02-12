package com.sofkau.qa.controller;

import com.sofkau.qa.repository.PacienteRepository;
import com.sofkau.qa.repository.model.Paciente;
import com.sofkau.qa.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/paciente")
public class PacienteController {

@Autowired
    private IPacienteService  pacienteService;
    private PacienteRepository pacienteRepository;


    public PacienteController(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    @GetMapping("/listar")
    public ResponseEntity listarPaciente(){

        return new ResponseEntity(pacienteService.obtenerPaciente(), HttpStatus.FOUND);
    }

    @PostMapping(value ="/registrar", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity registrarPaciente(@RequestBody Paciente paciente){
        return new ResponseEntity(pacienteService.registrarPaciente(paciente),HttpStatus.CREATED);
    }
}
