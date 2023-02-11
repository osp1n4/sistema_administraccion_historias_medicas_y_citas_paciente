package com.sofkau.qa;

import com.sofkau.qa.repository.DiaSemanaRepository;
import com.sofkau.qa.repository.PacienteRepository;
import com.sofkau.qa.repository.model.Paciente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.SQLOutput;

@SpringBootApplication
public class SistemaAdministraccionHistoriasMedicasYCitasPacienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaAdministraccionHistoriasMedicasYCitasPacienteApplication.class, args);
	}
	@Bean
	public DiaSemanaRepository diaSemanaRepository(){

		System.out.println( DiaSemanaRepository.LUNES);
		return diaSemanaRepository();
	}

}
