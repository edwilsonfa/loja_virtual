package com.learning.loja_virtual.model;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "produto")
@SequenceGenerator(name = "seq_produto", sequenceName = "seq_produto", allocationSize = 1, initialValue = 1)
public class Produto implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_prod")
    private Long id;

    private String tipoUnidade;
    private String nome;
    private Boolean ativo = Boolean.TRUE;
    @Column(columnDefinition = "text", length = 2000)
    private String descricao;

    /** Nota item produto - ASSOCIAR **/
    private Double peso;
    private Double largura;
    private Double altura;
    private Double profundidade;
    private BigDecimal valorVenda = BigDecimal.ZERO;
    private Integer qtdeEstoque = 0;
    private Integer qtdeAlertaEstoque = 0;
    private String linkYoutube;
    private Boolean alertaQtdeEstoque = Boolean.FALSE;
    private Integer qtdeClique = 0;

    public Produto() {
    }

    public Produto(Long id, String tipoUnidade, String nome, String descricao, Double peso, Double largura, Double altura, Double profundidade, BigDecimal valorVenda, Integer qtdeEstoque, Integer qtdeAlertaEstoque, String linkYoutube, Boolean alertaQtdeEstoque, Integer qtdeClique) {
        this.id = id;
        this.tipoUnidade = tipoUnidade;
        this.nome = nome;
        this.descricao = descricao;
        this.peso = peso;
        this.largura = largura;
        this.altura = altura;
        this.profundidade = profundidade;
        this.valorVenda = valorVenda;
        this.qtdeEstoque = qtdeEstoque;
        this.qtdeAlertaEstoque = qtdeAlertaEstoque;
        this.linkYoutube = linkYoutube;
        this.alertaQtdeEstoque = alertaQtdeEstoque;
        this.qtdeClique = qtdeClique;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoUnidade() {
        return tipoUnidade;
    }

    public void setTipoUnidade(String tipoUnidade) {
        this.tipoUnidade = tipoUnidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(Double profundidade) {
        this.profundidade = profundidade;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Integer getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(Integer qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public Integer getQtdeAlertaEstoque() {
        return qtdeAlertaEstoque;
    }

    public void setQtdeAlertaEstoque(Integer qtdeAlertaEstoque) {
        this.qtdeAlertaEstoque = qtdeAlertaEstoque;
    }

    public String getLinkYoutube() {
        return linkYoutube;
    }

    public void setLinkYoutube(String linkYoutube) {
        this.linkYoutube = linkYoutube;
    }

    public Boolean getAlertaQtdeEstoque() {
        return alertaQtdeEstoque;
    }

    public void setAlertaQtdeEstoque(Boolean alertaQtdeEstoque) {
        this.alertaQtdeEstoque = alertaQtdeEstoque;
    }

    public Integer getQtdeClique() {
        return qtdeClique;
    }

    public void setQtdeClique(Integer qtdeClique) {
        this.qtdeClique = qtdeClique;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(id, produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
