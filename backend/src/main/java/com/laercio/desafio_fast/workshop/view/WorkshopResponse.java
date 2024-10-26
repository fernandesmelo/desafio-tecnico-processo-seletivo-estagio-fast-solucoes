package com.laercio.desafio_fast.workshop.view;

public class WorkshopResponse {
    private int id;
    private String nome;
    private String dataRealizacao;
    private String descricao;

    // Construtor, Getters e Setters
    public WorkshopResponse(int id, String nome, String dataRealizacao, String descricao) {
        this.id = id;
        this.nome = nome;
        this.dataRealizacao = dataRealizacao;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(String dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

