package br.com.twtm.gui;

import br.com.twtm.xpromo.Mercadoria;
import br.com.twtm.xpromo.Oferta;
import br.com.twtm.xpromo.PessoaJuridica;
import java.awt.Color;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class PjOfertaJD extends javax.swing.JDialog {

    private PessoaJuridica pj;
    private Oferta o;
    private Mercadoria m;

    public PjOfertaJD(java.awt.Frame parent, boolean modal, PessoaJuridica pj) {
        super(parent, modal);
        initComponents();
        this.pj = pj;
        this.o = new Oferta();
        lbNomeMercadoria.setText(" ");
        lbDescMercadoria.setText(" ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        prbTerm = new javax.swing.JProgressBar();
        lbBola = new javax.swing.JLabel();
        lbPonta = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tfMenorPreco = new javax.swing.JTextField();
        btPreco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        tfQuant = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btConcluir = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btEscolher = new javax.swing.JButton();
        lbNomeMercadoria = new javax.swing.JLabel();
        lbDescMercadoria = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de oferta");
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        prbTerm.setBackground(new java.awt.Color(204, 204, 204));
        prbTerm.setBorderPainted(false);

        lbBola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/term-b0.png"))); // NOI18N

        lbPonta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/term-p0.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tfMenorPreco.setBackground(new java.awt.Color(255, 255, 255));
        tfMenorPreco.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tfMenorPreco.setForeground(new java.awt.Color(0, 102, 0));
        tfMenorPreco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfMenorPreco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 211, 218)));

        btPreco.setEditable(false);
        btPreco.setBackground(new java.awt.Color(243, 244, 245));
        btPreco.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btPreco.setForeground(new java.awt.Color(202, 59, 52));
        btPreco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        btPreco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 211, 218)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menor preço");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Maior preço");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(tfMenorPreco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 336, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(btPreco)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMenorPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        tfQuant.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tfQuant.setForeground(new java.awt.Color(51, 51, 51));
        tfQuant.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfQuant.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 211, 218)));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(51, 51, 51));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("1");
        jTextField4.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Quantidade");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Mercadoria");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(tfQuant))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 337, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lbPonta)
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(prbTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbBola))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbBola)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbPonta)
                            .addComponent(prbTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btConcluir.setBackground(new java.awt.Color(153, 0, 255));
        btConcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btConcluir.setForeground(new java.awt.Color(255, 255, 255));
        btConcluir.setText("Concluir");
        btConcluir.setMaximumSize(new java.awt.Dimension(91, 25));
        btConcluir.setMinimumSize(new java.awt.Dimension(91, 25));
        btConcluir.setPreferredSize(new java.awt.Dimension(91, 25));
        btConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConcluirActionPerformed(evt);
            }
        });

        btCancelar.setBackground(new java.awt.Color(153, 153, 153));
        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btEscolher.setBackground(new java.awt.Color(255, 216, 178));
        btEscolher.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btEscolher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/cadastrar_16.png"))); // NOI18N
        btEscolher.setText("Escolher mercadoria");
        btEscolher.setBorderPainted(false);
        btEscolher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEscolher.setFocusPainted(false);
        btEscolher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEscolherActionPerformed(evt);
            }
        });

        lbNomeMercadoria.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lbNomeMercadoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNomeMercadoria.setText("Nome da mercadoria completo");

        lbDescMercadoria.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lbDescMercadoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDescMercadoria.setText("Fabricante | Cor | Material | 99 X 99 X 99");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbDescMercadoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(292, 292, 292)
                                .addComponent(btEscolher, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(lbNomeMercadoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btEscolher, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNomeMercadoria)
                .addGap(2, 2, 2)
                .addComponent(lbDescMercadoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar))
                .addContainerGap())
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

    private void btConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConcluirActionPerformed
        try {
            if (vp()) {
                double preco = Double.parseDouble(tfMenorPreco.getText());
                int quant = Integer.parseInt(tfQuant.getText());
                o.setMenorPreco(preco);
                o.setQuant(quant);
                o.setPessoa(pj);
                Calendar c = Calendar.getInstance();
                o.setData(c.getTime());
                pj.comercial.cadastrarOferta(o);
                JOptionPane.showMessageDialog(null, "Oferta cadastrada!", "XPROMO", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Insira valores corretos!", "XPROMO", 2);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Preencha os dados corretamente!", "XPROMO", 2);
        }
    }//GEN-LAST:event_btConcluirActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btEscolherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEscolherActionPerformed
        PjMercadoriasJD t = new PjMercadoriasJD(null, true, pj, o);
        t.setVisible(true);
    }//GEN-LAST:event_btEscolherActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        Mercadoria m = o.getMercadoria();
        if (m != null) {
            this.m = m;
            lbNomeMercadoria.setText(m.getNome());
            String fabricante = m.getFabricante();
            String cor = m.getCor();
            String material = m.getMaterial();
            lbDescMercadoria.setText(fabricante + " | " + cor + " | " + material);
            btPreco.setText(m.getPreco() + "");
            btEscolher.setEnabled(false);
            btConcluir.setEnabled(true);
            btEscolher.setBackground(Color.white);
        }
    }//GEN-LAST:event_formWindowGainedFocus


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConcluir;
    private javax.swing.JButton btEscolher;
    private javax.swing.JTextField btPreco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lbBola;
    private javax.swing.JLabel lbDescMercadoria;
    private javax.swing.JLabel lbNomeMercadoria;
    private javax.swing.JLabel lbPonta;
    private javax.swing.JProgressBar prbTerm;
    private javax.swing.JTextField tfMenorPreco;
    private javax.swing.JTextField tfQuant;
    // End of variables declaration//GEN-END:variables

    public void colorirTerm() {
        int valor = 0;
        String b = "term-b0.png";
        String p = "term-p0.png";
        Color cor = new Color(204, 204, 204);

        if (valor == 100) {
            cor = new Color(178, 34, 34);
            b = "term-b1.png";
            p = "term-p1.png";
        } else if (valor >= 90 && valor < 100) {
            cor = new Color(178, 34, 34);
            p = "term-p1.png";
        } else if (valor >= 70 && valor < 90) {
            cor = new Color(255, 69, 0);
            p = "term-p2.png";
        } else if (valor >= 50 && valor < 70) {
            cor = new Color(255, 140, 0);
            p = "term-p3.png";
        } else if (valor > 0 && valor < 50) {
            cor = new Color(34, 139, 34);
            p = "term-p4.png";
        }
        prbTerm.setForeground(cor);
        lbBola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/" + b)));
        lbPonta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/" + p)));
        prbTerm.setValue(valor);
    }

    private boolean vp() throws Exception {
        try {
            double preco = Double.parseDouble(tfMenorPreco.getText());
            int quant = Integer.parseInt(tfQuant.getText());
            return (quant > 1 && preco < m.getPreco());
        } catch (Exception ex) {
            throw new Exception();
            //JOptionPane.showMessageDialog(null, "Preencha os dados corretamente!", "XPROMO", 2);
        }
    }

}
