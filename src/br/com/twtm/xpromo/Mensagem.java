package br.com.twtm.xpromo;

import java.util.Date;

public class Mensagem {

    private Pessoa remetente;
    private String mensagem;
    private Date horario;

    public Mensagem(Pessoa remetente, String mensagem, Date horario) {
        this.remetente = remetente;
        this.mensagem = mensagem;
        this.horario = horario;        
    }

    public Pessoa getRemetente() {
        return remetente;
    }

    public void setRemetente(Pessoa remetente) {
        this.remetente = remetente;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

}
