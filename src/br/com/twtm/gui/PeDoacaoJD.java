package br.com.twtm.gui;

import br.com.twtm.xpromo.Doacao;
import javax.swing.ImageIcon;

public class PeDoacaoJD extends javax.swing.JDialog {

    public PeDoacaoJD(java.awt.Frame parent, boolean modal, Doacao doacao) {
        super(parent, modal);
        initComponents();
        ImageIcon iconeDoador = new ImageIcon(getClass().getResource("/br/com/twtm/dominio/imagens/" + doacao.getDoador().perfil.getFoto() + ".png"));  
        ImageIcon iconeDonatario = new ImageIcon(getClass().getResource("/br/com/twtm/dominio/imagens/" + doacao.getDonatario().perfil.getFoto() + ".png"));        
        btVoce.setIcon(iconeDoador);
        btEntidade.setIcon(iconeDonatario);
        lbAgradecimento.setText(doacao.getDonatario().getNomeFantasia()+" agradece pelos "+doacao.getValor()+" reais");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundo = new javax.swing.JPanel();
        lbParabens = new javax.swing.JLabel();
        btVoce = new javax.swing.JButton();
        btEntidade = new javax.swing.JButton();
        lbAgradecimento = new javax.swing.JLabel();
        lbCoracoes = new javax.swing.JLabel();
        btConcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Concluir doação");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);

        pnlFundo.setBackground(new java.awt.Color(255, 255, 255));

        lbParabens.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        lbParabens.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbParabens.setText("Parabéns! Você realizou uma boa ação!");

        btVoce.setMaximumSize(new java.awt.Dimension(128, 128));
        btVoce.setMinimumSize(new java.awt.Dimension(128, 128));
        btVoce.setPreferredSize(new java.awt.Dimension(128, 128));

        btEntidade.setMaximumSize(new java.awt.Dimension(128, 128));
        btEntidade.setMinimumSize(new java.awt.Dimension(128, 128));
        btEntidade.setPreferredSize(new java.awt.Dimension(128, 128));

        lbAgradecimento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbAgradecimento.setForeground(new java.awt.Color(51, 51, 51));
        lbAgradecimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAgradecimento.setText("Nome fantasia completo da entidade filantrópica agradece pelos 99.999.99");

        lbCoracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/coracoes-doacao.gif"))); // NOI18N
        lbCoracoes.setMaximumSize(new java.awt.Dimension(343, 128));
        lbCoracoes.setMinimumSize(new java.awt.Dimension(343, 128));
        lbCoracoes.setPreferredSize(new java.awt.Dimension(343, 128));

        btConcluir.setBackground(new java.awt.Color(153, 0, 255));
        btConcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btConcluir.setForeground(new java.awt.Color(255, 255, 255));
        btConcluir.setText("Concluir");
        btConcluir.setMaximumSize(new java.awt.Dimension(91, 25));
        btConcluir.setMinimumSize(new java.awt.Dimension(91, 25));
        btConcluir.setPreferredSize(new java.awt.Dimension(91, 25));
        btConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFundoLayout.createSequentialGroup()
                        .addGap(0, 75, Short.MAX_VALUE)
                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFundoLayout.createSequentialGroup()
                                .addComponent(btVoce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbCoracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btEntidade, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFundoLayout.createSequentialGroup()
                                .addComponent(btConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbParabens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbAgradecimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbParabens)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbAgradecimento)
                .addGap(105, 105, 105)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btVoce, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btEntidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbCoracoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(btConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConcluirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btConcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConcluir;
    private javax.swing.JButton btEntidade;
    private javax.swing.JButton btVoce;
    private javax.swing.JLabel lbAgradecimento;
    private javax.swing.JLabel lbCoracoes;
    private javax.swing.JLabel lbParabens;
    private javax.swing.JPanel pnlFundo;
    // End of variables declaration//GEN-END:variables
}
