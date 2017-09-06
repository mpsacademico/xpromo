package br.com.twtm.gui;

import br.com.twtm.xpromo.DesfazerRefazer;
import br.com.twtm.xpromo.Interesse;
import br.com.twtm.xpromo.Pessoa;
import java.util.EmptyStackException;
import java.util.List;
import javax.swing.JOptionPane;

public class InteressesPL extends javax.swing.JPanel {

    private Pessoa p;
    private DesfazerRefazer df;
    private List interessesAtual;

    public InteressesPL(Pessoa p) {
        initComponents();
        this.p = p;         
        df = new DesfazerRefazer(p.comercial.getInteresses(), p);        
        atualizarBtDf();
        atualizarInteresses();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btRefazer = new javax.swing.JButton();
        btDesfazer = new javax.swing.JButton();
        btNovoInteresse = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlInteresses = new javax.swing.JPanel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMaximumSize(new java.awt.Dimension(1000, 553));
        setMinimumSize(new java.awt.Dimension(0, 400));
        setPreferredSize(new java.awt.Dimension(797, 553));
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(233, 234, 237));

        jPanel2.setBackground(new java.awt.Color(210, 211, 218));
        jPanel2.setToolTipText("");
        jPanel2.setMaximumSize(new java.awt.Dimension(797, 36));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Interesses");

        btRefazer.setBackground(new java.awt.Color(255, 255, 255));
        btRefazer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/refazer_36.png"))); // NOI18N
        btRefazer.setMaximumSize(new java.awt.Dimension(36, 36));
        btRefazer.setMinimumSize(new java.awt.Dimension(36, 36));
        btRefazer.setPreferredSize(new java.awt.Dimension(36, 36));
        btRefazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefazerActionPerformed(evt);
            }
        });

        btDesfazer.setBackground(new java.awt.Color(255, 255, 255));
        btDesfazer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/desfazer_36.png"))); // NOI18N
        btDesfazer.setMaximumSize(new java.awt.Dimension(36, 36));
        btDesfazer.setMinimumSize(new java.awt.Dimension(36, 36));
        btDesfazer.setPreferredSize(new java.awt.Dimension(36, 36));
        btDesfazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDesfazerActionPerformed(evt);
            }
        });

        btNovoInteresse.setBackground(new java.awt.Color(255, 255, 255));
        btNovoInteresse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/novo_32.png"))); // NOI18N
        btNovoInteresse.setBorderPainted(false);
        btNovoInteresse.setContentAreaFilled(false);
        btNovoInteresse.setMaximumSize(new java.awt.Dimension(36, 36));
        btNovoInteresse.setMinimumSize(new java.awt.Dimension(36, 36));
        btNovoInteresse.setPreferredSize(new java.awt.Dimension(36, 36));
        btNovoInteresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoInteresseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 572, Short.MAX_VALUE)
                .addComponent(btNovoInteresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btDesfazer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btRefazer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btDesfazer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btRefazer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btNovoInteresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jScrollPane1.setBorder(null);
        jScrollPane1.setMinimumSize(new java.awt.Dimension(0, 511));

        pnlInteresses.setBackground(new java.awt.Color(233, 234, 237));
        pnlInteresses.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                pnlInteressesComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                pnlInteressesComponentRemoved(evt);
            }
        });
        pnlInteresses.setLayout(new javax.swing.BoxLayout(pnlInteresses, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(pnlInteresses);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btRefazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefazerActionPerformed
        try {
            df.refazer();
            atualizarBtDf();
            atualizarInteresses();
        } catch (EmptyStackException ex) {
            //JOptionPane.showMessageDialog(null, "Não há o que refazer!", "XPROMO", JOptionPane.WARNING_MESSAGE);
        }
        atualizarBtDf();
        atualizarInteresses();
    }//GEN-LAST:event_btRefazerActionPerformed

    private void btNovoInteresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoInteresseActionPerformed
        PeCrudInteresseJD jdCrudInteresseJD = new PeCrudInteresseJD(null, true, p, df, interessesAtual);
        jdCrudInteresseJD.setVisible(true);
        atualizarBtDf();
    }//GEN-LAST:event_btNovoInteresseActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        atualizarBtDf();        
    }//GEN-LAST:event_formFocusGained

    private void btDesfazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDesfazerActionPerformed
        try {
            df.desfazer();
            atualizarBtDf();
            atualizarInteresses();
        } catch (EmptyStackException ex) {
            //JOptionPane.showMessageDialog(null, "Não há o que desfazer!", "XPROMO", JOptionPane.WARNING_MESSAGE);
        }
        atualizarBtDf();
        atualizarInteresses();
    }//GEN-LAST:event_btDesfazerActionPerformed

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        //atualizarBtDf();
    }//GEN-LAST:event_formComponentAdded

    private void pnlInteressesComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_pnlInteressesComponentAdded
        atualizarBtDf();
    }//GEN-LAST:event_pnlInteressesComponentAdded

    private void pnlInteressesComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_pnlInteressesComponentRemoved
        atualizarBtDf();
    }//GEN-LAST:event_pnlInteressesComponentRemoved

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDesfazer;
    private javax.swing.JButton btNovoInteresse;
    private javax.swing.JButton btRefazer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlInteresses;
    // End of variables declaration//GEN-END:variables

    public void atualizarInteresses() {
        pnlInteresses.removeAll();
        interessesAtual = p.comercial.getInteresses();
        int tam = interessesAtual.size();
        for (int i = tam - 1; i >= 0; i--) {
            InteressePL pnlInteresse = new InteressePL((Interesse) interessesAtual.get(i), p, df);
            pnlInteresses.add(pnlInteresse);
        }
        pnlInteresses.repaint();
        pnlInteresses.validate();
        jScrollPane1.validate();
    }

    public void atualizarBtDf() {
        if (!df.desfazerVazio()) {
            btDesfazer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/desfazer-ativo_36.png")));
        } else {
            btDesfazer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/desfazer_36.png")));
        }
        if (!df.refazerVazio()) {
            btRefazer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/refazer-ativo_36.png")));
        } else {
            btRefazer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/refazer_36.png")));
        }
    }
}
