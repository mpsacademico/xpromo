package br.com.twtm.gui;

import br.com.twtm.xpromo.DesfazerRefazer;
import br.com.twtm.xpromo.Interesse;
import br.com.twtm.xpromo.Pessoa;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

public class PeCrudInteresseJD extends javax.swing.JDialog {

    private int urgencia = 1;
    private Pessoa p;
    private Interesse i;
    private DesfazerRefazer df;
    private List lAtual;

    public PeCrudInteresseJD(java.awt.Frame parent, boolean modal, Pessoa p, DesfazerRefazer df, List lAtual) {
        super(parent, modal);
        initComponents();
        this.p = p;
        this.df = df;
        this.lAtual = lAtual;
        setTitle("Novo interesse");
        colorirBotoes();
        btAlterar.setVisible(false);
        btRemover.setVisible(false);
    }

    public PeCrudInteresseJD(java.awt.Frame parent, boolean modal, Pessoa p, Interesse i, DesfazerRefazer df) {
        super(parent, modal);
        initComponents();
        this.p = p;
        this.i = i;
        this.df = df;
        setTitle("Ajustes em registro");
        btCadastrar.setVisible(false);
        preencherCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfTitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfQuant = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btNormal = new javax.swing.JButton();
        btMedia = new javax.swing.JButton();
        btAlta = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDesc = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        chbCat = new javax.swing.JComboBox();
        btCadastrar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Interesse");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(233, 234, 237));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Título *");

        jLabel2.setText("Quantidade *");

        tfQuant.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfQuant.setText("1");

        jLabel3.setText("Urgência *");

        btNormal.setBackground(new java.awt.Color(153, 153, 153));
        btNormal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btNormal.setForeground(new java.awt.Color(255, 255, 255));
        btNormal.setText("Normal");
        btNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNormalActionPerformed(evt);
            }
        });

        btMedia.setBackground(new java.awt.Color(153, 153, 153));
        btMedia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btMedia.setForeground(new java.awt.Color(255, 255, 255));
        btMedia.setText("Média");
        btMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMediaActionPerformed(evt);
            }
        });

        btAlta.setBackground(new java.awt.Color(153, 153, 153));
        btAlta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btAlta.setForeground(new java.awt.Color(255, 255, 255));
        btAlta.setText("Alta");
        btAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltaActionPerformed(evt);
            }
        });

        jLabel4.setText("Descrição *");

        txaDesc.setColumns(20);
        txaDesc.setRows(5);
        jScrollPane1.setViewportView(txaDesc);

        jLabel5.setText("Categoria *");

        chbCat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vestuário", "Peças Eletrônicas", "Aparelhos e Equipamentos Domésticos", "Artesanato", "Peças de Automóveis, Motocicletas, Aviões e Barcos", "Baterias", "Persianas e Papel de Parede\t", "Livros\t", "Material de Construção", "Velas (com ou sem vidro)", "Eletrônicos para Consumidor", "Embalagens - Sacos/Caixas ", "Embalagens - Outros(Vidro, Metal)", "Embalagens - Plástico (Baldes, Latas, Garrafas)", "Papel para Cópias e Computador", "Caixas de Mostruário            ", "Documentos e Papéis", "Acessórios Eletrônicos", "Equipamentos para Exercícios", "Mobília \t", "Hardware e itens a Granel ", "Chapéus ", "Suprimentos para Saúde e Beleza", "Aquecimento e Refrigeração ", "Decoração Doméstica(inequebrável)", "Artigos Domésticos/ Decoração(frágil)", "Jóias e Óptica", "Equipamentos de Jardinagem", "Iluminação - Florescente", "Iluminaçao - Outros   ", "Dispositivos Médicos  ", "Equipamentos Médicos     ", "Suprimentos Médicos", "Silenciosos e Sistemas de Exaustão", "Instrumentos Musicais", "Suprimentos para Escritórios", "Suprimentos de Papel e Plástico", "Cuidados com Animais", "Farmacêutico/ Médico -Líquidos  ", "Farmacêutico/ MédicoSólidos    ", "Ferramentas e Equipamentos Elétricos", "Produtos de Papel Pré-impressos", "Suprimentos de Embalagem", "Equipamentos Esportivos", "Caixas de Armazenamento", "Pneus - Sem Roda", "Pneus - Roda", "Brinquedos/ Jogos e Hobby" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tfQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfTitulo)
                    .addComponent(chbCat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btNormal)
                        .addComponent(btMedia)
                        .addComponent(btAlta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chbCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        btCadastrar.setBackground(new java.awt.Color(255, 216, 178));
        btCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/cadastrar_16.png"))); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.setBorderPainted(false);
        btCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCadastrar.setFocusPainted(false);
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btAlterar.setBackground(new java.awt.Color(255, 216, 178));
        btAlterar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/alterar_16.png"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.setBorderPainted(false);
        btAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAlterar.setFocusPainted(false);
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btRemover.setBackground(new java.awt.Color(255, 216, 178));
        btRemover.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/deletar_16.png"))); // NOI18N
        btRemover.setText("Remover");
        btRemover.setBorderPainted(false);
        btRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btRemover.setFocusPainted(false);
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        try {
            if (vpCamposInteresse()) {
                String titulo = tfTitulo.getText();
                String descricao = txaDesc.getText();
                int quant = Integer.parseInt(tfQuant.getText());
                int cat = chbCat.getSelectedIndex();
                Calendar c = Calendar.getInstance();
                List listaSemModificacao = new ArrayList(lAtual);                
                Interesse interesse = new Interesse(urgencia, p, titulo, descricao, null, c.getTime(), quant, cat);
                p.comercial.cadastrarInteresse(interesse);                
                JOptionPane.showMessageDialog(null, "Interesse cadastrado!", "XPROMO", JOptionPane.INFORMATION_MESSAGE);
                df.modificacaoRealizada(listaSemModificacao, p.comercial.getInteresses());
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "XPROMO", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ops! Aconteceu algum erro!", "XPROMO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        try {
            if (vpCamposInteresse()) {
                List listaSemModificacao = new ArrayList(p.comercial.getInteresses());
                i.setTitulo(tfTitulo.getText());
                i.setDesc(txaDesc.getText());
                i.setQuant(Integer.parseInt(tfQuant.getText()));                
                i.setUrgencia(urgencia);
                i.setCategoria(chbCat.getSelectedIndex());
                df.modificacaoRealizada(listaSemModificacao, p.comercial.getInteresses());
                JOptionPane.showMessageDialog(null, "Interesse alterado!", "XPROMO", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "XPROMO", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ops! Aconteceu algum erro!", "XPROMO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "Deseja remover este interesse?", "XPROMO", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (op == 0) {
            List listaSemModificacao = new ArrayList(p.comercial.getInteresses());
            p.comercial.removerInteresse(i);
            df.modificacaoRealizada(listaSemModificacao, p.comercial.getInteresses());
            JOptionPane.showMessageDialog(null, "Interesse removido!", "XPROMO", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNormalActionPerformed
        urgencia = 1;
        colorirBotoes();
    }//GEN-LAST:event_btNormalActionPerformed

    private void btMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMediaActionPerformed
        urgencia = 2;
        colorirBotoes();
    }//GEN-LAST:event_btMediaActionPerformed

    private void btAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltaActionPerformed
        urgencia = 3;
        colorirBotoes();
    }//GEN-LAST:event_btAltaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlta;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btMedia;
    private javax.swing.JButton btNormal;
    private javax.swing.JButton btRemover;
    private javax.swing.JComboBox chbCat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfQuant;
    private javax.swing.JTextField tfTitulo;
    private javax.swing.JTextArea txaDesc;
    // End of variables declaration//GEN-END:variables

    private void colorirBotoes() {
        btNormal.setBackground(new java.awt.Color(153, 153, 153));
        btMedia.setBackground(new java.awt.Color(153, 153, 153));
        btAlta.setBackground(new java.awt.Color(153, 153, 153));
        if (urgencia == 1) {
            btNormal.setBackground(new Color(0, 102, 255));
        } else if (urgencia == 2) {
            btMedia.setBackground(new Color(204, 102, 0));
        } else if (urgencia == 3) {
            btAlta.setBackground(new Color(255, 51, 51));
        }
    }

    private void preencherCampos() {
        tfTitulo.setText(i.getTitulo());
        tfQuant.setText(i.getQuant() + "");
        urgencia = i.getUrgencia();
        colorirBotoes();
        txaDesc.setText(i.getDesc());
        chbCat.setSelectedIndex(i.getCategoria());
    }

    private boolean vpCamposInteresse() {
        String titulo = tfTitulo.getText();
        String quant = tfQuant.getText();
        String desc = txaDesc.getText();
        return !(titulo.equals("")
                || quant.equals("")
                || desc.equals(""));
    }
}
