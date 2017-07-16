package br.com.twtm.xpromo;

import java.util.Date;

/**
 * Implementação da classe Entidade Filantrópica
 *
 * @author TWTM
 * @version 1
 */
public class EntFilantropica extends PessoaJuridica {

    private String inscCmas;
    private String trabalhoSocial;

    public EntFilantropica() {

    }

    public EntFilantropica(Login login, Endereco end, String cnpj, String razaoSocial, String nomeFantasia, String inscEst, int cat, Date dtCriacao, String resp, String inscCmas, String trabalhoSocial, String tel, String cel, String email, String site, Perfil perfil) {
        super(login, end, cnpj, razaoSocial, nomeFantasia, inscEst, cat, dtCriacao, resp, tel, cel, email, site, perfil);
        this.inscCmas = inscCmas;
        this.trabalhoSocial = trabalhoSocial;
    }

    public void setInscCmas(String inscCmas) {
        this.inscCmas = inscCmas;
    }

    public String getInscCmas() {
        return this.inscCmas;
    }

    public void setTrabalhoSocial(String trabalhoSocial) {
        this.trabalhoSocial = trabalhoSocial;
    }

    public String getTrabalhoSocial() {
        return this.trabalhoSocial;
    }
}
