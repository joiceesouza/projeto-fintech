package br.com.fiap.projeto_fintech.model;

public class Agencia extends Conta{
    private int id_agencia;
    private int numero_agencia;

    public int getId_agencia() {
        return id_agencia;
    }

    public void setId_agencia(int id_agencia) {
        this.id_agencia = id_agencia;
    }

    public int getNumero_agencia() {
        return numero_agencia;
    }

    public void setNumero_agencia(int numero_agencia) {
        this.numero_agencia = numero_agencia;
    }
}
