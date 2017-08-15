package br.com.twtm.gui;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.JOptionPane;

public class PeSobreJD extends javax.swing.JDialog {

    private AudioClip audio;
    private int toque = 0;

    public PeSobreJD(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        URL url = PeSobreJD.class.getResource("song.wav");
        audio = Applet.newAudioClip(url);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundo = new javax.swing.JPanel();
        btOk = new javax.swing.JButton();
        pnlLogotipo = new javax.swing.JPanel();
        lbLogotipo = new javax.swing.JLabel();
        s01 = new javax.swing.JSeparator();
        pnlIntegrantes = new javax.swing.JPanel();
        lbSergio = new javax.swing.JLabel();
        lbJuliana = new javax.swing.JLabel();
        lbElisa = new javax.swing.JLabel();
        lbMarcos = new javax.swing.JLabel();
        lbMayara = new javax.swing.JLabel();
        lbDireitosReservados = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sobre o XPROMO");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);

        pnlFundo.setBackground(new java.awt.Color(255, 255, 255));

        btOk.setBackground(new java.awt.Color(153, 0, 255));
        btOk.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btOk.setForeground(new java.awt.Color(255, 255, 255));
        btOk.setText("Ok");
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });

        pnlLogotipo.setBackground(new java.awt.Color(0, 102, 102));

        lbLogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/xp-estatico.jpg"))); // NOI18N
        lbLogotipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogotipoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbLogotipoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbLogotipoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlLogotipoLayout = new javax.swing.GroupLayout(pnlLogotipo);
        pnlLogotipo.setLayout(pnlLogotipoLayout);
        pnlLogotipoLayout.setHorizontalGroup(
            pnlLogotipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbLogotipo)
        );
        pnlLogotipoLayout.setVerticalGroup(
            pnlLogotipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbLogotipo)
        );

        pnlIntegrantes.setBackground(new java.awt.Color(255, 255, 255));

        lbSergio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbSergio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSergio.setText("Sérgio R. dos Santos Jr.");

        lbJuliana.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbJuliana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJuliana.setText("Juliana Augusto Ganem ");

        lbElisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbElisa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbElisa.setText("Elisa de Oliveira Giornes ");

        lbMarcos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbMarcos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMarcos.setText("Marcos Paulo da Silva");

        lbMayara.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbMayara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMayara.setText("Mayara da Silva Oliveira ");

        javax.swing.GroupLayout pnlIntegrantesLayout = new javax.swing.GroupLayout(pnlIntegrantes);
        pnlIntegrantes.setLayout(pnlIntegrantesLayout);
        pnlIntegrantesLayout.setHorizontalGroup(
            pnlIntegrantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIntegrantesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlIntegrantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMarcos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbMayara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbElisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbSergio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbJuliana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlIntegrantesLayout.setVerticalGroup(
            pnlIntegrantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIntegrantesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbMarcos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMayara)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbJuliana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbElisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSergio)
                .addGap(34, 34, 34))
        );

        lbDireitosReservados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbDireitosReservados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDireitosReservados.setText(" ® 2015 TWTM");

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s01)
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addComponent(pnlLogotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnlIntegrantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbDireitosReservados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btOk)
                .addGap(145, 145, 145))
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLogotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(s01, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlIntegrantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDireitosReservados)
                .addGap(77, 77, 77)
                .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
        this.dispose();
    }//GEN-LAST:event_btOkActionPerformed

    private void lbLogotipoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogotipoMousePressed
        lbLogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/xp-animado.gif")));
        try {
            audio.loop();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ops! Ocorreu algum probleminha!", "XPROMO", JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_lbLogotipoMousePressed

    private void lbLogotipoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogotipoMouseReleased
        lbLogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/xp-estatico.jpg")));
        try {
            audio.stop();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ops! Ocorreu algum probleminha!", "XPROMO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lbLogotipoMouseReleased

    private void lbLogotipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogotipoMouseClicked

    }//GEN-LAST:event_lbLogotipoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btOk;
    private javax.swing.JLabel lbDireitosReservados;
    private javax.swing.JLabel lbElisa;
    private javax.swing.JLabel lbJuliana;
    private javax.swing.JLabel lbLogotipo;
    private javax.swing.JLabel lbMarcos;
    private javax.swing.JLabel lbMayara;
    private javax.swing.JLabel lbSergio;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPanel pnlIntegrantes;
    private javax.swing.JPanel pnlLogotipo;
    private javax.swing.JSeparator s01;
    // End of variables declaration//GEN-END:variables

    /*
     public void play(String nomeDoAudio) {
        //Este código executa apenas arquivos .wav
        URL url = PeSobreJD.class.getResource(nomeDoAudio + ".wav");
        AudioClip audio = Applet.newAudioClip(url);
        audio.play();
     }
     */
    
}
