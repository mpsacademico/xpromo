package br.com.twtm.gui;

import br.com.twtm.xpromo.Pessoa;
import br.com.twtm.xpromo.PessoaFisica;
import br.com.twtm.xpromo.PessoaJuridica;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDialog;

public class PeCartaoAmigoPL extends javax.swing.JPanel {

    private Pessoa p, eu;
    private ImageIcon icone, icone48;
    private int tu;

    public PeCartaoAmigoPL(Pessoa p, Pessoa eu) {
        this.p = p;
        this.eu = eu;
        initComponents();
        tu = p.login.getTipoUsuario();
        icone48 = new ImageIcon(p.perfil.getIcone().getImage().getScaledInstance(48, 48, Image.SCALE_DEFAULT));
        lbFotoCartao.setIcon(icone48);
        icone48.getImage().flush();
        if (p.getLogin().getTipoUsuario() == 0) {
            PessoaFisica pf = (PessoaFisica) p;
            lbNome.setText(pf.getNome());
            lbEmail.setText(pf.getEmail());
            //lbEmail.setText(this.p.login.getEmail());
        } else if (p.getLogin().getTipoUsuario() == 1 || p.getLogin().getTipoUsuario() == 2) {
            PessoaJuridica pj = (PessoaJuridica) p;
            lbNome.setText(pj.getRazaoSocial());
            lbEmail.setText(pj.getEmail());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbFotoCartao = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));
        setMaximumSize(new java.awt.Dimension(302, 54));
        setMinimumSize(new java.awt.Dimension(302, 54));
        setPreferredSize(new java.awt.Dimension(302, 54));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        lbFotoCartao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/perfil2.png"))); // NOI18N
        lbFotoCartao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lbNome.setText("Nome");
        lbNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbNomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbNomeMouseExited(evt);
            }
        });

        lbEmail.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lbEmail.setText("E-mail");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(lbFotoCartao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNome, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addComponent(lbEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lbFotoCartao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lbNome)
                        .addGap(2, 2, 2)
                        .addComponent(lbEmail)))
                .addGap(2, 2, 2))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        PePerfil telaPerfilAmigo = new PePerfil(null, true, p, eu);
        telaPerfilAmigo.setVisible(true);
    }//GEN-LAST:event_formMouseClicked

    private void lbNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNomeMouseClicked
        PePerfil telaPerfilAmigo = new PePerfil(null, true, p, eu);
        telaPerfilAmigo.setVisible(true);
    }//GEN-LAST:event_lbNomeMouseClicked

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        setBackground(new java.awt.Color(229, 229, 255));
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        setBackground(new java.awt.Color(245, 245, 245));
    }//GEN-LAST:event_formMouseExited

    private void lbNomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNomeMouseEntered
        setBackground(new java.awt.Color(229, 229, 255));
    }//GEN-LAST:event_lbNomeMouseEntered

    private void lbNomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNomeMouseExited
        setBackground(new java.awt.Color(245, 245, 245));
    }//GEN-LAST:event_lbNomeMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbFotoCartao;
    private javax.swing.JLabel lbNome;
    // End of variables declaration//GEN-END:variables
}
