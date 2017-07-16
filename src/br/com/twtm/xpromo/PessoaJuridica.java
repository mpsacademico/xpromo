package br.com.twtm.xpromo;

import java.util.Date;

/**
 * Implementação da classe Pessoa Jurídica
 *
 * @author TWTM
 * @version 1
 */
public class PessoaJuridica extends Pessoa {

    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;
    private String inscEst;
    private int cat;
    private Date dtCriacao;
    private String resp;

    public PessoaJuridica() {
    }

    public PessoaJuridica(Login login, Endereco end, String cnpj, String razaoSocial, String nomeFantasia, String inscEst, int cat, Date dtCriacao, String resp, String tel, String cel, String email, String site, Perfil perfil) {
        super(login, end, tel, cel, email, site);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.inscEst = inscEst;
        this.cat = cat;
        this.dtCriacao = dtCriacao;
        this.resp = resp;
        this.perfil = perfil;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setInscEst(String inscEst) {
        this.inscEst = inscEst;
    }

    public String getInscEst() {
        return this.inscEst;
    }

    public void setCat(int cat) {
        this.cat = cat;
    }

    public int getCat() {
        return this.cat;
    }

    public void setDtCriacao(Date dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    public Date getDtCriacao() {
        return this.dtCriacao;
    }

    public void setResp(String resp) {
        this.resp = resp;
    }

    public String getResp() {
        return this.resp;
    }
}
