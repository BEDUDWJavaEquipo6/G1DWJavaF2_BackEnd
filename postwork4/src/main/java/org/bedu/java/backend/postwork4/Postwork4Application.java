package org.bedu.java.backend.postwork4;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Postwork4Application implements CommandLineRunner{

	public static void main(String[] args) {

		SpringApplication.run(Postwork4Application.class, args
		);
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Here the command line runner is running inside the spring boot ,,..//");
	}
}
