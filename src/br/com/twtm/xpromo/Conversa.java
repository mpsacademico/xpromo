package br.com.twtm.xpromo;

import java.util.ArrayList;
import java.util.List;

public class Conversa {

    //private Pessoa p1, p2;
    private List<Mensagem> mensagens = new ArrayList();
    private Pessoa ultima;
    private Boolean lida = false;

    void addMensagem(Mensagem msg) {
        mensagens.add(msg);
        lida = false;
    }

    public List<Mensagem> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<Mensagem> mensagens) {
        this.mensagens = mensagens;
    }

    public void setUltima(Pessoa p) {
        this.ultima = p;
    }

    public Pessoa getUltima() {
        return this.ultima;
    }

    public boolean isLida() {
        return lida;
    }

    public void setLida(Boolean b) {
        this.lida = b;
    }

}
