package com.kdjs.dev.CadastoDeNinja.model;
import jakarta.persistence.*;

import java.util.List;


// Entity transforma uma classe em entidade do banco de dados
@Entity
@Table(name = "tb_cadastro")
public class NinjasModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private String email;
    private String cla;
    private String rank;
    private String tecnicas;
    private int idade;
    private List<MissoesModel> missoes;

    public NinjasModel() {
    }

    public NinjasModel(String nome, String cla, String rank, String tecnicas, int idade, String email) {
        this.nome = nome;
        this.cla = cla;
        this.rank = rank;
        this.tecnicas = tecnicas;
        this.idade = idade;
        this.email = email;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCla() {
        return cla;
    }

    public void setCla(String cla) {
        this.cla = cla;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getTecnicas() {
        return tecnicas;
    }

    public void setTecnicas(String tecnicas) {
        this.tecnicas = tecnicas;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail(){
        return email;
    }

    public String setEmail(String email) {
        return this.email = email;
    }
}
