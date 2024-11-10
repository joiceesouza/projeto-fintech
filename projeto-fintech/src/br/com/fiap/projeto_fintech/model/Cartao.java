package br.com.fiap.projeto_fintech.model;

public class Cartao {
    private int id_cartao;
    private int num_cartao;
    private float limite;
    private float limite_usado;
    private float limite_disponivel;

    public int getId_cartao() {
        return id_cartao;
    }

    public void setId_cartao(int id_cartao) {
        this.id_cartao = id_cartao;
    }

    public int getNum_cartao() {
        return num_cartao;
    }

    public void setNum_cartao(int num_cartao) {
        this.num_cartao = num_cartao;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public float getLimite_usado() {
        return limite_usado;
    }

    public void setLimite_usado(float limite_usado) {
        this.limite_usado = limite_usado;
    }

    public float getLimite_disponivel() {
        return limite_disponivel;
    }

    public void setLimite_disponivel(float limite_disponivel) {
        this.limite_disponivel = limite_disponivel;
    }
}
