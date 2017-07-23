package br.com.twtm.xpromo;

public class Topico {
    
    private String pergunta;
    private String resposta = null;

    public Topico(String pergunta, String resposta) {
        this.pergunta = pergunta;
        this.resposta = resposta;
    }   
    
    public Topico(String pergunta) {
        this.pergunta = pergunta;        
    }   
    
    public String getPergunta() {
        return pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
    
}
