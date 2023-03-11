package postwork5.postwork5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import postwork5.postwork5.model.Persona;
import postwork5.postwork5.service.CompruebaService;
import postwork5.postwork5.service.ValidaService;

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


		System.out.println("Introduce el teléfono: ");
		String telefono = reader.nextLine();

		System.out.println("Introduce la edad: ");
		int edad = Integer.parseInt(reader.nextLine());
/*
		System.out.println("Introduce direccion: ");
		String direccion = reader.nextLine();
		System.out.println("Introduce el correo electronico: ");
		String email = reader.nextLine();
*/
		Persona persona = new Persona( id,nombre,apellido, edad);
		//,telefono,edad,email,direccion);
		System.out.println(persona);

		if(validaService.Valida(telefono)){
			System.out.print("Telefono con solo dígitos: ");
			System.out.println(compruebaService.Comprueba(telefono));
		}else {
			System.out.println("Teléfono no válido");
		}


	}

}
