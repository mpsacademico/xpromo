package br.com.twtm.estruturas;

import java.util.Date;
import javax.swing.JTextPane;

public class Bnode {
    
    private static JTextPane i;

    public static JTextPane getI() {
        return i;
    }

    public static void setI(JTextPane aI) {
        i = aI;
    }
    
    private Date x;    
    public Bnode esq, dir;

    public Bnode(Date v) {
        x = v;
        esq = dir = null;
    }

    public void push(Date v) {
        if (v.compareTo(x) > 0) {
            if (dir != null) {
                dir.push(v);
            } else {
                dir = new Bnode(v);
            }
        } else {
            if (esq != null) {
                esq.push(v);
            } else {
                esq = new Bnode(v);
            }
        }
    }

    public void show() {
        if (esq != null) {
            esq.show();
        }
        getI().setText(x+"");
        i.repaint();
        i.validate();
        if (dir != null) {
            dir.show();
        }
    }   

    public int size() {
        int se = 0, sd = 0;
        if (esq != null) {
            se = esq.size();
        }
        if (dir != null) {
            sd = dir.size();
        }

        return 1 + se + sd;

    }  

}
