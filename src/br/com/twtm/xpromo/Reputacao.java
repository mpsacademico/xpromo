package br.com.twtm.xpromo;

import java.util.ArrayList;
import java.util.List;

public class Reputacao {
    
    private List<Mensagem> comentarios = new ArrayList();
    private List<Pessoa> avaliadores = new ArrayList();
    private int[] nota = new int[6];
    
    public void addComentario(Mensagem m){
        comentarios.add(m);
    }
    
    public void avaliar(int n){
        nota[0]++;
        nota[n]++;
    }
    
    public void avaliar(int n, Pessoa avaliador){
        avaliar(n);
        avaliadores.add(avaliador);
    }
    
    public int verAvaliacao(int n){
        return nota[n];
    }

    public List<Mensagem> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Mensagem> comentarios) {
        this.comentarios = comentarios;
    }

    public List<Pessoa> getAvaliadores() {
        return avaliadores;
    }

    public void setAvaliadores(List<Pessoa> avaliadores) {
        this.avaliadores = avaliadores;
    }

    public int[] getNota() {
        return nota;
    }

    public void setNota(int[] nota) {
        this.nota = nota;
    }    

    public boolean jaAvaliou(Pessoa p) {
       return avaliadores.contains(p);
    }
    
}
