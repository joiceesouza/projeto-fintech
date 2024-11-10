package br.com.fiap.projeto_fintech.model;

import java.util.Date;

public class Investimento {
    private int id_investimento;
    private String tipo_investimento;
    private float valor_investido;
    private Date dt_aplicacao;
    private String descricao;

    public int getId_investimento() {
        return id_investimento;
    }

    public void setId_investimento(int id_investimento) {
        this.id_investimento = id_investimento;
    }

    public String getTipo_investimento() {
        return tipo_investimento;
    }

    public void setTipo_investimento(String tipo_investimento) {
        this.tipo_investimento = tipo_investimento;
    }

    public float getValor_investido() {
        return valor_investido;
    }

    public void setValor_investido(float valor_investido) {
        this.valor_investido = valor_investido;
    }

    public Date getDt_aplicacao() {
        return dt_aplicacao;
    }

    public void setDt_aplicacao(Date dt_aplicacao) {
        this.dt_aplicacao = dt_aplicacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}