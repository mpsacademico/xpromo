package br.com.twtm.gui;

import br.com.twtm.xpromo.Topico;

public class PeTopicoPL extends javax.swing.JPanel {

    private int ind = 0;
    private Topico t;

    public PeTopicoPL(Topico t) {
        initComponents();
        this.t = t;
        lbTopico.setText(t.getPergunta());
        if (t.getResposta() == null) {
            ind++;
            lbTopico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
            lbTopico.setForeground(new java.awt.Color(0, 0, 153));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTopico = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbTopico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTopico.setText("Tópico");
        lbTopico.setBorderPainted(false);
        lbTopico.setContentAreaFilled(false);
        lbTopico.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTopico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbTopicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbTopico, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTopico, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbTopicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbTopicoActionPerformed
        if (ind == 0) {
            PeTopicoJD to = new PeTopicoJD(null, true, t);
            to.setVisible(true);
        }
    }//GEN-LAST:event_lbTopicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lbTopico;
    // End of variables declaration//GEN-END:variables
}
