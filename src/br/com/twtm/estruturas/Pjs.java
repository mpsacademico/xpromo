package br.com.twtm.estruturas;

import br.com.twtm.xpromo.PessoaJuridica;
import java.util.ArrayList;
import java.util.List;

public class Pjs {

    private static List<PessoaJuridica> pjs = new ArrayList();

    public static int tamanho() {
        return pjs.size();
    }

    public static void cadastrar(PessoaJuridica pj) {
        pjs.add(pj);
        System.out.println("Cadastrado");
    }

    public static PessoaJuridica recuperar(int indice) {
        return pjs.get(indice);
    }

    public static int indice(PessoaJuridica pj) {
        return pjs.indexOf(pj);
    }

    public static void remover(int i) {
        pjs.remove(i);
    }

    /*public static void substituir(int i, PessoaFisica pf) {
     System.out.println("SUB: i " + i);
     System.out.println(pf);
     pfs.set(i, pf);
     }*/
}
