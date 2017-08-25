package br.com.twtm.gui;

import br.com.twtm.xpromo.Oferta;
import br.com.twtm.xpromo.Pessoa;
import br.com.twtm.xpromo.PessoaJuridica;
import java.util.List;

public class PjOfertasPL extends javax.swing.JPanel {

    private Pessoa p;
    private List ofertas;

    public PjOfertasPL(Pessoa p) {
        initComponents();
        this.p = p;
        atualizarOfertas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btNovaOferta = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btOfAmigos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlOfertas = new javax.swing.JPanel();

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
        jLabel1.setText("Ofertas");

        btNovaOferta.setBackground(new java.awt.Color(255, 255, 255));
        btNovaOferta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/novo_32.png"))); // NOI18N
        btNovaOferta.setBorderPainted(false);
        btNovaOferta.setContentAreaFilled(false);
        btNovaOferta.setMaximumSize(new java.awt.Dimension(36, 36));
        btNovaOferta.setMinimumSize(new java.awt.Dimension(36, 36));
        btNovaOferta.setPreferredSize(new java.awt.Dimension(36, 36));
        btNovaOferta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovaOfertaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 0, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Mercadorias");
        jButton1.setBorderPainted(false);
        jButton1.setMaximumSize(new java.awt.Dimension(73, 36));
        jButton1.setMinimumSize(new java.awt.Dimension(73, 36));
        jButton1.setPreferredSize(new java.awt.Dimension(73, 36));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btOfAmigos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btOfAmigos.setForeground(new java.awt.Color(204, 51, 0));
        btOfAmigos.setText("Ofertas de amigos");
        btOfAmigos.setBorderPainted(false);
        btOfAmigos.setContentAreaFilled(false);
        btOfAmigos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btOfAmigos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 402, Short.MAX_VALUE)
                .addComponent(btNovaOferta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btNovaOferta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btOfAmigos, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jScrollPane1.setBorder(null);
        jScrollPane1.setMinimumSize(new java.awt.Dimension(0, 511));

        pnlOfertas.setBackground(new java.awt.Color(233, 234, 237));
        pnlOfertas.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                pnlOfertasComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                pnlOfertasComponentRemoved(evt);
            }
        });
        pnlOfertas.setLayout(new javax.swing.BoxLayout(pnlOfertas, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(pnlOfertas);

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

    private void btNovaOfertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovaOfertaActionPerformed
        PjOfertaJD t = new PjOfertaJD(null, true, (PessoaJuridica) p);
        t.setVisible(true);
        atualizarOfertas();
    }//GEN-LAST:event_btNovaOfertaActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        atualizarOfertas();
    }//GEN-LAST:event_formFocusGained

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded

    }//GEN-LAST:event_formComponentAdded

    private void pnlOfertasComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_pnlOfertasComponentAdded

    }//GEN-LAST:event_pnlOfertasComponentAdded

    private void pnlOfertasComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_pnlOfertasComponentRemoved

    }//GEN-LAST:event_pnlOfertasComponentRemoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PjMercadoriasJD t = new PjMercadoriasJD(null, true, (PessoaJuridica) p);
        t.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNovaOferta;
    private javax.swing.JButton btOfAmigos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlOfertas;
    // End of variables declaration//GEN-END:variables

    public void atualizarOfertas() {
        pnlOfertas.removeAll();
        ofertas = p.comercial.getOfertas();
        int tam = ofertas.size();
        for (int i = tam - 1; i >= 0; i--) {
            PjOfertaPL pnlOferta = new PjOfertaPL(p, (Oferta) ofertas.get(i));
            pnlOfertas.add(pnlOferta);
        }
        pnlOfertas.repaint();
        pnlOfertas.validate();
        jScrollPane1.validate();
    }
}
