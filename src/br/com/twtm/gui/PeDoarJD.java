package br.com.twtm.gui;

import br.com.twtm.xpromo.Doacao;
import br.com.twtm.xpromo.EntFilantropica;
import br.com.twtm.xpromo.Pessoa;

public class PeDoarJD extends javax.swing.JDialog {

    private Pessoa p, eu;

    public PeDoarJD(java.awt.Frame parent, boolean modal, Pessoa p, Pessoa eu) {
        super(parent, modal);
        initComponents();
        this.p = p;
        this.eu = eu;
        lbAviso.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgItensDenuncia = new javax.swing.ButtonGroup();
        pnlFundo = new javax.swing.JPanel();
        pnlTopo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        btDoar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tfValor = new javax.swing.JTextField();
        lbAviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Realizar doação");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);

        pnlFundo.setBackground(new java.awt.Color(255, 255, 255));

        pnlTopo.setBackground(new java.awt.Color(233, 234, 237));

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/coracao_64.png"))); // NOI18N
        lbTitulo.setText("Qual o valor da doação?");

        javax.swing.GroupLayout pnlTopoLayout = new javax.swing.GroupLayout(pnlTopo);
        pnlTopo.setLayout(pnlTopoLayout);
        pnlTopoLayout.setHorizontalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTopoLayout.setVerticalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lbTitulo)
                .addGap(5, 5, 5))
        );

        btDoar.setBackground(new java.awt.Color(51, 102, 255));
        btDoar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btDoar.setForeground(new java.awt.Color(255, 255, 255));
        btDoar.setText("Doar");
        btDoar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDoarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tfValor.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        tfValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        lbAviso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbAviso.setForeground(new java.awt.Color(255, 0, 0));
        lbAviso.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbAviso.setText("Insira um valor positivo e sem centavos!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfValor)
            .addComponent(lbAviso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbAviso)
                .addGap(10, 10, 10))
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
                        .addComponent(btDoar)))
                .addContainerGap())
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addComponent(pnlTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btDoar)
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

    private void btDoarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDoarActionPerformed
        try {
            int valor = Integer.parseInt(tfValor.getText());
            if (valor <= 0) {
                throw new Exception();
            }
            Doacao d = new Doacao(eu, (EntFilantropica) p, (double) valor);
            PeDoacaoJD telaDoacao = new PeDoacaoJD(null, true, d);
            this.dispose();
            telaDoacao.setVisible(true);            
        } catch (Exception ex) {
            lbAviso.setText("Insira um valor positivo e sem centavos!");
        }
    }//GEN-LAST:event_btDoarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDoar;
    private javax.swing.ButtonGroup btgItensDenuncia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAviso;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPanel pnlTopo;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
