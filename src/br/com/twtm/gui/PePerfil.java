package br.com.twtm.gui;

import br.com.twtm.xpromo.EntFilantropica;
import br.com.twtm.xpromo.Pessoa;
import br.com.twtm.xpromo.PessoaFisica;
import br.com.twtm.xpromo.PessoaJuridica;
import br.com.twtm.xpromo.VoltarAvancar;
import java.util.EmptyStackException;
import javax.swing.JOptionPane;

public class PePerfil extends javax.swing.JDialog {

    private Pessoa p, eu;
    private VoltarAvancar va;

    public PePerfil(java.awt.Frame parent, boolean modal, Pessoa p, Pessoa eu) {
        super(parent, modal);
        initComponents();
        this.p = p;
        this.eu = eu;
        va = new VoltarAvancar(p);
        int tu = p.login.getTipoUsuario();
        pnlPerfil.removeAll();
        if (tu == 0) {
            PessoaFisica pf = (PessoaFisica) p;
            PfPerfilPL l = new PfPerfilPL(pf, eu, va, pnlPerfil, pnlTopo);
            pnlPerfil.add(l);
        } else if (tu == 1) {
            PessoaJuridica pj = (PessoaJuridica) p;
            PjPerfilPL l = new PjPerfilPL(pj, eu, va, pnlPerfil, pnlTopo);
            pnlPerfil.add(l);
        } else if (tu == 2) {
            PessoaJuridica pj = (PessoaJuridica) p;
            EntPerfilPL l = new EntPerfilPL(pj, eu, va, pnlPerfil, pnlTopo);
            pnlPerfil.add(l);
        }
        pnlPerfil.repaint();
        pnlPerfil.validate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlTopo = new javax.swing.JPanel();
        btVoltar = new javax.swing.JButton();
        btAvancar = new javax.swing.JButton();
        pnlPerfil = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Navegador de perfis");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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
                .addGap(0, 961, Short.MAX_VALUE))
        );
        pnlTopoLayout.setVerticalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGroup(pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        pnlPerfil.setBackground(new java.awt.Color(255, 255, 255));
        pnlPerfil.setLayout(new javax.swing.BoxLayout(pnlPerfil, javax.swing.BoxLayout.Y_AXIS));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(pnlTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlPerfil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE))
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

    private void btAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAvancarActionPerformed
        try {
            Pessoa pe = va.refazer();
            System.out.println(pe.login.getEmail());
            int tu = pe.login.getTipoUsuario();
            pnlPerfil.removeAll();
            if (tu == 0) {
                PessoaFisica pf = (PessoaFisica) pe;
                PfPerfilPL l = new PfPerfilPL(pf, eu, va, pnlPerfil, pnlTopo);
                pnlPerfil.add(l);
            } else if (tu == 1) {
                PessoaJuridica pj = (PessoaJuridica) pe;
                PjPerfilPL l = new PjPerfilPL(pj, eu, va, pnlPerfil, pnlTopo);
                pnlPerfil.add(l);
            } else if (tu == 2) {
                PessoaJuridica pj = (PessoaJuridica) pe;
                EntPerfilPL l = new EntPerfilPL(pj, eu, va, pnlPerfil, pnlTopo);
                pnlPerfil.add(l);
            }
            pnlPerfil.repaint();
            pnlPerfil.validate();
        } catch (EmptyStackException ex) {
            JOptionPane.showMessageDialog(null, "Não há para onde avançar!", "XPROMO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btAvancarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        try {
            Pessoa pe = va.desfazer();
            int tu = pe.login.getTipoUsuario();            
            pnlPerfil.removeAll();
            if (tu == 0) {
                PessoaFisica pf = (PessoaFisica) pe;
                PfPerfilPL l = new PfPerfilPL(pf, eu, va, pnlPerfil, pnlTopo);
                pnlPerfil.add(l);
            } else if (tu == 1) {
                PessoaJuridica pj = (PessoaJuridica) pe;
                PjPerfilPL l = new PjPerfilPL(pj, eu, va, pnlPerfil, pnlTopo);
                pnlPerfil.add(l);
            } else if (tu == 2) {
                PessoaJuridica pj = (PessoaJuridica) pe;
                EntPerfilPL l = new EntPerfilPL(pj, eu, va, pnlPerfil, pnlTopo);
                pnlPerfil.add(l);
            }
            pnlPerfil.repaint();
            pnlPerfil.validate();
        } catch (EmptyStackException ex) {
            JOptionPane.showMessageDialog(null, "Não há para onde voltar!", "XPROMO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAvancar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlPerfil;
    private javax.swing.JPanel pnlTopo;
    // End of variables declaration//GEN-END:variables

}
