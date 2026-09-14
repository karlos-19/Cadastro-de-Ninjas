package com.kdjs.dev.CadastoDeNinja.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


// Entity transforma uma classe em entidade do banco de dados
@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
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

    //@ManyToOne - um ninja tem uma unica missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreign Key ou chave estrangeira
    private MissoesModel missao;
}
