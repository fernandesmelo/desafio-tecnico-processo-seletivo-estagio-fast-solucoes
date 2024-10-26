package com.fastsolucoes.workshop.controller;

import com.fastsolucoes.workshop.model.Colaborador;
import com.fastsolucoes.workshop.service.ColaboradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/colaboradores")
public class ColaboradorController {

    @Autowired
    private ColaboradorService colaboradorService;

    @GetMapping
    public List<Colaborador> listarColaboradores() {
        return colaboradorService.listarColaboradores();
    }

    @PostMapping
    public Colaborador criarColaborador(@RequestBody Colaborador colaborador) {
        return colaboradorService.salvarColaborador(colaborador);
    }

    @PutMapping("/{id}")
    public Colaborador atualizarColaborador(@PathVariable int id, @RequestBody Colaborador colaborador) {
        return colaboradorService.atualizarColaborador(id, colaborador);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarColaborador(@PathVariable int id) {
        colaboradorService.deletarColaborador(id);
        return ResponseEntity.noContent().build();
    }
}
 
}
