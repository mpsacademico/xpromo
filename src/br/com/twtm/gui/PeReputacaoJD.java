package br.com.twtm.gui;

import br.com.twtm.xpromo.Pessoa;
import javax.swing.JOptionPane;

public class PeReputacaoJD extends javax.swing.JDialog {

    private Pessoa p, eu;

    public PeReputacaoJD(java.awt.Frame parent, boolean modal, Pessoa p, Pessoa eu) {
        super(parent, modal);
        initComponents();
        this.p = p;
        this.eu = eu;
        pintarBarras();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgItensDenuncia = new javax.swing.ButtonGroup();
        pnlFundo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pgb1 = new javax.swing.JProgressBar();
        pgb2 = new javax.swing.JProgressBar();
        pgb3 = new javax.swing.JProgressBar();
        pgb4 = new javax.swing.JProgressBar();
        pgb5 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbMedia = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        bt1 = new javax.swing.JLabel();
        bt2 = new javax.swing.JLabel();
        bt3 = new javax.swing.JLabel();
        bt4 = new javax.swing.JLabel();
        bt5 = new javax.swing.JLabel();
        lbQuant = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reputação do vendedor");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        pnlFundo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFundo.setMaximumSize(new java.awt.Dimension(684, 240));
        pnlFundo.setMinimumSize(new java.awt.Dimension(684, 240));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pgb1.setBackground(new java.awt.Color(255, 255, 255));
        pgb1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pgb1.setForeground(new java.awt.Color(245, 196, 169));
        pgb1.setBorderPainted(false);

        pgb2.setBackground(new java.awt.Color(255, 255, 255));
        pgb2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pgb2.setForeground(new java.awt.Color(240, 163, 120));
        pgb2.setBorderPainted(false);

        pgb3.setBackground(new java.awt.Color(255, 255, 255));
        pgb3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pgb3.setForeground(new java.awt.Color(237, 142, 89));
        pgb3.setBorderPainted(false);

        pgb4.setBackground(new java.awt.Color(255, 255, 255));
        pgb4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pgb4.setForeground(new java.awt.Color(235, 127, 67));
        pgb4.setBorderPainted(false);

        pgb5.setBackground(new java.awt.Color(255, 255, 255));
        pgb5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pgb5.setForeground(new java.awt.Color(233, 111, 43));
        pgb5.setBorderPainted(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star1-m_24.png"))); // NOI18N
        jLabel1.setText(" 5 ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star1-f_24.png"))); // NOI18N
        jLabel2.setText(" 4 ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star1-f_24.png"))); // NOI18N
        jLabel3.setText(" 3 ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star1-f_24.png"))); // NOI18N
        jLabel4.setText(" 2 ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star1-m_24.png"))); // NOI18N
        jLabel5.setText(" 1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pgb1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pgb2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pgb3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pgb4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pgb5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(pgb1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, 0)
                                        .addComponent(pgb2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addComponent(pgb3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(pgb4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pgb5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbMedia.setFont(new java.awt.Font("Segoe UI Light", 0, 110)); // NOI18N
        lbMedia.setForeground(new java.awt.Color(51, 51, 51));
        lbMedia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMedia.setText("0");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star1-m_32.png"))); // NOI18N

        bt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star1-m_32.png"))); // NOI18N

        bt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star1-m_32.png"))); // NOI18N

        bt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star1-m_32.png"))); // NOI18N

        bt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star1-m_32.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt5)
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt5)
                    .addComponent(bt4)
                    .addComponent(bt3)
                    .addComponent(bt2)
                    .addComponent(bt1))
                .addGap(0, 0, 0))
        );

        lbQuant.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbQuant.setForeground(new java.awt.Color(102, 102, 102));
        lbQuant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbQuant.setText("XXX avaliaram");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMedia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbQuant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbQuant)
                .addGap(19, 19, 19))
        );

        jButton1.setBackground(new java.awt.Color(153, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Avaliar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFundoLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!p.comercial.reputacao.jaAvaliou(eu)) {
            PeAvaliarEmpresaJD t = new PeAvaliarEmpresaJD(null, true, p, eu);
            t.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Você já avaliou esta empresa!", "XPROMO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        pintarBarras();
    }//GEN-LAST:event_formWindowGainedFocus

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bt1;
    private javax.swing.JLabel bt2;
    private javax.swing.JLabel bt3;
    private javax.swing.JLabel bt4;
    private javax.swing.JLabel bt5;
    private javax.swing.ButtonGroup btgItensDenuncia;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbMedia;
    private javax.swing.JLabel lbQuant;
    private javax.swing.JProgressBar pgb1;
    private javax.swing.JProgressBar pgb2;
    private javax.swing.JProgressBar pgb3;
    private javax.swing.JProgressBar pgb4;
    private javax.swing.JProgressBar pgb5;
    private javax.swing.JPanel pnlFundo;
    // End of variables declaration//GEN-END:variables

    public void pintarBarras() {
        double avaliaram, item1, item2, item3, item4, item5;
        avaliaram = p.comercial.getReputacao().verAvaliacao(0);
        lbQuant.setText(Math.round(avaliaram) + " avaliaram");
        item1 = (p.comercial.getReputacao().verAvaliacao(1) / avaliaram) * 100;
        item2 = (p.comercial.getReputacao().verAvaliacao(2) / avaliaram) * 100;
        item3 = (p.comercial.getReputacao().verAvaliacao(3) / avaliaram) * 100;
        item4 = (p.comercial.getReputacao().verAvaliacao(4) / avaliaram) * 100;
        item5 = (p.comercial.getReputacao().verAvaliacao(5) / avaliaram) * 100;
        pgb5.setValue((int) item1);
        pgb4.setValue((int) item2);
        pgb3.setValue((int) item3);
        pgb2.setValue((int) item4);
        pgb1.setValue((int) item5);
        /*int i = 1;
         int temp = 0;
         while (i != 5) {
         int nota = p.comercial.reputacao.verAvaliacao(i);
         if (nota >= temp && nota != 0) {
         temp = nota;
         lbMedia.setText(i + "");
         colorir(i);
         }
         i++;
         }*/
        int soma = (p.comercial.getReputacao().verAvaliacao(1) * 1 + p.comercial.getReputacao().verAvaliacao(2) * 2
                + p.comercial.getReputacao().verAvaliacao(3) * 3 + p.comercial.getReputacao().verAvaliacao(4) * 4
                + p.comercial.getReputacao().verAvaliacao(5) * 5);
        int m = (int) soma / 15;
        if (m > 5) {
            m--;
        }
        lbMedia.setText(m + "");
        colorir(m);
    }

    private void colorir(int i) {
        if (i == 1) {
            bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-m_32.png")));
        } else if (i == 2) {
            bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-m_32.png")));
            bt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-f_32.png")));
        } else if (i == 3) {
            bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-m_32.png")));
            bt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-f_32.png")));
            bt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-f_32.png")));
        } else if (i == 4) {
            bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-m_32.png")));
            bt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-f_32.png")));
            bt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-f_32.png")));
            bt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-f_32.png")));
        } else if (i == 5) {
            bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-m_32.png")));
            bt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-f_32.png")));
            bt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-f_32.png")));
            bt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-f_32.png")));
            bt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-m_32.png")));
        }
    }

}
