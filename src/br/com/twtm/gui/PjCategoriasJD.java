package br.com.twtm.gui;

import br.com.twtm.xpromo.FiltroCat;
import br.com.twtm.xpromo.Pessoa;
import javax.swing.JOptionPane;

public class PjCategoriasJD extends javax.swing.JDialog {

    private FiltroCat fc;

    public PjCategoriasJD(java.awt.Frame parent, boolean modal, Pessoa p) {
        super(parent, modal);
        initComponents();
        fc = p.comercial.getFc();
        preencherCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        jCheckBox26 = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jCheckBox28 = new javax.swing.JCheckBox();
        jCheckBox29 = new javax.swing.JCheckBox();
        jCheckBox30 = new javax.swing.JCheckBox();
        jCheckBox31 = new javax.swing.JCheckBox();
        jCheckBox32 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jCheckBox33 = new javax.swing.JCheckBox();
        jCheckBox34 = new javax.swing.JCheckBox();
        jCheckBox35 = new javax.swing.JCheckBox();
        jCheckBox36 = new javax.swing.JCheckBox();
        jCheckBox37 = new javax.swing.JCheckBox();
        jCheckBox38 = new javax.swing.JCheckBox();
        jCheckBox39 = new javax.swing.JCheckBox();
        jCheckBox40 = new javax.swing.JCheckBox();
        jCheckBox41 = new javax.swing.JCheckBox();
        jCheckBox42 = new javax.swing.JCheckBox();
        jCheckBox43 = new javax.swing.JCheckBox();
        jCheckBox44 = new javax.swing.JCheckBox();
        jCheckBox45 = new javax.swing.JCheckBox();
        jCheckBox46 = new javax.swing.JCheckBox();
        jCheckBox47 = new javax.swing.JCheckBox();
        jCheckBox48 = new javax.swing.JCheckBox();
        btOk = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Filtragem de categorias");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Vestuário");

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Peças eletrônicas");

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("Aparelhos e Equipamentos Domésticos");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("Artesanato");

        jCheckBox5.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setText("Peças de Automóveis, Motocicletas, Aviões e Barcos");

        jCheckBox6.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setText("Baterias");

        jCheckBox7.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setText("Persianas e Papel de Parede\t");

        jCheckBox8.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setText("Livros");

        jCheckBox9.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox9.setText("Material de Construção");

        jCheckBox10.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox10.setText("Caixas de Mostruário");

        jCheckBox11.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox11.setText("Papel para Cópias e Computador");

        jCheckBox12.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox12.setText("Embalagens - Plástico (Baldes, Latas, Garrafas)");

        jCheckBox13.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox13.setText("Embalagens - Outros(Vidro, Metal)");

        jCheckBox14.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox14.setText("Embalagens - Sacos/Caixas ");

        jCheckBox15.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox15.setText("Eletrônicos para Consumidor");

        jCheckBox16.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox16.setText("Velas (com ou sem vidro)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox9)
                    .addComponent(jCheckBox16)
                    .addComponent(jCheckBox15)
                    .addComponent(jCheckBox14)
                    .addComponent(jCheckBox13)
                    .addComponent(jCheckBox12)
                    .addComponent(jCheckBox11)
                    .addComponent(jCheckBox10))
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox10))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(32767, 375));
        jPanel3.setMinimumSize(new java.awt.Dimension(0, 375));
        jPanel3.setPreferredSize(new java.awt.Dimension(213, 375));

        jCheckBox17.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox17.setText("Documentos e Papéis");

        jCheckBox18.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox18.setText("Acessórios Eletrônicos");

        jCheckBox19.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox19.setText("Equipamentos para Exercícios");

        jCheckBox20.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox20.setText("Mobília ");

        jCheckBox21.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox21.setText("Hardware e itens a Granel ");

        jCheckBox22.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox22.setText("Chapéus ");

        jCheckBox23.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox23.setText("Suprimentos para Saúde e Beleza");

        jCheckBox24.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox24.setText("Aquecimento e Refrigeração ");

        jCheckBox25.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox25.setText("Decoração Doméstica (inequebrável)");

        jCheckBox26.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox26.setText("Equipamentos Médicos");

        jCheckBox27.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox27.setText("Dispositivos Médicos  ");

        jCheckBox28.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox28.setText("Iluminaçao - Outros   ");

        jCheckBox29.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox29.setText("Iluminação - Florescente");

        jCheckBox30.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox30.setText("Equipamentos de Jardinagem");

        jCheckBox31.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox31.setText("Jóias e Óptica");

        jCheckBox32.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox32.setText("Artigos Domésticos/ Decoração(frágil)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox17)
                    .addComponent(jCheckBox18)
                    .addComponent(jCheckBox19)
                    .addComponent(jCheckBox20)
                    .addComponent(jCheckBox21)
                    .addComponent(jCheckBox22)
                    .addComponent(jCheckBox23)
                    .addComponent(jCheckBox24)
                    .addComponent(jCheckBox25)
                    .addComponent(jCheckBox32)
                    .addComponent(jCheckBox31)
                    .addComponent(jCheckBox30)
                    .addComponent(jCheckBox29)
                    .addComponent(jCheckBox28)
                    .addComponent(jCheckBox27)
                    .addComponent(jCheckBox26))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jCheckBox33.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox33.setText("Suprimentos Médicos");

        jCheckBox34.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox34.setText("Silenciosos e Sistemas de Exaustão");

        jCheckBox35.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox35.setText("Instrumentos Musicais");

        jCheckBox36.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox36.setText("Suprimentos para Escritórios");

        jCheckBox37.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox37.setText("Suprimentos de Papel e Plástico");

        jCheckBox38.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox38.setText("Cuidados com Animais");

        jCheckBox39.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox39.setText("Farmacêutico/ Médico -Líquidos  ");

        jCheckBox40.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox40.setText("Farmacêutico/ Médico- Sólidos   ");

        jCheckBox41.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox41.setText("Ferramentas e Equipamentos Elétricos");

        jCheckBox42.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox42.setText("Brinquedos/ Jogos e Hobby");

        jCheckBox43.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox43.setText("Pneus - Roda");

        jCheckBox44.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox44.setText("Pneus - Sem Roda");

        jCheckBox45.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox45.setText("Caixas de Armazenamento");

        jCheckBox46.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox46.setText("Equipamentos Esportivos");

        jCheckBox47.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox47.setText("Suprimentos de Embalagem");

        jCheckBox48.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox48.setText("Produtos de Papel Pré-impressos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox33)
                    .addComponent(jCheckBox34)
                    .addComponent(jCheckBox35)
                    .addComponent(jCheckBox36)
                    .addComponent(jCheckBox37)
                    .addComponent(jCheckBox38)
                    .addComponent(jCheckBox39)
                    .addComponent(jCheckBox40)
                    .addComponent(jCheckBox41)
                    .addComponent(jCheckBox48)
                    .addComponent(jCheckBox47)
                    .addComponent(jCheckBox46)
                    .addComponent(jCheckBox45)
                    .addComponent(jCheckBox44)
                    .addComponent(jCheckBox43)
                    .addComponent(jCheckBox42))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox42)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btOk.setBackground(new java.awt.Color(153, 0, 255));
        btOk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btOk.setForeground(new java.awt.Color(255, 255, 255));
        btOk.setText("Ok");
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btOk)
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

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
        criaExpressao();
        //JOptionPane.showMessageDialog(null, "Categorias marcadas com sucesso!", "XPROMO", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_btOkActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btOk;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox30;
    private javax.swing.JCheckBox jCheckBox31;
    private javax.swing.JCheckBox jCheckBox32;
    private javax.swing.JCheckBox jCheckBox33;
    private javax.swing.JCheckBox jCheckBox34;
    private javax.swing.JCheckBox jCheckBox35;
    private javax.swing.JCheckBox jCheckBox36;
    private javax.swing.JCheckBox jCheckBox37;
    private javax.swing.JCheckBox jCheckBox38;
    private javax.swing.JCheckBox jCheckBox39;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox40;
    private javax.swing.JCheckBox jCheckBox41;
    private javax.swing.JCheckBox jCheckBox42;
    private javax.swing.JCheckBox jCheckBox43;
    private javax.swing.JCheckBox jCheckBox44;
    private javax.swing.JCheckBox jCheckBox45;
    private javax.swing.JCheckBox jCheckBox46;
    private javax.swing.JCheckBox jCheckBox47;
    private javax.swing.JCheckBox jCheckBox48;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

    public void criaExpressao() {
        String expressao = "";
        fc.limparCategorias();
        if (jCheckBox1.isSelected()) {
            expressao = expressao.concat("0;");
            fc.add(0);
        }
        if (jCheckBox2.isSelected()) {
            expressao = expressao.concat("1;");
            fc.add(1);
        }
        if (jCheckBox3.isSelected()) {
            expressao = expressao.concat("2;");
            fc.add(2);
        }
        if (jCheckBox4.isSelected()) {
            expressao = expressao.concat("3;");
            fc.add(3);
        }
        if (jCheckBox5.isSelected()) {
            expressao = expressao.concat("4;");
            fc.add(4);
        }
        if (jCheckBox6.isSelected()) {
            expressao = expressao.concat("5;");
            fc.add(5);
        }
        if (jCheckBox7.isSelected()) {
            expressao = expressao.concat("6;");
            fc.add(6);
        }
        if (jCheckBox8.isSelected()) {
            expressao = expressao.concat("7;");
            fc.add(7);
        }
        if (jCheckBox9.isSelected()) {
            expressao = expressao.concat("8;");
            fc.add(8);
        }
        if (jCheckBox10.isSelected()) {
            expressao = expressao.concat("9;");
            fc.add(9);
        }
        if (jCheckBox11.isSelected()) {
            expressao = expressao.concat("10;");
            fc.add(10);
        }
        if (jCheckBox12.isSelected()) {
            expressao = expressao.concat("11;");
            fc.add(11);
        }
        if (jCheckBox13.isSelected()) {
            expressao = expressao.concat("12;");
            fc.add(12);
        }
        if (jCheckBox14.isSelected()) {
            expressao = expressao.concat("13;");
            fc.add(13);
        }
        if (jCheckBox15.isSelected()) {
            expressao = expressao.concat("14;");
            fc.add(14);
        }
        if (jCheckBox16.isSelected()) {
            expressao = expressao.concat("15;");
            fc.add(15);
        }
        if (jCheckBox17.isSelected()) {
            expressao = expressao.concat("16;");
            fc.add(16);
        }
        if (jCheckBox18.isSelected()) {
            expressao = expressao.concat("17;");
            fc.add(17);
        }
        if (jCheckBox19.isSelected()) {
            expressao = expressao.concat("18;");
            fc.add(18);
        }
        if (jCheckBox20.isSelected()) {
            expressao = expressao.concat("19;");
            fc.add(19);
        }
        if (jCheckBox21.isSelected()) {
            expressao = expressao.concat("20;");
            fc.add(20);
        }
        if (jCheckBox22.isSelected()) {
            expressao = expressao.concat("21;");
            fc.add(21);
        }
        if (jCheckBox23.isSelected()) {
            expressao = expressao.concat("22;");
            fc.add(22);
        }
        if (jCheckBox24.isSelected()) {
            expressao = expressao.concat("23;");
            fc.add(23);
        }
        if (jCheckBox25.isSelected()) {
            expressao = expressao.concat("24;");
            fc.add(24);
        }
        if (jCheckBox26.isSelected()) {
            expressao = expressao.concat("25;");
            fc.add(25);
        }
        if (jCheckBox27.isSelected()) {
            expressao = expressao.concat("26;");
            fc.add(26);
        }
        if (jCheckBox28.isSelected()) {
            expressao = expressao.concat("27;");
            fc.add(27);
        }
        if (jCheckBox29.isSelected()) {
            expressao = expressao.concat("28;");
            fc.add(28);
        }
        if (jCheckBox30.isSelected()) {
            expressao = expressao.concat("29;");
            fc.add(29);
        }
        if (jCheckBox31.isSelected()) {
            expressao = expressao.concat("30;");
            fc.add(30);
        }
        if (jCheckBox32.isSelected()) {
            expressao = expressao.concat("31;");
            fc.add(31);
        }
        if (jCheckBox33.isSelected()) {
            expressao = expressao.concat("32;");
            fc.add(32);
        }
        if (jCheckBox34.isSelected()) {
            expressao = expressao.concat("33;");
            fc.add(33);
        }
        if (jCheckBox35.isSelected()) {
            expressao = expressao.concat("34;");
            fc.add(34);
        }
        if (jCheckBox36.isSelected()) {
            expressao = expressao.concat("35;");
            fc.add(35);
        }
        if (jCheckBox37.isSelected()) {
            expressao = expressao.concat("36;");
            fc.add(36);
        }
        if (jCheckBox38.isSelected()) {
            expressao = expressao.concat("37;");
            fc.add(37);
        }
        if (jCheckBox39.isSelected()) {
            expressao = expressao.concat("38;");
            fc.add(38);
        }
        if (jCheckBox40.isSelected()) {
            expressao = expressao.concat("39;");
            fc.add(39);
        }
        if (jCheckBox41.isSelected()) {
            expressao = expressao.concat("40;");
            fc.add(40);
        }
        if (jCheckBox42.isSelected()) {
            expressao = expressao.concat("41;");
            fc.add(41);
        }
        if (jCheckBox43.isSelected()) {
            expressao = expressao.concat("42;");
            fc.add(42);
        }
        if (jCheckBox44.isSelected()) {
            expressao = expressao.concat("43;");
            fc.add(43);
        }
        if (jCheckBox45.isSelected()) {
            expressao = expressao.concat("44;");
            fc.add(44);
        }
        if (jCheckBox46.isSelected()) {
            expressao = expressao.concat("45;");
            fc.add(45);
        }
        if (jCheckBox47.isSelected()) {
            expressao = expressao.concat("46;");
            fc.add(46);
        }
        if (jCheckBox48.isSelected()) {
            expressao = expressao.concat("47;");
            fc.add(47);
        }
        //System.out.println(expressao);
        //fc.imprimir();
    }

    private void preencherCampos() {
        if (fc.contem(0)) {
            jCheckBox1.setSelected(true);
        }
        if (fc.contem(1)) {
            jCheckBox2.setSelected(true);
        }
        if (fc.contem(2)) {
            jCheckBox3.setSelected(true);
        }
        if (fc.contem(3)) {
            jCheckBox4.setSelected(true);
        }
        if (fc.contem(4)) {
            jCheckBox5.setSelected(true);
        }
        if (fc.contem(5)) {
            jCheckBox6.setSelected(true);
        }
        if (fc.contem(6)) {
            jCheckBox7.setSelected(true);
        }
        if (fc.contem(7)) {
            jCheckBox8.setSelected(true);
        }
        if (fc.contem(8)) {
            jCheckBox9.setSelected(true);
        }
        if (fc.contem(9)) {
            jCheckBox10.setSelected(true);
        }
        if (fc.contem(10)) {
            jCheckBox11.setSelected(true);
        }
        if (fc.contem(11)) {
            jCheckBox12.setSelected(true);
        }
        if (fc.contem(12)) {
            jCheckBox13.setSelected(true);
        }
        if (fc.contem(13)) {
            jCheckBox14.setSelected(true);
        }
        if (fc.contem(14)) {
            jCheckBox15.setSelected(true);
        }
        if (fc.contem(15)) {
            jCheckBox16.setSelected(true);
        }
        if (fc.contem(16)) {
            jCheckBox17.setSelected(true);
        }
        if (fc.contem(17)) {
            jCheckBox18.setSelected(true);
        }
        if (fc.contem(18)) {
            jCheckBox19.setSelected(true);
        }
        if (fc.contem(19)) {
            jCheckBox20.setSelected(true);
        }
        if (fc.contem(20)) {
            jCheckBox21.setSelected(true);
        }
        if (fc.contem(21)) {
            jCheckBox22.setSelected(true);
        }
        if (fc.contem(22)) {
            jCheckBox23.setSelected(true);
        }
        if (fc.contem(23)) {
            jCheckBox24.setSelected(true);
        }
        if (fc.contem(24)) {
            jCheckBox25.setSelected(true);
        }
        if (fc.contem(25)) {
            jCheckBox26.setSelected(true);
        }
        if (fc.contem(26)) {
            jCheckBox27.setSelected(true);
        }
        if (fc.contem(27)) {
            jCheckBox28.setSelected(true);
        }
        if (fc.contem(28)) {
            jCheckBox29.setSelected(true);
        }
        if (fc.contem(29)) {
            jCheckBox30.setSelected(true);
        }
        if (fc.contem(30)) {
            jCheckBox31.setSelected(true);
        }
        if (fc.contem(31)) {
            jCheckBox32.setSelected(true);
        }
        if (fc.contem(32)) {
            jCheckBox33.setSelected(true);
        }
        if (fc.contem(33)) {
            jCheckBox34.setSelected(true);
        }
        if (fc.contem(34)) {
            jCheckBox35.setSelected(true);
        }
        if (fc.contem(35)) {
            jCheckBox36.setSelected(true);
        }
        if (fc.contem(36)) {
            jCheckBox37.setSelected(true);
        }
        if (fc.contem(37)) {
            jCheckBox38.setSelected(true);
        }
        if (fc.contem(38)) {
            jCheckBox39.setSelected(true);
        }
        if (fc.contem(39)) {
            jCheckBox40.setSelected(true);
        }
        if (fc.contem(40)) {
            jCheckBox41.setSelected(true);
        }
        if (fc.contem(41)) {
            jCheckBox42.setSelected(true);
        }
        if (fc.contem(42)) {
            jCheckBox43.setSelected(true);
        }
        if (fc.contem(43)) {
            jCheckBox44.setSelected(true);
        }
        if (fc.contem(44)) {
            jCheckBox45.setSelected(true);
        }
        if (fc.contem(45)) {
            jCheckBox46.setSelected(true);
        }
        if (fc.contem(46)) {
            jCheckBox47.setSelected(true);
        }
        if (fc.contem(47)) {
            jCheckBox48.setSelected(true);
        }
    }
}
