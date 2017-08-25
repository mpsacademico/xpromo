package br.com.twtm.gui;

import br.com.twtm.xpromo.Pessoa;

public class PeMsgTourJD extends javax.swing.JDialog {

    private Pessoa p;

    public PeMsgTourJD(java.awt.Frame parent, boolean modal, Pessoa p) {
        super(parent, modal);
        initComponents();
        this.p = p;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundo = new javax.swing.JPanel();
        pnlTopo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbAdvertencia = new javax.swing.JLabel();
        spnl01 = new javax.swing.JScrollPane();
        tpnlAviso = new javax.swing.JTextPane();
        btEntendi = new javax.swing.JButton();
        btNao = new javax.swing.JButton();
        chbVer = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tour pelo XPROMO");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);

        pnlFundo.setBackground(new java.awt.Color(255, 255, 255));

        pnlTopo.setBackground(new java.awt.Color(0, 51, 204));

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setText("Bem-vindo ao XPROMO!!!");

        javax.swing.GroupLayout pnlTopoLayout = new javax.swing.GroupLayout(pnlTopo);
        pnlTopo.setLayout(pnlTopoLayout);
        pnlTopoLayout.setHorizontalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addContainerGap(262, Short.MAX_VALUE))
        );
        pnlTopoLayout.setVerticalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopoLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lbTitulo)
                .addContainerGap())
        );

        lbAdvertencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/balao_128.png"))); // NOI18N

        spnl01.setBorder(null);

        tpnlAviso.setEditable(false);
        tpnlAviso.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tpnlAviso.setText("Aprenda mais sobre o XPROMO. Deseja fazer um tour pelas principais funcionalidades?");
        spnl01.setViewportView(tpnlAviso);

        btEntendi.setBackground(new java.awt.Color(255, 255, 255));
        btEntendi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btEntendi.setForeground(new java.awt.Color(0, 51, 204));
        btEntendi.setText("Sim");
        btEntendi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntendiActionPerformed(evt);
            }
        });

        btNao.setBackground(new java.awt.Color(255, 255, 255));
        btNao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btNao.setForeground(new java.awt.Color(51, 51, 51));
        btNao.setText("Não");
        btNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNaoActionPerformed(evt);
            }
        });

        chbVer.setBackground(new java.awt.Color(255, 255, 255));
        chbVer.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        chbVer.setText("Não ver esta mensagem novamente");

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addComponent(chbVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btNao, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEntendi, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addComponent(lbAdvertencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnl01, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addComponent(pnlTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(lbAdvertencia))
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(spnl01)))
                .addGap(18, 18, 18)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btEntendi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btNao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chbVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btEntendiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntendiActionPerformed
        /*LoginJF f = new LoginJF();
         f.setVisible(true);*/
        salvar();
        PeTourJD t = new PeTourJD(null, true);
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_btEntendiActionPerformed

    private void btNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNaoActionPerformed
        salvar();
        this.dispose();
    }//GEN-LAST:event_btNaoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntendi;
    private javax.swing.JButton btNao;
    private javax.swing.JCheckBox chbVer;
    private javax.swing.JLabel lbAdvertencia;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPanel pnlTopo;
    private javax.swing.JScrollPane spnl01;
    private javax.swing.JTextPane tpnlAviso;
    // End of variables declaration//GEN-END:variables

    public void salvar() {
        if (chbVer.isSelected() == true) {
            p.perfil.setVer(false);
        }
    }

}
