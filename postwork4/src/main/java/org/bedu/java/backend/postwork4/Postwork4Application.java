package org.bedu.java.backend.postwork4;

import org.bedu.java.backend.postwork4.model.Persona;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Postwork4Application implements CommandLineRunner{

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

		System.out.println("Introduce el teléfono: ");
		String telefono = reader.nextLine();

		System.out.println("Introduce la edad: ");
		int edad = reader.nextLine();

		System.out.println("Introduce direccion: ");
		String direccion = reader.nextLine();

		System.out.println("Introduce el correo electronico: ");
		String email = reader.nextLine();

		Persona persona = new Persona( nombre,apellido,telefono,edad,email,direccion);
		System.out.println(persona);
	}
}
