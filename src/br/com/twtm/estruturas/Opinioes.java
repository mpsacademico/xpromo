package br.com.twtm.estruturas;

import br.com.twtm.xpromo.Opiniao;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Opinioes {

    private static Queue<Opiniao> opinioes = new LinkedList();
    private static List<Opiniao> opinioesArquivadas = new ArrayList();

    public static void cadastrar(Opiniao o) {
        opinioes.add(o);
    }

    public static Opiniao exibirPrimeira() {
        return opinioes.element();
    }

    public static void arquivarOpiniao() {
        getOpinioesArquivadas().add(opinioes.poll());
    }
    
    public static int tamanho(){
        return opinioes.size();
    }
    
    public static int qtdArquivadas(){
        return getOpinioesArquivadas().size();
    }

    public static List<Opiniao> getOpinioesArquivadas() {
        return opinioesArquivadas;
    }

    public static void setOpinioesArquivadas(List<Opiniao> aOpinioesArquivadas) {
        opinioesArquivadas = aOpinioesArquivadas;
    }
    
    public static void sair() {
        opinioes.poll();
    }


}
