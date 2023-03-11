package org.bedu.java.backend.postwork4;

import org.bedu.java.backend.postwork4.model.Persona;
//import org.bedu.java.backend.postwork4.model.service.FormateaTel;
import org.bedu.java.backend.postwork4.model.service.ValidarTel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Postwork4Application implements CommandLineRunner{

	private final ValidarTel validarTel;
	//private final FormateaTel formateaTel;

	//Inyección de validacion
	@Autowired
	public Postwork4Application(ValidarTel validarTel ) {
		this.validarTel = validarTel;
		//this.formateaTel = formateaTel;
	}

	public static void main(String[] args) {



		SpringApplication.run(Postwork4Application.class, args
		);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner reader = new Scanner(System.in);

		System.out.println("Introduce el nombre: ");
		String nombre = reader.nextLine();

		System.out.println("Introduce el apellido: ");
		String apellido = reader.nextLine();

		System.out.println("Introduce el ID: ");
		String id = reader.nextLine();

		System.out.println("Introduce la edad: ");
		int edad = Integer.parseInt(reader.nextLine());

		System.out.println("Introduce el teléfono: ");
		String telefono = reader.nextLine();


/*
		System.out.println("Introduce direccion: ");
		String direccion = reader.nextLine();

		System.out.println("Introduce el correo electronico: ");
		String email = reader.nextLine();
*/

		telefono = validarTel.limpiarTel(telefono);
		//telefono = formateaTel.formatear(telefono);

		Persona persona = new Persona( id,nombre,apellido, edad,telefono);
		//,telefono,edad,email,direccion);
		System.out.println(persona);
	}
}
