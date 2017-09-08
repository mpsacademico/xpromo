package br.com.twtm.gui;

import br.com.twtm.xpromo.EntFilantropica;
import br.com.twtm.xpromo.Pessoa;
import br.com.twtm.xpromo.PessoaFisica;
import br.com.twtm.xpromo.PessoaJuridica;
import br.com.twtm.xpromo.VoltarAvancar;
import java.awt.Image;
import java.util.EmptyStackException;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PeFaceAmigoPL extends javax.swing.JPanel {

    private Pessoa p, eu, ultimo;
    private VoltarAvancar va;
    private JPanel pnlPerfil, topo;

    public PeFaceAmigoPL(Pessoa p, Pessoa eu, Pessoa ultimo, VoltarAvancar va) {
        initComponents();
        this.p = p;
        this.eu = eu;
        this.va = va;
        this.ultimo = ultimo;
        ImageIcon icone36 = new ImageIcon(p.perfil.getIcone().getImage().getScaledInstance(36, 36, Image.SCALE_DEFAULT));
        btFoto.setIcon(icone36);
        int tu = p.login.getTipoUsuario();
        if (tu == 0) {
            PessoaFisica pf = (PessoaFisica) p;
            btFoto.setToolTipText(pf.getNome());
        } else if (tu == 1 || tu ==2) {
            PessoaJuridica pj = (PessoaJuridica) p;
            btFoto.setToolTipText(pj.getNomeFantasia());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGeral = new javax.swing.JPanel();
        btFoto = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(38, 36));
        setMinimumSize(new java.awt.Dimension(38, 36));
        setPreferredSize(new java.awt.Dimension(38, 36));

        pnlGeral.setMaximumSize(new java.awt.Dimension(36, 36));
        pnlGeral.setMinimumSize(new java.awt.Dimension(36, 36));
        pnlGeral.setPreferredSize(new java.awt.Dimension(36, 36));

        btFoto.setBorderPainted(false);
        btFoto.setContentAreaFilled(false);
        btFoto.setMaximumSize(new java.awt.Dimension(38, 36));
        btFoto.setMinimumSize(new java.awt.Dimension(38, 36));
        btFoto.setPreferredSize(new java.awt.Dimension(38, 36));
        btFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlGeralLayout = new javax.swing.GroupLayout(pnlGeral);
        pnlGeral.setLayout(pnlGeralLayout);
        pnlGeralLayout.setHorizontalGroup(
            pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlGeralLayout.setVerticalGroup(
            pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFotoActionPerformed
        try {
            va.modificacaoRealizada(ultimo, p);
        } catch (EmptyStackException ex) {
            //JOptionPane.showMessageDialog(null, "Não há o que desfazer!", "XPROMO", JOptionPane.WARNING_MESSAGE);
        }
        int tu = p.login.getTipoUsuario();
        pnlPerfil.removeAll();
        if (tu == 0) {
            PessoaFisica pf = (PessoaFisica) p;
            PfPerfilPL l = new PfPerfilPL(pf, eu, va, pnlPerfil, topo);
            pnlPerfil.add(l);
        } else if (tu == 1) {
            PessoaJuridica pj = (PessoaJuridica) p;
            PjPerfilPL l = new PjPerfilPL(pj, eu, va, pnlPerfil, topo);
            pnlPerfil.add(l);
        } else if (tu == 2) {
            PessoaJuridica pj = (PessoaJuridica) p;
            EntPerfilPL l = new EntPerfilPL(pj, eu, va, pnlPerfil, topo);
            pnlPerfil.add(l);
        }
        pnlPerfil.repaint();
        pnlPerfil.validate();
    }//GEN-LAST:event_btFotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFoto;
    private javax.swing.JPanel pnlGeral;
    // End of variables declaration//GEN-END:variables

    public void upPainel(JPanel pnl, JPanel topo) {
        this.pnlPerfil = pnl;
        this.topo = topo;
    }

}
