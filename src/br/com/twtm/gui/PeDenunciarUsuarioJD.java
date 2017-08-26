package br.com.twtm.gui;

import br.com.twtm.xpromo.Pessoa;
import java.awt.Color;
import javax.swing.JOptionPane;

public class PeDenunciarUsuarioJD extends javax.swing.JDialog {

    private Pessoa p, eu;

    public PeDenunciarUsuarioJD(java.awt.Frame parent, boolean modal, Pessoa p, Pessoa eu) {
        super(parent, modal);
        initComponents();
        this.p = p;
        this.eu = eu;
        if (p.perfil.jaDenunciou(eu)) {
            lbTitulo.setText("Denúncia já registrada!");
            lbTitulo.setForeground(new Color(255, 51, 51));
            btDenunciar.setEnabled(false);
            rbt1.setEnabled(false);
            rbt2.setEnabled(false);
            rbt3.setEnabled(false);
            rbt4.setEnabled(false);
            rbt5.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgItensDenuncia = new javax.swing.ButtonGroup();
        pnlFundo = new javax.swing.JPanel();
        pnlTopo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        btDenunciar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rbt1 = new javax.swing.JRadioButton();
        rbt2 = new javax.swing.JRadioButton();
        rbt3 = new javax.swing.JRadioButton();
        rbt4 = new javax.swing.JRadioButton();
        rbt5 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Denunciar usuário");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);

        pnlFundo.setBackground(new java.awt.Color(255, 255, 255));

        pnlTopo.setBackground(new java.awt.Color(233, 234, 237));

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/denuncia_55.png"))); // NOI18N
        lbTitulo.setText("Conte-nos o que aconteceu!");

        javax.swing.GroupLayout pnlTopoLayout = new javax.swing.GroupLayout(pnlTopo);
        pnlTopo.setLayout(pnlTopoLayout);
        pnlTopoLayout.setHorizontalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTopoLayout.setVerticalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lbTitulo)
                .addGap(5, 5, 5))
        );

        btDenunciar.setBackground(new java.awt.Color(255, 51, 51));
        btDenunciar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btDenunciar.setForeground(new java.awt.Color(255, 255, 255));
        btDenunciar.setText("Denunciar");
        btDenunciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDenunciarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        rbt1.setBackground(new java.awt.Color(255, 255, 255));
        btgItensDenuncia.add(rbt1);
        rbt1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rbt1.setText("Conta possivelmente invadida");

        rbt2.setBackground(new java.awt.Color(255, 255, 255));
        btgItensDenuncia.add(rbt2);
        rbt2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rbt2.setText("Discurso de ódio ou apologia ao crime");

        rbt3.setBackground(new java.awt.Color(255, 255, 255));
        btgItensDenuncia.add(rbt3);
        rbt3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rbt3.setText("Spam ou fraude");

        rbt4.setBackground(new java.awt.Color(255, 255, 255));
        btgItensDenuncia.add(rbt4);
        rbt4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rbt4.setText("Comportamento violento ou perigoso");

        rbt5.setBackground(new java.awt.Color(255, 255, 255));
        btgItensDenuncia.add(rbt5);
        rbt5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rbt5.setText("Conteúdo sexualmente explícito");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbt1)
                    .addComponent(rbt2)
                    .addComponent(rbt3)
                    .addComponent(rbt4)
                    .addComponent(rbt5))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbt2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbt3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbt4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbt5)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btDenunciar)))
                .addContainerGap())
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addComponent(pnlTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btDenunciar)
                .addContainerGap())
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

    private void btDenunciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDenunciarActionPerformed
        int item = 0;
        if (btgItensDenuncia.getSelection() != null) {
            if (rbt1.isSelected() == true) {
                item = 1;
            } else if (rbt2.isSelected() == true) {
                item = 2;
            } else if (rbt3.isSelected() == true) {
                item = 3;
            } else if (rbt4.isSelected() == true) {
                item = 4;
            } else if (rbt5.isSelected() == true) {
                item = 5;
            }
            p.perfil.addDenuncia(item, p, eu);
            JOptionPane.showMessageDialog(null, "Sua denúncia foi registrada!", "XPROMO", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Escolha algum item na lista!", "XPROMO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btDenunciarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDenunciar;
    private javax.swing.ButtonGroup btgItensDenuncia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPanel pnlTopo;
    private javax.swing.JRadioButton rbt1;
    private javax.swing.JRadioButton rbt2;
    private javax.swing.JRadioButton rbt3;
    private javax.swing.JRadioButton rbt4;
    private javax.swing.JRadioButton rbt5;
    // End of variables declaration//GEN-END:variables
}
