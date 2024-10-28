package com.laercio.desafio_fast.workshop.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "colaboradores")
public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String nome;
    String departamento;
    String cargo;

    public Colaborador (DadosCadastroColaborador dados) {
        this.id = dados.id();
        this.nome = dados.nome();
        this.departamento = dados.departamento();
        this.cargo = dados.cargo();
    }

    public Colaborador(){}

    @Override
    public String toString(){
        return "Colaborador ["
        + "nome=" + nome + ", "
				+ "departamento=" + departamento + ", "
				+ "cargo=" + cargo + ""
				+ "]";
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void atualizaDados(DadosCadastroColaborador dados){
        this.nome = dados.nome();
        this.departamento = dados.departamento();
        this.cargo = dados.cargo();
    }
}