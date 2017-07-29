package br.com.twtm.estruturas;

import java.util.ArrayList;
import java.util.List;

public class GrafoParcerias {
    
    private static List<List> empresas = new ArrayList();    
    
    public static void tamanho(){
        System.out.println("Tamanho MA: "+getEmpresas().size()+" X ");
    }

    public static List getEmpresas() {
        return empresas;
    }

    public static void setEmpresas(List aEmpresas) {
        empresas = aEmpresas;
    }

}
