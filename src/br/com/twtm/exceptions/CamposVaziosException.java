package br.com.twtm.exceptions;

public class CamposVaziosException extends Exception {

    public CamposVaziosException() {
        super("Campos obrigatórios estão vazios!");
    }

    public CamposVaziosException(String mensagem) {
        super(mensagem);
    }

}
