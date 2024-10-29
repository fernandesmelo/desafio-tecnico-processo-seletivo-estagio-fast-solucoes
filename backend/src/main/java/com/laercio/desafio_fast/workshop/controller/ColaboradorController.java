package com.laercio.desafio_fast.workshop.controller;

import com.laercio.desafio_fast.workshop.model.Colaborador;
import com.laercio.desafio_fast.workshop.model.DadosCadastroColaborador;
import com.laercio.desafio_fast.workshop.repository.ColaboradorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class ColaboradorController {

    @Autowired
    private ColaboradorRepository repository;

    @GetMapping
    public String abreFormProd(Model model) {
        model.addAttribute("colaborador", new Colaborador());
        return "index/";
    }

    @PostMapping
    @Transactional
    public String cadastraProd(DadosCadastroColaborador dados) {
        Colaborador colaborador;

        if (dados.id() != null) { 
            colaborador = repository.findById(dados.id())
                    .orElseThrow(() -> new IllegalArgumentException("Funcionário inválido: " + dados.id()));
            colaborador.atualizaDados(dados); 
        } else { 
            colaborador = new Colaborador(dados);
        }

        repository.save(colaborador);
        return "redirect:/index";
    }

    @GetMapping("/index")
    public String carregaFormularioEdicao(@RequestParam Long id, Model model) {
        Colaborador colaborador = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("colaborador inválido: " + id));
        model.addAttribute("colaborador", colaborador);
        return "/index";
    }

    @GetMapping("/listagem")
    public String carregaLista(Model model) {
        model.addAttribute("lista", repository.findAll());
        return "/index";
    }

    @GetMapping("/")
    public String principal() {
        return "index.html";
    }

    @DeleteMapping
    @Transactional
    public String removeProd(Long id) {
        repository.deleteById(id);
        System.out.println("Excluido");
        return "redirect:/produto/listagem";
    }
}
