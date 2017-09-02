package br.com.twtm.gui;

import br.com.twtm.xpromo.Conversa;
import br.com.twtm.xpromo.EntFilantropica;
import br.com.twtm.xpromo.Mensagem;
import br.com.twtm.xpromo.Pessoa;
import br.com.twtm.xpromo.PessoaFisica;
import br.com.twtm.xpromo.PessoaJuridica;
import java.awt.Point;
import java.util.Calendar;
import java.util.List;
import javax.swing.JViewport;

public class ConversaAmigoPL extends javax.swing.JPanel {

    private Pessoa p, eu;
    private Conversa conversa;

    public ConversaAmigoPL(Pessoa p, Pessoa eu) {
        this.p = p;
        this.eu = eu;
        initComponents();
        atualizaConversa();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pnlHistorico = new javax.swing.JPanel();
        tfMensagem = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lbNomeCompletoDestinatario = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(680, 611));
        setMinimumSize(new java.awt.Dimension(680, 611));
        setPreferredSize(new java.awt.Dimension(680, 611));

        jScrollPane1.setBackground(new java.awt.Color(233, 234, 237));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        pnlHistorico.setBackground(new java.awt.Color(233, 234, 237));
        pnlHistorico.setMaximumSize(new java.awt.Dimension(663, 0));
        pnlHistorico.setLayout(new javax.swing.BoxLayout(pnlHistorico, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(pnlHistorico);

        tfMensagem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMensagemActionPerformed(evt);
            }
        });
        tfMensagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfMensagemKeyReleased(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        lbNomeCompletoDestinatario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbNomeCompletoDestinatario.setForeground(new java.awt.Color(255, 255, 255));
        lbNomeCompletoDestinatario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNomeCompletoDestinatario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/status.png"))); // NOI18N
        lbNomeCompletoDestinatario.setText("Nome Completo Destinatário");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbNomeCompletoDestinatario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbNomeCompletoDestinatario)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(tfMensagem)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tfMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMensagemActionPerformed

    }//GEN-LAST:event_tfMensagemActionPerformed

    private void tfMensagemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMensagemKeyReleased
        String msg = tfMensagem.getText();
        if (evt.getKeyCode() == 10) {
            if (!(msg.equals(""))) {
                tfMensagem.setText("");
                Calendar c = Calendar.getInstance();
                Mensagem mensagem = new Mensagem(eu, msg, c.getTime());
                eu.perfil.upConversa(p, eu, mensagem);
                atualizaConversa();
            }
        }
    }//GEN-LAST:event_tfMensagemKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNomeCompletoDestinatario;
    private javax.swing.JPanel pnlHistorico;
    private javax.swing.JTextField tfMensagem;
    // End of variables declaration//GEN-END:variables

    private void atualizaConversa() {
        pnlHistorico.removeAll();
        int tu = p.login.getTipoUsuario();
        if (tu == 0) {
            PessoaFisica pf = (PessoaFisica) p;
            lbNomeCompletoDestinatario.setText(pf.getNome());
        } else if (tu == 1) {
            PessoaJuridica pj = (PessoaJuridica) p;
            lbNomeCompletoDestinatario.setText(pj.getNomeFantasia());
        } else if (tu == 2) {
            EntFilantropica ent = (EntFilantropica) p;
            lbNomeCompletoDestinatario.setText(ent.getNomeFantasia());
        }
        int status = p.login.getStatus();
        if (status == 1) {
            lbNomeCompletoDestinatario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/status-ocupado.png")));
        } else if (status == 2) {
            lbNomeCompletoDestinatario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/status-indisponivel.png")));
        } else if (status == 0) {
            lbNomeCompletoDestinatario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/status-disponivel.png")));
        }
        conversa = eu.perfil.getConversa(p);
        List msgs = conversa.getMensagens();
        for (Object msgO : msgs) {
            Mensagem msg = (Mensagem) msgO;
            if (msg.getRemetente() == eu) {
                MsgRemetentePL msgHistorico = new MsgRemetentePL(msg);
                pnlHistorico.add(msgHistorico);
            } else {
                MsgDestinatarioPL msgHistorico = new MsgDestinatarioPL(msg);
                pnlHistorico.add(msgHistorico);
            }
        }
        pnlHistorico.repaint();
        pnlHistorico.validate();
        jScrollPane1.validate();
        jScrollPane1.getViewport().setViewPosition(new Point(999999999, 999999999));
    }
}
