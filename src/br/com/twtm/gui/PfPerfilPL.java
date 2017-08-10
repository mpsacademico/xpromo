package br.com.twtm.gui;

import br.com.twtm.xpromo.Pessoa;
import br.com.twtm.xpromo.PessoaFisica;
import br.com.twtm.xpromo.VoltarAvancar;
import java.util.List;
import javax.swing.JPanel;

public class PfPerfilPL extends javax.swing.JPanel {

    private Pessoa pf, eu;
    private VoltarAvancar va;
    private JPanel pnl;

    public PfPerfilPL(PessoaFisica pf, Pessoa eu, VoltarAvancar va, JPanel pnl, JPanel topo) {
        initComponents();
        this.pf = pf;
        this.eu = eu;
        this.va = va;
        this.pnl = pnl;        
        lbNomeCompleto.setText(pf.getNome());
        lbLocal.setText(pf.end.getCidade() + " (" + pf.end.getUf() + ")");
        tplQuemEuSou.setText(pf.perfil.getQuemEuSou());
        lbFoto.setIcon(pf.perfil.getIcone());
        topo.setBackground(pf.perfil.getCor());
        List amigos = pf.perfil.getAmigos();
        for (Object amigo : amigos) {
            PeFaceAmigoPL pl = new PeFaceAmigoPL((Pessoa) amigo, eu, pf, va);
            pl.upPainel(pnl, topo);
            pnlAmigos.add(pl);
        }
        pnlAmigos.repaint();
        lbQuantAmigos.setText("Amigos (" + amigos.size() + ")");
        pnlInteresses.removeAll();
        List interessesAtual = pf.comercial.getInteresses();
        int tam = interessesAtual.size();
        System.out.println("tam " + tam);
        for (int i = tam - 1; i >= 0; i--) {
            InteressePL pnlInteresse = new InteressePL((br.com.twtm.xpromo.Interesse) interessesAtual.get(i), pf, null);
            pnlInteresses.add(pnlInteresse);
        }
        /*for (int i = tam - 1; i >= 0; i--) {
         PeDesejoPL pdpl = new PeDesejoPL();
         pnlDesejos.add(pdpl);            
         }*/
        pnlInteresses.repaint();
        pnlInteresses.validate();
        jScrollPane3.validate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tplQuemEuSou = new javax.swing.JTextPane();
        lbLocal = new javax.swing.JLabel();
        lbFoto = new javax.swing.JLabel();
        lbNomeCompleto = new javax.swing.JLabel();
        btDenunciar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnlAmigos = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lbQuantAmigos = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        pnlInteresses = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(1033, 602));
        setMinimumSize(new java.awt.Dimension(1033, 602));
        setPreferredSize(new java.awt.Dimension(1033, 602));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(233, 234, 237));

        jScrollPane1.setBorder(null);

        tplQuemEuSou.setEditable(false);
        tplQuemEuSou.setBackground(new java.awt.Color(233, 234, 237));
        tplQuemEuSou.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(233, 234, 237)));
        tplQuemEuSou.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tplQuemEuSou.setToolTipText("");
        tplQuemEuSou.setCaretColor(new java.awt.Color(233, 234, 237));
        jScrollPane1.setViewportView(tplQuemEuSou);

        lbLocal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbLocal.setText("Localidade");

        lbFoto.setForeground(new java.awt.Color(255, 255, 255));
        lbFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/perfil_128.png"))); // NOI18N
        lbFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbNomeCompleto.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbNomeCompleto.setText("Nome Completo");

        btDenunciar.setForeground(new java.awt.Color(203, 52, 56));
        btDenunciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/denunciar_16.png"))); // NOI18N
        btDenunciar.setText("Denunciar");
        btDenunciar.setBorderPainted(false);
        btDenunciar.setContentAreaFilled(false);
        btDenunciar.setFocusPainted(false);
        btDenunciar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btDenunciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDenunciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbNomeCompleto, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btDenunciar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbFoto)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNomeCompleto)
                            .addComponent(btDenunciar))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lbLocal)
                                .addGap(192, 192, 192))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125))))))
        );

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 211, 218)));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        pnlAmigos.setBackground(new java.awt.Color(233, 234, 237));
        pnlAmigos.setMaximumSize(new java.awt.Dimension(228, 228));
        pnlAmigos.setMinimumSize(new java.awt.Dimension(228, 228));
        pnlAmigos.setPreferredSize(new java.awt.Dimension(228, 228));
        pnlAmigos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jScrollPane2.setViewportView(pnlAmigos);

        jPanel4.setBackground(new java.awt.Color(210, 211, 218));

        lbQuantAmigos.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbQuantAmigos.setText("Amigos (XXX)");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(lbQuantAmigos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(lbQuantAmigos))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 211, 218)));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlInteresses.setBackground(new java.awt.Color(255, 255, 255));
        pnlInteresses.setLayout(new javax.swing.BoxLayout(pnlInteresses, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane3.setViewportView(pnlInteresses);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 225, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
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

    private void btDenunciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDenunciarActionPerformed
        PeDenunciarUsuarioJD d = new PeDenunciarUsuarioJD(null, true, pf, eu);
        d.setVisible(true);
    }//GEN-LAST:event_btDenunciarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDenunciar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbFoto;
    private javax.swing.JLabel lbLocal;
    private javax.swing.JLabel lbNomeCompleto;
    private javax.swing.JLabel lbQuantAmigos;
    private javax.swing.JPanel pnlAmigos;
    private javax.swing.JPanel pnlInteresses;
    private javax.swing.JTextPane tplQuemEuSou;
    // End of variables declaration//GEN-END:variables

}
