package br.com.twtm.gui;

import br.com.twtm.estruturas.Denuncias;
import br.com.twtm.xpromo.Pessoa;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class AdmAnaliseDenunciaJF extends javax.swing.JFrame {

    public AdmAnaliseDenunciaJF() {
        initComponents();
        btAnalisar.setBackground(Color.white);
        if (Denuncias.tamanho() != 0) {
            atualizarTela(Denuncias.exibirPrimeira());
        } else {
            limparTela();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMenuSuperior = new javax.swing.JPanel();
        btAnalisar = new javax.swing.JButton();
        pnlCard = new javax.swing.JPanel();
        pnlAnalisar = new javax.swing.JPanel();
        btSuspender = new javax.swing.JButton();
        btLiberar = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();
        pnlGrafico = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Denúncias");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/twtm/imagens/icone-xpromo.png")));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnMenuSuperior.setBackground(new java.awt.Color(233, 234, 237));

        btAnalisar.setBackground(new java.awt.Color(255, 204, 153));
        btAnalisar.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btAnalisar.setText("Analisar (XX)");
        btAnalisar.setBorderPainted(false);
        btAnalisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAnalisar.setFocusPainted(false);
        btAnalisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnalisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnMenuSuperiorLayout = new javax.swing.GroupLayout(pnMenuSuperior);
        pnMenuSuperior.setLayout(pnMenuSuperiorLayout);
        pnMenuSuperiorLayout.setHorizontalGroup(
            pnMenuSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuSuperiorLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btAnalisar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnMenuSuperiorLayout.setVerticalGroup(
            pnMenuSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuSuperiorLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(btAnalisar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlCard.setLayout(new java.awt.CardLayout());

        pnlAnalisar.setBackground(new java.awt.Color(255, 255, 255));
        pnlAnalisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlAnalisar.setMaximumSize(new java.awt.Dimension(942, 602));
        pnlAnalisar.setMinimumSize(new java.awt.Dimension(942, 602));
        pnlAnalisar.setPreferredSize(new java.awt.Dimension(942, 602));

        btSuspender.setBackground(new java.awt.Color(255, 51, 51));
        btSuspender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSuspender.setForeground(new java.awt.Color(255, 255, 255));
        btSuspender.setText("Suspender");
        btSuspender.setBorderPainted(false);
        btSuspender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSuspenderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSuspenderMouseExited(evt);
            }
        });
        btSuspender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuspenderActionPerformed(evt);
            }
        });

        btLiberar.setBackground(new java.awt.Color(51, 153, 0));
        btLiberar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btLiberar.setForeground(new java.awt.Color(255, 255, 255));
        btLiberar.setText("Liberar");
        btLiberar.setBorderPainted(false);
        btLiberar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btLiberarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btLiberarMouseExited(evt);
            }
        });
        btLiberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLiberarActionPerformed(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbTitulo.setText("Denúncia contra usuário de login \"LOGIN\":");

        pnlGrafico.setBackground(new java.awt.Color(255, 255, 255));
        pnlGrafico.setLayout(new javax.swing.BoxLayout(pnlGrafico, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout pnlAnalisarLayout = new javax.swing.GroupLayout(pnlAnalisar);
        pnlAnalisar.setLayout(pnlAnalisarLayout);
        pnlAnalisarLayout.setHorizontalGroup(
            pnlAnalisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAnalisarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAnalisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAnalisarLayout.createSequentialGroup()
                        .addGap(0, 616, Short.MAX_VALUE)
                        .addComponent(btLiberar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSuspender, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlAnalisarLayout.setVerticalGroup(
            pnlAnalisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAnalisarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAnalisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSuspender, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLiberar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlCard.add(pnlAnalisar, "analisar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMenuSuperior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnMenuSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAnalisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnalisarActionPerformed

    }//GEN-LAST:event_btAnalisarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void btSuspenderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSuspenderMouseEntered

    }//GEN-LAST:event_btSuspenderMouseEntered

    private void btSuspenderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSuspenderMouseExited

    }//GEN-LAST:event_btSuspenderMouseExited

    private void btSuspenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuspenderActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "Prosseguir com o bloqueio?", "XPROMO", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (op == 0) {
            Denuncias.exibirPrimeira().login.setBloqueio(true);
            Denuncias.sair();
            if (Denuncias.tamanho() != 0) {
                atualizarTela(Denuncias.exibirPrimeira());
            } else {
                limparTela();
            }
        }
    }//GEN-LAST:event_btSuspenderActionPerformed

    private void btLiberarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLiberarMouseEntered

    }//GEN-LAST:event_btLiberarMouseEntered

    private void btLiberarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLiberarMouseExited

    }//GEN-LAST:event_btLiberarMouseExited

    private void btLiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLiberarActionPerformed
        Denuncias.sair();
        if (Denuncias.tamanho() != 0) {
            atualizarTela(Denuncias.exibirPrimeira());
        } else {
            limparTela();
        }
    }//GEN-LAST:event_btLiberarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnalisar;
    private javax.swing.JButton btLiberar;
    private javax.swing.JButton btSuspender;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pnMenuSuperior;
    private javax.swing.JPanel pnlAnalisar;
    private javax.swing.JPanel pnlCard;
    private javax.swing.JPanel pnlGrafico;
    // End of variables declaration//GEN-END:variables

    private void atualizarTela(Pessoa p) {
        lbTitulo.setText("Denúncia contra usuário de login \"" + p.login.getEmail() + "\":");
        if (Denuncias.tamanho() != 0) {
            pnlGrafico.removeAll();
            btAnalisar.setText("Analisar (" + Denuncias.tamanho() + ")");
            AdmEstatisticasDenunciaPL pnlAdmEstatisticasDenunciaPL = new AdmEstatisticasDenunciaPL(p);
            pnlGrafico.add(pnlAdmEstatisticasDenunciaPL);
            pnlGrafico.repaint();
            pnlGrafico.revalidate();
        }
    }

    public void limparTela() {
        btAnalisar.setText("Analisar (0)");
        lbTitulo.setText("Não existem denúncias!");
        pnlGrafico.removeAll();
        btLiberar.setVisible(false);
        btSuspender.setVisible(false);
    }

}
