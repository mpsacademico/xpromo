package br.com.twtm.estruturas;

import br.com.twtm.xpromo.Login;
import br.com.twtm.xpromo.Pessoa;
import br.com.twtm.xpromo.PessoaFisica;
import java.util.ArrayList;
import java.util.List;

public class Pfs {

    private static List<PessoaFisica> pfs = new ArrayList();

    public static int tamanho() {
        return pfs.size();
    }

    public static void cadastrar(PessoaFisica pf) {
        pfs.add(pf);
        System.out.println("Cadastrado");
    }

    public static PessoaFisica recuperar(int indice) {
        return pfs.get(indice);
    }

    public static int indice(PessoaFisica pf) {
        return pfs.indexOf(pf);
    }

    public static void remover(int i) {
        pfs.remove(i);
    }

    public static void alterar(PessoaFisica pf) {
        Login login = pf.getLogin();
        System.out.println(login.getPosicao());
        pfs.set(login.getPosicao(), pf);
    }

    public static int ordem(Pessoa pessoa) {
        return pfs.indexOf(pessoa);
    }

}
