package com.devspring.dslist;

import entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import repository.ClientesRepository;

@SpringBootApplication
@ComponentScan(basePackages = {"com.devspring.dslist", "entity", "repository"})
public class DslistApplication {

	@Bean
	public CommandLineRunner init(@Autowired ClientesRepository clientesRepository){
		return args -> {
			Cliente cliente = new Cliente();
			cliente.setNome("Fulano");
			clientesRepository.salvar(cliente);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(DslistApplication.class, args);
	}

}
