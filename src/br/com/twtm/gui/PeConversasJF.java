package br.com.twtm.gui;

import br.com.twtm.estruturas.Pessoas;
import br.com.twtm.xpromo.Pessoa;
import br.com.twtm.xpromo.PessoaFisica;
import br.com.twtm.xpromo.PessoaJuridica;
import java.awt.Toolkit;
import java.util.List;

public class PeConversasJF extends javax.swing.JFrame {

    private Pessoa eu;

    public PeConversasJF(Pessoa eu) {
        this.eu = eu;
        initComponents();
        buscarAmigos("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCard = new javax.swing.JPanel();
        pnlFundo = new javax.swing.JPanel();
        spnlBuscaListagem = new javax.swing.JScrollPane();
        pnlBuscaListagem = new javax.swing.JPanel();
        pnlCaixaBusca = new javax.swing.JPanel();
        tfBusca = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        pnlHistoricoMensagens = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Conversas");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/twtm/imagens/icone-xpromo.png")));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlCard.setLayout(new java.awt.CardLayout());

        pnlFundo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFundo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        spnlBuscaListagem.setBorder(null);
        spnlBuscaListagem.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlBuscaListagem.setBackground(new java.awt.Color(255, 255, 255));
        pnlBuscaListagem.setLayout(new javax.swing.BoxLayout(pnlBuscaListagem, javax.swing.BoxLayout.Y_AXIS));
        spnlBuscaListagem.setViewportView(pnlBuscaListagem);

        pnlCaixaBusca.setBackground(new java.awt.Color(255, 255, 255));
        pnlCaixaBusca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        tfBusca.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfBusca.setText("Busca...");
        tfBusca.setBorder(null);
        tfBusca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfBuscaFocusLost(evt);
            }
        });
        tfBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfBuscaMouseClicked(evt);
            }
        });
        tfBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfBuscaKeyReleased(evt);
            }
        });

        btBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/lupa_16.png"))); // NOI18N
        btBuscar.setBorderPainted(false);
        btBuscar.setContentAreaFilled(false);
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCaixaBuscaLayout = new javax.swing.GroupLayout(pnlCaixaBusca);
        pnlCaixaBusca.setLayout(pnlCaixaBuscaLayout);
        pnlCaixaBuscaLayout.setHorizontalGroup(
            pnlCaixaBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCaixaBuscaLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(tfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        pnlCaixaBuscaLayout.setVerticalGroup(
            pnlCaixaBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCaixaBuscaLayout.createSequentialGroup()
                .addGroup(pnlCaixaBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfBusca)
                    .addComponent(btBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pnlHistoricoMensagens.setBackground(new java.awt.Color(233, 234, 237));
        pnlHistoricoMensagens.setMaximumSize(new java.awt.Dimension(680, 611));
        pnlHistoricoMensagens.setMinimumSize(new java.awt.Dimension(680, 611));
        pnlHistoricoMensagens.setPreferredSize(new java.awt.Dimension(680, 611));
        pnlHistoricoMensagens.setLayout(new javax.swing.BoxLayout(pnlHistoricoMensagens, javax.swing.BoxLayout.Y_AXIS));

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlCaixaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnlBuscaListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlHistoricoMensagens, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addComponent(pnlHistoricoMensagens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addComponent(pnlCaixaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnlBuscaListagem))))
        );

        pnlCard.add(pnlFundo, "convidar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnlCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfBuscaMouseClicked
        tfBusca.setText("");
    }//GEN-LAST:event_tfBuscaMouseClicked

    private void tfBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscaKeyReleased
        buscarAmigos(tfBusca.getText());
    }//GEN-LAST:event_tfBuscaKeyReleased

    private void tfBuscaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBuscaFocusLost
        if (tfBusca.getText().equals("")) {
            tfBusca.setText("Busca...");
        }
    }//GEN-LAST:event_tfBuscaFocusLost

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed

    }//GEN-LAST:event_btBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JPanel pnlBuscaListagem;
    private javax.swing.JPanel pnlCaixaBusca;
    private javax.swing.JPanel pnlCard;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPanel pnlHistoricoMensagens;
    private javax.swing.JScrollPane spnlBuscaListagem;
    private javax.swing.JTextField tfBusca;
    // End of variables declaration//GEN-END:variables

    private void buscarAmigos(String busca) {
        int resultados = 0;
        pnlBuscaListagem.removeAll();
        List amigos = eu.perfil.getAmigos();
        for (Object amigo : amigos) {
            Pessoa p = (Pessoa) amigo;
            int tu = p.login.getTipoUsuario();
            if (tu == 0) {
                PessoaFisica pf = (PessoaFisica) p;
                String nome = pf.getNome();
                if (nome.toLowerCase().contains(busca.toLowerCase())) {
                    resultados++;
                    CartaoConversaAmigoPL cac = new CartaoConversaAmigoPL(p, eu);
                    cac.atualizaFundo(pnlHistoricoMensagens);
                    pnlBuscaListagem.add(cac);
                }
            } else if (tu == 1 || tu == 2) {
                PessoaJuridica pj = (PessoaJuridica) p;
                String nomeFantasia = pj.getNomeFantasia();
                if (nomeFantasia.toLowerCase().contains(busca.toLowerCase())) {
                    resultados++;
                    CartaoConversaAmigoPL cac = new CartaoConversaAmigoPL(p, eu);
                    cac.atualizaFundo(pnlHistoricoMensagens);
                    pnlBuscaListagem.add(cac);
                }
            }

        }
        pnlBuscaListagem.repaint();
        pnlBuscaListagem.validate();
        spnlBuscaListagem.validate();
    }

}
