package br.com.twtm.gui;

import br.com.twtm.xpromo.Pessoa;
import javax.swing.JPanel;

public class PeCorPerfilJD extends javax.swing.JDialog {
    
    private Pessoa p;
    private JPanel pnlTopo;

    public PeCorPerfilJD(java.awt.Frame parent, boolean modal, Pessoa p, JPanel pnlTopo) {
        super(parent, modal);
        initComponents();
        this.p=p;
        this.pnlTopo=pnlTopo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jColorChooser1 = new javax.swing.JColorChooser();
        btOk = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Escolha a cor de seu perfil");
        setResizable(false);

        jColorChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jColorChooser1MouseClicked(evt);
            }
        });

        btOk.setBackground(new java.awt.Color(153, 0, 255));
        btOk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btOk.setForeground(new java.awt.Color(255, 255, 255));
        btOk.setText("Salvar");
        btOk.setMaximumSize(new java.awt.Dimension(91, 25));
        btOk.setMinimumSize(new java.awt.Dimension(91, 25));
        btOk.setPreferredSize(new java.awt.Dimension(91, 25));
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });

        btCancelar.setBackground(new java.awt.Color(153, 153, 153));
        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
        p.perfil.setCor(jColorChooser1.getColor());
        pnlTopo.setBackground(jColorChooser1.getColor());
        this.dispose();
    }//GEN-LAST:event_btOkActionPerformed

    private void jColorChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jColorChooser1MouseClicked
        
    }//GEN-LAST:event_jColorChooser1MouseClicked

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btOk;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
