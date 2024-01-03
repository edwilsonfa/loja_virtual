package com.learning.loja_virtual.model;

import com.learning.loja_virtual.enums.StatusContaReceber;
import com.learning.loja_virtual.enums.TipoEndereco;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "conta_receber")
@SequenceGenerator(name = "seq_conta_receber", sequenceName = "seq_conta_receber",allocationSize = 1, initialValue = 1)
public class ContaReceber implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_conta_receber")
    private Long id;

    private String descricao;
    private BigDecimal valorTotal;
    private BigDecimal valorDesconto;

    @Enumerated(EnumType.STRING)
    private StatusContaReceber statusContaReceber;
    @Temporal(TemporalType.DATE)
    private Date dtVencimento;
    @Temporal(TemporalType.DATE)
    private Date dtPagamento;

    @ManyToOne(targetEntity = Pessoa.class)
    @JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(value=ConstraintMode.CONSTRAINT, name = "pessoa_fk"))
    private Pessoa pessoa;

    public ContaReceber() {
    }

    public ContaReceber(Long id, String descricao, BigDecimal valorTotal, BigDecimal valorDesconto, StatusContaReceber statusContaReceber, Date dtVencimento, Date dtPagamento, Pessoa pessoa) {
        this.id = id;
        this.descricao = descricao;
        this.valorTotal = valorTotal;
        this.valorDesconto = valorDesconto;
        this.statusContaReceber = statusContaReceber;
        this.dtVencimento = dtVencimento;
        this.dtPagamento = dtPagamento;
        this.pessoa = pessoa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public BigDecimal getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public StatusContaReceber getStatusContaReceber() {
        return statusContaReceber;
    }

    public void setStatusContaReceber(StatusContaReceber statusContaReceber) {
        this.statusContaReceber = statusContaReceber;
    }

    public Date getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(Date dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public Date getDtPagamento() {
        return dtPagamento;
    }

    public void setDtPagamento(Date dtPagamento) {
        this.dtPagamento = dtPagamento;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContaReceber that = (ContaReceber) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
