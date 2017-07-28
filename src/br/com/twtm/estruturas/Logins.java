package br.com.twtm.estruturas;

import br.com.twtm.xpromo.Login;
import br.com.twtm.xpromo.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Logins {

    private static List<Login> logins = new ArrayList();
    private static List<String> emails = new ArrayList();

    public Logins() {

    }

    public static void cadastrar(Login login) {
        emails.add(login.getEmail());
        logins.add(login);
        login.setPosicao(ordem(login));
        System.out.println("Login cadastrado --> nº " + ordem(login));
    }

    public static int tamanho() {
        return logins.size();
    }

    public static Login recuperar(int indice) {
        return logins.get(indice);
    }

    public static int ordem(Login login) {
        return logins.indexOf(login);
    }

    public static Pessoa procurarLogin(String email, String senha) {
        int i = tamanho() - 1;
        while (i >= 0) {
            Login login = Logins.recuperar(i);
            if (email.equals(login.getEmail()) && senha.equals(login.getSenha())) {
                return Pessoas.recuperar(login.getPosicao());
            }
            i--;
        }
        return null;
    }
    
    public static boolean loginExiste(String email){
        return emails.contains(email);
    }

}
