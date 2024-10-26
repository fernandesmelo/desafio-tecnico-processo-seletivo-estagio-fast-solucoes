package com.laercio.desafio_fast.workshop.model;

import javax.persistence.*;

@Entity
@Table(name = "colaboradores")
public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idColaboradores") // Nome da coluna no banco
    private int id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "departamento", nullable = false)
    private String departamento;

    @Column(name = "cargo", nullable = false)
    private String cargo;

    // Getters e Setters
}