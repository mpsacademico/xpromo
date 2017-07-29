package br.com.twtm.estruturas;

import br.com.twtm.xpromo.Topico;
import java.util.ArrayList;
import java.util.List;

public class Ajuda {
    
    private static List<Topico> topicos = new ArrayList();

    public static List getTopicos() {
        return topicos;
    }
    
    public static void novoTopico(Topico t){
        topicos.add(t);        
    }
    
}
