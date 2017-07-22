package br.com.twtm.xpromo;

import java.util.Date;

public class Interesse extends Proposta {

    private int urgencia;

    public Interesse(int urgencia, Pessoa pessoa, String titulo, String desc, Categoria cat, Date data, int quant, int categoria) {
        super(pessoa, titulo, desc, cat, data, quant, categoria);
        this.urgencia = urgencia;
    }   

    public void setUrgencia(int urgencia) {
        this.urgencia = urgencia;
    }

    public int getUrgencia() {
        return this.urgencia;
    }

}
