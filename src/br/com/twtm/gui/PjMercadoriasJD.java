package br.com.twtm.gui;

import br.com.twtm.xpromo.Mercadoria;
import br.com.twtm.xpromo.Oferta;
import br.com.twtm.xpromo.PessoaJuridica;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PjMercadoriasJD extends javax.swing.JDialog {

    private PessoaJuridica pj;
    private Oferta o;
    private int i;

    public PjMercadoriasJD(java.awt.Frame parent, boolean modal, PessoaJuridica pj) {
        super(parent, modal);
        initComponents();
        this.pj = pj;
        preencherTabela();
    }

    public PjMercadoriasJD(java.awt.Frame parent, boolean modal, PessoaJuridica pj, Oferta o) {
        super(parent, modal);
        initComponents();
        this.pj = pj;
        this.o = o;
        i = 1;
        preencherTabela();
        setTitle("Escolher mercadoria...");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlArquivadas = new javax.swing.JPanel();
        spnl03 = new javax.swing.JScrollPane();
        tblMercadorias = new javax.swing.JTable();
        btCadastrar = new javax.swing.JButton();
        btDetalhes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de mercadorias");
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        pnlArquivadas.setBackground(new java.awt.Color(255, 255, 255));
        pnlArquivadas.setMaximumSize(new java.awt.Dimension(942, 602));
        pnlArquivadas.setMinimumSize(new java.awt.Dimension(942, 602));

        spnl03.setBackground(new java.awt.Color(255, 255, 255));

        tblMercadorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descrição", "Fabricante", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMercadorias.getTableHeader().setReorderingAllowed(false);
        tblMercadorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMercadoriasMouseClicked(evt);
            }
        });
        tblMercadorias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblMercadoriasKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblMercadoriasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tblMercadoriasKeyTyped(evt);
            }
        });
        spnl03.setViewportView(tblMercadorias);
        if (tblMercadorias.getColumnModel().getColumnCount() > 0) {
            tblMercadorias.getColumnModel().getColumn(0).setMinWidth(622);
            tblMercadorias.getColumnModel().getColumn(0).setPreferredWidth(622);
            tblMercadorias.getColumnModel().getColumn(0).setMaxWidth(622);
            tblMercadorias.getColumnModel().getColumn(1).setMinWidth(200);
            tblMercadorias.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblMercadorias.getColumnModel().getColumn(1).setMaxWidth(200);
            tblMercadorias.getColumnModel().getColumn(2).setResizable(false);
            tblMercadorias.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        btCadastrar.setBackground(new java.awt.Color(255, 216, 178));
        btCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/cadastrar_16.png"))); // NOI18N
        btCadastrar.setText("Nova");
        btCadastrar.setBorderPainted(false);
        btCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCadastrar.setFocusPainted(false);
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btDetalhes.setBackground(new java.awt.Color(255, 216, 178));
        btDetalhes.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btDetalhes.setText("Detalhes");
        btDetalhes.setBorderPainted(false);
        btDetalhes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDetalhes.setFocusPainted(false);
        btDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDetalhesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlArquivadasLayout = new javax.swing.GroupLayout(pnlArquivadas);
        pnlArquivadas.setLayout(pnlArquivadasLayout);
        pnlArquivadasLayout.setHorizontalGroup(
            pnlArquivadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spnl03, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
            .addGroup(pnlArquivadasLayout.createSequentialGroup()
                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlArquivadasLayout.setVerticalGroup(
            pnlArquivadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlArquivadasLayout.createSequentialGroup()
                .addGroup(pnlArquivadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(spnl03, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlArquivadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlArquivadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblMercadoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMercadoriasMouseClicked
        if (i == 1) {
            if (evt.getClickCount() == 2) {
                int linha = tblMercadorias.getSelectedRow();
                o.setMercadoria(pj.comercial.getMercadorias().get(linha));
                this.dispose();
            }
        }
    }//GEN-LAST:event_tblMercadoriasMouseClicked

    private void tblMercadoriasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblMercadoriasKeyPressed
        //selecionarComSetas(evt.getKeyCode());
    }//GEN-LAST:event_tblMercadoriasKeyPressed

    private void tblMercadoriasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblMercadoriasKeyReleased
        // selecionarComSetas(evt.getKeyCode());
    }//GEN-LAST:event_tblMercadoriasKeyReleased

    private void tblMercadoriasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblMercadoriasKeyTyped
        // selecionarComSetas(evt.getKeyCode());
    }//GEN-LAST:event_tblMercadoriasKeyTyped

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        preencherTabela();
    }//GEN-LAST:event_formWindowGainedFocus

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        PjCadastroMercadoria t = new PjCadastroMercadoria(null, true, pj);
        t.setVisible(true);
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDetalhesActionPerformed
        int linha = tblMercadorias.getSelectedRow();
        if (linha >= 0) {
            //System.out.println(linha);
            Mercadoria me = pj.comercial.getMercadorias().get(linha);
            PjExibicaoMercadoria t = new PjExibicaoMercadoria(null, true, pj, me);
            t.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione algum item!", "XPROMO", 2);
        }
    }//GEN-LAST:event_btDetalhesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btDetalhes;
    private javax.swing.JPanel pnlArquivadas;
    private javax.swing.JScrollPane spnl03;
    private javax.swing.JTable tblMercadorias;
    // End of variables declaration//GEN-END:variables

    public void preencherTabela() {
        DefaultTableModel tabela = ((DefaultTableModel) tblMercadorias.getModel());
        tabela.setRowCount(0);
        List mercadorias = pj.comercial.getMercadorias();
        Object dados[] = new Object[3];
        for (Object m : mercadorias) {
            Mercadoria me = (Mercadoria) m;
            dados[0] = me.getNome();
            dados[1] = me.getFabricante();
            dados[2] = me.getPreco();
            tabela.addRow(dados);
        }
    }

}
