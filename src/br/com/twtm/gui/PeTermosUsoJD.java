package br.com.twtm.gui;

import java.awt.Point;

public class PeTermosUsoJD extends javax.swing.JDialog {

    public PeTermosUsoJD(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jScrollPane1.getViewport().setViewPosition(new Point(1, 1));
        jScrollPane1.revalidate();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tplTermosUso = new javax.swing.JTextPane();
        btEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Termos de Uso Xpromo");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(233, 234, 237));

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setWheelScrollingEnabled(false);

        tplTermosUso.setEditable(false);
        tplTermosUso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(233, 234, 237)));
        tplTermosUso.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        tplTermosUso.setText("Termos de Uso \n-------------------------------------------\nAo usar ou acessar o Sistema XPROMO, você concorda que teremos acesso à seus conteúdos e informações, bem como suas eventuais alterações. Por se tratar de um protótipo, não asseguramos a confidencialidade dos dados cadastrados, visto que estes dados devem ser fictícios. \n\nTermos para a Exclusão de um Usuário \n-------------------------------------------\nNossa missão é fornecer às pessoas o poder de compra e venda de produtos com total segurança. Para isso, desenvolvemos um conjunto de Termos sobre o que não é permitido na rede social XPromo, que lhe ajudará a entender os tipos de conteúdos ou perfis que podem ser denunciados e removidos. \n \nNão é permitido\n-------------------------------------------\nA venda de qualquer tipo de droga; \nCriação de organizações falsas ou terroristas; \nQualquer tipo ameaça, bullying ou assédio com os outras pessoas na rede; \nConteúdos sexualmente explícitos; \nComportamento violento ou perigoso;");
        tplTermosUso.setToolTipText("");
        tplTermosUso.setCaretColor(new java.awt.Color(233, 234, 237));
        jScrollPane1.setViewportView(tplTermosUso);

        btEntrar.setBackground(new java.awt.Color(153, 0, 255));
        btEntrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btEntrar.setText("Ok");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 531, Short.MAX_VALUE)
                        .addComponent(btEntrar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btEntrar)
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

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btEntrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane tplTermosUso;
    // End of variables declaration//GEN-END:variables
}
