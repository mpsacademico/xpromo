package br.com.twtm.gui;

import br.com.twtm.estruturas.Opinioes;
import br.com.twtm.xpromo.Login;
import br.com.twtm.xpromo.Opiniao;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class PeOpiniaoJD extends javax.swing.JDialog {

    private Login login;

    public PeOpiniaoJD(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        pnlFundo = new javax.swing.JPanel();
        btEnviar = new javax.swing.JButton();
        pnlCabecalho = new javax.swing.JPanel();
        lbMenino = new javax.swing.JLabel();
        lbXpromo = new javax.swing.JLabel();
        lbOpiniao = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        lbDeSuaOpiniao = new javax.swing.JLabel();
        spnl01 = new javax.swing.JScrollPane();
        txaOpiniao = new javax.swing.JTextArea();
        lbInfo = new javax.swing.JLabel();

        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Opinião");
        setResizable(false);

        pnlFundo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFundo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btEnviar.setBackground(new java.awt.Color(153, 0, 255));
        btEnviar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btEnviar.setText("Enviar");
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });

        pnlCabecalho.setBackground(new java.awt.Color(233, 234, 237));

        lbMenino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/opiniao_72.png"))); // NOI18N

        lbXpromo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbXpromo.setText("XPROMO");

        lbOpiniao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbOpiniao.setText("Opinião");

        javax.swing.GroupLayout pnlCabecalhoLayout = new javax.swing.GroupLayout(pnlCabecalho);
        pnlCabecalho.setLayout(pnlCabecalhoLayout);
        pnlCabecalhoLayout.setHorizontalGroup(
            pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbMenino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbXpromo)
                    .addComponent(lbOpiniao))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        pnlCabecalhoLayout.setVerticalGroup(
            pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCabecalhoLayout.createSequentialGroup()
                        .addComponent(lbXpromo)
                        .addGap(0, 0, 0)
                        .addComponent(lbOpiniao))
                    .addComponent(lbMenino))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btCancelar.setBackground(new java.awt.Color(153, 153, 153));
        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        lbDeSuaOpiniao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbDeSuaOpiniao.setText("Dê sua opinião! Envie sugestões, críticas e elogios:");

        spnl01.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txaOpiniao.setColumns(20);
        txaOpiniao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txaOpiniao.setLineWrap(true);
        txaOpiniao.setRows(5);
        txaOpiniao.setWrapStyleWord(true);
        spnl01.setViewportView(txaOpiniao);

        lbInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/info-azul_16.png"))); // NOI18N
        lbInfo.setToolTipText("Sua identidade será mantida em sigilo!");

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCabecalho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnl01)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFundoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFundoLayout.createSequentialGroup()
                        .addComponent(lbDeSuaOpiniao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbInfo)))
                .addContainerGap())
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFundoLayout.createSequentialGroup()
                .addComponent(pnlCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDeSuaOpiniao)
                    .addComponent(lbInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnl01, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEnviar)
                    .addComponent(btCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed
        if (!txaOpiniao.getText().equals("")) {
            this.cadastrar();
        } else {
            JOptionPane.showMessageDialog(null, "O campo não foi preenchido!", "XPROMO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btEnviarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        if (!txaOpiniao.getText().equals("")) {
            int op = JOptionPane.showConfirmDialog(null, "O texto digitado será perdido!\nDeseja enviar a sua opinião?", "XPROMO", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (op == 0) {
                this.cadastrar();
            } else {
                this.dispose();
            }
        } else {
            this.dispose();
        }
    }//GEN-LAST:event_btCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEnviar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lbDeSuaOpiniao;
    private javax.swing.JLabel lbInfo;
    private javax.swing.JLabel lbMenino;
    private javax.swing.JLabel lbOpiniao;
    private javax.swing.JLabel lbXpromo;
    private javax.swing.JPanel pnlCabecalho;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JScrollPane spnl01;
    private javax.swing.JTextArea txaOpiniao;
    // End of variables declaration//GEN-END:variables

    private void cadastrar() {
        Calendar c = Calendar.getInstance();
        Opiniao o = new Opiniao(txaOpiniao.getText(), c.getTime(), false);
        Opinioes.cadastrar(o);
        JOptionPane.showMessageDialog(null, "Seu feedback nos ajudará a melhorar!", "XPROMO", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }

}
