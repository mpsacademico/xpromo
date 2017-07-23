package br.com.twtm.xpromo;

import java.util.List;
import java.util.Stack;

public class DesfazerRefazer {

    public Stack<List> desfazer, refazer;
    public List original;
    public Pessoa p;

    public DesfazerRefazer(List original, Pessoa p) {
        this.p = p;
        this.original = original;
        //System.out.println("construtor: Desfazer e Refazer criados e vazios!");
        this.desfazer = new Stack();
        this.refazer = new Stack();
    }

    public void modificacaoRealizada(List lsa, List la) {
        //System.out.println("modificacaoRealizada: Recebi uma lista antiga e armazenei!");
        this.desfazer.add(lsa);
    }

    public void desfazer() {
        if (!desfazer.empty()) {
            //System.out.println("desfazer: passei topo para refazer!");            
            this.refazer.add(p.comercial.getInteresses());
        }
        p.comercial.setInteresses(desfazer.pop());
    }

    public void refazer() {
        if (!refazer.empty()) {
            //System.out.println("refazer: passei topo para desfazer!");            
            this.desfazer.add(p.comercial.getInteresses());
        }
        p.comercial.setInteresses(refazer.pop());
    }

    public boolean desfazerVazio() {
        return desfazer.empty();
    }

    public boolean refazerVazio() {
        return refazer.empty();
    }

}
