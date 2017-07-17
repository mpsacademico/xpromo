package br.com.twtm.xpromo;

import java.util.Date;

/**
 * Implementa as rotinas para autenticação de usuários
 *
 * @author TWTM
 * @version 1
 */
public class Login {

    private String email;
    private String senha;
    private int tipoUsuario;
    private boolean validadeCad;
    private int posicao;
    private int status;
    private Date dtSenha = null;
    private boolean bloqueio = false;   

    public Login() {
    }

    public Login(String email, String senha, int tipoUsuario, boolean validadeCad) {
        this.email = email;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
        this.validadeCad = validadeCad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public boolean isValidadeCad() {
        return validadeCad;
    }

    public void setValidadeCad(boolean validadeCad) {
        this.validadeCad = validadeCad;
    }

    public void setPosicao(int ordem) {
        this.posicao = ordem;
    }

    public int getPosicao() {
        return this.posicao;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Login get() {
        return this;
    }

    public void setDtSenha(Date time) {
        this.dtSenha = time;
    }

    public Date getDtSenha() {
        return dtSenha;
    }

    public boolean isBloqueio() {
        return bloqueio;
    }

    public void setBloqueio(boolean bloqueio) {
        this.bloqueio = bloqueio;
    }

}
