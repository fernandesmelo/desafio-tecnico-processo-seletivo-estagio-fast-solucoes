package com.laercio.desafio_fast.workshop.controller;
import com.laercio.desafio_fast.workshop.model.DadosCadastroWorkshop;
import com.laercio.desafio_fast.workshop.model.Workshop;
import com.laercio.desafio_fast.workshop.repository.WorkshopRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class WorkshopController {

    @Autowired
    private WorkshopRepository repository;

    @GetMapping
    public String abreFormProd(Model model) {
        model.addAttribute("workshop", new Workshop());
        return "index/";
    }

    @PostMapping
    @Transactional
    public String cadastraProd(DadosCadastroWorkshop dados) {
        Workshop workshop;

        if (dados.id() != null) { 
            workshop = repository.findById(dados.id())
                    .orElseThrow(() -> new IllegalArgumentException("Funcionário inválido: " + dados.id()));
            workshop.atualizaDados(dados); 
        } else { 
            workshop = new Workshop(dados);
        }

        repository.save(workshop);
        return "redirect:/index";
    }

    @GetMapping("/index")
    public String carregaFormularioEdicao(@RequestParam Long id, Model model) {
        Workshop workshop = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("workshop inválido: " + id));
        model.addAttribute("workshop", workshop);
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
