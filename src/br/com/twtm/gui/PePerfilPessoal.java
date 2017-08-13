package br.com.twtm.gui;

import br.com.twtm.xpromo.Pessoa;
import br.com.twtm.xpromo.PessoaFisica;
import br.com.twtm.xpromo.PessoaJuridica;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PePerfilPessoal extends javax.swing.JDialog {

    private Pessoa p;
    private PessoaFisica pf;
    private PessoaJuridica pj;
    //private EntFilantropica ent;
    private int alteracao = 0, tu;
    private String caminho = "perfil";
    private ImageIcon icone;
    private Frame parent, frTP;
    private JLabel lbImagemCartao;
    private PeVisualizarPerfil pvp;

    public PePerfilPessoal(java.awt.Frame parent, boolean modal, Pessoa p) {
        super(parent, modal);
        initComponents();
        this.p = p;
        this.tu = p.login.getTipoUsuario();
        if (p.login.getTipoUsuario() == 0) {
            pf = (PessoaFisica) p;
            lbNome.setText(pf.getNome());
            //lbEmail.setText(this.p.login.getEmail());
        } else if (p.login.getTipoUsuario() == 1 || p.login.getTipoUsuario() == 2) {
            pj = (PessoaJuridica) p;
            lbNome.setText(pj.getNomeFantasia());
        }
        cbStatus.setSelectedIndex(p.login.getStatus());
        lbLocal.setText(p.end.getCidade() + " (" + p.end.getUf() + ")");
        tplQuemEuSou.setText(p.perfil.getQuemEuSou());
        pvp = new PeVisualizarPerfil(parent, true, p);
        pnlTopo.setBackground(p.perfil.getCor());
        icone = p.perfil.getIcone();
        lbFoto.setIcon(icone);
        icone.getImage().flush();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGeral = new javax.swing.JPanel();
        btOk = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        lbLocal = new javax.swing.JLabel();
        spnl01 = new javax.swing.JScrollPane();
        tplQuemEuSou = new javax.swing.JTextPane();
        lbFoto = new javax.swing.JLabel();
        pnlTopo = new javax.swing.JPanel();
        btCorPerfil = new javax.swing.JButton();
        cbStatus = new javax.swing.JComboBox();
        btCancelar = new javax.swing.JButton();
        btVisualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Perfil pessoal");
        setResizable(false);

        pnlGeral.setBackground(new java.awt.Color(255, 255, 255));
        pnlGeral.setMaximumSize(new java.awt.Dimension(636, 263));
        pnlGeral.setPreferredSize(new java.awt.Dimension(636, 263));

        btOk.setBackground(new java.awt.Color(153, 0, 255));
        btOk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btOk.setForeground(new java.awt.Color(255, 255, 255));
        btOk.setText("Salvar");
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });

        lbNome.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lbNome.setText("Nome Completo");

        lbLocal.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbLocal.setText("Cidade (UF)");

        spnl01.setBorder(null);

        tplQuemEuSou.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tplQuemEuSou.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tplQuemEuSou.setText("Conte um pouco sobre você e seus interesses");
        tplQuemEuSou.setToolTipText("Conte um pouco sobre você e seus interesses");
        tplQuemEuSou.setMaximumSize(new java.awt.Dimension(481, 86));
        spnl01.setViewportView(tplQuemEuSou);

        lbFoto.setBackground(new java.awt.Color(233, 234, 237));
        lbFoto.setForeground(new java.awt.Color(255, 255, 255));
        lbFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/perfil-alterar_128.png"))); // NOI18N
        lbFoto.setToolTipText("Clique para escolher uma imagem");
        lbFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbFoto.setMaximumSize(new java.awt.Dimension(128, 128));
        lbFoto.setMinimumSize(new java.awt.Dimension(128, 128));
        lbFoto.setPreferredSize(new java.awt.Dimension(128, 128));
        lbFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbFotoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbFotoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbFotoMouseExited(evt);
            }
        });

        pnlTopo.setBackground(new java.awt.Color(233, 234, 237));
        pnlTopo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btCorPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/balde-tinta_32.png"))); // NOI18N
        btCorPerfil.setToolTipText("Clique para alterar a cor de perfil");
        btCorPerfil.setBorderPainted(false);
        btCorPerfil.setContentAreaFilled(false);
        btCorPerfil.setFocusPainted(false);
        btCorPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCorPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTopoLayout = new javax.swing.GroupLayout(pnlTopo);
        pnlTopo.setLayout(pnlTopoLayout);
        pnlTopoLayout.setHorizontalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btCorPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlTopoLayout.setVerticalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btCorPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cbStatus.setBackground(new java.awt.Color(233, 234, 237));
        cbStatus.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Disponível", "Ocupado", "Indisponível" }));
        cbStatus.setToolTipText("Status");
        cbStatus.setBorder(null);

        btCancelar.setBackground(new java.awt.Color(153, 153, 153));
        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btVisualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/olho_16.png"))); // NOI18N
        btVisualizar.setText("Visualizar");
        btVisualizar.setBorderPainted(false);
        btVisualizar.setContentAreaFilled(false);
        btVisualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVisualizar.setFocusPainted(false);
        btVisualizar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVisualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlGeralLayout = new javax.swing.GroupLayout(pnlGeral);
        pnlGeral.setLayout(pnlGeralLayout);
        pnlGeralLayout.setHorizontalGroup(
            pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(pnlTopo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlGeralLayout.createSequentialGroup()
                        .addGap(0, 258, Short.MAX_VALUE)
                        .addComponent(btVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlGeralLayout.createSequentialGroup()
                        .addGroup(pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spnl01))))
                .addContainerGap())
        );
        pnlGeralLayout.setVerticalGroup(
            pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeralLayout.createSequentialGroup()
                .addComponent(pnlTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlGeralLayout.createSequentialGroup()
                        .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlGeralLayout.createSequentialGroup()
                        .addComponent(lbNome)
                        .addGap(2, 2, 2)
                        .addComponent(lbLocal)
                        .addGap(17, 17, 17)
                        .addComponent(spnl01)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btOk)
                    .addComponent(btCancelar)
                    .addComponent(btVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
        int temp = 0;
        String doc = "perfil";
        if (alteracao != 0) {
            if (tu == 0) {
                doc = pf.getCpf();
            } else if (tu == 1 || tu == 2) {
                doc = pj.getCnpj();
            }
            doc = doc.replaceAll("[^0-9]", "");
            try {
                File f = new File(caminho);
                BufferedImage fundo = ImageIO.read(new File(caminho));
                BufferedImage image = new BufferedImage(128, 128, BufferedImage.TYPE_INT_RGB);
                Graphics g = image.getGraphics();
                g.drawImage(fundo.getScaledInstance(128, 128, 10000), 0, 0, null);
                ImageIcon novoIcone = new ImageIcon(image);
                ImageIcon icone48 = new ImageIcon(novoIcone.getImage().getScaledInstance(48, 48, Image.SCALE_DEFAULT));
                lbImagemCartao.setIcon(icone48);
                ImageIO.write(image, "PNG", new File("src/br/com/twtm/dominio/imagens/" + doc + ".png"));
                p.perfil.setFoto(doc);
                p.perfil.setIcone(novoIcone);
            } catch (Exception ex) {
                temp = 1;
                JOptionPane.showMessageDialog(null, "A ação não foi completada!\nTente carregar uma outra imagem!", "XPROMO!", JOptionPane.ERROR_MESSAGE);
            }
        }
        p.perfil.setQuemEuSou(tplQuemEuSou.getText());
        if (temp == 0) {
            p.login.setStatus(cbStatus.getSelectedIndex());
            JOptionPane.showMessageDialog(null, "Perfil atualizado com sucesso!", "XPROMO", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
    }//GEN-LAST:event_btOkActionPerformed

    private void lbFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFotoMouseClicked
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Escolher imagem de perfil");
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fileChooser.setFileFilter(new FileNameExtensionFilter("Image files", "bmp", "png", "jpg"));
            if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                this.caminho = fileChooser.getSelectedFile().getAbsolutePath();
                icone = new ImageIcon(fileChooser.getSelectedFile().getPath());
                ImageIcon iconeRedimensionado = new ImageIcon(icone.getImage().getScaledInstance(128, 128, Image.SCALE_DEFAULT));
                pvp.atualizarImagem(iconeRedimensionado);
                lbFoto.setIcon(icone);
                icone.getImage().flush();
                alteracao++;
            }
        } catch (Exception ex) {
            lbFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/dominio/imagens/" + p.perfil.getFoto() + ".png")));
            JOptionPane.showMessageDialog(null, "Não foi possível carregar a imagem!", "XPROMO", JOptionPane.ERROR_MESSAGE);
            alteracao = 0;
        }
    }//GEN-LAST:event_lbFotoMouseClicked

    private void lbFotoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFotoMouseEntered
        lbFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/perfil-alterar_128.png")));
    }//GEN-LAST:event_lbFotoMouseEntered

    private void lbFotoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFotoMouseExited
        lbFoto.setIcon(icone);
    }//GEN-LAST:event_lbFotoMouseExited

    private void btCorPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCorPerfilActionPerformed
        PeCorPerfilJD corPerfilJD = new PeCorPerfilJD(parent, true, p, pnlTopo);
        corPerfilJD.setVisible(true);
    }//GEN-LAST:event_btCorPerfilActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVisualizarActionPerformed
        if (alteracao == 0) {
            pvp.atualizarImagem(icone);
        }
        pvp.atualizarTexto(tplQuemEuSou.getText());
        pvp.atualizarCor(pnlTopo.getBackground());
        pvp.setVisible(true);
    }//GEN-LAST:event_btVisualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btCorPerfil;
    private javax.swing.JButton btOk;
    private javax.swing.JButton btVisualizar;
    private javax.swing.JComboBox cbStatus;
    private javax.swing.JLabel lbFoto;
    private javax.swing.JLabel lbLocal;
    private javax.swing.JLabel lbNome;
    private javax.swing.JPanel pnlGeral;
    private javax.swing.JPanel pnlTopo;
    private javax.swing.JScrollPane spnl01;
    private javax.swing.JTextPane tplQuemEuSou;
    // End of variables declaration//GEN-END:variables

    void setImagemCartao(JLabel lbFoto) {
        this.lbImagemCartao = lbFoto;
    }

}
