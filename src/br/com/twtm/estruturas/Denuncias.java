package br.com.twtm.estruturas;

import br.com.twtm.xpromo.Denuncia;
import br.com.twtm.xpromo.Pessoa;
import java.util.LinkedList;
import java.util.Queue;

public class Denuncias {

    protected static int num = 10;
    private static Queue<Pessoa> denunciados = new LinkedList();

    public static void cadastrar(Pessoa p) {
        if (!denunciados.contains(p)) {
            denunciados.add(p);
        }
    }

    public static Pessoa exibirPrimeira() {
        return denunciados.element();
    }

    public static int tamanho() {
        return denunciados.size();
    }

    public static void sair() {
        denunciados.poll();
    }

}
