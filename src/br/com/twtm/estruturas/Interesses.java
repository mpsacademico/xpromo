/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.twtm.ed;

import br.com.twtm.xpromo.Interesse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mayara da Silva
 */
public class Interesses {

    private List<Interesse> interesses;

    public Interesses() {
        this.interesses = new ArrayList();
    }

    public void cadastrar(Interesse interesse) {
        this.interesses.add(interesse);
    }
}
