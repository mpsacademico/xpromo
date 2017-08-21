package br.com.twtm.gui;

import br.com.twtm.xpromo.EntFilantropica;
import br.com.twtm.xpromo.Pessoa;
import br.com.twtm.xpromo.PessoaFisica;
import br.com.twtm.xpromo.PessoaJuridica;
import java.awt.Color;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PeCartaoAmizadePL extends javax.swing.JPanel {

    //0 - não amigo | 1 - amigo | 2 - convidado | 3 - solicitado
    private int estadoAmizade = 0;
    private Pessoa p, eu;

    public PeCartaoAmizadePL(Pessoa p, Pessoa eu) {
        this.p = p;
        this.eu = eu;
        initComponents();
        ImageIcon icone96 = new ImageIcon(p.perfil.getIcone().getImage().getScaledInstance(96, 96, Image.SCALE_DEFAULT));
        lbFoto.setIcon(icone96);
        icone96.getImage().flush();
        int tu = p.login.getTipoUsuario();
        lbLocal.setText(p.end.getCidade() + " (" + p.end.getUf() + ")");
        if (tu == 0) {
            PessoaFisica pf = (PessoaFisica) p;
            lbNomeCompleto.setText(pf.getNome());
        } else if (tu == 1 || tu == 2) {
            PessoaJuridica pj = (PessoaJuridica) p;
            lbNomeCompleto.setText(pj.getNomeFantasia());
        }
        List convites = p.perfil.getSolicitacoes();
        List amigos = eu.perfil.getAmigos();
        if (amigos.contains(p)) {
            btAcao.setText("Amigo");
            btAcao.setBackground(new Color(51, 153, 0));
            btAcao.setForeground(Color.white);
            estadoAmizade = 1;
        } else if (convites.contains(eu)) {
            btAcao.setText("Convidado");
            btAcao.setBackground(new Color(0, 102, 255));
            btAcao.setForeground(Color.white);
            estadoAmizade = 2;
        }
        btRecusar.setVisible(false);
    }

    public PeCartaoAmizadePL(Pessoa p, Pessoa eu, int i) {
        this.p = p;
        this.eu = eu;
        initComponents();
        ImageIcon icone96 = new ImageIcon(p.perfil.getIcone().getImage().getScaledInstance(96, 96, Image.SCALE_DEFAULT));
        lbFoto.setIcon(icone96);
        icone96.getImage().flush();
        lbLocal.setText(p.end.getCidade() + " (" + p.end.getUf() + ")");
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
        estadoAmizade = 3;
        btAcao.setText("Aceitar");
        btAcao.setBackground(new Color(83, 167, 75));
        btAcao.setForeground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundo = new javax.swing.JPanel();
        lbFoto = new javax.swing.JLabel();
        lbNomeCompleto = new javax.swing.JLabel();
        s01 = new javax.swing.JSeparator();
        btAcao = new javax.swing.JButton();
        btRecusar = new javax.swing.JButton();
        lbLocal = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(922, 122));
        setMinimumSize(new java.awt.Dimension(922, 122));
        setPreferredSize(new java.awt.Dimension(922, 122));

        pnlFundo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFundo.setMaximumSize(new java.awt.Dimension(922, 128));
        pnlFundo.setMinimumSize(new java.awt.Dimension(922, 128));
        pnlFundo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pnlFundoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pnlFundoFocusLost(evt);
            }
        });
        pnlFundo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlFundoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlFundoMouseExited(evt);
            }
        });

        lbFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/perfil_96.png"))); // NOI18N

        lbNomeCompleto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbNomeCompleto.setText("Nome Completo");

        s01.setForeground(new java.awt.Color(204, 204, 204));

        btAcao.setBackground(new java.awt.Color(153, 153, 153));
        btAcao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btAcao.setText("Convidar");
        btAcao.setBorderPainted(false);
        btAcao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAcaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btAcaoMouseExited(evt);
            }
        });
        btAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcaoActionPerformed(evt);
            }
        });

        btRecusar.setBackground(new java.awt.Color(202, 59, 52));
        btRecusar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btRecusar.setForeground(new java.awt.Color(255, 255, 255));
        btRecusar.setText("Recusar");
        btRecusar.setBorderPainted(false);
        btRecusar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btRecusarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btRecusarMouseExited(evt);
            }
        });
        btRecusar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRecusarActionPerformed(evt);
            }
        });

        lbLocal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbLocal.setText("Cidade (UF)");

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNomeCompleto, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                            .addComponent(lbLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btRecusar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFundoLayout.createSequentialGroup()
                        .addComponent(s01)
                        .addContainerGap())))
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addComponent(lbNomeCompleto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbLocal))
                    .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addComponent(btAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRecusar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(s01, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btAcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcaoActionPerformed
        if (estadoAmizade == 0) {
            JOptionPane.showMessageDialog(null, "Convite enviado com sucesso!", "XPROMO", JOptionPane.INFORMATION_MESSAGE);
            p.perfil.addConvite(eu);
            btAcao.setText("Convidado");
            btAcao.setBackground(new Color(0, 102, 255));
            btAcao.setForeground(Color.white);
            estadoAmizade = 2;
        } else if (estadoAmizade == 1) {
            eu.perfil.removeAmigo(p, eu);
            JOptionPane.showMessageDialog(null, "Amigo removido com sucesso!", "XPROMO", JOptionPane.INFORMATION_MESSAGE);
            btAcao.setText("Convidar");
            btAcao.setBackground(new Color(153, 153, 153));
            btAcao.setForeground(Color.black);
            estadoAmizade = 0;
        } else if (estadoAmizade == 3) {
            eu.perfil.addAmigo(p, eu);
            eu.perfil.removeConvite(p);
            JOptionPane.showMessageDialog(null, "Solicitação de amizade aceita!", "XPROMO", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btAcaoActionPerformed

    private void btAcaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAcaoMouseEntered
        if (estadoAmizade == 1) {
            btAcao.setText("Remover");
            btAcao.setBackground(new Color(255, 51, 51));
            btAcao.setForeground(Color.white);
        }
    }//GEN-LAST:event_btAcaoMouseEntered

    private void btAcaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAcaoMouseExited
        if (estadoAmizade == 1) {
            btAcao.setText("Amigo");
            btAcao.setBackground(new Color(51, 153, 0));
            btAcao.setForeground(Color.white);
            estadoAmizade = 1;
        }
    }//GEN-LAST:event_btAcaoMouseExited

    private void btRecusarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRecusarActionPerformed
        eu.perfil.removeConvite(p);
        JOptionPane.showMessageDialog(null, "Solicitação de amizade recusada!", "XPROMO", JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);
    }//GEN-LAST:event_btRecusarActionPerformed

    private void btRecusarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRecusarMouseExited

    }//GEN-LAST:event_btRecusarMouseExited

    private void btRecusarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRecusarMouseEntered

    }//GEN-LAST:event_btRecusarMouseEntered

    private void pnlFundoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlFundoMouseEntered

    }//GEN-LAST:event_pnlFundoMouseEntered

    private void pnlFundoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlFundoMouseExited
        /*if(estadoAmizade==3){
         btAcao.setBackground(new Color(154,207,149)); 
         btRecusar.setBackground(new Color(223,137,133));  
         }*/
    }//GEN-LAST:event_pnlFundoMouseExited

    private void pnlFundoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnlFundoFocusGained
        /*if(estadoAmizade==3){
         btAcao.setBackground(new Color(83, 167, 75));            
         btRecusar.setBackground(new Color(202,59,52));            
         }*/
    }//GEN-LAST:event_pnlFundoFocusGained

    private void pnlFundoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnlFundoFocusLost

    }//GEN-LAST:event_pnlFundoFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAcao;
    private javax.swing.JButton btRecusar;
    private javax.swing.JLabel lbFoto;
    private javax.swing.JLabel lbLocal;
    private javax.swing.JLabel lbNomeCompleto;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JSeparator s01;
    // End of variables declaration//GEN-END:variables
}
