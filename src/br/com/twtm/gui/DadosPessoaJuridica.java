package br.com.twtm.gui;

import br.com.twtm.xpromo.Endereco;
import br.com.twtm.xpromo.Login;
import br.com.twtm.xpromo.Perfil;
import br.com.twtm.xpromo.Pessoa;
import br.com.twtm.xpromo.PessoaFisica;
import br.com.twtm.xpromo.PessoaJuridica;
import static java.awt.image.ImageObserver.WIDTH;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DadosPessoaJuridica extends javax.swing.JPanel {

    public DadosPessoaJuridica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgSexo = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tfNomeFantasia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfRazaoSocial = new javax.swing.JTextField();
        tfCnpj = new javax.swing.JTextField();
        tfTel = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tfCel = new javax.swing.JTextField();
        tfIsncEst = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        tfSite = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfTipoPessoa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        ftfDtCriacao = new javax.swing.JFormattedTextField();
        jLabel26 = new javax.swing.JLabel();
        tfResponsavelContato = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(394, 342));
        setMinimumSize(new java.awt.Dimension(394, 342));
        setPreferredSize(new java.awt.Dimension(394, 418));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Nome Fantasia *");

        jLabel7.setText("Razão Social *");

        jLabel15.setText("Inscrição Estadual *");

        jLabel23.setText("Celular");

        jLabel25.setText("Site");

        jLabel24.setText("E-mail *");

        tfEmail.setEditable(false);

        jLabel13.setText("Tipo de Pessoa *");

        tfTipoPessoa.setEditable(false);
        tfTipoPessoa.setText("Pessoa Jurídica");

        jLabel5.setText("Data de Criacao *");

        jLabel14.setText("CNPJ *");

        jLabel22.setText("Telefone *");

        try {
            ftfDtCriacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel26.setText("Responsável para Contato *");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNomeFantasia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfRazaoSocial, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfTipoPessoa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ftfDtCriacao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(39, 39, 39))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(tfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15)
                            .addComponent(tfIsncEst, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel22)
                            .addComponent(tfTel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfCel)))
                    .addComponent(tfResponsavelContato)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfSite)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftfDtCriacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfIsncEst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfResponsavelContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(jPanel6);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgSexo;
    private javax.swing.JFormattedTextField ftfDtCriacao;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField tfCel;
    private javax.swing.JTextField tfCnpj;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfIsncEst;
    private javax.swing.JTextField tfNomeFantasia;
    private javax.swing.JTextField tfRazaoSocial;
    private javax.swing.JTextField tfResponsavelContato;
    private javax.swing.JTextField tfSite;
    private javax.swing.JTextField tfTel;
    private javax.swing.JTextField tfTipoPessoa;
    // End of variables declaration//GEN-END:variables

    public void preencherCampos(Pessoa p) {
        PessoaJuridica pj = (PessoaJuridica) p;
        tfNomeFantasia.setText(pj.getNomeFantasia());
        tfRazaoSocial.setText(pj.getRazaoSocial());
        if (p.login.getTipoUsuario() == 1) {
            tfTipoPessoa.setText("Pessoa Jurídica");
        } else if (p.login.getTipoUsuario() == 2) {
            tfTipoPessoa.setText("Entidade Filantrópica");
        }
        //cbCat.setSelectedIndex(pj.getCat());
        SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
        String data = out.format(pj.getDtCriacao());
        ftfDtCriacao.setText(data);
        tfCnpj.setText(pj.getCnpj());
        tfIsncEst.setText(pj.getInscEst());
        tfTel.setText(pj.getTel());
        tfCel.setText(pj.getCel());
        tfEmail.setText(pj.getLogin().getEmail());
        tfSite.setText(pj.getEmail());
        tfCnpj.setEditable(false);
        tfIsncEst.setEditable(false);
        tfResponsavelContato.setText(pj.getResp());
    }

    public void preencherCampos(Pessoa p, boolean b) {
        PessoaJuridica pj = (PessoaJuridica) p;
        tfNomeFantasia.setText(pj.getNomeFantasia());
        tfRazaoSocial.setText(pj.getRazaoSocial());
        if (p.login.getTipoUsuario() == 1) {
            tfTipoPessoa.setText("Pessoa Jurídica");
        } else if (p.login.getTipoUsuario() == 2) {
            tfTipoPessoa.setText("Entidade Filantrópica");
        }
        //cbCat.setSelectedIndex(pj.getCat());
        SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
        String data = out.format(pj.getDtCriacao());
        ftfDtCriacao.setText(data);
        tfCnpj.setText(pj.getCnpj());
        tfIsncEst.setText(pj.getInscEst());
        tfTel.setText(pj.getTel());
        tfCel.setText(pj.getCel());
        tfEmail.setText(pj.getLogin().getEmail());
        tfSite.setText(pj.getEmail());
        tfResponsavelContato.setText(pj.getResp());
    }

    public void preencherCampos(Login login) {
        tfEmail.setText(login.getEmail());
        if (login.getTipoUsuario() == 1) {
            tfTipoPessoa.setText("Pessoa Jurídica");
        } else if (login.getTipoUsuario() == 2) {
            tfTipoPessoa.setText("Entidade Filantrópica");
        }
    }

    public PessoaJuridica criarPessoaJuridica(Login login, Endereco endereco) {
        Calendar c = Calendar.getInstance();
        c.set(WIDTH, WIDTH, WIDTH);
        try {
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            c.setTime((java.util.Date) formatter.parse(ftfDtCriacao.getText()));
        } catch (Exception ex) {
        }
        String nomeFantasia = tfNomeFantasia.getText();
        String razaoSocial = tfRazaoSocial.getText();
        String tipoPessoa = tfTipoPessoa.getText();
        //String cat = cbCat.getSelectedItem() + "";
        String dtCriacao = ftfDtCriacao.getText();
        String cnpj = tfCnpj.getText();
        String isncEst = tfIsncEst.getText();
        String tel = tfTel.getText();
        String cel = tfCel.getText();
        String email = tfEmail.getText();
        String site = tfSite.getText();
        String responsavelContato = tfResponsavelContato.getText();
        return new PessoaJuridica(login, endereco, cnpj, razaoSocial, nomeFantasia, isncEst, 0, c.getTime(), responsavelContato, tel, cel, email, site, new Perfil());
    }

    public void alterarPessoaJuridica(PessoaJuridica pj, Endereco end) {
        Calendar c = Calendar.getInstance();
        c.set(WIDTH, WIDTH, WIDTH);
        try {
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            c.setTime((java.util.Date) formatter.parse(ftfDtCriacao.getText()));
        } catch (Exception ex) {
        }
        String nomeFantasia = tfNomeFantasia.getText();
        String razaoSocial = tfRazaoSocial.getText();
        String tipoPessoa = tfTipoPessoa.getText();
        //String cat = cbCat.getSelectedItem() + "";
        String dtCriacao = ftfDtCriacao.getText();
        String cnpj = tfCnpj.getText();
        String isncEst = tfIsncEst.getText();
        String tel = tfTel.getText();
        String cel = tfCel.getText();
        String email = tfEmail.getText();
        String site = tfSite.getText();
        String responsavelContato = tfResponsavelContato.getText();
        pj.setNomeFantasia(nomeFantasia);
        pj.setRazaoSocial(razaoSocial);
        pj.setCnpj(cnpj);
        pj.setInscEst(isncEst);
        pj.setTel(tfTel.getText());
        pj.setCel(tfCel.getText());
        pj.setEmail(tfEmail.getText());
        pj.setSite("www.inativo.com.br");
        pj.setResp(responsavelContato);
    }

    public boolean vp() {
        String nomeFantasia = tfNomeFantasia.getText();
        String razaoSocial = tfRazaoSocial.getText();
        String tipoPessoa = tfTipoPessoa.getText();
        //String cat = cbCat.getSelectedItem() + "";
        String dtCriacao = ftfDtCriacao.getText();
        String cnpj = tfCnpj.getText();
        String isncEst = tfIsncEst.getText();
        String tel = tfTel.getText();
        String email = tfEmail.getText();
        String reponsavelContato = tfResponsavelContato.getText();
        return !(nomeFantasia.equals("")
                || razaoSocial.equals("")
                || tipoPessoa.equals("")
                || dtCriacao.equals("")
                || cnpj.equals("")
                || isncEst.equals("")
                || tel.equals("")
                || email.equals("")
                || reponsavelContato.equals(""));
    }

}
