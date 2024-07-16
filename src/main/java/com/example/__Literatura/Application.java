package com.example.__Literatura;

import com.example.__Literatura.principal.Principal;
import com.example.__Literatura.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	BookRepository libroRepositorio;
	@Autowired
	AuthorRepository autorRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(libroRepositorio, autorRepositorio);
		principal.mostrarMenu();
	}
}