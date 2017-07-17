package br.com.twtm.xpromo;

/**
 * Implementacao da classe Endereco
 *
 * @author TWTM
 * @version 1
 */
public class Endereco {

    private String end;
    private String num;
    private String cep;
    private String complemento;
    private String bairro;
    private String referencia;
    private String caixaPostal;
    private String cidade;
    private String uf;

    public Endereco(String end, String num, String cep, String complemento, String bairro, String referencia, String caixaPostal, String cidade, String uf) {
        this.end = end;
        this.num = num;
        this.cep = cep;
        this.complemento = complemento;
        this.bairro = bairro;
        this.referencia = referencia;
        this.caixaPostal = caixaPostal;
        this.cidade = cidade;
        this.uf = uf;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getEnd() {
        return this.end;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getNum() {
        return this.num;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCep() {
        return this.cep;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getReferencia() {
        return this.referencia;
    }

    public void setCaixaPostal(String caixaPostal) {
        this.caixaPostal = caixaPostal;
    }

    public String getCaixaPostal() {
        return this.caixaPostal;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getUf() {
        return this.uf;
    }
}
