package br.com.twtm.estruturas;

import br.com.twtm.xpromo.Login;
import br.com.twtm.xpromo.Pessoa;
import java.util.ArrayList;
import java.util.List;

public class Pessoas {

    private static List<Pessoa> usuarios = new ArrayList();

    public static boolean contem(Pessoa p) {
        return usuarios.contains(p);
    }

    public static List<Pessoa> getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(List<Pessoa> aUsuarios) {
        usuarios = aUsuarios;
    }

    public Pessoas() {

    }

    public static void cadastrar(Pessoa p) {
        usuarios.add(p);
        System.out.println("Usuário cadastrado --> nº: " + ordem(p));
    }

    public static int ordem(Pessoa p) {
        return usuarios.indexOf(p);
    }

    public static Pessoa recuperar(int indice) {
        return usuarios.get(indice);
    }

    public static Pessoa procurarPessoa(String email) {
        int i = usuarios.size() - 1;
        System.out.println("Numero users: " + usuarios.size());
        while (i >= 0) {
            Pessoa pessoa = Pessoas.recuperar(i);
            if (email.equals(pessoa.getLogin().getEmail())) {
                return usuarios.get(i);
            }
            i--;
        }
        return null;
    }

}
