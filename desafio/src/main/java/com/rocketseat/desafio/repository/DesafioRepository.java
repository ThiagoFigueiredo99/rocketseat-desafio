package com.rocketseat.desafio.repository;

import com.rocketseat.desafio.model.Desafio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesafioRepository extends JpaRepository<Desafio, Long> {
}
