package br.com.twtm.xpromo;

import java.util.Calendar;
import java.util.Date;

public class Doacao {
    
    private Pessoa doador;
    private EntFilantropica donatario;
    private Date date;
    private Double valor;

    public Doacao(Pessoa doador, EntFilantropica donatario, Double valor) {
        this.doador = doador;
        this.donatario = donatario;        
        this.valor = valor;
        Calendar c = Calendar.getInstance();
        this.date = c.getTime();
    }   

    public Pessoa getDoador() {
        return doador;
    }

    public void setDoador(Pessoa doador) {
        this.doador = doador;
    }

    public EntFilantropica getDonatario() {
        return donatario;
    }

    public void setDonatario(EntFilantropica donatario) {
        this.donatario = donatario;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }   
    
}
