package org.bedu.java.backend.postwork6;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.bedu.java.backend.postwork6.model.Persona;
import org.bedu.java.backend.postwork6.service.ValidaService;

import java.util.Scanner;

import static org.bedu.java.backend.postwork6.service.ValidaService.formatear;

@SpringBootApplication
public class Postwork6Application {



	public static void main(String[] args) {
		SpringApplication.run(Postwork6Application.class, args);
	}



}
