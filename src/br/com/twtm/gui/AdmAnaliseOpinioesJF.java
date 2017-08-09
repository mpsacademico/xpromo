package br.com.twtm.gui;

import br.com.twtm.estruturas.Opinioes;
import br.com.twtm.xpromo.Opiniao;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdmAnaliseOpinioesJF extends javax.swing.JFrame {

    private List<Opiniao> opinioes;
    private Opiniao o;

    public AdmAnaliseOpinioesJF() {
        initComponents();
        btAnalisar.setBackground(Color.white);
        if (Opinioes.tamanho() != 0) {
            o = Opinioes.exibirPrimeira();
            atualizarAnalisar();
            preencherCampos();
        } else {
            atualizarAnalisar();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMenuSuperior = new javax.swing.JPanel();
        btArquivadas = new javax.swing.JButton();
        btAnalisar = new javax.swing.JButton();
        pnlCard = new javax.swing.JPanel();
        pnlAnalisar = new javax.swing.JPanel();
        btIrrelevante = new javax.swing.JButton();
        btRelevante = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();
        spnl01 = new javax.swing.JScrollPane();
        txaOpiniao = new javax.swing.JTextArea();
        pnlArquivadas = new javax.swing.JPanel();
        spnl03 = new javax.swing.JScrollPane();
        tblOpinioesArquivadas = new javax.swing.JTable();
        lbQtdOpinioesArquivadas = new javax.swing.JLabel();
        spnl02 = new javax.swing.JScrollPane();
        txaOpiniaoArquivada = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Opiniões");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/twtm/imagens/icone-xpromo.png")));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnMenuSuperior.setBackground(new java.awt.Color(233, 234, 237));

        btArquivadas.setBackground(new java.awt.Color(255, 204, 153));
        btArquivadas.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btArquivadas.setText("Arquivadas");
        btArquivadas.setBorderPainted(false);
        btArquivadas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btArquivadas.setFocusPainted(false);
        btArquivadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btArquivadasActionPerformed(evt);
            }
        });

        btAnalisar.setBackground(new java.awt.Color(255, 204, 153));
        btAnalisar.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btAnalisar.setText("Analisar (XX)");
        btAnalisar.setBorderPainted(false);
        btAnalisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAnalisar.setFocusPainted(false);
        btAnalisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnalisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnMenuSuperiorLayout = new javax.swing.GroupLayout(pnMenuSuperior);
        pnMenuSuperior.setLayout(pnMenuSuperiorLayout);
        pnMenuSuperiorLayout.setHorizontalGroup(
            pnMenuSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuSuperiorLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btAnalisar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btArquivadas, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnMenuSuperiorLayout.setVerticalGroup(
            pnMenuSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuSuperiorLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnMenuSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAnalisar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btArquivadas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlCard.setLayout(new java.awt.CardLayout());

        pnlAnalisar.setBackground(new java.awt.Color(255, 255, 255));
        pnlAnalisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlAnalisar.setMaximumSize(new java.awt.Dimension(942, 602));
        pnlAnalisar.setMinimumSize(new java.awt.Dimension(942, 602));
        pnlAnalisar.setPreferredSize(new java.awt.Dimension(942, 602));

        btIrrelevante.setBackground(new java.awt.Color(255, 51, 51));
        btIrrelevante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btIrrelevante.setForeground(new java.awt.Color(255, 255, 255));
        btIrrelevante.setText("Irrelevante");
        btIrrelevante.setBorderPainted(false);
        btIrrelevante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btIrrelevanteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btIrrelevanteMouseExited(evt);
            }
        });
        btIrrelevante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIrrelevanteActionPerformed(evt);
            }
        });

        btRelevante.setBackground(new java.awt.Color(51, 153, 0));
        btRelevante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btRelevante.setForeground(new java.awt.Color(255, 255, 255));
        btRelevante.setText("Relevante");
        btRelevante.setBorderPainted(false);
        btRelevante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btRelevanteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btRelevanteMouseExited(evt);
            }
        });
        btRelevante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelevanteActionPerformed(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbTitulo.setText("Opinião enviada dia XX/XX/XXXX às XX:XX:");

        spnl01.setBorder(null);
        spnl01.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txaOpiniao.setEditable(false);
        txaOpiniao.setColumns(20);
        txaOpiniao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txaOpiniao.setLineWrap(true);
        txaOpiniao.setRows(5);
        spnl01.setViewportView(txaOpiniao);

        javax.swing.GroupLayout pnlAnalisarLayout = new javax.swing.GroupLayout(pnlAnalisar);
        pnlAnalisar.setLayout(pnlAnalisarLayout);
        pnlAnalisarLayout.setHorizontalGroup(
            pnlAnalisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAnalisarLayout.createSequentialGroup()
                .addGroup(pnlAnalisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAnalisarLayout.createSequentialGroup()
                        .addContainerGap(626, Short.MAX_VALUE)
                        .addComponent(btRelevante, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btIrrelevante, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAnalisarLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(spnl01)))
                .addContainerGap())
            .addGroup(pnlAnalisarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAnalisarLayout.setVerticalGroup(
            pnlAnalisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAnalisarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spnl01, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(pnlAnalisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btIrrelevante, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRelevante, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlCard.add(pnlAnalisar, "analisar");

        pnlArquivadas.setBackground(new java.awt.Color(255, 255, 255));
        pnlArquivadas.setMaximumSize(new java.awt.Dimension(942, 602));
        pnlArquivadas.setMinimumSize(new java.awt.Dimension(942, 602));

        spnl03.setBackground(new java.awt.Color(255, 255, 255));

        tblOpinioesArquivadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enviada em", "Analisada em", "Opinião"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOpinioesArquivadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOpinioesArquivadasMouseClicked(evt);
            }
        });
        tblOpinioesArquivadas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblOpinioesArquivadasKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblOpinioesArquivadasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tblOpinioesArquivadasKeyTyped(evt);
            }
        });
        spnl03.setViewportView(tblOpinioesArquivadas);
        if (tblOpinioesArquivadas.getColumnModel().getColumnCount() > 0) {
            tblOpinioesArquivadas.getColumnModel().getColumn(0).setMinWidth(110);
            tblOpinioesArquivadas.getColumnModel().getColumn(0).setPreferredWidth(110);
            tblOpinioesArquivadas.getColumnModel().getColumn(0).setMaxWidth(110);
            tblOpinioesArquivadas.getColumnModel().getColumn(1).setMinWidth(110);
            tblOpinioesArquivadas.getColumnModel().getColumn(1).setPreferredWidth(110);
            tblOpinioesArquivadas.getColumnModel().getColumn(1).setMaxWidth(110);
            tblOpinioesArquivadas.getColumnModel().getColumn(2).setResizable(false);
        }

        lbQtdOpinioesArquivadas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbQtdOpinioesArquivadas.setText("Estão arquivadas XXX opiniões");

        spnl02.setBackground(new java.awt.Color(255, 255, 255));
        spnl02.setBorder(javax.swing.BorderFactory.createTitledBorder("Exibição"));
        spnl02.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txaOpiniaoArquivada.setEditable(false);
        txaOpiniaoArquivada.setColumns(20);
        txaOpiniaoArquivada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txaOpiniaoArquivada.setLineWrap(true);
        txaOpiniaoArquivada.setRows(5);
        spnl02.setViewportView(txaOpiniaoArquivada);

        javax.swing.GroupLayout pnlArquivadasLayout = new javax.swing.GroupLayout(pnlArquivadas);
        pnlArquivadas.setLayout(pnlArquivadasLayout);
        pnlArquivadasLayout.setHorizontalGroup(
            pnlArquivadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlArquivadasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlArquivadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnl03, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlArquivadasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbQtdOpinioesArquivadas, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spnl02))
                .addContainerGap())
        );
        pnlArquivadasLayout.setVerticalGroup(
            pnlArquivadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlArquivadasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spnl02, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spnl03, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbQtdOpinioesArquivadas)
                .addGap(7, 7, 7))
        );

        pnlCard.add(pnlArquivadas, "arquivadas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMenuSuperior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnMenuSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAnalisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnalisarActionPerformed
        atualizarAnalisar();
        btAnalisar.setBackground(Color.white);
        btArquivadas.setBackground(new Color(255, 204, 153));
        CardLayout showPanel = (CardLayout) pnlCard.getLayout();
        showPanel.show(pnlCard, "analisar");
    }//GEN-LAST:event_btAnalisarActionPerformed

    private void btArquivadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btArquivadasActionPerformed
        if (Opinioes.qtdArquivadas() != 0) {
            atualizarAnalisar();
            atualizarArquivadas();
            btArquivadas.setBackground(Color.white);
            btAnalisar.setBackground(new Color(255, 204, 153));
            CardLayout showPanel = (CardLayout) pnlCard.getLayout();
            showPanel.show(pnlCard, "arquivadas");
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma opinião arquivada!", "XPROMO", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btArquivadasActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void btIrrelevanteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btIrrelevanteMouseEntered

    }//GEN-LAST:event_btIrrelevanteMouseEntered

    private void btIrrelevanteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btIrrelevanteMouseExited

    }//GEN-LAST:event_btIrrelevanteMouseExited

    private void btIrrelevanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIrrelevanteActionPerformed
        Opinioes.sair();
        JOptionPane.showMessageDialog(null, "Opinião irrelevante descartada!", "XPROMO", JOptionPane.INFORMATION_MESSAGE);
        if (Opinioes.tamanho() != 0) {
            preencherCampos();
        } else {
            txaOpiniao.setText("");
        }
        atualizarAnalisar();
    }//GEN-LAST:event_btIrrelevanteActionPerformed

    private void btRelevanteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRelevanteMouseEntered

    }//GEN-LAST:event_btRelevanteMouseEntered

    private void btRelevanteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRelevanteMouseExited

    }//GEN-LAST:event_btRelevanteMouseExited

    private void btRelevanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelevanteActionPerformed
        o.setAnalisada(true);
        o.setRelevancia(1);
        o.setDtAnalisada(Calendar.getInstance().getTime());
        Opinioes.arquivarOpiniao();
        JOptionPane.showMessageDialog(null, "Opinião relevante arquivada!", "XPROMO", JOptionPane.INFORMATION_MESSAGE);
        if (Opinioes.tamanho() != 0) {
            preencherCampos();
        } else {
            txaOpiniao.setText("");
        }
        atualizarAnalisar();
    }//GEN-LAST:event_btRelevanteActionPerformed

    private void tblOpinioesArquivadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOpinioesArquivadasMouseClicked
        int linha = tblOpinioesArquivadas.getSelectedRow();
        txaOpiniaoArquivada.setText(opinioes.get(linha).getOpiniao());
    }//GEN-LAST:event_tblOpinioesArquivadasMouseClicked

    private void tblOpinioesArquivadasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblOpinioesArquivadasKeyReleased
        selecionarComSetas(evt.getKeyCode());
    }//GEN-LAST:event_tblOpinioesArquivadasKeyReleased

    private void tblOpinioesArquivadasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblOpinioesArquivadasKeyTyped
        selecionarComSetas(evt.getKeyCode());
    }//GEN-LAST:event_tblOpinioesArquivadasKeyTyped

    private void tblOpinioesArquivadasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblOpinioesArquivadasKeyPressed
        selecionarComSetas(evt.getKeyCode());
    }//GEN-LAST:event_tblOpinioesArquivadasKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnalisar;
    private javax.swing.JButton btArquivadas;
    private javax.swing.JButton btIrrelevante;
    private javax.swing.JButton btRelevante;
    private javax.swing.JLabel lbQtdOpinioesArquivadas;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pnMenuSuperior;
    private javax.swing.JPanel pnlAnalisar;
    private javax.swing.JPanel pnlArquivadas;
    private javax.swing.JPanel pnlCard;
    private javax.swing.JScrollPane spnl01;
    private javax.swing.JScrollPane spnl02;
    private javax.swing.JScrollPane spnl03;
    private javax.swing.JTable tblOpinioesArquivadas;
    private javax.swing.JTextArea txaOpiniao;
    private javax.swing.JTextArea txaOpiniaoArquivada;
    // End of variables declaration//GEN-END:variables

    private void atualizarAnalisar() {
        if (Opinioes.tamanho() != 0) {
            btAnalisar.setText("Analisar (" + Opinioes.tamanho() + ")");
        } else {
            btAnalisar.setText("Analisar (0)");
            lbTitulo.setText("Não existem opiniões!");
            btRelevante.setVisible(false);
            btIrrelevante.setVisible(false);
        }
    }

    private void atualizarArquivadas() {
        txaOpiniaoArquivada.setText("");
        lbQtdOpinioesArquivadas.setText("Estão arquivadas " + Opinioes.qtdArquivadas() + " opiniões");
        DefaultTableModel tabela = ((DefaultTableModel) tblOpinioesArquivadas.getModel());
        tabela.setRowCount(0);
        opinioes = Opinioes.getOpinioesArquivadas();
        Object dados[] = new Object[3];
        for (Opiniao oa : opinioes) {
            SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
            String temp = out.format(oa.getDt().getTime());
            dados[0] = temp;
            temp = out.format(oa.getDtAnalisada().getTime());
            dados[1] = temp;
            dados[2] = oa.getOpiniao();
            tabela.addRow(dados);
        }
    }

    private void preencherCampos() {
        o = Opinioes.exibirPrimeira();
        SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
        String data = out.format(o.getDt().getTime());
        String dh = data;
        out = new SimpleDateFormat("HH:mm:ss");
        data = out.format(o.getDt().getTime());
        lbTitulo.setText("Opinião enviada dia " + dh.concat(" às " + data) + ":");
        txaOpiniao.setText(o.getOpiniao());
    }

    private void selecionarComSetas(int tecla) {

        int linha = tblOpinioesArquivadas.getSelectedRow();
        //Setinhas --> 38: para cima | 40: para baixo
        if (tecla == 38 && linha >= 0) {
            tblOpinioesArquivadas.setRowSelectionInterval(linha, linha--);
            linha = tblOpinioesArquivadas.getSelectedRow();
            txaOpiniaoArquivada.setText(opinioes.get(linha).getOpiniao());
        } else if (tecla == 40 && linha < tblOpinioesArquivadas.getRowCount()) {
            tblOpinioesArquivadas.setRowSelectionInterval(linha, linha++);
            linha = tblOpinioesArquivadas.getSelectedRow();
            txaOpiniaoArquivada.setText(opinioes.get(linha).getOpiniao());
        }
    }

}
