package com.devlucaswilliams.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlucaswilliams.clientes.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
