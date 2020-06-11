package com.example.repository;

import com.example.web.domain.models.tb_fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface providerRepository extends JpaRepository<tb_fornecedor, Integer> {
}
