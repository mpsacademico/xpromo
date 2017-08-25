package br.com.twtm.gui;

import br.com.twtm.estruturas.Btree;
import br.com.twtm.xpromo.DesfazerRefazer;
import br.com.twtm.xpromo.Interesse;
import br.com.twtm.xpromo.Pessoa;
import java.util.List;

public class PjInteressesPL extends javax.swing.JPanel {

    Btree t;
    private Pessoa p;
    private DesfazerRefazer df;
    private List interessesAtual;

    public PjInteressesPL(Pessoa p) {
        initComponents();
        this.p = p;
        atualizarInteresses();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
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

        jButton1.setBackground(new java.awt.Color(153, 0, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Filtrar");
        jButton1.setBorderPainted(false);
        jButton1.setMaximumSize(new java.awt.Dimension(73, 36));
        jButton1.setMinimumSize(new java.awt.Dimension(73, 36));
        jButton1.setPreferredSize(new java.awt.Dimension(73, 36));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 578, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
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

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    }//GEN-LAST:event_formFocusGained

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        //atualizarBtDf();
    }//GEN-LAST:event_formComponentAdded

    private void pnlInteressesComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_pnlInteressesComponentAdded

    }//GEN-LAST:event_pnlInteressesComponentAdded

    private void pnlInteressesComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_pnlInteressesComponentRemoved

    }//GEN-LAST:event_pnlInteressesComponentRemoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PjCategoriasJD categoriasJD = new PjCategoriasJD(null, true, p);
        categoriasJD.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlInteresses;
    // End of variables declaration//GEN-END:variables

    public void atualizarInteresses() {
        t = new Btree();        
        pnlInteresses.removeAll();
        List amigos = p.perfil.getAmigos();
        for (Object amigo : amigos) {
            Pessoa a = (Pessoa) amigo;
            interessesAtual = a.comercial.getInteresses();
            int tam = interessesAtual.size();
            for (int i = tam - 1; i >= 0; i--) {                
                Interesse it = (Interesse) interessesAtual.get(i);
                t.push(it.getData());             
                if (p.comercial.fc.contem(it.getCategoria())) {
                    InteressePL pnlInteresse = new InteressePL((Interesse) interessesAtual.get(i), a, null);
                    pnlInteresses.add(pnlInteresse);
                }
            }
        }
        pnlInteresses.repaint();
        pnlInteresses.validate();
        jScrollPane1.validate();              
    }
}
