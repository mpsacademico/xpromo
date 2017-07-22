package br.com.twtm.xpromo;

import java.util.ArrayList;
import java.util.List;

public class FiltroCat {
    
    private List valores = new ArrayList();
    
    public void add(int valor){
        valores.add(valor);
    }
    
    public void imprimir(){
        for(Object valor: valores){
            System.out.print((int) valor+";");
        }
    }

    public void limparCategorias() {
        valores.clear();
    }

    public boolean contem(int i) {
        return valores.contains(i);
    }
    
}
