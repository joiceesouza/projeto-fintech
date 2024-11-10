package br.com.fiap.projeto_fintech.model;

import java.sql.Time;
import java.util.Date;

public class Pix {
    private int id_pix;
    private float valor;
    private Date dt_pix;
    private String pix_destino;
    private Time hr_pix;

    public int getId_pix() {
        return id_pix;
    }

    public void setId_pix(int id_pix) {
        this.id_pix = id_pix;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getDt_pix() {
        return dt_pix;
    }

    public void setDt_pix(Date dt_pix) {
        this.dt_pix = dt_pix;
    }

    public String getPix_destino() {
        return pix_destino;
    }

    public void setPix_destino(String pix_destino) {
        this.pix_destino = pix_destino;
    }

    public Time getHr_pix() {
        return hr_pix;
    }

    public void setHr_pix(Time hr_pix) {
        this.hr_pix = hr_pix;
    }
}
