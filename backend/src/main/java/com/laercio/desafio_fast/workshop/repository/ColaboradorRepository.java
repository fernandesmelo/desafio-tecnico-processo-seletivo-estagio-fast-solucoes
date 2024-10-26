package com.fastsolucoes.workshop.repository;

import com.fastsolucoes.workshop.model.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColaboradorRepository extends JpaRepository<Colaborador, Integer> {
}

