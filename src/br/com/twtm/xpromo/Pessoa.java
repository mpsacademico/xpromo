package br.com.twtm.xpromo;

import java.util.List;

/**
 * Modela os dados básicos para contato de Pessoa
 *
 * @author TWTM
 * @version 1
 */
public abstract class Pessoa {

    public Login login;
    public Endereco end;
    private String tel;
    private String cel;
    private String email;
    private String site;
    public Perfil perfil;
    public Comercial comercial = new Comercial();

    public Pessoa() {
    }

    public Pessoa(Login login, Endereco end, String tel, String cel, String email, String site, Perfil perfil) {
        this.login = login;
        this.end = end;
        this.tel = tel;
        this.cel = cel;
        this.email = email;
        this.site = site;
        this.perfil = perfil;
    }

    public Pessoa(Login login, Endereco end, String tel, String cel, String email, String site) {
        this.login = login;
        this.end = end;
        this.tel = tel;
        this.cel = cel;
        this.email = email;
        this.site = site;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTel() {
        return this.tel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getCel() {
        return this.cel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getSite() {
        return this.site;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }
}
