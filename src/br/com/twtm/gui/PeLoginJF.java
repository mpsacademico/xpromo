package br.com.twtm.gui;

import br.com.twtm.estruturas.Logins;
import br.com.twtm.exceptions.CamposVaziosException;
import br.com.twtm.xpromo.Login;
import br.com.twtm.xpromo.Pessoa;

import br.com.twtm.xpromo.PessoaFisica;
import br.com.twtm.xpromo.PessoaJuridica;
import java.awt.Toolkit;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import mps.Placeholder;

public class PeLoginJF extends javax.swing.JFrame {

    Login login;

    public PeLoginJF() {
        initComponents();
        login = new Login();
        //O char '\u0000' significa caracter nulo
        pwSenhaLogin.setEchoChar('\u0000');
        pwSenhaCadastro.setEchoChar('\u0000');
        pwConfirmarSenha.setEchoChar('\u0000');
        pnlCadastro.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTotal = new javax.swing.JPanel();
        btFechar = new javax.swing.JButton();
        pnlLogomarca = new javax.swing.JPanel();
        lbLogomarca = new javax.swing.JLabel();
        lbSlogan01 = new javax.swing.JLabel();
        lbSlogan02 = new javax.swing.JLabel();
        lpnlAutenticacao = new javax.swing.JLayeredPane();
        pnlLogin = new javax.swing.JPanel();
        tfEmailLogin = new javax.swing.JTextField();
        btEntrar = new javax.swing.JButton();
        pwSenhaLogin = new javax.swing.JPasswordField();
        lbLogin = new javax.swing.JLabel();
        lbOu = new javax.swing.JLabel();
        lbCadastroLink = new javax.swing.JLabel();
        lbEsqueceuSenha = new javax.swing.JLabel();
        lbCadastroLink1 = new javax.swing.JLabel();
        pnlCadastro = new javax.swing.JPanel();
        tfEmailCadastro = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        pwSenhaCadastro = new javax.swing.JPasswordField();
        lbCadastro = new javax.swing.JLabel();
        lbOu2 = new javax.swing.JLabel();
        lbLoginLink = new javax.swing.JLabel();
        pwConfirmarSenha = new javax.swing.JPasswordField();
        cbTipoPessoa = new javax.swing.JComboBox();
        ckbTermosUso = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("XPROMO");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/twtm/imagens/icone-xpromo.png")));
        setUndecorated(true);
        setResizable(false);

        pnlTotal.setBackground(new java.awt.Color(0, 102, 102));
        pnlTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 153)));

        btFechar.setBackground(new java.awt.Color(0, 102, 102));
        btFechar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btFechar.setForeground(new java.awt.Color(255, 255, 255));
        btFechar.setText("X");
        btFechar.setToolTipText("Fechar");
        btFechar.setBorder(null);
        btFechar.setBorderPainted(false);
        btFechar.setContentAreaFilled(false);
        btFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btFechar.setFocusPainted(false);
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        pnlLogomarca.setBackground(new java.awt.Color(0, 102, 102));

        lbLogomarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/logomarca-grande.png"))); // NOI18N

        lbSlogan01.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lbSlogan01.setForeground(new java.awt.Color(255, 255, 255));
        lbSlogan01.setText("Explore seu mundo");

        lbSlogan02.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lbSlogan02.setForeground(new java.awt.Color(255, 255, 255));
        lbSlogan02.setText("de interesses!");

        javax.swing.GroupLayout pnlLogomarcaLayout = new javax.swing.GroupLayout(pnlLogomarca);
        pnlLogomarca.setLayout(pnlLogomarcaLayout);
        pnlLogomarcaLayout.setHorizontalGroup(
            pnlLogomarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogomarcaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLogomarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbLogomarca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbSlogan01, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbSlogan02, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pnlLogomarcaLayout.setVerticalGroup(
            pnlLogomarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogomarcaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLogomarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSlogan01)
                .addGap(1, 1, 1)
                .addComponent(lbSlogan02)
                .addContainerGap())
        );

        pnlLogin.setBackground(new java.awt.Color(0, 102, 102));

        tfEmailLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfEmailLogin.setText("E-mail");
        tfEmailLogin.setToolTipText("E-mail");
        tfEmailLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfEmailLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfEmailLoginFocusLost(evt);
            }
        });
        tfEmailLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailLoginActionPerformed(evt);
            }
        });

        btEntrar.setBackground(new java.awt.Color(153, 0, 255));
        btEntrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btEntrar.setText("Entrar");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        pwSenhaLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pwSenhaLogin.setText("Senha ");
        pwSenhaLogin.setToolTipText("Senha");
        pwSenhaLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwSenhaLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwSenhaLoginFocusLost(evt);
            }
        });
        pwSenhaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwSenhaLoginActionPerformed(evt);
            }
        });

        lbLogin.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        lbLogin.setForeground(new java.awt.Color(255, 255, 255));
        lbLogin.setText("Login");

        lbOu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbOu.setForeground(new java.awt.Color(255, 255, 255));
        lbOu.setText("ou");

        lbCadastroLink.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbCadastroLink.setForeground(new java.awt.Color(204, 204, 255));
        lbCadastroLink.setText("Cadastro");
        lbCadastroLink.setToolTipText("");
        lbCadastroLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbCadastroLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCadastroLinkMouseClicked(evt);
            }
        });

        lbEsqueceuSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbEsqueceuSenha.setForeground(new java.awt.Color(0, 102, 102));
        lbEsqueceuSenha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbEsqueceuSenha.setText("Esqueceu sua senha?");

        lbCadastroLink1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbCadastroLink1.setForeground(new java.awt.Color(204, 204, 255));
        lbCadastroLink1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCadastroLink1.setText("Cadastre-se");
        lbCadastroLink1.setToolTipText("");
        lbCadastroLink1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbCadastroLink1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCadastroLink1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfEmailLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pwSenhaLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlLoginLayout.createSequentialGroup()
                            .addComponent(lbEsqueceuSenha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addComponent(lbLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbOu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCadastroLink))
                    .addComponent(lbCadastroLink1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLogin)
                    .addComponent(lbOu)
                    .addComponent(lbCadastroLink))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfEmailLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pwSenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEsqueceuSenha)
                .addGap(96, 96, 96)
                .addComponent(lbCadastroLink1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pnlCadastro.setBackground(new java.awt.Color(0, 102, 102));

        tfEmailCadastro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfEmailCadastro.setText("E-mail");
        tfEmailCadastro.setToolTipText("E-mail");
        tfEmailCadastro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfEmailCadastroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfEmailCadastroFocusLost(evt);
            }
        });
        tfEmailCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailCadastroActionPerformed(evt);
            }
        });

        btCadastrar.setBackground(new java.awt.Color(153, 0, 255));
        btCadastrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        pwSenhaCadastro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pwSenhaCadastro.setText("Senha ");
        pwSenhaCadastro.setToolTipText("Senha");
        pwSenhaCadastro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwSenhaCadastroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwSenhaCadastroFocusLost(evt);
            }
        });
        pwSenhaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwSenhaCadastroActionPerformed(evt);
            }
        });

        lbCadastro.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        lbCadastro.setForeground(new java.awt.Color(255, 255, 255));
        lbCadastro.setText("Cadastro");

        lbOu2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbOu2.setForeground(new java.awt.Color(255, 255, 255));
        lbOu2.setText("ou");

        lbLoginLink.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbLoginLink.setForeground(new java.awt.Color(204, 204, 255));
        lbLoginLink.setText("Login");
        lbLoginLink.setToolTipText("");
        lbLoginLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbLoginLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLoginLinkMouseClicked(evt);
            }
        });

        pwConfirmarSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pwConfirmarSenha.setText("Confirmar Senha");
        pwConfirmarSenha.setToolTipText("Senha");
        pwConfirmarSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwConfirmarSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwConfirmarSenhaFocusLost(evt);
            }
        });
        pwConfirmarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwConfirmarSenhaActionPerformed(evt);
            }
        });

        cbTipoPessoa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbTipoPessoa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pessoa Física", "Pessoa Jurídica", "Entidade Filantrópica" }));

        ckbTermosUso.setBackground(new java.awt.Color(0, 102, 102));
        ckbTermosUso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ckbTermosUso.setForeground(new java.awt.Color(204, 204, 255));
        ckbTermosUso.setText("Concorda com nossos ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Termos de Uso");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlCadastroLayout = new javax.swing.GroupLayout(pnlCadastro);
        pnlCadastro.setLayout(pnlCadastroLayout);
        pnlCadastroLayout.setHorizontalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbTipoPessoa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfEmailCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pwSenhaCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pwConfirmarSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btCadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCadastroLayout.createSequentialGroup()
                                .addComponent(lbCadastro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbOu2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbLoginLink)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ckbTermosUso, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlCadastroLayout.setVerticalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCadastro)
                    .addComponent(lbOu2)
                    .addComponent(lbLoginLink))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfEmailCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pwSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pwConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbTermosUso)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout lpnlAutenticacaoLayout = new javax.swing.GroupLayout(lpnlAutenticacao);
        lpnlAutenticacao.setLayout(lpnlAutenticacaoLayout);
        lpnlAutenticacaoLayout.setHorizontalGroup(
            lpnlAutenticacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpnlAutenticacaoLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(lpnlAutenticacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lpnlAutenticacaoLayout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(pnlCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(58, Short.MAX_VALUE)))
        );
        lpnlAutenticacaoLayout.setVerticalGroup(
            lpnlAutenticacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpnlAutenticacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(lpnlAutenticacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lpnlAutenticacaoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        lpnlAutenticacao.setLayer(pnlLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpnlAutenticacao.setLayer(pnlCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(" ® 2015 TWTM");

        javax.swing.GroupLayout pnlTotalLayout = new javax.swing.GroupLayout(pnlTotal);
        pnlTotal.setLayout(pnlTotalLayout);
        pnlTotalLayout.setHorizontalGroup(
            pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTotalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTotalLayout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(pnlLogomarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lpnlAutenticacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlTotalLayout.setVerticalGroup(
            pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTotalLayout.createSequentialGroup()
                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTotalLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lpnlAutenticacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTotalLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(pnlLogomarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Já vai indo?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (op == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btFecharActionPerformed

    private void tfEmailLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailLoginActionPerformed

    }//GEN-LAST:event_tfEmailLoginActionPerformed

    private void pwSenhaLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwSenhaLoginFocusGained
        Placeholder.placeholderSenha(pwSenhaLogin, "Senha ", String.valueOf(pwSenhaLogin.getPassword()));
    }//GEN-LAST:event_pwSenhaLoginFocusGained

    private void pwSenhaLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwSenhaLoginFocusLost
        Placeholder.placeholderSenha(pwSenhaLogin, "Senha ", String.valueOf(pwSenhaLogin.getPassword()));
    }//GEN-LAST:event_pwSenhaLoginFocusLost

    private void pwSenhaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwSenhaLoginActionPerformed

    }//GEN-LAST:event_pwSenhaLoginActionPerformed

    private void tfEmailLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEmailLoginFocusGained
        Placeholder.placeholderTexto(tfEmailLogin, "E-mail", tfEmailLogin.getText());
    }//GEN-LAST:event_tfEmailLoginFocusGained

    private void tfEmailLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEmailLoginFocusLost
        Placeholder.placeholderTexto(tfEmailLogin, "E-mail", tfEmailLogin.getText());
    }//GEN-LAST:event_tfEmailLoginFocusLost

    private void tfEmailCadastroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEmailCadastroFocusGained
        Placeholder.placeholderTexto(tfEmailCadastro, "E-mail", tfEmailCadastro.getText());
    }//GEN-LAST:event_tfEmailCadastroFocusGained

    private void tfEmailCadastroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEmailCadastroFocusLost
        Placeholder.placeholderTexto(tfEmailCadastro, "E-mail", tfEmailCadastro.getText());
    }//GEN-LAST:event_tfEmailCadastroFocusLost

    private void tfEmailCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailCadastroActionPerformed

    }//GEN-LAST:event_tfEmailCadastroActionPerformed

    private void pwSenhaCadastroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwSenhaCadastroFocusGained
        Placeholder.placeholderSenha(pwSenhaCadastro, "Senha ", String.valueOf(pwSenhaCadastro.getPassword()));
    }//GEN-LAST:event_pwSenhaCadastroFocusGained

    private void pwSenhaCadastroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwSenhaCadastroFocusLost
        Placeholder.placeholderSenha(pwSenhaCadastro, "Senha ", String.valueOf(pwSenhaCadastro.getPassword()));
    }//GEN-LAST:event_pwSenhaCadastroFocusLost

    private void pwSenhaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwSenhaCadastroActionPerformed

    }//GEN-LAST:event_pwSenhaCadastroActionPerformed

    private void pwConfirmarSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwConfirmarSenhaFocusGained
        Placeholder.placeholderSenha(pwConfirmarSenha, "Confirmar Senha", String.valueOf(pwConfirmarSenha.getPassword()));
    }//GEN-LAST:event_pwConfirmarSenhaFocusGained

    private void pwConfirmarSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwConfirmarSenhaFocusLost
        Placeholder.placeholderSenha(pwConfirmarSenha, "Confirmar Senha", String.valueOf(pwConfirmarSenha.getPassword()));
    }//GEN-LAST:event_pwConfirmarSenhaFocusLost

    private void pwConfirmarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwConfirmarSenhaActionPerformed

    }//GEN-LAST:event_pwConfirmarSenhaActionPerformed

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        Pessoa p = Logins.procurarLogin(tfEmailLogin.getText(), String.valueOf(pwSenhaLogin.getPassword()));
        System.err.println(p);
        if (p != null) {
            if (p.getLogin().isValidadeCad()) {
                if (p.login.isBloqueio() == false) {
                    int tu = p.login.getTipoUsuario();
                    if (tu == 0) {
                        PessoaFisica pf = (PessoaFisica) p;
                        PfTelaInicial frTelaInicial = new PfTelaInicial(pf);
                        frTelaInicial.setVisible(true);
                        System.out.println(pf.perfil.isVer());
                        if (pf.perfil.isVer() == true) {
                            PeMsgTourJD t = new PeMsgTourJD(null, true, pf);
                            t.setVisible(true);
                        }
                    } else if (tu == 1 || tu == 2) {
                        PessoaJuridica pj = (PessoaJuridica) p;
                        PjTelaInicial frTelaInicial = new PjTelaInicial(pj);
                        frTelaInicial.setVisible(true);
                        if (pj.perfil.isVer() == true) {
                            PeMsgTourJD t = new PeMsgTourJD(null, true, pj);
                            t.setVisible(true);
                        }
                    } else if (tu == 3) {
                        AdmTelaInicialJF admTelaInicialJF = new AdmTelaInicialJF(p);
                        admTelaInicialJF.setVisible(true);
                    }
                    this.dispose();
                } else {
                    PeUsuarioSuspensoJD peUsuarioSuspensoJD = new PeUsuarioSuspensoJD(this, true);
                    peUsuarioSuspensoJD.setVisible(true);
                    tfEmailLogin.setText("E-mail");
                    pwSenhaLogin.setText("Senha ");
                }
            } else {
                int tu = p.login.getTipoUsuario();
                if (tu == 0) {
                    PfContaFR frConta = new PfContaFR(p, false);
                    frConta.setVisible(true);
                } else if (tu == 1 || tu == 2) {
                    PjContaFR frConta = new PjContaFR(p, false);
                    frConta.setVisible(true);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Verifique seu login e tente novamente!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btEntrarActionPerformed

    private void lbCadastroLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCadastroLinkMouseClicked
        pnlLogin.setVisible(false);
        pnlCadastro.setVisible(true);
    }//GEN-LAST:event_lbCadastroLinkMouseClicked

    private void lbLoginLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLoginLinkMouseClicked
        pnlCadastro.setVisible(false);
        pnlLogin.setVisible(true);
    }//GEN-LAST:event_lbLoginLinkMouseClicked

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        try {
            if (this.vpCamposCadastro()) {
                if (Logins.loginExiste(tfEmailCadastro.getText())) {
                    throw new Exception("Escolha algum outro login!");
                }
                if (this.compararSenhas()) {
                    if (ckbTermosUso.isSelected()) {
                        Login novoLogin = new Login(
                                tfEmailCadastro.getText(),
                                String.valueOf(pwSenhaCadastro.getPassword()),
                                cbTipoPessoa.getSelectedIndex(),
                                false
                        );
                        Logins.cadastrar(novoLogin);
                        if (cbTipoPessoa.getSelectedIndex() == 0) {
                            PfContaFR frContaInicial = new PfContaFR(novoLogin);
                            frContaInicial.setVisible(true);
                        } else if (cbTipoPessoa.getSelectedIndex() == 1 || cbTipoPessoa.getSelectedIndex() == 2) {
                            PjContaFR frContaInicial = new PjContaFR(novoLogin);
                            frContaInicial.setVisible(true);
                        }
                        this.dispose();
                    } else {
                        throw new Exception("É necessário aceitar os nossos Termos de Uso!");
                    }

                } else {
                    throw new Exception("As senhas não coincidem!");
                }
            } else {
                throw new CamposVaziosException();
            }
        } catch (CamposVaziosException e) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "XPROMO", JOptionPane.WARNING_MESSAGE);
            //System.err.println(e.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "XPROMO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        PeTermosUsoJD tlTermosUso = new PeTermosUsoJD(this, true);
        tlTermosUso.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void lbCadastroLink1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCadastroLink1MouseClicked
        pnlLogin.setVisible(false);
        pnlCadastro.setVisible(true);
    }//GEN-LAST:event_lbCadastroLink1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btEntrar;
    private javax.swing.JButton btFechar;
    private javax.swing.JComboBox cbTipoPessoa;
    private javax.swing.JCheckBox ckbTermosUso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbCadastro;
    private javax.swing.JLabel lbCadastroLink;
    private javax.swing.JLabel lbCadastroLink1;
    private javax.swing.JLabel lbEsqueceuSenha;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbLoginLink;
    private javax.swing.JLabel lbLogomarca;
    private javax.swing.JLabel lbOu;
    private javax.swing.JLabel lbOu2;
    private javax.swing.JLabel lbSlogan01;
    private javax.swing.JLabel lbSlogan02;
    private javax.swing.JLayeredPane lpnlAutenticacao;
    private javax.swing.JPanel pnlCadastro;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlLogomarca;
    private javax.swing.JPanel pnlTotal;
    private javax.swing.JPasswordField pwConfirmarSenha;
    private javax.swing.JPasswordField pwSenhaCadastro;
    private javax.swing.JPasswordField pwSenhaLogin;
    private javax.swing.JTextField tfEmailCadastro;
    private javax.swing.JTextField tfEmailLogin;
    // End of variables declaration//GEN-END:variables

    private void limparLogin() {
        tfEmailLogin.setText("E-mail");
        pwSenhaLogin.setText("Senha ");
    }

    private void limparCadastro() {
        tfEmailCadastro.setText("E-mail");
        pwSenhaCadastro.setText("Senha ");
        pwConfirmarSenha.setText("Confirmar Senha");
        cbTipoPessoa.setSelectedIndex(0);
        ckbTermosUso.setSelected(false);
    }

    //verificar preenchimento dos campos do cadastro
    private boolean vpCamposCadastro() {
        String email = tfEmailCadastro.getText();
        String senha = String.valueOf(pwSenhaCadastro.getPassword());
        String confirmarSenha = String.valueOf(pwConfirmarSenha.getPassword());
        return !(email.equals("")
                || senha.equals("")
                || email.equals("E-mail")
                || senha.equals("Senha ")
                || confirmarSenha.equals("")
                || confirmarSenha.equals("Confirmar Senha"));
    }

    private boolean compararSenhas() {
        String senha = String.valueOf(pwSenhaCadastro.getPassword());
        String confirmarSenha = String.valueOf(pwConfirmarSenha.getPassword());
        return (senha.equals(confirmarSenha));
    }
}
