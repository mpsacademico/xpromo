package br.com.twtm.gui;

import br.com.twtm.xpromo.Pessoa;

public class PeAvaliarEmpresaJD extends javax.swing.JDialog {

    private Pessoa p, eu;

    public PeAvaliarEmpresaJD(java.awt.Frame parent, boolean modal, Pessoa p, Pessoa eu) {
        super(parent, modal);
        initComponents();
        this.eu = eu;
        this.p = p;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Avaliar empresa");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMaximumSize(new java.awt.Dimension(684, 240));
        setMinimumSize(new java.awt.Dimension(684, 240));
        setPreferredSize(new java.awt.Dimension(684, 240));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star1-m_96.png"))); // NOI18N
        bt1.setBorderPainted(false);
        bt1.setContentAreaFilled(false);
        bt1.setFocusPainted(false);
        bt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt1MouseExited(evt);
            }
        });
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        bt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star1-f_96.png"))); // NOI18N
        bt2.setBorderPainted(false);
        bt2.setContentAreaFilled(false);
        bt2.setFocusPainted(false);
        bt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt2MouseExited(evt);
            }
        });
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        bt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star1-f_96.png"))); // NOI18N
        bt3.setBorderPainted(false);
        bt3.setContentAreaFilled(false);
        bt3.setFocusPainted(false);
        bt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt3MouseExited(evt);
            }
        });
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        bt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star1-f_96.png"))); // NOI18N
        bt4.setBorderPainted(false);
        bt4.setContentAreaFilled(false);
        bt4.setFocusPainted(false);
        bt4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt4MouseExited(evt);
            }
        });
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });

        bt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star1-m_96.png"))); // NOI18N
        bt5.setBorderPainted(false);
        bt5.setContentAreaFilled(false);
        bt5.setFocusPainted(false);
        bt5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt5MouseExited(evt);
            }
        });
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt4)
                    .addComponent(bt3)
                    .addComponent(bt2)
                    .addComponent(bt5)
                    .addComponent(bt1))
                .addGap(67, 67, 67))
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

    private void bt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt1MouseEntered
        colorir(1);
    }//GEN-LAST:event_bt1MouseEntered

    private void bt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt1MouseExited
        apagar();
    }//GEN-LAST:event_bt1MouseExited

    private void bt2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt2MouseEntered
        colorir(2);
    }//GEN-LAST:event_bt2MouseEntered

    private void bt2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt2MouseExited
        apagar();
    }//GEN-LAST:event_bt2MouseExited

    private void bt3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt3MouseEntered
        colorir(3);
    }//GEN-LAST:event_bt3MouseEntered

    private void bt3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt3MouseExited
        apagar();
    }//GEN-LAST:event_bt3MouseExited

    private void bt4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt4MouseEntered
        colorir(4);
    }//GEN-LAST:event_bt4MouseEntered

    private void bt4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt4MouseExited
        apagar();
    }//GEN-LAST:event_bt4MouseExited

    private void bt5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt5MouseEntered
        colorir(5);
    }//GEN-LAST:event_bt5MouseEntered

    private void bt5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt5MouseExited
        apagar();
    }//GEN-LAST:event_bt5MouseExited

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        p.comercial.getReputacao().avaliar(1, eu);
        dispose();
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        p.comercial.getReputacao().avaliar(2, eu);
        dispose();
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        p.comercial.getReputacao().avaliar(3, eu);
        dispose();
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        p.comercial.getReputacao().avaliar(4, eu);
        dispose();
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        p.comercial.getReputacao().avaliar(5, eu);
        dispose();
    }//GEN-LAST:event_bt5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void colorir(int i) {
        if (i == 1) {
            bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-m_96.png")));
        } else if (i == 2) {
            bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-m_96.png")));
            bt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-f_96.png")));
        } else if (i == 3) {
            bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-m_96.png")));
            bt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-f_96.png")));
            bt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-f_96.png")));
        } else if (i == 4) {
            bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-m_96.png")));
            bt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-f_96.png")));
            bt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-f_96.png")));
            bt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-f_96.png")));
        } else if (i == 5) {
            bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-m_96.png")));
            bt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-f_96.png")));
            bt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-f_96.png")));
            bt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-f_96.png")));
            bt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star2-m_96.png")));
        }

    }

    private void apagar() {
        bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star1-m_96.png")));
        bt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star1-f_96.png")));
        bt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star1-f_96.png")));
        bt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star1-f_96.png")));
        bt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/star1-m_96.png")));
    }
}
