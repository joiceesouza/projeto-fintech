package br.com.fiap.projeto_fintech.model;

import java.util.Date;

public class Emprestimo {
    private int id_emprestismo;
    private float valor;
    private float tx_juros;
    private Date dt_inicio;
    private Date dt_vencimento;

    public int getId_emprestismo() {
        return id_emprestismo;
    }

    public void setId_emprestismo(int id_emprestismo) {
        this.id_emprestismo = id_emprestismo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getTx_juros() {
        return tx_juros;
    }

    public void setTx_juros(float tx_juros) {
        this.tx_juros = tx_juros;
    }

    public Date getDt_inicio() {
        return dt_inicio;
    }

    public void setDt_inicio(Date dt_inicio) {
        this.dt_inicio = dt_inicio;
    }

    public Date getDt_vencimento() {
        return dt_vencimento;
    }

    public void setDt_vencimento(Date dt_vencimento) {
        this.dt_vencimento = dt_vencimento;
    }
}