package br.com.twtm.gui;

import br.com.twtm.xpromo.Pessoa;
import br.com.twtm.xpromo.PessoaFisica;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AdmTelaInicialJF extends javax.swing.JFrame {

    private Pessoa p;
    private JFrame frOpinioes, frDenuncias;

    public AdmTelaInicialJF(Pessoa p) {
        initComponents();
        this.p = p;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ppmSair = new javax.swing.JPopupMenu();
        mitConta = new javax.swing.JMenuItem();
        mitAcesso = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mitSobre = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mitSair = new javax.swing.JMenuItem();
        pnlFundo = new javax.swing.JPanel();
        pnlCabecalho = new javax.swing.JPanel();
        lbLogomarca = new javax.swing.JLabel();
        btOpcoes = new javax.swing.JButton();
        pnlMenu = new javax.swing.JPanel();
        btOpinioes = new javax.swing.JButton();
        btDenuncias = new javax.swing.JButton();
        lbMarcadAgua = new javax.swing.JLabel();

        ppmSair.setBackground(new java.awt.Color(0, 102, 102));
        ppmSair.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mitConta.setBackground(new java.awt.Color(0, 102, 102));
        mitConta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mitConta.setForeground(new java.awt.Color(255, 255, 255));
        mitConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/conta_24.png"))); // NOI18N
        mitConta.setText("Conta");
        mitConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitContaActionPerformed(evt);
            }
        });
        ppmSair.add(mitConta);

        mitAcesso.setBackground(new java.awt.Color(0, 102, 102));
        mitAcesso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mitAcesso.setForeground(new java.awt.Color(255, 255, 255));
        mitAcesso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/acesso_24.png"))); // NOI18N
        mitAcesso.setText("Acesso");
        mitAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitAcessoActionPerformed(evt);
            }
        });
        ppmSair.add(mitAcesso);
        ppmSair.add(jSeparator1);

        mitSobre.setBackground(new java.awt.Color(0, 102, 102));
        mitSobre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mitSobre.setForeground(new java.awt.Color(255, 255, 255));
        mitSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/sobre_24.png"))); // NOI18N
        mitSobre.setText("Sobre");
        mitSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitSobreActionPerformed(evt);
            }
        });
        ppmSair.add(mitSobre);
        ppmSair.add(jSeparator2);

        mitSair.setBackground(new java.awt.Color(0, 102, 102));
        mitSair.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mitSair.setForeground(new java.awt.Color(255, 255, 255));
        mitSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/logout.png"))); // NOI18N
        mitSair.setText("Sair");
        mitSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitSairActionPerformed(evt);
            }
        });
        ppmSair.add(mitSair);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("XPROMO | Área Administrativa");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setExtendedState(PfTelaInicial.MAXIMIZED_BOTH);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/twtm/imagens/icone-xpromo.png")));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlFundo.setBackground(new java.awt.Color(233, 234, 237));

        pnlCabecalho.setBackground(new java.awt.Color(0, 102, 102));

        lbLogomarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/logomarca-media.png"))); // NOI18N

        btOpcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/opcoes_32.png"))); // NOI18N
        btOpcoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOpcoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCabecalhoLayout = new javax.swing.GroupLayout(pnlCabecalho);
        pnlCabecalho.setLayout(pnlCabecalhoLayout);
        pnlCabecalhoLayout.setHorizontalGroup(
            pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLogomarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlCabecalhoLayout.setVerticalGroup(
            pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbLogomarca)
                    .addComponent(btOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pnlMenu.setBackground(new java.awt.Color(233, 234, 237));
        pnlMenu.setMaximumSize(new java.awt.Dimension(4000, 33));
        pnlMenu.setMinimumSize(new java.awt.Dimension(1280, 33));

        btOpinioes.setBackground(new java.awt.Color(255, 204, 153));
        btOpinioes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btOpinioes.setText("Opiniões");
        btOpinioes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOpinioesActionPerformed(evt);
            }
        });

        btDenuncias.setBackground(new java.awt.Color(255, 204, 153));
        btDenuncias.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btDenuncias.setText("Denúncias");
        btDenuncias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDenunciasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addComponent(btOpinioes, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btDenuncias, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btOpinioes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btDenuncias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lbMarcadAgua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMarcadAgua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/marca_xpromo.png"))); // NOI18N

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbMarcadAgua, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
                    .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addComponent(pnlCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMarcadAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOpcoesActionPerformed
        ppmSair.show(btOpcoes, -63, 20);
    }//GEN-LAST:event_btOpcoesActionPerformed

    private void btOpinioesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOpinioesActionPerformed
        if (frOpinioes == null) {
            frOpinioes = new AdmAnaliseOpinioesJF();
            frOpinioes.setVisible(true);
        } else {
            if (!frOpinioes.isVisible()) {
                frOpinioes = new AdmAnaliseOpinioesJF();
                frOpinioes.setVisible(true);
            }
        }
    }//GEN-LAST:event_btOpinioesActionPerformed

    private void btDenunciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDenunciasActionPerformed
        if (frDenuncias == null) {
            frDenuncias = new AdmAnaliseDenunciaJF();
            frDenuncias.setVisible(true);
        } else {
            if (!frDenuncias.isVisible()) {
                frDenuncias = new AdmAnaliseDenunciaJF();
                frDenuncias.setVisible(true);
            }
        }
    }//GEN-LAST:event_btDenunciasActionPerformed

    private void mitContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitContaActionPerformed
        PfContaFR frConta = new PfContaFR((PessoaFisica) p);
        frConta.setVisible(true);
    }//GEN-LAST:event_mitContaActionPerformed

    private void mitAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitAcessoActionPerformed
        PeAcessoJD jdAcesso = new PeAcessoJD(this, true, p.getLogin());
        jdAcesso.setVisible(true);
    }//GEN-LAST:event_mitAcessoActionPerformed

    private void mitSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitSobreActionPerformed
        PeSobreJD jdSobre = new PeSobreJD(this, true);
        jdSobre.setVisible(true);
    }//GEN-LAST:event_mitSobreActionPerformed

    private void mitSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitSairActionPerformed
        fecharJanela();
    }//GEN-LAST:event_mitSairActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        fecharJanela();
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDenuncias;
    private javax.swing.JButton btOpcoes;
    private javax.swing.JButton btOpinioes;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel lbLogomarca;
    private javax.swing.JLabel lbMarcadAgua;
    private javax.swing.JMenuItem mitAcesso;
    private javax.swing.JMenuItem mitConta;
    private javax.swing.JMenuItem mitSair;
    private javax.swing.JMenuItem mitSobre;
    private javax.swing.JPanel pnlCabecalho;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPopupMenu ppmSair;
    // End of variables declaration//GEN-END:variables

    public void fecharJanela() {
        int op = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Já vai indo?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (op == 0) {
            PeLoginJF telaLogin = new PeLoginJF();
            if (frOpinioes != null) {
                frOpinioes.dispose();
            }
            if (frDenuncias != null) {
                frDenuncias.dispose();
            }
            this.dispose();
            telaLogin.setVisible(true);
        }
    }

}
