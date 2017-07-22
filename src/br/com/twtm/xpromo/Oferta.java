package br.com.twtm.xpromo;

import java.util.Date;
/**
 * Implementa os valores de um produto no sistema, como preço mínimo, máximo e
 * unitário
 *
 * @author TWTM
 * @version 1
 */
public class Oferta extends Proposta {

    private Mercadoria mercadoria;
    private double menorPreco;

    public Oferta(Mercadoria mercadoria, double menorPreco, Pessoa pessoa, String titulo, String desc, Categoria cat, Date data, int quant, int categoria) {
        super(pessoa, titulo, desc, cat, data, quant, categoria);
        this.mercadoria = mercadoria;
        this.menorPreco = menorPreco;
    }

    public Oferta() {
    }

    public Mercadoria getMercadoria() {
        return mercadoria;
    }

    public void setMercadoria(Mercadoria mercadoria) {
        this.mercadoria = mercadoria;
    }

    public double getMenorPreco() {
        return menorPreco;
    }

    public void setMenorPreco(double menorPreco) {
        this.menorPreco = menorPreco;
    }    

}
