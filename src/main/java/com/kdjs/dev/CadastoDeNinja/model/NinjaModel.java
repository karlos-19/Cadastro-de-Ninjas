package com.kdjs.dev.CadastoDeNinja.model;
import jakarta.persistence.*;


// Entity transforma uma classe em entidade do banco de dados
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String nome;
    private String email;
    private String cla;
    private String rank;
    private String tecnicas;
    private int idade;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String cla, String rank, String tecnicas, int idade, String email) {
        this.nome = nome;
        this.cla = cla;
        this.rank = rank;
        this.tecnicas = tecnicas;
        this.idade = idade;
        this.email = email;
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
