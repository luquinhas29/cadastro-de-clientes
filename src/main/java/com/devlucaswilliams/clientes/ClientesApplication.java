package com.devlucaswilliams.clientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.devlucaswilliams.clientes.model.entity.Cliente;
import com.devlucaswilliams.clientes.model.repository.ClienteRepository;

@SpringBootApplication

public class ClientesApplication {
	
	@Autowired
	ClienteRepository repository;
	
	@Bean
	public CommandLineRunner run() {
		return args ->{
			Cliente cliente = Cliente.builder().cpf("09055496430").nome("lucas williams").build();
		    repository.save(cliente);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientesApplication.class, args);
	}

}
