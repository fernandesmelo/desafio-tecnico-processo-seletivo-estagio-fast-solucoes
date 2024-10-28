package com.laercio.desafio_fast.workshop.repository;

import com.laercio.desafio_fast.workshop.model.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColaboradorRepository extends JpaRepository<Colaborador, Long> {
}

