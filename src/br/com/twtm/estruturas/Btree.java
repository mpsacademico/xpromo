package br.com.twtm.estruturas;

import java.util.Date;

public class Btree {

    private Bnode raiz;

    public Btree() {
        raiz = null;
    }

    public void push(Date v) {
        if (raiz != null) {
            raiz.push(v);
        } else {
            raiz = new Bnode(v);
        }
    }

    public void show() {
        if (raiz != null) {
            raiz.show();
        }

    }

    public int size() {
        if (raiz != null) {
            return raiz.size();
        } else {
            return 0;
        }
    }

}
