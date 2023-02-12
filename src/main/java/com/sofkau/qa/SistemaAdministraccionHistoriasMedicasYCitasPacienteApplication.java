package com.sofkau.qa;

import com.sofkau.qa.service.EnumDiaSemana;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaAdministraccionHistoriasMedicasYCitasPacienteApplication {

	public static void main(String[] args) {
		System.out.println(EnumDiaSemana.VIERNES);
		SpringApplication.run(SistemaAdministraccionHistoriasMedicasYCitasPacienteApplication.class, args);
	}

}
