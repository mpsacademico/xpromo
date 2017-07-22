package br.com.twtm.xpromo;

import java.util.ArrayList;
import java.util.List;

public class Comercial {

    private List<Interesse> interesses = new ArrayList();
    public FiltroCat fc = new FiltroCat();
    private List<Mercadoria> mercadorias = new ArrayList();
    public Reputacao reputacao = new Reputacao();
    private List<Oferta> ofertas = new ArrayList();

    public void cadastrarOferta(Oferta o) {
        ofertas.add(o);
    }

    public void cadastrarInteresse(Interesse i) {
        interesses.add(i);
    }

    public List<Interesse> getInteresses() {
        return interesses;
    }

    public void setInteresses(List<Interesse> interesses) {
        this.interesses = interesses;
    }

    public void removerInteresse(Interesse i) {
        this.interesses.remove(i);
    }

    public FiltroCat getFc() {
        return fc;
    }

    public void setFc(FiltroCat fc) {
        this.fc = fc;
    }

    public void cadastrarMercadoria(Mercadoria m) {
        getMercadorias().add(m);
    }

    public void removerMercadoria(Mercadoria m) {
        getMercadorias().remove(m);
    }

    public List<Mercadoria> getMercadorias() {
        return mercadorias;
    }

    public void setMercadorias(List<Mercadoria> mercadorias) {
        this.mercadorias = mercadorias;
    }

    public Reputacao getReputacao() {
        return reputacao;
    }

    public void setReputacao(Reputacao reputacao) {
        this.reputacao = reputacao;
    }

    public List<Oferta> getOfertas() {
        return ofertas;
    }

    public void setOfertas(List<Oferta> ofertas) {
        this.ofertas = ofertas;
    }

}
