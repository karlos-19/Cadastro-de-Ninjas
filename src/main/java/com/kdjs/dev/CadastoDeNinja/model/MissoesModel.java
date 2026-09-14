package com.kdjs.dev.CadastoDeNinja.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
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

    //@OneToMany - uma missão para vários ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjasModel> ninjas;

}
