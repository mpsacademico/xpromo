package br.com.twtm.xpromo;

import java.util.Date;
import java.util.Calendar;

/**
 * Implementa a proposta de compra ou venda para avaliação
 *
 * @author TWTM
 * @version 1
 */
public abstract class Proposta {

    //private int cod;
    private Pessoa pessoa;
    private String titulo;
    private String desc;
    private Categoria cat;
    private Date data;
    private int quant;
    private int categoria;

    public Proposta(Pessoa pessoa, String titulo, String desc, Categoria cat, Date data, int quant, int categoria) {
        this.pessoa = pessoa;
        this.titulo = titulo;
        this.desc = desc;
        this.cat = cat;
        this.data = data;
        this.quant = quant;
        this.categoria = categoria;
    }

    public Proposta() {
    }   
    
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Categoria getCat() {
        return cat;
    }

    public void setCat(Categoria cat) {
        this.cat = cat;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

}
