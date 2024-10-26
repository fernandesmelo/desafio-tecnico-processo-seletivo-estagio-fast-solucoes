package com.laercio.desafio_fast.workshop.repository;

import com.laercio.desafio_fast.workshop.model.Workshop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkshopRepository extends JpaRepository<Workshop, Integer> {
}
