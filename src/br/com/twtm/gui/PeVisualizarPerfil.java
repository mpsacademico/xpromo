package br.com.twtm.gui;

import br.com.twtm.xpromo.Pessoa;
import br.com.twtm.xpromo.PessoaFisica;
import br.com.twtm.xpromo.PessoaJuridica;
import java.awt.Color;
import javax.swing.ImageIcon;

public class PeVisualizarPerfil extends javax.swing.JDialog {

    private Pessoa eu;

    public PeVisualizarPerfil(java.awt.Frame parent, boolean modal, Pessoa eu) {
        super(parent, modal);
        initComponents();
        setTitle("Pré-visualização de perfil");
        this.eu = eu;       
        pnlTopo.setBackground(eu.perfil.getCor());        
        int tu = eu.login.getTipoUsuario();        
        if (tu == 0) {
            PessoaFisica pf = (PessoaFisica) eu;
            lbNomeCompleto.setText(pf.getNome());
        } else if (tu == 1 || tu ==2) {
            PessoaJuridica pj = (PessoaJuridica) eu;
            lbNomeCompleto.setText(pj.getNomeFantasia());
        }         
        lbLocal.setText(eu.end.getCidade() + " (" + eu.end.getUf() + ")");
        tplQuemEuSou.setText(eu.perfil.getQuemEuSou());               
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
        jButton1 = new javax.swing.JButton();
        pnlTopo = new javax.swing.JPanel();
        btVoltar = new javax.swing.JButton();
        btAvancar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        pnlInteresses = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Navegador de perfis");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);

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

        lbNomeCompleto.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbNomeCompleto.setText("Nome Completo");

        jButton1.setForeground(new java.awt.Color(203, 52, 56));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/denunciar_16.png"))); // NOI18N
        jButton1.setText("Denunciar");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setEnabled(false);
        jButton1.setFocusPainted(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
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
                .addContainerGap()
                .addComponent(lbFoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbNomeCompleto, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(jButton1))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lbLocal)
                                .addGap(192, 192, 192))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125))))))
        );

        pnlTopo.setBackground(new java.awt.Color(210, 211, 218));
        pnlTopo.setMaximumSize(new java.awt.Dimension(1033, 36));
        pnlTopo.setMinimumSize(new java.awt.Dimension(1033, 36));

        btVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/voltar_32.png"))); // NOI18N
        btVoltar.setBorderPainted(false);
        btVoltar.setContentAreaFilled(false);
        btVoltar.setFocusPainted(false);
        btVoltar.setMaximumSize(new java.awt.Dimension(36, 36));
        btVoltar.setMinimumSize(new java.awt.Dimension(36, 36));
        btVoltar.setPreferredSize(new java.awt.Dimension(36, 36));
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btAvancar.setBackground(new java.awt.Color(255, 255, 255));
        btAvancar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/avancar_32.png"))); // NOI18N
        btAvancar.setBorderPainted(false);
        btAvancar.setContentAreaFilled(false);
        btAvancar.setFocusPainted(false);
        btAvancar.setMaximumSize(new java.awt.Dimension(36, 36));
        btAvancar.setMinimumSize(new java.awt.Dimension(36, 36));
        btAvancar.setPreferredSize(new java.awt.Dimension(36, 36));
        btAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAvancarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTopoLayout = new javax.swing.GroupLayout(pnlTopo);
        pnlTopo.setLayout(pnlTopoLayout);
        pnlTopoLayout.setHorizontalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlTopoLayout.setVerticalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGroup(pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 211, 218)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
        );

        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 211, 218)));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlInteresses.setBackground(new java.awt.Color(255, 255, 255));
        pnlInteresses.setLayout(new javax.swing.BoxLayout(pnlInteresses, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane3.setViewportView(pnlInteresses);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(pnlTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 218, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAvancarActionPerformed

    }//GEN-LAST:event_btAvancarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        
    }//GEN-LAST:event_btVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAvancar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbFoto;
    private javax.swing.JLabel lbLocal;
    private javax.swing.JLabel lbNomeCompleto;
    private javax.swing.JPanel pnlInteresses;
    private javax.swing.JPanel pnlTopo;
    private javax.swing.JTextPane tplQuemEuSou;
    // End of variables declaration//GEN-END:variables

    public void atualizarImagem(ImageIcon i){
        lbFoto.setIcon(i);        
    }
    public void atualizarTexto(String t){
        tplQuemEuSou.setText(t);
    }
    public void atualizarCor(Color c){
        pnlTopo.setBackground(c);
    }
}
