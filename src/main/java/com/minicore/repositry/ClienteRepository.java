package com.minicore.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minicore.model.cliente;

public interface ClienteRepository extends JpaRepository<cliente, Integer>{

}
