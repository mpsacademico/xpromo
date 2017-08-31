package br.com.twtm.gui;

import br.com.twtm.xpromo.Conversa;
import br.com.twtm.xpromo.EntFilantropica;
import br.com.twtm.xpromo.Pessoa;
import br.com.twtm.xpromo.PessoaFisica;
import br.com.twtm.xpromo.PessoaJuridica;
import java.awt.Color;
import javax.swing.JPanel;

public class CartaoConversaAmigoPL extends javax.swing.JPanel {

    private Pessoa p, eu;
    private JPanel pnlFundoHistorico;
    private Conversa c;
    private Color cor = Color.white;
    private int lida;

    public CartaoConversaAmigoPL(Pessoa p, Pessoa eu) {
        initComponents();
        this.p = p;
        this.eu = eu;
        int status = p.login.getStatus();
        if (status == 1) {
            lbStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/status-ocupado.png")));
            lbStatus.setToolTipText("Ocupado");
        } else if (status == 2) {            
            lbStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/status-indisponivel.png")));
            lbStatus.setToolTipText("Indisponível");
        } else if (status == 0) {            
            lbStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/status-disponivel.png")));
            lbStatus.setToolTipText("Disponível");
        }
        int tu = p.login.getTipoUsuario();
        if (tu == 0) {
            PessoaFisica pf = (PessoaFisica) p;
            lbNomeCompleto.setText(pf.getNome());
        } else if (tu == 1) {
            PessoaJuridica pj = (PessoaJuridica) p;
            lbNomeCompleto.setText(pj.getNomeFantasia());
        } else if (tu == 2) {
            EntFilantropica ent = (EntFilantropica) p;
            lbNomeCompleto.setText(ent.getNomeFantasia());
        }
        c = eu.perfil.getConversa(p);
        Pessoa ultima = c.getUltima();
        if (ultima == p && c.isLida() == false) {
            lida = 1;
            lbNomeCompleto.setForeground(new Color(153, 0, 255));            
            pnlFundo.setBackground(new Color(204,204,255));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundo = new javax.swing.JPanel();
        lbNomeCompleto = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMaximumSize(new java.awt.Dimension(250, 30));
        setMinimumSize(new java.awt.Dimension(250, 30));
        setPreferredSize(new java.awt.Dimension(250, 30));
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

        pnlFundo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFundo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlFundoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlFundoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlFundoMouseExited(evt);
            }
        });

        lbNomeCompleto.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbNomeCompleto.setText("Nome Completo");

        lbStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/status.png"))); // NOI18N

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFundoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lbStatus)
                .addGap(2, 2, 2)
                .addComponent(lbNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbStatus)
                    .addComponent(lbNomeCompleto))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnlFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered

    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited

    }//GEN-LAST:event_formMouseExited

    private void pnlFundoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlFundoMouseEntered
        pnlFundo.setBackground(new java.awt.Color(229, 229, 255));
    }//GEN-LAST:event_pnlFundoMouseEntered

    private void pnlFundoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlFundoMouseExited
        if (lida == 0) pnlFundo.setBackground(Color.white);
        else if (lida == 1)pnlFundo.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_pnlFundoMouseExited

    private void pnlFundoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlFundoMouseClicked
        lida = 0;
        pnlFundoHistorico.setBackground(Color.red);
        pnlFundoHistorico.removeAll();
        pnlFundoHistorico.add(new ConversaAmigoPL(p, eu), 0);
        lbNomeCompleto.setForeground(Color.black);
        pnlFundo.setBackground(Color.white);
        cor = Color.white;
        pnlFundoHistorico.repaint();
        pnlFundoHistorico.revalidate();
        if (c.getUltima() == p) {
            c.setLida(true);
        }
    }//GEN-LAST:event_pnlFundoMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbNomeCompleto;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JPanel pnlFundo;
    // End of variables declaration//GEN-END:variables

    public void atualizaFundo(JPanel jpl) {
        this.pnlFundoHistorico = jpl;
    }

}
