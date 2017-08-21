package br.com.twtm.gui;

import br.com.twtm.xpromo.Login;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class PeAcessoJD extends javax.swing.JDialog {

    private Login login;

    public PeAcessoJD(java.awt.Frame parent, boolean modal, Login login) {
        super(parent, modal);
        initComponents();

        this.login = login;

        //Preenchimento dos campos de dados básicos de autenticação
        tfLogin.setText(login.getEmail());
        String temp = "Tipo de usuário";
        int tu = login.getTipoUsuario();
        if (tu == 0) {
            temp = "Pessoa física";
        } else if (tu == 1) {
            temp = "Pessoa jurídica";
        } else if (tu == 2) {
            temp = "Entidade filantrópica";
        } else if (tu == 3) {
            temp = "Administrador";
        }
        tfTu.setText(temp);
        int status = login.getStatus();
        if (status == 0) {
            temp = "Disponível";
        } else if (status == 1) {
            temp = "Ocupado";
        } else if (status == 2) {
            temp = "Indisponível";
        }
        tfStatus.setText(temp);

        //Exibição da data da última alteração de senha da conta
        if (login.getDtSenha() != null) {
            SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
            String data = out.format(login.getDtSenha().getTime());
            String dh = data;
            out = new SimpleDateFormat("HH:mm:ss");
            data = out.format(login.getDtSenha().getTime());
            lbDtUltimaAlteracao.setText("Última alteração em " + dh.concat(" às " + data));
        } else {
            lbDtUltimaAlteracao.setText("");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundo = new javax.swing.JPanel();
        btOk = new javax.swing.JButton();
        pnlCabecalho = new javax.swing.JPanel();
        lbCadeado = new javax.swing.JLabel();
        lbXpromo = new javax.swing.JLabel();
        lbAcesso = new javax.swing.JLabel();
        pnlDadosBasicos = new javax.swing.JPanel();
        lbLogin = new javax.swing.JLabel();
        lbTipoUsuario = new javax.swing.JLabel();
        tfLogin = new javax.swing.JTextField();
        tfTu = new javax.swing.JTextField();
        tfStatus = new javax.swing.JTextField();
        lbStatus = new javax.swing.JLabel();
        pnlAlteracaoSenha = new javax.swing.JPanel();
        lbSenhaAntiga = new javax.swing.JLabel();
        lbNovaSenha = new javax.swing.JLabel();
        lbConfirmarNovaSenha = new javax.swing.JLabel();
        pwSenhaAntiga = new javax.swing.JPasswordField();
        pwNovaSenha = new javax.swing.JPasswordField();
        pwConfirmarNovaSenha = new javax.swing.JPasswordField();
        btCancelar = new javax.swing.JButton();
        lbDtUltimaAlteracao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acesso");
        setResizable(false);

        pnlFundo.setBackground(new java.awt.Color(255, 255, 255));

        btOk.setBackground(new java.awt.Color(153, 0, 255));
        btOk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btOk.setForeground(new java.awt.Color(255, 255, 255));
        btOk.setText("Ok");
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });

        pnlCabecalho.setBackground(new java.awt.Color(233, 234, 237));

        lbCadeado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/cadeado_72.png"))); // NOI18N

        lbXpromo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbXpromo.setText("XPROMO");

        lbAcesso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbAcesso.setText("Acesso");

        javax.swing.GroupLayout pnlCabecalhoLayout = new javax.swing.GroupLayout(pnlCabecalho);
        pnlCabecalho.setLayout(pnlCabecalhoLayout);
        pnlCabecalhoLayout.setHorizontalGroup(
            pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCadeado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbXpromo)
                    .addComponent(lbAcesso))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCabecalhoLayout.setVerticalGroup(
            pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCabecalhoLayout.createSequentialGroup()
                        .addComponent(lbXpromo)
                        .addGap(0, 0, 0)
                        .addComponent(lbAcesso))
                    .addComponent(lbCadeado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDadosBasicos.setBackground(new java.awt.Color(255, 255, 255));
        pnlDadosBasicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados básicos de autenticação"));

        lbLogin.setText("Login");

        lbTipoUsuario.setText("Tipo de usuário");

        tfLogin.setEditable(false);
        tfLogin.setBackground(new java.awt.Color(255, 255, 255));
        tfLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tfTu.setEditable(false);
        tfTu.setBackground(new java.awt.Color(255, 255, 255));
        tfTu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tfStatus.setEditable(false);
        tfStatus.setBackground(new java.awt.Color(255, 255, 255));
        tfStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbStatus.setText("Status");

        javax.swing.GroupLayout pnlDadosBasicosLayout = new javax.swing.GroupLayout(pnlDadosBasicos);
        pnlDadosBasicos.setLayout(pnlDadosBasicosLayout);
        pnlDadosBasicosLayout.setHorizontalGroup(
            pnlDadosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosBasicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbLogin)
                    .addComponent(lbTipoUsuario)
                    .addComponent(lbStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDadosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(tfLogin)
                    .addComponent(tfTu))
                .addContainerGap())
        );
        pnlDadosBasicosLayout.setVerticalGroup(
            pnlDadosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosBasicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTipoUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbStatus))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAlteracaoSenha.setBackground(new java.awt.Color(255, 255, 255));
        pnlAlteracaoSenha.setBorder(javax.swing.BorderFactory.createTitledBorder("Alteração de senha"));

        lbSenhaAntiga.setText("Senha antiga");

        lbNovaSenha.setText("Nova senha");

        lbConfirmarNovaSenha.setText("Confirmar nova senha");

        javax.swing.GroupLayout pnlAlteracaoSenhaLayout = new javax.swing.GroupLayout(pnlAlteracaoSenha);
        pnlAlteracaoSenha.setLayout(pnlAlteracaoSenhaLayout);
        pnlAlteracaoSenhaLayout.setHorizontalGroup(
            pnlAlteracaoSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlteracaoSenhaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAlteracaoSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pwSenhaAntiga)
                    .addComponent(pwNovaSenha)
                    .addGroup(pnlAlteracaoSenhaLayout.createSequentialGroup()
                        .addGroup(pnlAlteracaoSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSenhaAntiga)
                            .addComponent(lbNovaSenha)
                            .addComponent(lbConfirmarNovaSenha))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pwConfirmarNovaSenha))
                .addContainerGap())
        );
        pnlAlteracaoSenhaLayout.setVerticalGroup(
            pnlAlteracaoSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlteracaoSenhaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSenhaAntiga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwSenhaAntiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lbNovaSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lbConfirmarNovaSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pwConfirmarNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btCancelar.setBackground(new java.awt.Color(153, 153, 153));
        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        lbDtUltimaAlteracao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbDtUltimaAlteracao.setForeground(new java.awt.Color(255, 51, 51));
        lbDtUltimaAlteracao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDtUltimaAlteracao.setText("Última alteração em XX/XX/XXXX às XX:XX:XX");

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCabecalho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDadosBasicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAlteracaoSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFundoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbDtUltimaAlteracao, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFundoLayout.createSequentialGroup()
                .addComponent(pnlCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlDadosBasicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlAlteracaoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbDtUltimaAlteracao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btOk)
                    .addComponent(btCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
        try {
            if (vpCamposCadastro()) {
                if (login.getSenha().equals(String.valueOf(pwSenhaAntiga.getPassword()))) {
                    if (compararSenhas()) {
                        login.setSenha(String.valueOf(pwNovaSenha.getPassword()));
                        JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!", "XPROMO", JOptionPane.INFORMATION_MESSAGE);
                        Calendar c = Calendar.getInstance();
                        login.setDtSenha(c.getTime());
                        this.dispose();
                    } else {
                        throw new Exception("As senhas não coincidem!");
                    }
                } else {
                    throw new Exception("A senha antiga está incorreta!");
                }
            } else {
                throw new Exception("Preencha todos os campos!");
            }
        } catch (Exception e) {
            this.limparCampos();
            JOptionPane.showMessageDialog(null, e.getMessage(), "XPROMO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btOkActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btOk;
    private javax.swing.JLabel lbAcesso;
    private javax.swing.JLabel lbCadeado;
    private javax.swing.JLabel lbConfirmarNovaSenha;
    private javax.swing.JLabel lbDtUltimaAlteracao;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbNovaSenha;
    private javax.swing.JLabel lbSenhaAntiga;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbTipoUsuario;
    private javax.swing.JLabel lbXpromo;
    private javax.swing.JPanel pnlAlteracaoSenha;
    private javax.swing.JPanel pnlCabecalho;
    private javax.swing.JPanel pnlDadosBasicos;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPasswordField pwConfirmarNovaSenha;
    private javax.swing.JPasswordField pwNovaSenha;
    private javax.swing.JPasswordField pwSenhaAntiga;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JTextField tfStatus;
    private javax.swing.JTextField tfTu;
    // End of variables declaration//GEN-END:variables

    private boolean vpCamposCadastro() {
        String senhaAntiga = String.valueOf(pwSenhaAntiga.getPassword());
        String novaSenha = String.valueOf(pwNovaSenha.getPassword());
        String confirmarNovaSenha = String.valueOf(pwConfirmarNovaSenha.getPassword());
        return !(senhaAntiga.equals("")
                || novaSenha.equals("")
                || confirmarNovaSenha.equals(""));
    }

    private boolean compararSenhas() {
        String novaSenha = String.valueOf(pwNovaSenha.getPassword());
        String confirmarNovaSenha = String.valueOf(pwConfirmarNovaSenha.getPassword());
        return (novaSenha.equals(confirmarNovaSenha));
    }

    private void limparCampos() {
        pwSenhaAntiga.setText("");
        pwNovaSenha.setText("");
        pwConfirmarNovaSenha.setText("");
    }

}
