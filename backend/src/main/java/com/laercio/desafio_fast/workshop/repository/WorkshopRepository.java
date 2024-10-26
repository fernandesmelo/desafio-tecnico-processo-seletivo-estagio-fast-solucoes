package com.fastsolucoes.workshop.repository;

import com.fastsolucoes.workshop.model.Workshop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkshopRepository extends JpaRepository<Workshop, Integer> {
}
