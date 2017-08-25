package br.com.twtm.gui;

import br.com.twtm.xpromo.DesfazerRefazer;
import br.com.twtm.xpromo.Interesse;
import br.com.twtm.xpromo.Mercadoria;
import br.com.twtm.xpromo.Oferta;
import br.com.twtm.xpromo.Pessoa;
import br.com.twtm.xpromo.PessoaFisica;
import br.com.twtm.xpromo.PessoaJuridica;
import java.awt.Color;
import java.awt.Image;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;

public class PjOfertaPL extends javax.swing.JPanel {

    private Pessoa pe;
    private Oferta o;

    public PjOfertaPL(Pessoa pe, Oferta o) {
        initComponents();
        this.pe = pe;
        this.o = o;
        lbTitulo.setText("\"" + o.getMercadoria().getNome() + "\" X " + o.getQuant());
        SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String data = out.format(o.getData());
        Pessoa p = o.getPessoa();
        if (p.getLogin().getTipoUsuario() == 0) {
            PessoaFisica pf = (PessoaFisica) p;
            lbAutoria.setText("em " + data + " | por " + pf.getNome());
        } else if (p.getLogin().getTipoUsuario() == 1 || p.getLogin().getTipoUsuario() == 2) {
            PessoaJuridica pj = (PessoaJuridica) p;
            lbAutoria.setText("em " + data + " | por " + "por " + pj.getRazaoSocial());
        }
        Mercadoria m = o.getMercadoria();
        String fabricante = m.getFabricante();
        String cor = m.getCor();
        String material = m.getMaterial();
        //lbDescMercadoria.setText(fabricante + " | " + cor + " | " + material);
        NumberFormat z = NumberFormat.getCurrencyInstance();
        lbPreco.setText(z.format(o.getMenorPreco()));
        if (m.getIcone() != null) {
            ImageIcon icone = new ImageIcon(m.getIcone().getImage().getScaledInstance(68, 68, Image.SCALE_DEFAULT));
            lbImagem.setIcon(icone);
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
        lbImagem = new javax.swing.JLabel();
        lbPreco = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        mitEditar.setText("Editar");

        mitExcluir.setText("Excluir");

        setMaximumSize(new java.awt.Dimension(1000, 148));
        setMinimumSize(new java.awt.Dimension(797, 148));
        setPreferredSize(new java.awt.Dimension(797, 148));
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

        pnlUrgencia.setBackground(new java.awt.Color(0, 102, 102));
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

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 0, 102));
        lbTitulo.setText("Título");

        lbAutoria.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lbAutoria.setForeground(new java.awt.Color(0, 102, 0));
        lbAutoria.setText("em XX/XX/XX XX:XX | por Nome Completo do Autor");

        lbImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/mercadoria.png"))); // NOI18N
        lbImagem.setToolTipText("Detalhes da mercadoria");
        lbImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 211, 218)));
        lbImagem.setMaximumSize(new java.awt.Dimension(68, 68));
        lbImagem.setMinimumSize(new java.awt.Dimension(68, 68));
        lbImagem.setPreferredSize(new java.awt.Dimension(68, 68));
        lbImagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbImagemMouseClicked(evt);
            }
        });

        lbPreco.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbPreco.setForeground(new java.awt.Color(153, 0, 255));
        lbPreco.setText("9999999");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setText("por até");

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addComponent(pnlUrgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addComponent(lbImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlFundoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbAutoria, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlUrgencia, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFundoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lbTitulo)
                .addGap(1, 1, 1)
                .addComponent(lbAutoria)
                .addGap(5, 5, 5)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(1, 1, 1)
                        .addComponent(lbPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(8, 8, 8)
                .addComponent(pnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pnlFundoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlFundoMouseEntered
        pnlFundo.setBackground(new java.awt.Color(255, 216, 178));
    }//GEN-LAST:event_pnlFundoMouseEntered

    private void pnlFundoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlFundoMouseExited
        pnlFundo.setBackground(Color.white);
    }//GEN-LAST:event_pnlFundoMouseExited

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered

    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited

    }//GEN-LAST:event_formMouseExited

    private void lbImagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbImagemMouseClicked
        PjExibicaoMercadoria t = new PjExibicaoMercadoria(null, true, (PessoaJuridica) pe, o.getMercadoria());
        t.setVisible(true);
    }//GEN-LAST:event_lbImagemMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAutoria;
    private javax.swing.JLabel lbImagem;
    private javax.swing.JLabel lbPreco;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JMenuItem mitEditar;
    private javax.swing.JMenuItem mitExcluir;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPanel pnlUrgencia;
    private javax.swing.JPopupMenu ppmOpcoes;
    // End of variables declaration//GEN-END:variables
}
