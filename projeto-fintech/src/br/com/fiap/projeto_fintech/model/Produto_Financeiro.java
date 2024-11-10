package br.com.fiap.projeto_fintech.model;

public class Produto_Financeiro {
    private int id_produto;
    private String tipo;
    private float tx_juros;
    private String descricao;

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getTx_juros() {
        return tx_juros;
    }

    public void setTx_juros(float tx_juros) {
        this.tx_juros = tx_juros;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}