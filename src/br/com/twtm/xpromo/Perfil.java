package br.com.twtm.xpromo;

import br.com.twtm.estruturas.Denuncias;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.swing.ImageIcon;

public class Perfil {

    private String foto = "perfil";
    private ImageIcon icone;
    private Color cor = new Color(210, 211, 218);
    private String quemEuSou;
    private String missao;
    private String visao;
    private String valores;
    private List<Pessoa> amigos;
    private Queue<Pessoa> convites = new LinkedList();
    private List<Pessoa> solicitacoes = new ArrayList();
    private List<Conversa> conversas = new ArrayList();
    private int[] denuncias = new int[6];
    private List<Pessoa> denunciantes = new ArrayList();
    private boolean ver = false;
    //private List<Amizade> amizades;

    public Perfil(String foto, String quemEuSou) {
        this.foto = foto;
        this.quemEuSou = quemEuSou;
        this.amigos = new ArrayList();
        URL caminho = getClass().getResource("/br/com/twtm/dominio/imagens/" + getFoto() + ".png");
        ImageIcon temp = new ImageIcon(caminho);
        icone = new ImageIcon(temp.getImage().getScaledInstance(128, 128, Image.SCALE_DEFAULT));
        //this.amizades = new ArrayList();
        //URL caminho = getClass().getResource("/br/com/twtm/dominio/imagens/" + foto + ".png");         
    }

    public Perfil() {
        this.amigos = new ArrayList();
        URL caminho = getClass().getResource("/br/com/twtm/dominio/imagens/" + getFoto() + ".png");
        ImageIcon temp = new ImageIcon(caminho);
        icone = new ImageIcon(temp.getImage().getScaledInstance(128, 128, Image.SCALE_DEFAULT));
    }

    public void addAmigo(Pessoa p) {
        this.amigos.add(p);
    }

    public void addAmigo(Pessoa p, Pessoa eu) {
        Conversa novaConversa = new Conversa();
        this.conversas.add(novaConversa);
        p.perfil.addConversa(novaConversa);
        this.amigos.add(p);
        p.perfil.addAmigo(eu);
    }

    public void addConvite(Pessoa p) {
        convites.add(p);
        solicitacoes.add(p);
    }

    public Pessoa exibirPrimeiro() {
        return convites.element();
    }

    public int sizeConvites() {
        return convites.size();
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setCor(Color color) {
        this.cor = color;
    }

    public Color getCor() {
        return this.cor;
    }

    public String getQuemEuSou() {
        return quemEuSou;
    }

    public void setQuemEuSou(String quemEuSou) {
        this.quemEuSou = quemEuSou;
    }

    public String getMissao() {
        return missao;
    }

    public void setMissao(String missao) {
        this.missao = missao;
    }

    public String getVisao() {
        return visao;
    }

    public void setVisao(String visao) {
        this.visao = visao;
    }

    public String getValores() {
        return valores;
    }

    public void setValores(String valores) {
        this.valores = valores;
    }

    public List<Pessoa> getAmigos() {
        return amigos;
    }

    public void setAmigos(List<Pessoa> amigos) {
        this.amigos = amigos;
    }

    public ImageIcon getIcone() {
        return icone;
    }

    public void setIcone(ImageIcon icone) {
        this.icone = icone;
    }

    public List getSolicitacoes() {
        return solicitacoes;
    }

    public int getQtSolicitacoes() {
        return solicitacoes.size();
    }

    public void removeConvite(Pessoa p) {
        solicitacoes.remove(p);
    }

    public void removeAmigo(Pessoa p) {
        this.amigos.remove(p);
    }

    public void removeAmigo(Pessoa p, Pessoa eu) {
        this.conversas.remove(amigos.indexOf(p));
        p.perfil.removeConversa(eu);
        this.removeAmigo(p);
        p.perfil.removeAmigo(eu);
    }

    public void upConversa(Pessoa destinatario, Pessoa remetente, Mensagem msg) {
        int posicao = amigos.indexOf(destinatario);
        Conversa c = conversas.get(posicao);
        c.setUltima(remetente);
        c.addMensagem(msg);
    }

    public List<Conversa> getConversas() {
        return conversas;
    }

    public void setConversas(List<Conversa> conversas) {
        this.conversas = conversas;
    }

    public Conversa getConversa(Pessoa destinatario) {
        return conversas.get(amigos.indexOf(destinatario));
    }

    public void addConversa(Conversa conversa) {
        this.conversas.add(conversa);
    }

    public void removeConversa(Pessoa eu) {
        this.conversas.remove(amigos.indexOf(eu));
    }

    public void addDenuncia(int item, Pessoa p, Pessoa denunciante) {
        denunciantes.add(denunciante);
        denuncias[0]++;
        denuncias[item]++;
        if (denuncias[0] >= 10) {
            Denuncias.cadastrar(p);
        }
    }

    public boolean jaDenunciou(Pessoa p) {
        return denunciantes.contains(p);
    }

    public int valorItemDenuncia(int item) {
        return denuncias[item];
    }

    public void setVer(boolean b) {
        this.ver = b;
    }

    public boolean isVer() {
        return ver;
    }

}
