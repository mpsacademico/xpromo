package br.com.twtm.xpromo;

import java.util.Date;

/**
 * Cadastro de pessoa física
 *
 * @author TWTM
 * @version 1
 */
public class PessoaFisica extends Pessoa {

    private String cpf;
    private String rg;
    private String nome;
    private String apelido;
    private Date dtNasc;
    private int sexo;
    private String estCivil;
    private String naturalidade;
    private String nacionalidade;
    private String ocupacao;

    public PessoaFisica() {

    }

    public PessoaFisica(Login login, Endereco end, String cpf, String rg, String nome, String apelido, Date dtNasc, int sexo, String estCivil, String naturalidade, String nacionalidade, String ocupacao, String tel, String cel, String email, String site, Perfil perfil) {
        super(login, end, tel, cel, email, site, perfil);
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.apelido = apelido;
        this.dtNasc = dtNasc;
        this.sexo = sexo;
        this.estCivil = estCivil;
        this.naturalidade = naturalidade;
        this.nacionalidade = nacionalidade;
        this.ocupacao = ocupacao;
    }

    public PessoaFisica(Login login, Endereco end, String cpf, String rg, String nome, String apelido, Date dtNasc, int sexo, String estCivil, String naturalidade, String nacionalidade, String ocupacao, String tel, String cel, String email, String site) {
        super(login, end, tel, cel, email, site);
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.apelido = apelido;
        this.dtNasc = dtNasc;
        this.sexo = sexo;
        this.estCivil = estCivil;
        this.naturalidade = naturalidade;
        this.nacionalidade = nacionalidade;
        this.ocupacao = ocupacao;
        System.out.println("Pessoa física nasceu!");
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRg() {
        return this.rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getApelido() {
        return this.apelido;
    }

    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }

    public Date getDtNasc() {
        return this.dtNasc;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getSexo() {
        return this.sexo;
    }

    public void setEstCivil(String estCivil) {
        this.estCivil = estCivil;
    }

    public String getEstCivil() {
        return this.estCivil;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNaturalidade() {
        return this.naturalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public String getOcupacao() {
        return this.ocupacao;
    }

}
