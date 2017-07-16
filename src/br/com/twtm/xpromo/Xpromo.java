package br.com.twtm.xpromo;

import br.com.twtm.dominio.AjudaDOM;
import br.com.twtm.dominio.OpinioesDOM;
import br.com.twtm.dominio.UsuariosDOM;
import br.com.twtm.gui.PeLoginJF;

public class Xpromo {

    public static void main(String[] args) {
        if (true) {
            System.out.println("DOMÍNIO ATIVADO!!!");
            new UsuariosDOM();
            new OpinioesDOM();
            System.out.println("------------------");
        }
        new AjudaDOM();
        PeLoginJF frLogin = new PeLoginJF();
        frLogin.setVisible(true);
    }

}
