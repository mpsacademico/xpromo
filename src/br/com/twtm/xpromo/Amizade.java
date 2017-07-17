package br.com.twtm.xpromo;

class Amizade {

    public Pessoa amigo;
    public Convite convite;

    public Amizade(Pessoa p) {
        this.amigo = p;
        this.confirmar();
    }

    public void confirmar() {
        this.amigo.perfil.addAmigo(amigo);

    }

}
