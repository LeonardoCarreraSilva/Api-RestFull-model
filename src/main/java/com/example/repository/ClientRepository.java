package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.web.domain.models.tb_cliente;

@Repository
public interface ClientRepository extends JpaRepository<tb_cliente, Integer>{

}
