package br.com.twtm.xpromo;

import java.util.Stack;

public class VoltarAvancar {

    public Stack<Pessoa> desfazer, refazer;
    public Pessoa p, atual, primeiro;
    private boolean temp;

    public VoltarAvancar(Pessoa p) {
        //this.p = p;        
        //System.out.println("construtor: Desfazer e Refazer criados e vazios!");
        this.desfazer = new Stack();
        this.refazer = new Stack();
        this.desfazer.add(p);
        this.primeiro = p;
        temp = true;
    }

    public void modificacaoRealizada(Pessoa p, Pessoa atual) {
        this.atual = atual;
        this.desfazer.add(atual);
        //System.out.println("modificacaoRealizada: Recebi uma lista antiga e armazenei!" + desfazer.size());
        //this.atual = atual;
    }

    public Pessoa desfazer() {        
        if (!desfazer.empty()) {
            //System.out.println("desfazer: passei topo para refazer!");
            this.refazer.add(desfazer.peek());
        }
        return desfazer.pop();
    }

    public Pessoa refazer() {        
        if (!refazer.empty()) {
            //System.out.println("refazer: passei topo para desfazer!");
            this.desfazer.add(refazer.peek());
        }
        return refazer.pop();
    }

    public boolean desfazerVazio() {
        return desfazer.empty();
    }

    public boolean refazerVazio() {
        return refazer.empty();
    }

}
