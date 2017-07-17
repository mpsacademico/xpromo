package br.com.twtm.xpromo;

public class Estados {

    private static final String estado[][] = new String[27][2];

    public Estados() {
        preencheMatriz();
    }

    public String getSigla(int indice) {
        return estado[indice][0];
    }

    public String getNome(int indice) {
        return estado[indice][1];
    }

    private static void preencheMatriz() {
        estado[0][0] = "AC";
        estado[0][1] = "Acre";
        estado[1][0] = "AL";
        estado[1][1] = "Alagoas";
        estado[2][0] = "AP";
        estado[2][1] = "Amapá";
        estado[3][0] = "AM";
        estado[3][1] = "Amazonas";
        estado[4][0] = "BA";
        estado[4][1] = "Bahia";
        estado[5][0] = "CE";
        estado[5][1] = "Ceará";
        estado[6][0] = "DF";
        estado[6][1] = "Distrito Federal";
        estado[7][0] = "ES";
        estado[7][1] = "Espirito Santo";
        estado[8][0] = "GO";
        estado[8][1] = "Goias";
        estado[9][0] = "MA";
        estado[9][1] = "Maranhão";
        estado[10][0] = "MT";
        estado[10][1] = "Mato Grosso";
        estado[11][0] = "MS";
        estado[11][1] = "Mato Grosso do Sul";
        estado[12][0] = "MG";
        estado[12][1] = "Minas Gerais";
        estado[13][0] = "PA";
        estado[13][1] = "Pará";
        estado[14][0] = "PB";
        estado[14][1] = "Paraíba";
        estado[15][0] = "PR";
        estado[15][1] = "Paraná";
        estado[16][0] = "PE";
        estado[16][1] = "Pernambuco";
        estado[17][0] = "PI";
        estado[17][1] = "Piaui";
        estado[18][0] = "RJ";
        estado[18][1] = "Rio de Janeiro";
        estado[19][0] = "RN";
        estado[19][1] = "Rio Grande do Norte";
        estado[20][0] = "RS";
        estado[20][1] = "Rio Grande do Sul";
        estado[21][0] = "RO";
        estado[21][1] = "Rondonia";
        estado[22][0] = "RR";
        estado[22][1] = "Roraima";
        estado[23][0] = "SC";
        estado[23][1] = "Santa Catarina";
        estado[24][0] = "SP";
        estado[24][1] = "São Paulo";
        estado[25][0] = "SE";
        estado[25][1] = "Sergipe";
        estado[26][0] = "TO";
        estado[26][1] = "Tocantins";
    }
}
