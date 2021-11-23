package com.lanchonete.produtos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@SequenceGenerator(name = "produto", sequenceName = "SQ_TB_PRODUTO", allocationSize = 1)
public class Produto {

    @Id
    @Column(name = "id_produto")
    @GeneratedValue(generator = "produto", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "nome_produto")
    private String nome;

    @Column(name = "qtdd_produto")
    private Integer quantidade;

    @Column(name = "descricao_produto")
    private String descricao;

}
