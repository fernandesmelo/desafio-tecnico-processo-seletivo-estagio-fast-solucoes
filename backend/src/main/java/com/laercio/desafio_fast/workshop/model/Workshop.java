package com.laercio.desafio_fast.workshop.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "workshops")
public class Workshop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String nome;
    String data;
    String descricao;
    String local;
    String horaInicio;
    String horaFim;


    public Workshop (DadosCadastroWorkshop dados) {
        this.id = dados.id();
        this.nome = dados.nome();
        this.data = dados.data();
        this.descricao = dados.descricao();
        this.local = dados.local();
        this.horaInicio = dados.horaInicio();
        this.horaFim = dados.horaFim();
    }

    public Workshop(){}

    @Override
    public String toString(){
        return "Workshop ["
        + "nome=" + nome + ", "
				+ "data=" + data + ", "
				+ "descricao=" + descricao + ", "
                + "local=" + local + ", "
                + "horaInicio=" + horaInicio + ", "
                + "horaFim=" + horaFim + ""
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    public void atualizaDados(DadosCadastroWorkshop dados){
        this.id = dados.id();
        this.nome = dados.nome();
        this.data = dados.data();
        this.descricao = dados.descricao();
        this.local = dados.local();
        this.horaInicio = dados.horaInicio();
        this.horaFim = dados.horaFim();
    }
}