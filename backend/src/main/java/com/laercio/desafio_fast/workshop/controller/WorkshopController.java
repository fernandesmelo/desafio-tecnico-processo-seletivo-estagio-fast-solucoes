package com.laercio.desafio_fast.workshop.controller;

import com.laercio.desafio_fast.workshop.model.Workshop;
import com.laercio.desafio_fast.workshop.service.WorkshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workshops")
public class WorkshopController {

    @Autowired
    private WorkshopService workshopService;

    @GetMapping
    public List<Workshop> listarWorkshops() {
        return workshopService.listarWorkshops();
    }

    @PostMapping
    public Workshop criarWorkshop(@RequestBody Workshop workshop) {
        return workshopService.salvarWorkshop(workshop);
    }

    @PutMapping("/{id}")
    public Workshop atualizarWorkshop(@PathVariable int id, @RequestBody Workshop workshop) {
        return workshopService.atualizarWorkshop(id, workshop);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarWorkshop(@PathVariable int id) {
        workshopService.deletarWorkshop(id);
        return ResponseEntity.noContent().build();
    }
}

