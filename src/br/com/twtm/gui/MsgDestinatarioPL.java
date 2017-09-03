package br.com.twtm.gui;

import br.com.twtm.xpromo.Mensagem;
import java.awt.Image;
import java.net.URL;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;

public class MsgDestinatarioPL extends javax.swing.JPanel {

    public MsgDestinatarioPL(Mensagem msg) {
        initComponents();        
        ImageIcon icone48 = new ImageIcon(msg.getRemetente().perfil.getIcone().getImage().getScaledInstance(48, 48, Image.SCALE_DEFAULT));
        lbFoto.setIcon(icone48);
        icone48.getImage().flush();
        SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
        String data = out.format(msg.getHorario());
        String dh = data;
        out = new SimpleDateFormat("HH:mm:ss");
        data = out.format(msg.getHorario());
        lbHorario.setText(dh.concat(" às " + data));
        tpnlMensagem.setText(msg.getMensagem());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundo = new javax.swing.JPanel();
        lbFoto = new javax.swing.JLabel();
        pnlBalao = new javax.swing.JPanel();
        spnl01 = new javax.swing.JScrollPane();
        tpnlMensagem = new javax.swing.JTextPane();
        lbHorario = new javax.swing.JLabel();
        lbPontinhaBalao = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(680, 89));
        setMinimumSize(new java.awt.Dimension(680, 89));
        setPreferredSize(new java.awt.Dimension(680, 89));

        pnlFundo.setBackground(new java.awt.Color(233, 234, 237));
        pnlFundo.setMaximumSize(new java.awt.Dimension(672, 89));
        pnlFundo.setMinimumSize(new java.awt.Dimension(672, 89));
        pnlFundo.setPreferredSize(new java.awt.Dimension(672, 89));

        lbFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/perfil_48.png"))); // NOI18N

        pnlBalao.setBackground(new java.awt.Color(204, 193, 218));
        pnlBalao.setMaximumSize(new java.awt.Dimension(550, 70));
        pnlBalao.setMinimumSize(new java.awt.Dimension(550, 70));
        pnlBalao.setPreferredSize(new java.awt.Dimension(550, 70));

        spnl01.setBorder(null);
        spnl01.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tpnlMensagem.setEditable(false);
        tpnlMensagem.setBackground(new java.awt.Color(204, 193, 218));
        tpnlMensagem.setBorder(null);
        tpnlMensagem.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        spnl01.setViewportView(tpnlMensagem);

        lbHorario.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lbHorario.setForeground(new java.awt.Color(102, 102, 102));
        lbHorario.setText("XX/XX/XXXX às XX:XX:XX");

        javax.swing.GroupLayout pnlBalaoLayout = new javax.swing.GroupLayout(pnlBalao);
        pnlBalao.setLayout(pnlBalaoLayout);
        pnlBalaoLayout.setHorizontalGroup(
            pnlBalaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBalaoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lbHorario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBalaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spnl01))
        );
        pnlBalaoLayout.setVerticalGroup(
            pnlBalaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBalaoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(spnl01, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(lbHorario))
        );

        lbPontinhaBalao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/ponta-balao-01.png"))); // NOI18N

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lbFoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPontinhaBalao)
                .addGap(0, 0, 0)
                .addComponent(pnlBalao, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBalao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPontinhaBalao)
                    .addComponent(lbFoto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, 92, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbFoto;
    private javax.swing.JLabel lbHorario;
    private javax.swing.JLabel lbPontinhaBalao;
    private javax.swing.JPanel pnlBalao;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JScrollPane spnl01;
    private javax.swing.JTextPane tpnlMensagem;
    // End of variables declaration//GEN-END:variables

}
