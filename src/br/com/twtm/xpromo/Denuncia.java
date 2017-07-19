package br.com.twtm.xpromo;

/**
 *
 * @author Mayara da Silva
 */
public class Denuncia {

    private String motivo;
    private String emailDenunciado;

    public Denuncia(String motivo, String emailDenunciado) {
        this.motivo = motivo;
        this.emailDenunciado = emailDenunciado;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getEmailDenunciado() {
        return emailDenunciado;
    }

    public void setEmailDenunciado(String emailDenunciado) {
        this.emailDenunciado = emailDenunciado;
    }

}
