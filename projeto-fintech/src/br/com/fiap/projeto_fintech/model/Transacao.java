package br.com.fiap.projeto_fintech.model;

import java.util.Date;

public class Transacao {
    private int id_transacao;
    private String tipo_transacao;
    private float valor_transacao;
    private Date dt_transacao;

    public int getId_transacao() {
        return id_transacao;
    }

    public void setId_transacao(int id_trnsacao) {
        this.id_transacao = id_trnsacao;
    }

    public String getTipo_transacao() {
        return tipo_transacao;
    }

    public void setTipo_transacao(String tipo_transacao) {
        this.tipo_transacao = tipo_transacao;
    }

    public float getValor_transacao() {
        return valor_transacao;
    }

    public void setValor_transacao(float valor_transacao) {
        this.valor_transacao = valor_transacao;
    }

    public Date getDt_transacao() {
        return dt_transacao;
    }

    public void setDt_transacao(Date dt_transacao) {
        this.dt_transacao = dt_transacao;
    }
}
