package br.com.twtm.xpromo;

import java.util.Date;

/**
 *
 * @author Marcos
 */
public class Convite {

    //public Pessoa remetente;
    public Pessoa destinatario;
    private String mensagem;
    //private Date dtEnvio;

    public Convite(Pessoa destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public Pessoa getDestinatario() {
        return destinatario;
    }

}
