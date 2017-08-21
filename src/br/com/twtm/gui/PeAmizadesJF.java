package br.com.twtm.gui;

import br.com.twtm.estruturas.Pessoas;
import br.com.twtm.xpromo.Pessoa;
import br.com.twtm.xpromo.PessoaFisica;
import br.com.twtm.xpromo.PessoaJuridica;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JOptionPane;

public class PeAmizadesJF extends javax.swing.JFrame {

    private Pessoa eu;
    private int qtdSolicitacoes;

    public PeAmizadesJF(Pessoa p) {
        this.eu = p;
        initComponents();
        btConvidar.setBackground(Color.white);
        lbResultados.setText("");
        qtdSolicitacoes = p.perfil.getQtSolicitacoes();
        btSolicitacoes.setText("Solicitacões (" + qtdSolicitacoes + ")");
        criaListaSolicitacoes();
        buscarAmigos("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCabecalho = new javax.swing.JPanel();
        btSolicitacoes = new javax.swing.JButton();
        btConvidar = new javax.swing.JButton();
        pnlCard = new javax.swing.JPanel();
        pnlConvidar = new javax.swing.JPanel();
        tfBusca = new javax.swing.JTextField();
        spnlBusca = new javax.swing.JScrollPane();
        pnlBusca = new javax.swing.JPanel();
        lbResultados = new javax.swing.JLabel();
        pnlSolicitacoes = new javax.swing.JPanel();
        spnlConvites = new javax.swing.JScrollPane();
        pnlConvites = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Amizades");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/twtm/imagens/icone-xpromo.png")));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlCabecalho.setBackground(new java.awt.Color(233, 234, 237));

        btSolicitacoes.setBackground(new java.awt.Color(255, 204, 153));
        btSolicitacoes.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btSolicitacoes.setText("Solicitações (XX)");
        btSolicitacoes.setBorderPainted(false);
        btSolicitacoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSolicitacoes.setFocusPainted(false);
        btSolicitacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSolicitacoesActionPerformed(evt);
            }
        });

        btConvidar.setBackground(new java.awt.Color(255, 216, 178));
        btConvidar.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btConvidar.setText("Convidar");
        btConvidar.setBorderPainted(false);
        btConvidar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btConvidar.setFocusPainted(false);
        btConvidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConvidarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCabecalhoLayout = new javax.swing.GroupLayout(pnlCabecalho);
        pnlCabecalho.setLayout(pnlCabecalhoLayout);
        pnlCabecalhoLayout.setHorizontalGroup(
            pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabecalhoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btConvidar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btSolicitacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCabecalhoLayout.setVerticalGroup(
            pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabecalhoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConvidar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSolicitacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlCard.setLayout(new java.awt.CardLayout());

        pnlConvidar.setBackground(new java.awt.Color(255, 255, 255));
        pnlConvidar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tfBusca.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfBusca.setText("Procure seu amigo pelo nome...");
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

        spnlBusca.setBorder(null);
        spnlBusca.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spnlBusca.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        pnlBusca.setBackground(new java.awt.Color(255, 255, 255));
        pnlBusca.setLayout(new javax.swing.BoxLayout(pnlBusca, javax.swing.BoxLayout.Y_AXIS));
        spnlBusca.setViewportView(pnlBusca);

        lbResultados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbResultados.setForeground(new java.awt.Color(51, 51, 51));
        lbResultados.setText("Foram encontrados XXX resultados");

        javax.swing.GroupLayout pnlConvidarLayout = new javax.swing.GroupLayout(pnlConvidar);
        pnlConvidar.setLayout(pnlConvidarLayout);
        pnlConvidarLayout.setHorizontalGroup(
            pnlConvidarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConvidarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
            .addComponent(spnlBusca)
        );
        pnlConvidarLayout.setVerticalGroup(
            pnlConvidarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConvidarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConvidarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbResultados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnlBusca, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE))
        );

        pnlCard.add(pnlConvidar, "convidar");

        pnlSolicitacoes.setBackground(new java.awt.Color(255, 255, 255));

        spnlConvites.setBorder(null);
        spnlConvites.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spnlConvites.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        pnlConvites.setBackground(new java.awt.Color(255, 255, 255));
        pnlConvites.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlConvites.setLayout(new javax.swing.BoxLayout(pnlConvites, javax.swing.BoxLayout.Y_AXIS));
        spnlConvites.setViewportView(pnlConvites);

        javax.swing.GroupLayout pnlSolicitacoesLayout = new javax.swing.GroupLayout(pnlSolicitacoes);
        pnlSolicitacoes.setLayout(pnlSolicitacoesLayout);
        pnlSolicitacoesLayout.setHorizontalGroup(
            pnlSolicitacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spnlConvites, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
        );
        pnlSolicitacoesLayout.setVerticalGroup(
            pnlSolicitacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSolicitacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spnlConvites, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE))
        );

        pnlCard.add(pnlSolicitacoes, "solicitacoes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCabecalho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            tfBusca.setText("Procure seu amigo pelo nome...");
        }
    }//GEN-LAST:event_tfBuscaFocusLost

    private void btConvidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConvidarActionPerformed
        btConvidar.setBackground(Color.white);
        btSolicitacoes.setBackground(new Color(255, 204, 153));
        CardLayout showPanel = (CardLayout) pnlCard.getLayout();
        showPanel.show(pnlCard, "convidar");
    }//GEN-LAST:event_btConvidarActionPerformed

    private void btSolicitacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSolicitacoesActionPerformed
        if (qtdSolicitacoes != 0) {
            btSolicitacoes.setText("Solicitações");
            btSolicitacoes.setBackground(Color.white);
            btConvidar.setBackground(new Color(255, 204, 153));
            CardLayout showPanel = (CardLayout) pnlCard.getLayout();
            showPanel.show(pnlCard, "solicitacoes");
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma solicitação de amizade!", "XPROMO", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btSolicitacoesActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConvidar;
    private javax.swing.JButton btSolicitacoes;
    private javax.swing.JLabel lbResultados;
    private javax.swing.JPanel pnlBusca;
    private javax.swing.JPanel pnlCabecalho;
    private javax.swing.JPanel pnlCard;
    private javax.swing.JPanel pnlConvidar;
    private javax.swing.JPanel pnlConvites;
    private javax.swing.JPanel pnlSolicitacoes;
    private javax.swing.JScrollPane spnlBusca;
    private javax.swing.JScrollPane spnlConvites;
    private javax.swing.JTextField tfBusca;
    // End of variables declaration//GEN-END:variables

    private void criaListaSolicitacoes() {
        List solicitantes = eu.perfil.getSolicitacoes();
        for (Object solicitante : solicitantes) {
            Pessoa p = (Pessoa) solicitante;
            int tu = p.login.getTipoUsuario();
            if (tu == 0) {
                PessoaFisica pf = (PessoaFisica) solicitante;
                PeCartaoAmizadePL amigoConvidarPL = new PeCartaoAmizadePL(pf, eu, 0);
                pnlConvites.add(amigoConvidarPL);
            } else if (tu == 1 || tu == 2) {
                PessoaJuridica pj = (PessoaJuridica) solicitante;
                PeCartaoAmizadePL amigoConvidarPL = new PeCartaoAmizadePL(pj, eu, 0);
                pnlConvites.add(amigoConvidarPL);
            }
        }
        pnlConvites.repaint();
        pnlConvites.validate();
        spnlConvites.validate();
    }

    private void buscarAmigos(String busca) {
        int resultados = 0;
        pnlBusca.removeAll();
        List solicitacoes = eu.perfil.getSolicitacoes();
        List usuarios = Pessoas.getUsuarios();
        for (Object usuario : usuarios) {
            Pessoa p = (Pessoa) usuario;
            if (eu != p && !solicitacoes.contains(p)) {
                //&& !amigos.contains(p)
                if (p.login.isValidadeCad()) {
                    int tu = p.login.getTipoUsuario();
                    if (tu == 0) {
                        PessoaFisica pf = (PessoaFisica) p;
                        String nome = pf.getNome();
                        if (nome.toLowerCase().contains(busca.toLowerCase())) {
                            resultados++;
                            PeCartaoAmizadePL amigoConvidarPL = new PeCartaoAmizadePL(p, eu);
                            pnlBusca.add(amigoConvidarPL);
                        }
                    } else if (tu == 1 || tu == 2) {
                        PessoaJuridica pj = (PessoaJuridica) p;
                        String nomeFantasia = pj.getNomeFantasia();
                        if (nomeFantasia.toLowerCase().contains(busca.toLowerCase())) {
                            resultados++;
                            PeCartaoAmizadePL amigoConvidarPL = new PeCartaoAmizadePL(p, eu);
                            pnlBusca.add(amigoConvidarPL);
                        }
                    }
                }
            }
        }
        if (resultados == 0) {
            lbResultados.setText("Não foram encontrados resultados");
        } else if (resultados == 1) {
            lbResultados.setText("Foi encontrado 1 resultado");
        } else {
            lbResultados.setText("Foram encontrados " + resultados + " resultados");
        }
        pnlBusca.repaint();
        pnlBusca.validate();
        spnlBusca.validate();
    }
}
