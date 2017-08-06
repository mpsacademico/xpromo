package br.com.twtm.gui;

import br.com.twtm.estruturas.Logins;
import br.com.twtm.estruturas.Pessoas;
import br.com.twtm.xpromo.Login;
import br.com.twtm.xpromo.Pessoa;
import br.com.twtm.xpromo.PessoaFisica;
import br.com.twtm.xpromo.PessoaJuridica;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class PjContaFR extends javax.swing.JFrame {

    /**
     * indica se os botões podem funcionar ou não (dados, endereço)
     */
    private int ind = 0;

    private Login login;
    private PessoaJuridica pj;

    public PjContaFR(Login novoLogin) {
        this.login = novoLogin;
        initComponents();
        dpj.preencherCampos(login);
        btDadosPessoais.setBackground(new java.awt.Color(51, 153, 255));
        lbBemVindo.setText("Bem-vindo, " + login.getEmail());
    }

    public PjContaFR(PessoaJuridica pj) {
        this.ind = 1;
        this.pj = pj;
        initComponents();
        dpj.preencherCampos(pj);
        endp.preencherCampos(pj);
        btAvancar.setBorderPainted(false);
        btAvancar.setForeground(Color.WHITE);
        btAvancar.setBackground(Color.WHITE);
        btOk.setText("Atualizar");
        lbBemVindo.setText("");
        lbDeixarParaDepois.setText("");
        btDadosPessoais.setBackground(new Color(255, 153, 102));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        CardLayout showPanel = (CardLayout) pnlCard.getLayout();
        showPanel.show(pnlCard, "dadosPessoaFisica");
    }

    public PjContaFR(Pessoa p, boolean estado) {
        initComponents();
        login = p.getLogin();
        this.pj = (PessoaJuridica) p;
        dpj.preencherCampos(p, true);
        endp.preencherCampos(p);
        btDadosPessoais.setBackground(new java.awt.Color(51, 153, 255));
        lbBemVindo.setText("Bem-vindo, " + p.getLogin().getEmail());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlConta = new javax.swing.JPanel();
        pnlTituloPrincipal = new javax.swing.JPanel();
        lbBemVindo = new javax.swing.JLabel();
        lbDeixarParaDepois = new javax.swing.JLabel();
        lbLogomarca = new javax.swing.JLabel();
        pnlCard = new javax.swing.JPanel();
        dadosPf = new javax.swing.JPanel();
        btAvancar = new javax.swing.JButton();
        dpj = new br.com.twtm.gui.DadosPessoaJuridica();
        enderecoP = new javax.swing.JPanel();
        btOk = new javax.swing.JButton();
        endp = new br.com.twtm.gui.PeEnderecoPL();
        jPanel1 = new javax.swing.JPanel();
        btDadosPessoais = new javax.swing.JButton();
        btEndereco = new javax.swing.JButton();
        btPagamento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Conta");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/twtm/imagens/icone-xpromo.png")));
        setResizable(false);

        pnlConta.setBackground(new java.awt.Color(255, 255, 255));
        pnlConta.setMaximumSize(new java.awt.Dimension(32767, 639));
        pnlConta.setMinimumSize(new java.awt.Dimension(960, 639));

        pnlTituloPrincipal.setBackground(new java.awt.Color(0, 102, 102));

        lbBemVindo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbBemVindo.setForeground(new java.awt.Color(255, 255, 255));
        lbBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbBemVindo.setText("Bem-vindo, <e-mail>!");

        lbDeixarParaDepois.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbDeixarParaDepois.setForeground(new java.awt.Color(204, 204, 255));
        lbDeixarParaDepois.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDeixarParaDepois.setText("Deixar para depois");
        lbDeixarParaDepois.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbDeixarParaDepois.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDeixarParaDepoisMouseClicked(evt);
            }
        });

        lbLogomarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/logomarca-media.png"))); // NOI18N

        javax.swing.GroupLayout pnlTituloPrincipalLayout = new javax.swing.GroupLayout(pnlTituloPrincipal);
        pnlTituloPrincipal.setLayout(pnlTituloPrincipalLayout);
        pnlTituloPrincipalLayout.setHorizontalGroup(
            pnlTituloPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLogomarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                .addGroup(pnlTituloPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDeixarParaDepois, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbBemVindo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlTituloPrincipalLayout.setVerticalGroup(
            pnlTituloPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTituloPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlTituloPrincipalLayout.createSequentialGroup()
                        .addComponent(lbBemVindo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbDeixarParaDepois))
                    .addComponent(lbLogomarca))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCard.setBackground(new java.awt.Color(255, 255, 255));
        pnlCard.setLayout(new java.awt.CardLayout());

        dadosPf.setBackground(new java.awt.Color(255, 255, 255));

        btAvancar.setBackground(new java.awt.Color(153, 0, 255));
        btAvancar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btAvancar.setForeground(new java.awt.Color(255, 255, 255));
        btAvancar.setText("Avançar");
        btAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAvancarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dadosPfLayout = new javax.swing.GroupLayout(dadosPf);
        dadosPf.setLayout(dadosPfLayout);
        dadosPfLayout.setHorizontalGroup(
            dadosPfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosPfLayout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addGroup(dadosPfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAvancar))
                .addGap(0, 0, 0))
        );
        dadosPfLayout.setVerticalGroup(
            dadosPfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPfLayout.createSequentialGroup()
                .addComponent(dpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btAvancar)
                .addContainerGap())
        );

        pnlCard.add(dadosPf, "dadosPessoaFisica");

        enderecoP.setBackground(new java.awt.Color(255, 255, 255));
        enderecoP.setPreferredSize(new java.awt.Dimension(677, 489));

        btOk.setBackground(new java.awt.Color(153, 0, 255));
        btOk.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btOk.setForeground(new java.awt.Color(255, 255, 255));
        btOk.setText("Cadastrar");
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout enderecoPLayout = new javax.swing.GroupLayout(enderecoP);
        enderecoP.setLayout(enderecoPLayout);
        enderecoPLayout.setHorizontalGroup(
            enderecoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(enderecoPLayout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addGroup(enderecoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(endp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btOk)))
        );
        enderecoPLayout.setVerticalGroup(
            enderecoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enderecoPLayout.createSequentialGroup()
                .addComponent(endp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(btOk)
                .addContainerGap())
        );

        pnlCard.add(enderecoP, "endereco");

        jPanel1.setBackground(new java.awt.Color(233, 234, 237));

        btDadosPessoais.setBackground(new java.awt.Color(255, 204, 153));
        btDadosPessoais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/dados-pessoais.png"))); // NOI18N
        btDadosPessoais.setToolTipText("Dados Pessoais");
        btDadosPessoais.setBorderPainted(false);
        btDadosPessoais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDadosPessoais.setFocusPainted(false);
        btDadosPessoais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDadosPessoaisActionPerformed(evt);
            }
        });

        btEndereco.setBackground(new java.awt.Color(255, 204, 153));
        btEndereco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/endereco.png"))); // NOI18N
        btEndereco.setToolTipText("Endereço");
        btEndereco.setBorderPainted(false);
        btEndereco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEndereco.setFocusPainted(false);
        btEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnderecoActionPerformed(evt);
            }
        });

        btPagamento.setBackground(new java.awt.Color(255, 204, 153));
        btPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pagamento.png"))); // NOI18N
        btPagamento.setToolTipText("Pagamento");
        btPagamento.setBorderPainted(false);
        btPagamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPagamento.setFocusPainted(false);
        btPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPagamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(354, 354, 354))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btPagamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlContaLayout = new javax.swing.GroupLayout(pnlConta);
        pnlConta.setLayout(pnlContaLayout);
        pnlContaLayout.setHorizontalGroup(
            pnlContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTituloPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlContaLayout.setVerticalGroup(
            pnlContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContaLayout.createSequentialGroup()
                .addComponent(pnlTituloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnderecoActionPerformed
        if (ind == 1) {
            CardLayout showPanel = (CardLayout) pnlCard.getLayout();
            showPanel.show(pnlCard, "endereco");
            btEndereco.setBackground(new Color(255, 153, 102));
            btDadosPessoais.setBackground(new Color(255, 204, 153));
        }
    }//GEN-LAST:event_btEnderecoActionPerformed

    private void lbDeixarParaDepoisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDeixarParaDepoisMouseClicked
        Object[] opcoes = {"Ok", "Cancelar"};
        int op = JOptionPane.showOptionDialog(null, "O seu cadastro ainda não foi finalizado!\n"
                + "Continue de onde parou em seu próximo acesso.", "XPROMO", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[1]);
        if (op == 0) {
            if (Pessoas.contem(pj)) {
                dpj.alterarPessoaJuridica(pj, endp.criarEnd());
            } else {
                Pessoas.cadastrar(dpj.criarPessoaJuridica(login, endp.criarEnd()));
            }
            PeLoginJF tLogin = new PeLoginJF();
            this.dispose();
            tLogin.setVisible(true);
        }
    }//GEN-LAST:event_lbDeixarParaDepoisMouseClicked

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
        if (ind == 1) {
            if (endp.vpCampos() && dpj.vp()) {
                dpj.alterarPessoaJuridica(pj, endp.criarEnd());
                JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!", "XPROMO", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios!", "XPROMO", JOptionPane.WARNING_MESSAGE);
            }
        }
        if (ind == 0) {
            if (endp.vpCampos()) {
                btEndereco.setBackground(new java.awt.Color(0, 204, 51));
                login.setValidadeCad(true);
                if (Pessoas.contem(pj)) {
                    dpj.alterarPessoaJuridica(pj, endp.criarEnd());
                } else {
                    Pessoas.cadastrar(dpj.criarPessoaJuridica(login, endp.criarEnd()));
                }
                PessoaJuridica nova = (PessoaJuridica) Logins.procurarLogin(login.getEmail(), login.getSenha());
                nova.perfil.setVer(true);
                PjTelaInicial t = new PjTelaInicial(nova);
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "XPROMO", JOptionPane.INFORMATION_MESSAGE);                
                PeMsgTourJD msg = new PeMsgTourJD(null, true, nova);
                t.setVisible(true);
                msg.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios!", "XPROMO", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btOkActionPerformed

    private void btAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAvancarActionPerformed
        if (dpj.vp()) {
            btDadosPessoais.setBackground(new java.awt.Color(0, 204, 51));
            btEndereco.setBackground(new java.awt.Color(51, 153, 255));
            CardLayout showPanel = (CardLayout) pnlCard.getLayout();
            showPanel.show(pnlCard, "endereco");
        } else {
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios!", "XPROMO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btAvancarActionPerformed

    private void btDadosPessoaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDadosPessoaisActionPerformed
        if (ind == 1) {
            CardLayout showPanel = (CardLayout) pnlCard.getLayout();
            showPanel.show(pnlCard, "dadosPessoaFisica");
            btDadosPessoais.setBackground(new Color(255, 153, 102));
            btEndereco.setBackground(new Color(255, 204, 153));
        }
    }//GEN-LAST:event_btDadosPessoaisActionPerformed

    private void btPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPagamentoActionPerformed
        //JOptionPane.showMessageDialog(null, "Função desabilitada nesta versão!", "XPROMO", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btPagamentoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAvancar;
    private javax.swing.JButton btDadosPessoais;
    private javax.swing.JButton btEndereco;
    private javax.swing.JButton btOk;
    private javax.swing.JButton btPagamento;
    private javax.swing.JPanel dadosPf;
    private br.com.twtm.gui.DadosPessoaJuridica dpj;
    private javax.swing.JPanel enderecoP;
    private br.com.twtm.gui.PeEnderecoPL endp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBemVindo;
    private javax.swing.JLabel lbDeixarParaDepois;
    private javax.swing.JLabel lbLogomarca;
    private javax.swing.JPanel pnlCard;
    private javax.swing.JPanel pnlConta;
    private javax.swing.JPanel pnlTituloPrincipal;
    // End of variables declaration//GEN-END:variables
}
