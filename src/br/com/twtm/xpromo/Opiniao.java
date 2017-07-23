package br.com.twtm.xpromo;

import java.util.Date;

public class Opiniao {

    private String opiniao;
    private Date dt;
    private boolean analisada;
    private int relevancia;
    private Date dtAnalisada;
    private Administrador analisador;
    //Pessoa usuario; //Caso um usuário só comente itens denunciáveis

    public Opiniao(String opiniao, Date dt, boolean analisada) {
        this.opiniao = opiniao;
        this.dt = dt;
        this.analisada = analisada;
    }

    public Opiniao(String opiniao, Date dt, boolean analisada, int relevancia) {
        this.opiniao = opiniao;
        this.dt = dt;
        this.analisada = analisada;
        this.relevancia = relevancia;
    }

    /*public void cadastrar() {
        Opinioes.cadastrar(this);
    }*/

    public String getOpiniao() {
        return opiniao;
    }

    public void setOpiniao(String opiniao) {
        this.opiniao = opiniao;
    }

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }

    public boolean isAnalisada() {
        return analisada;
    }

    public void setAnalisada(boolean analisada) {
        this.analisada = analisada;
    }

    public int getRelevancia() {
        return relevancia;
    }

    public void setRelevancia(int relevancia) {
        this.relevancia = relevancia;
    }  

    public Date getDtAnalisada() {
        return dtAnalisada;
    }

    public void setDtAnalisada(Date dtAnalisada) {
        this.dtAnalisada = dtAnalisada;
    }

    public Administrador getAnalisador() {
        return analisador;
    }

    public void setAnalisador(Administrador analisador) {
        this.analisador = analisador;
    }

}
