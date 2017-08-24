package br.com.twtm.gui;

import br.com.twtm.estruturas.Ajuda;
import br.com.twtm.xpromo.Topico;
import java.util.List;

public class PeAjudaJD extends javax.swing.JDialog {

    public PeAjudaJD(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        List ts = Ajuda.getTopicos();
        for (Object t : ts) {
            PeTopicoPL l = new PeTopicoPL((Topico) t);
            pnlTopicos.add(l);            
        }
        pnlTopicos.repaint();
        pnlTopicos.validate();
        jScrollPane1.validate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundo = new javax.swing.JPanel();
        pnlCabecalho = new javax.swing.JPanel();
        lbCadeado = new javax.swing.JLabel();
        lbXpromo = new javax.swing.JLabel();
        lbAcesso = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlTopicos = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajuda do XPROMO");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMaximumSize(new java.awt.Dimension(938, 622));
        setMinimumSize(new java.awt.Dimension(938, 622));
        setPreferredSize(new java.awt.Dimension(938, 622));
        setResizable(false);

        pnlFundo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFundo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        pnlCabecalho.setBackground(new java.awt.Color(233, 234, 237));

        lbCadeado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/ajuda_72.png"))); // NOI18N

        lbXpromo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbXpromo.setText("XPROMO");

        lbAcesso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbAcesso.setText("Ajuda");

        javax.swing.GroupLayout pnlCabecalhoLayout = new javax.swing.GroupLayout(pnlCabecalho);
        pnlCabecalho.setLayout(pnlCabecalhoLayout);
        pnlCabecalhoLayout.setHorizontalGroup(
            pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCadeado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbXpromo)
                    .addComponent(lbAcesso))
                .addContainerGap(542, Short.MAX_VALUE))
        );
        pnlCabecalhoLayout.setVerticalGroup(
            pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCabecalhoLayout.createSequentialGroup()
                        .addComponent(lbXpromo)
                        .addGap(0, 0, 0)
                        .addComponent(lbAcesso))
                    .addComponent(lbCadeado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlTopicos.setBackground(new java.awt.Color(255, 255, 255));
        pnlTopicos.setLayout(new javax.swing.BoxLayout(pnlTopicos, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(pnlTopicos);

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addComponent(pnlCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAcesso;
    private javax.swing.JLabel lbCadeado;
    private javax.swing.JLabel lbXpromo;
    private javax.swing.JPanel pnlCabecalho;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPanel pnlTopicos;
    // End of variables declaration//GEN-END:variables
}
