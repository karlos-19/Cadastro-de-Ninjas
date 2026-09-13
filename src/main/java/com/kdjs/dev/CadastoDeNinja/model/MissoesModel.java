package com.kdjs.dev.CadastoDeNinja.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_missao")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String titulo;
    private String descricao;
    private String rank;
    private String status;
    private String recompensa;
    private String prazo;
    private String ninjaResponsavel;
    private String solicitante;

    public MissoesModel(){
    }

    public MissoesModel(long id, String titulo, String descricao, String rank, String status, String recompensa, String prazo, String ninjaResponsavel, String solicitante) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.rank = rank;
        this.status = status;
        this.recompensa = recompensa;
        this.prazo = prazo;
        this.ninjaResponsavel = ninjaResponsavel;
        this.solicitante = solicitante;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(String recompensa) {
        this.recompensa = recompensa;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public String getNinjaResponsavel() {
        return ninjaResponsavel;
    }

    public void setNinjaResponsavel(String ninjaResponsavel) {
        this.ninjaResponsavel = ninjaResponsavel;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }
}
