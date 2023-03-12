package org.bedu.java.backend.postwork5.postwork5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.bedu.java.backend.postwork5.postwork5.model.Persona;
import org.bedu.java.backend.postwork5.postwork5.service.CompruebaService;
import org.bedu.java.backend.postwork5.postwork5.service.ValidaService;

import java.util.Scanner;

@SpringBootApplication
public class Postwork5Application implements CommandLineRunner {

	private ValidaService validaService;
	private CompruebaService compruebaService;
	@Autowired
	public Postwork5Application(ValidaService validaService, CompruebaService compruebaService){
		this.validaService = validaService;
		this.compruebaService = compruebaService;

	}

	public static void main(String[] args) {
		SpringApplication.run(Postwork5Application.class, args);
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

		System.out.println("Introduce el telefono: ");
		String telefono = reader.nextLine();


/*
		System.out.println("Introduce direccion: ");
		String direccion = reader.nextLine();
		System.out.println("Introduce el correo electronico: ");
		String email = reader.nextLine();
*/



		if(validaService.Valida(telefono)){
			System.out.print("Telefono con solo dígitos: ");
//			System.out.println(compruebaService.Comprueba(telefono));
			telefono = compruebaService.Comprueba(telefono);
			//,telefono,edad,email,direccion);
			Persona persona = new Persona( id,nombre,apellido, edad,telefono);
			System.out.println(persona);
		}else {
			System.out.println("Telefono "+ telefono +" no valido debe ir en formato con guion 123-123-1234 o con espacio 123 123 1234");
		}


	}

}
