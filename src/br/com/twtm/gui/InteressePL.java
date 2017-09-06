package br.com.twtm.gui;

import br.com.twtm.xpromo.DesfazerRefazer;
import br.com.twtm.xpromo.Interesse;
import br.com.twtm.xpromo.Pessoa;
import br.com.twtm.xpromo.PessoaFisica;
import br.com.twtm.xpromo.PessoaJuridica;
import java.awt.Color;
import java.text.SimpleDateFormat;

public class InteressePL extends javax.swing.JPanel {

    Pessoa pe;
    Interesse interesse;
    DesfazerRefazer df;
    
    public InteressePL(Interesse i, Pessoa pe, DesfazerRefazer df) {
        initComponents();
        this.pe=pe;
        this.interesse=i;
        this.df = df;
        btOpcoes.setVisible(false);
        int urgencia = i.getUrgencia();
        if(urgencia==1){
            pnlUrgencia.setBackground(new Color(0,102,255));
        }else if(urgencia==2){
            pnlUrgencia.setBackground(new Color(204,102,0));
        }else if (urgencia==3){
            pnlUrgencia.setBackground(new Color(255,51,51));
        }
        lbTitulo.setText(i.getTitulo() + " (" + i.getQuant() + ")");
        SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String data = out.format(i.getData());
        Pessoa p = i.getPessoa();
        if (p.getLogin().getTipoUsuario() == 0) {
            PessoaFisica pf = (PessoaFisica) p;
            lbAutoria.setText("em " + data + " | por " + pf.getNome());
        } else if (p.getLogin().getTipoUsuario() == 1 || p.getLogin().getTipoUsuario() == 2) {
            PessoaJuridica pj = (PessoaJuridica) p;
            lbAutoria.setText("em " + data + " | por " + "por " + pj.getRazaoSocial());
        }
        lbDescricao.setText(i.getDesc());
        if(df==null){
            btOpcoes.setIcon(null);
            btOpcoes.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ppmOpcoes = new javax.swing.JPopupMenu();
        mitEditar = new javax.swing.JMenuItem();
        mitExcluir = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        pnlFundo = new javax.swing.JPanel();
        pnlUrgencia = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbAutoria = new javax.swing.JLabel();
        lbDescricao = new javax.swing.JLabel();
        btOpcoes = new javax.swing.JButton();

        mitEditar.setText("Editar");

        mitExcluir.setText("Excluir");

        setMaximumSize(new java.awt.Dimension(1000, 71));
        setMinimumSize(new java.awt.Dimension(797, 71));
        setPreferredSize(new java.awt.Dimension(797, 71));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 82));
        jPanel1.setPreferredSize(new java.awt.Dimension(797, 82));

        pnlFundo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFundo.setMaximumSize(new java.awt.Dimension(32767, 70));
        pnlFundo.setPreferredSize(new java.awt.Dimension(797, 70));
        pnlFundo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlFundoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlFundoMouseExited(evt);
            }
        });

        pnlUrgencia.setBackground(new java.awt.Color(255, 51, 51));
        pnlUrgencia.setMaximumSize(new java.awt.Dimension(32767, 70));
        pnlUrgencia.setMinimumSize(new java.awt.Dimension(0, 70));
        pnlUrgencia.setPreferredSize(new java.awt.Dimension(2, 70));

        javax.swing.GroupLayout pnlUrgenciaLayout = new javax.swing.GroupLayout(pnlUrgencia);
        pnlUrgencia.setLayout(pnlUrgenciaLayout);
        pnlUrgenciaLayout.setHorizontalGroup(
            pnlUrgenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        pnlUrgenciaLayout.setVerticalGroup(
            pnlUrgenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 0, 102));
        lbTitulo.setText("Título");

        lbAutoria.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lbAutoria.setForeground(new java.awt.Color(0, 102, 0));
        lbAutoria.setText("em XX/XX/XX XX:XX | por Nome Completo do Autor");

        lbDescricao.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbDescricao.setText("Descrição");
        lbDescricao.setMaximumSize(new java.awt.Dimension(765, 16));
        lbDescricao.setPreferredSize(new java.awt.Dimension(765, 16));

        btOpcoes.setBackground(new java.awt.Color(255, 216, 178));
        btOpcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/opcoes_16.png"))); // NOI18N
        btOpcoes.setToolTipText("Opções");
        btOpcoes.setBorderPainted(false);
        btOpcoes.setContentAreaFilled(false);
        btOpcoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btOpcoesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btOpcoesMouseExited(evt);
            }
        });
        btOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOpcoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addComponent(pnlUrgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbAutoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFundoLayout.createSequentialGroup()
                                .addComponent(lbTitulo)
                                .addGap(1, 1, 1)
                                .addComponent(lbAutoria))
                            .addComponent(btOpcoes))
                        .addGap(5, 5, 5)
                        .addComponent(lbDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnlUrgencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(pnlFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pnlFundoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlFundoMouseEntered
        pnlFundo.setBackground(new java.awt.Color(255, 216, 178));
        btOpcoes.setVisible(true);
    }//GEN-LAST:event_pnlFundoMouseEntered

    private void pnlFundoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlFundoMouseExited
        pnlFundo.setBackground(Color.white);
        btOpcoes.setVisible(false);
    }//GEN-LAST:event_pnlFundoMouseExited

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered

    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited

    }//GEN-LAST:event_formMouseExited

    private void btOpcoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btOpcoesMouseEntered
        pnlFundo.setBackground(new java.awt.Color(255, 216, 178));
        btOpcoes.setVisible(true);
    }//GEN-LAST:event_btOpcoesMouseEntered

    private void btOpcoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btOpcoesMouseExited
        pnlFundo.setBackground(Color.white);
        btOpcoes.setVisible(false);
    }//GEN-LAST:event_btOpcoesMouseExited

    private void btOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOpcoesActionPerformed
        PeCrudInteresseJD jdCrudInteresseJD = new PeCrudInteresseJD(null, true, pe, interesse, df);
        jdCrudInteresseJD.setVisible(true);
    }//GEN-LAST:event_btOpcoesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btOpcoes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAutoria;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JMenuItem mitEditar;
    private javax.swing.JMenuItem mitExcluir;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPanel pnlUrgencia;
    private javax.swing.JPopupMenu ppmOpcoes;
    // End of variables declaration//GEN-END:variables
}
