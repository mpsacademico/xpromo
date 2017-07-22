package br.com.twtm.xpromo;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class Mercadoria {

    private int id;
    private Pessoa vendedor;
    private String nome;
    private Categoria cat;
    private double preco;
    private String descComercial;
    private String fabricante;
    private double peso;
    private String unidade;
    private double[] dimensao;
    private String material;
    private String cor;
    private String imagem = "mercadoria";
    private ImageIcon icone;

    public Mercadoria() {
        System.out.println("Mercadoria disponível!");
    }

    public Mercadoria(int id, Pessoa vendedor, String nome, Categoria cat, double preco, String descComercial, String fabricante, double peso, String unidade, double[] dimensao, String material, String cor) {
        this.id = id;
        this.vendedor = vendedor;
        this.nome = nome;
        this.cat = cat;
        this.preco = preco;
        this.descComercial = descComercial;
        this.fabricante = fabricante;
        this.peso = peso;
        this.unidade = unidade;
        this.dimensao = dimensao;
        this.material = material;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCat() {
        return cat;
    }

    public void setCat(Categoria cat) {
        this.cat = cat;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescComercial() {
        return descComercial;
    }

    public void setDescComercial(String descComercial) {
        this.descComercial = descComercial;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double[] getDimensao() {
        return dimensao;
    }

    public void setDimensao(double[] dimensao) {
        this.dimensao = dimensao;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getVendedor() {
        return vendedor;
    }

    public void setVendedor(Pessoa vendedor) {
        this.vendedor = vendedor;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
        URL caminho = getClass().getResource("/br/com/twtm/dominio/mercadorias/" + this.imagem + ".png");
        ImageIcon temp = new ImageIcon(caminho);
        icone = new ImageIcon(temp.getImage().getScaledInstance(128, 128, Image.SCALE_DEFAULT));
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public ImageIcon getIcone() {
        return icone;
    }

    public void setIcone(ImageIcon icone) {
        this.icone = icone;
    }

    private void carregarImagem() {
    }

}
