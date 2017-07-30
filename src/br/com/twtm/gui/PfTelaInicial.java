package br.com.twtm.gui;

import br.com.twtm.xpromo.Pessoa;
import br.com.twtm.xpromo.PessoaFisica;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PfTelaInicial extends javax.swing.JFrame {

    private InteressesPL pnlInteressesPL;
    private JFrame jfConversas, jfAmizades, jfConta;
    private PessoaFisica pf;
    private int tipo = 0;
    private int filtroPressionado = 9;

    public PfTelaInicial(PessoaFisica pf) {
        this.pf = pf;
        initComponents();
        ImageIcon icone48 = new ImageIcon(pf.perfil.getIcone().getImage().getScaledInstance(48, 48, Image.SCALE_DEFAULT));
        lbFoto.setIcon(icone48);
        icone48.getImage().flush();
        lbApelido.setText(pf.getNome());
        lbEmail.setText(pf.getEmail());
        listarAmigos(9);
        verificaStatus(pf.login.getStatus());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ppmSair = new javax.swing.JPopupMenu();
        mitConta = new javax.swing.JMenuItem();
        mitAcesso = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mitAjuda = new javax.swing.JMenuItem();
        mitOpiniao = new javax.swing.JMenuItem();
        mitSobre = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mitSair = new javax.swing.JMenuItem();
        pnlFundo = new javax.swing.JPanel();
        pnlCabecalho = new javax.swing.JPanel();
        lbLogomarca = new javax.swing.JLabel();
        btOpcoes = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        pnlCartao = new javax.swing.JPanel();
        lbFoto = new javax.swing.JLabel();
        lbApelido = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        spnl01 = new javax.swing.JScrollPane();
        pnlAmigos = new javax.swing.JPanel();
        pnlMenuSocial = new javax.swing.JPanel();
        btPerfil = new javax.swing.JButton();
        btAmizades = new javax.swing.JButton();
        btConversas = new javax.swing.JButton();
        btTodos = new javax.swing.JButton();
        btPessoas = new javax.swing.JButton();
        btEmpresas = new javax.swing.JButton();
        btEntidades = new javax.swing.JButton();
        pnlStatus = new javax.swing.JPanel();
        lbNumAmigos = new javax.swing.JLabel();
        lbAmigo = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();
        pnlAnuncioLateral = new javax.swing.JPanel();
        pnlControleAnuncios = new javax.swing.JPanel();
        lbDescAnuncios = new javax.swing.JLabel();
        btSobreAnuncios = new javax.swing.JButton();
        btFecharAnuncio = new javax.swing.JButton();
        pnlExibicaoAnuncio = new javax.swing.JPanel();
        lbAnuncio = new javax.swing.JButton();
        pnlGeral = new javax.swing.JPanel();
        pnlMenuPrincipal = new javax.swing.JPanel();
        btOfertas = new javax.swing.JButton();
        btInteresses = new javax.swing.JButton();
        btCompras = new javax.swing.JButton();
        btVendas = new javax.swing.JButton();
        btServicos = new javax.swing.JButton();
        btAmostras = new javax.swing.JButton();
        btFeira = new javax.swing.JButton();
        btDoacoes = new javax.swing.JButton();
        btXpromo = new javax.swing.JButton();

        ppmSair.setBackground(new java.awt.Color(0, 102, 102));
        ppmSair.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mitConta.setBackground(new java.awt.Color(0, 102, 102));
        mitConta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mitConta.setForeground(new java.awt.Color(255, 255, 255));
        mitConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/conta_24.png"))); // NOI18N
        mitConta.setText("Conta");
        mitConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitContaActionPerformed(evt);
            }
        });
        ppmSair.add(mitConta);

        mitAcesso.setBackground(new java.awt.Color(0, 102, 102));
        mitAcesso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mitAcesso.setForeground(new java.awt.Color(255, 255, 255));
        mitAcesso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/acesso_24.png"))); // NOI18N
        mitAcesso.setText("Acesso");
        mitAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitAcessoActionPerformed(evt);
            }
        });
        ppmSair.add(mitAcesso);
        ppmSair.add(jSeparator1);

        mitAjuda.setBackground(new java.awt.Color(0, 102, 102));
        mitAjuda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mitAjuda.setForeground(new java.awt.Color(255, 255, 255));
        mitAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/ajuda_24.png"))); // NOI18N
        mitAjuda.setText("Ajuda");
        mitAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitAjudaActionPerformed(evt);
            }
        });
        ppmSair.add(mitAjuda);

        mitOpiniao.setBackground(new java.awt.Color(0, 102, 102));
        mitOpiniao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mitOpiniao.setForeground(new java.awt.Color(255, 255, 255));
        mitOpiniao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/opiniao_24.png"))); // NOI18N
        mitOpiniao.setText("Opinião");
        mitOpiniao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitOpiniaoActionPerformed(evt);
            }
        });
        ppmSair.add(mitOpiniao);

        mitSobre.setBackground(new java.awt.Color(0, 102, 102));
        mitSobre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mitSobre.setForeground(new java.awt.Color(255, 255, 255));
        mitSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/sobre_24.png"))); // NOI18N
        mitSobre.setText("Sobre");
        mitSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitSobreActionPerformed(evt);
            }
        });
        ppmSair.add(mitSobre);
        ppmSair.add(jSeparator2);

        mitSair.setBackground(new java.awt.Color(0, 102, 102));
        mitSair.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mitSair.setForeground(new java.awt.Color(255, 255, 255));
        mitSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/logout.png"))); // NOI18N
        mitSair.setText("Sair");
        mitSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitSairActionPerformed(evt);
            }
        });
        ppmSair.add(mitSair);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("XPROMO");
        setExtendedState(PfTelaInicial.MAXIMIZED_BOTH);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/twtm/imagens/icone-xpromo.png")));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlFundo.setBackground(new java.awt.Color(233, 234, 237));

        pnlCabecalho.setBackground(new java.awt.Color(0, 102, 102));

        lbLogomarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/logomarca-media.png"))); // NOI18N

        btOpcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/opcoes_32.png"))); // NOI18N
        btOpcoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOpcoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCabecalhoLayout = new javax.swing.GroupLayout(pnlCabecalho);
        pnlCabecalho.setLayout(pnlCabecalhoLayout);
        pnlCabecalhoLayout.setHorizontalGroup(
            pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLogomarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlCabecalhoLayout.setVerticalGroup(
            pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbLogomarca)
                    .addComponent(btOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jPanel4ComponentHidden(evt);
            }
        });

        pnlCartao.setBackground(new java.awt.Color(229, 229, 255));
        pnlCartao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlCartao.setMaximumSize(new java.awt.Dimension(242, 53));
        pnlCartao.setMinimumSize(new java.awt.Dimension(242, 53));
        pnlCartao.setPreferredSize(new java.awt.Dimension(242, 53));

        lbFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/perfil_48.png"))); // NOI18N

        lbApelido.setText("Nome");

        lbEmail.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lbEmail.setText("E-mail");

        javax.swing.GroupLayout pnlCartaoLayout = new javax.swing.GroupLayout(pnlCartao);
        pnlCartao.setLayout(pnlCartaoLayout);
        pnlCartaoLayout.setHorizontalGroup(
            pnlCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCartaoLayout.createSequentialGroup()
                .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(pnlCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbApelido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        pnlCartaoLayout.setVerticalGroup(
            pnlCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCartaoLayout.createSequentialGroup()
                .addGroup(pnlCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCartaoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbApelido)
                        .addGap(2, 2, 2)
                        .addComponent(lbEmail)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCartaoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1, Short.MAX_VALUE))
        );

        spnl01.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlAmigos.setBackground(new java.awt.Color(245, 245, 245));
        pnlAmigos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlAmigos.setLayout(new javax.swing.BoxLayout(pnlAmigos, javax.swing.BoxLayout.Y_AXIS));
        spnl01.setViewportView(pnlAmigos);

        pnlMenuSocial.setBackground(new java.awt.Color(255, 255, 255));
        pnlMenuSocial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlMenuSocial.setPreferredSize(new java.awt.Dimension(100, 43));

        btPerfil.setBackground(new java.awt.Color(153, 102, 255));
        btPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlsocial/1.png"))); // NOI18N
        btPerfil.setBorderPainted(false);
        btPerfil.setContentAreaFilled(false);
        btPerfil.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlsocial/8.png"))); // NOI18N
        btPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPerfilActionPerformed(evt);
            }
        });

        btAmizades.setBackground(new java.awt.Color(153, 102, 255));
        btAmizades.setForeground(new java.awt.Color(255, 255, 255));
        btAmizades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlsocial/2.png"))); // NOI18N
        btAmizades.setBorderPainted(false);
        btAmizades.setContentAreaFilled(false);
        btAmizades.setPreferredSize(new java.awt.Dimension(85, 23));
        btAmizades.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlsocial/9.png"))); // NOI18N
        btAmizades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAmizadesActionPerformed(evt);
            }
        });

        btConversas.setBackground(new java.awt.Color(153, 102, 255));
        btConversas.setForeground(new java.awt.Color(255, 255, 255));
        btConversas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlsocial/3.png"))); // NOI18N
        btConversas.setBorderPainted(false);
        btConversas.setContentAreaFilled(false);
        btConversas.setPreferredSize(new java.awt.Dimension(85, 23));
        btConversas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlsocial/10.png"))); // NOI18N
        btConversas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConversasActionPerformed(evt);
            }
        });

        btTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlsocial/4.png"))); // NOI18N
        btTodos.setBorderPainted(false);
        btTodos.setContentAreaFilled(false);
        btTodos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlsocial/11.png"))); // NOI18N
        btTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTodosActionPerformed(evt);
            }
        });

        btPessoas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlsocial/5.png"))); // NOI18N
        btPessoas.setBorderPainted(false);
        btPessoas.setContentAreaFilled(false);
        btPessoas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlsocial/12.png"))); // NOI18N
        btPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPessoasActionPerformed(evt);
            }
        });

        btEmpresas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlsocial/6.png"))); // NOI18N
        btEmpresas.setBorderPainted(false);
        btEmpresas.setContentAreaFilled(false);
        btEmpresas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlsocial/13.png"))); // NOI18N
        btEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmpresasActionPerformed(evt);
            }
        });

        btEntidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlsocial/7.png"))); // NOI18N
        btEntidades.setBorderPainted(false);
        btEntidades.setContentAreaFilled(false);
        btEntidades.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlsocial/14.png"))); // NOI18N
        btEntidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntidadesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuSocialLayout = new javax.swing.GroupLayout(pnlMenuSocial);
        pnlMenuSocial.setLayout(pnlMenuSocialLayout);
        pnlMenuSocialLayout.setHorizontalGroup(
            pnlMenuSocialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuSocialLayout.createSequentialGroup()
                .addComponent(btPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btAmizades, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btConversas, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMenuSocialLayout.createSequentialGroup()
                .addComponent(btTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btEntidades, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlMenuSocialLayout.setVerticalGroup(
            pnlMenuSocialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuSocialLayout.createSequentialGroup()
                .addGroup(pnlMenuSocialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btAmizades, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConversas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlMenuSocialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEntidades, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlStatus.setBackground(new java.awt.Color(255, 200, 173));

        lbNumAmigos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbNumAmigos.setForeground(new java.awt.Color(51, 51, 51));
        lbNumAmigos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbNumAmigos.setText("9999");

        lbAmigo.setText("amigos");

        lbStatus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbStatus.setText("Status");
        lbStatus.setToolTipText("Clique para alterar seu status!");
        lbStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbStatusMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlStatusLayout = new javax.swing.GroupLayout(pnlStatus);
        pnlStatus.setLayout(pnlStatusLayout);
        pnlStatusLayout.setHorizontalGroup(
            pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlStatusLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lbStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNumAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlStatusLayout.setVerticalGroup(
            pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlStatusLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumAmigos)
                    .addComponent(lbAmigo)
                    .addComponent(lbStatus)))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCartao, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
            .addComponent(spnl01)
            .addComponent(pnlMenuSocial, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
            .addComponent(pnlStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(pnlCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlMenuSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spnl01, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(pnlStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlAnuncioLateral.setBackground(new java.awt.Color(255, 255, 255));

        pnlControleAnuncios.setBackground(new java.awt.Color(255, 255, 255));
        pnlControleAnuncios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbDescAnuncios.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDescAnuncios.setText("Anúncios Xpromo");

        btSobreAnuncios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/info_16.png"))); // NOI18N
        btSobreAnuncios.setToolTipText("Sobre os anúncios do Xpromo");
        btSobreAnuncios.setBorderPainted(false);
        btSobreAnuncios.setContentAreaFilled(false);
        btSobreAnuncios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSobreAnunciosActionPerformed(evt);
            }
        });

        btFecharAnuncio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/fechar_16.png"))); // NOI18N
        btFecharAnuncio.setToolTipText("Não quero ver esse anúncio!");
        btFecharAnuncio.setBorderPainted(false);
        btFecharAnuncio.setContentAreaFilled(false);
        btFecharAnuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharAnuncioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlControleAnunciosLayout = new javax.swing.GroupLayout(pnlControleAnuncios);
        pnlControleAnuncios.setLayout(pnlControleAnunciosLayout);
        pnlControleAnunciosLayout.setHorizontalGroup(
            pnlControleAnunciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlControleAnunciosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbDescAnuncios, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btSobreAnuncios, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btFecharAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlControleAnunciosLayout.setVerticalGroup(
            pnlControleAnunciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlControleAnunciosLayout.createSequentialGroup()
                .addGroup(pnlControleAnunciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btSobreAnuncios, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFecharAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDescAnuncios, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        pnlExibicaoAnuncio.setBackground(new java.awt.Color(246, 145, 70));
        pnlExibicaoAnuncio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbAnuncio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/anuncie-aqui.png"))); // NOI18N
        lbAnuncio.setBorderPainted(false);
        lbAnuncio.setContentAreaFilled(false);

        javax.swing.GroupLayout pnlExibicaoAnuncioLayout = new javax.swing.GroupLayout(pnlExibicaoAnuncio);
        pnlExibicaoAnuncio.setLayout(pnlExibicaoAnuncioLayout);
        pnlExibicaoAnuncioLayout.setHorizontalGroup(
            pnlExibicaoAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbAnuncio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlExibicaoAnuncioLayout.setVerticalGroup(
            pnlExibicaoAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExibicaoAnuncioLayout.createSequentialGroup()
                .addComponent(lbAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlAnuncioLateralLayout = new javax.swing.GroupLayout(pnlAnuncioLateral);
        pnlAnuncioLateral.setLayout(pnlAnuncioLateralLayout);
        pnlAnuncioLateralLayout.setHorizontalGroup(
            pnlAnuncioLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAnuncioLateralLayout.createSequentialGroup()
                .addComponent(pnlExibicaoAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(pnlControleAnuncios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlAnuncioLateralLayout.setVerticalGroup(
            pnlAnuncioLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAnuncioLateralLayout.createSequentialGroup()
                .addComponent(pnlExibicaoAnuncio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(pnlControleAnuncios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlGeral.setBackground(new java.awt.Color(255, 255, 255));
        pnlGeral.setLayout(new javax.swing.BoxLayout(pnlGeral, javax.swing.BoxLayout.LINE_AXIS));

        pnlMenuPrincipal.setBackground(new java.awt.Color(233, 234, 237));
        pnlMenuPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlMenuPrincipal.setPreferredSize(new java.awt.Dimension(0, 96));

        btOfertas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlmenuprincipal/ofertas2.png"))); // NOI18N
        btOfertas.setBorderPainted(false);
        btOfertas.setContentAreaFilled(false);
        btOfertas.setPreferredSize(new java.awt.Dimension(96, 96));
        btOfertas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlmenuprincipal/ofertas.png"))); // NOI18N
        btOfertas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btOfertasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btOfertasMouseExited(evt);
            }
        });
        btOfertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOfertasActionPerformed(evt);
            }
        });

        btInteresses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlmenuprincipal/interesses2.png"))); // NOI18N
        btInteresses.setBorderPainted(false);
        btInteresses.setContentAreaFilled(false);
        btInteresses.setPreferredSize(new java.awt.Dimension(96, 96));
        btInteresses.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlmenuprincipal/interesses.png"))); // NOI18N
        btInteresses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btInteressesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btInteressesMouseExited(evt);
            }
        });
        btInteresses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInteressesActionPerformed(evt);
            }
        });

        btCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlmenuprincipal/compras2.png"))); // NOI18N
        btCompras.setBorderPainted(false);
        btCompras.setContentAreaFilled(false);
        btCompras.setPreferredSize(new java.awt.Dimension(96, 96));
        btCompras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlmenuprincipal/compras.png"))); // NOI18N
        btCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btComprasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btComprasMouseExited(evt);
            }
        });
        btCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btComprasActionPerformed(evt);
            }
        });

        btVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlmenuprincipal/vendas2.png"))); // NOI18N
        btVendas.setBorderPainted(false);
        btVendas.setContentAreaFilled(false);
        btVendas.setPreferredSize(new java.awt.Dimension(96, 96));
        btVendas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlmenuprincipal/vendas.png"))); // NOI18N
        btVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btVendasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btVendasMouseExited(evt);
            }
        });

        btServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlmenuprincipal/servicos2.png"))); // NOI18N
        btServicos.setBorderPainted(false);
        btServicos.setContentAreaFilled(false);
        btServicos.setPreferredSize(new java.awt.Dimension(96, 96));
        btServicos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlmenuprincipal/servicos.png"))); // NOI18N
        btServicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btServicosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btServicosMouseExited(evt);
            }
        });

        btAmostras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlmenuprincipal/amostras2.png"))); // NOI18N
        btAmostras.setBorderPainted(false);
        btAmostras.setContentAreaFilled(false);
        btAmostras.setPreferredSize(new java.awt.Dimension(96, 96));
        btAmostras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlmenuprincipal/amostras.png"))); // NOI18N
        btAmostras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAmostrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btAmostrasMouseExited(evt);
            }
        });

        btFeira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlmenuprincipal/feira2.png"))); // NOI18N
        btFeira.setBorderPainted(false);
        btFeira.setContentAreaFilled(false);
        btFeira.setPreferredSize(new java.awt.Dimension(96, 96));
        btFeira.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlmenuprincipal/feira.png"))); // NOI18N
        btFeira.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btFeiraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btFeiraMouseExited(evt);
            }
        });

        btDoacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlmenuprincipal/doacoes2.png"))); // NOI18N
        btDoacoes.setBorderPainted(false);
        btDoacoes.setContentAreaFilled(false);
        btDoacoes.setPreferredSize(new java.awt.Dimension(96, 96));
        btDoacoes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlmenuprincipal/doacoes.png"))); // NOI18N
        btDoacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btDoacoesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btDoacoesMouseExited(evt);
            }
        });

        btXpromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlmenuprincipal/xpromo2.png"))); // NOI18N
        btXpromo.setBorderPainted(false);
        btXpromo.setContentAreaFilled(false);
        btXpromo.setPreferredSize(new java.awt.Dimension(96, 96));
        btXpromo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlmenuprincipal/xpromo.png"))); // NOI18N
        btXpromo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btXpromoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btXpromoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuPrincipalLayout = new javax.swing.GroupLayout(pnlMenuPrincipal);
        pnlMenuPrincipal.setLayout(pnlMenuPrincipalLayout);
        pnlMenuPrincipalLayout.setHorizontalGroup(
            pnlMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuPrincipalLayout.createSequentialGroup()
                .addComponent(btOfertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btInteresses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btAmostras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btFeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btDoacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btXpromo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(416, Short.MAX_VALUE))
        );
        pnlMenuPrincipalLayout.setVerticalGroup(
            pnlMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuPrincipalLayout.createSequentialGroup()
                .addGroup(pnlMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btOfertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btInteresses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAmostras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDoacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btXpromo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlAnuncioLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(pnlMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addComponent(pnlCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlGeral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAnuncioLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btOfertasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btOfertasMouseEntered

    }//GEN-LAST:event_btOfertasMouseEntered

    private void btOfertasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btOfertasMouseExited

    }//GEN-LAST:event_btOfertasMouseExited

    private void btInteressesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btInteressesMouseEntered

    }//GEN-LAST:event_btInteressesMouseEntered

    private void btInteressesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btInteressesMouseExited

    }//GEN-LAST:event_btInteressesMouseExited

    private void btAmostrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAmostrasMouseEntered

    }//GEN-LAST:event_btAmostrasMouseEntered

    private void btAmostrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAmostrasMouseExited

    }//GEN-LAST:event_btAmostrasMouseExited

    private void btFeiraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFeiraMouseEntered

    }//GEN-LAST:event_btFeiraMouseEntered

    private void btFeiraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFeiraMouseExited

    }//GEN-LAST:event_btFeiraMouseExited

    private void btOfertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOfertasActionPerformed

    }//GEN-LAST:event_btOfertasActionPerformed

    private void mitSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitSairActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Já vai indo?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (op == 0) {
            this.dispose();
            PeLoginJF telaLogin = new PeLoginJF();
            if (jfConversas != null) {
                jfConversas.dispose();
            }
            if (jfAmizades != null) {
                jfAmizades.dispose();
            }
            if (jfConta != null) {
                jfConta.dispose();
            }
            telaLogin.setVisible(true);
        }
    }//GEN-LAST:event_mitSairActionPerformed

    private void mitContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitContaActionPerformed
        if (jfConta == null) {
            jfConta = new PfContaFR(pf);
            jfConta.setVisible(true);
            listarAmigos(filtroPressionado);
        } else {
            if (!jfConta.isVisible()) {
                jfConta = new PfContaFR(pf);
                jfConta.setVisible(true);
                listarAmigos(filtroPressionado);
            }
        }
    }//GEN-LAST:event_mitContaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int op = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Já vai indo?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (op == 0) {
            this.dispose();
            PeLoginJF telaLogin = new PeLoginJF();
            if (jfConversas != null) {
                jfConversas.dispose();
            }
            if (jfAmizades != null) {
                jfAmizades.dispose();
            }
            if (jfConta != null) {
                jfConta.dispose();
            }
            telaLogin.setVisible(true);
        }
    }//GEN-LAST:event_formWindowClosing

    private void mitSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitSobreActionPerformed
        PeSobreJD jdSobre = new PeSobreJD(this, true);
        jdSobre.setVisible(true);
    }//GEN-LAST:event_mitSobreActionPerformed

    private void btOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOpcoesActionPerformed
        ppmSair.show(btOpcoes, -63, 20);
    }//GEN-LAST:event_btOpcoesActionPerformed

    private void jPanel4ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel4ComponentHidden

    }//GEN-LAST:event_jPanel4ComponentHidden

    private void btConversasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConversasActionPerformed
        if (jfConversas == null) {
            jfConversas = new PeConversasJF(pf);
            jfConversas.setVisible(true);
            listarAmigos(filtroPressionado);
        } else {
            if (!jfConversas.isVisible()) {
                jfConversas = new PeConversasJF(pf);
                jfConversas.setVisible(true);
                listarAmigos(filtroPressionado);
            }
        }
    }//GEN-LAST:event_btConversasActionPerformed

    private void btPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPerfilActionPerformed
        PePerfilPessoal telaCadastroPerfil = new PePerfilPessoal(this, true, pf);
        telaCadastroPerfil.setImagemCartao(lbFoto);
        telaCadastroPerfil.setVisible(true);
    }//GEN-LAST:event_btPerfilActionPerformed

    private void btAmizadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAmizadesActionPerformed
        if (jfAmizades == null) {
            jfAmizades = new PeAmizadesJF(pf);
            jfAmizades.setVisible(true);
            listarAmigos(filtroPressionado);
        } else {
            if (!jfAmizades.isVisible()) {
                jfAmizades = new PeAmizadesJF(pf);
                jfAmizades.setVisible(true);
                listarAmigos(filtroPressionado);
            }
        }
    }//GEN-LAST:event_btAmizadesActionPerformed

    private void btComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btComprasMouseEntered

    }//GEN-LAST:event_btComprasMouseEntered

    private void btComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btComprasMouseExited

    }//GEN-LAST:event_btComprasMouseExited

    private void btVendasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVendasMouseEntered

    }//GEN-LAST:event_btVendasMouseEntered

    private void btVendasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVendasMouseExited

    }//GEN-LAST:event_btVendasMouseExited

    private void btDoacoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDoacoesMouseEntered

    }//GEN-LAST:event_btDoacoesMouseEntered

    private void btDoacoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDoacoesMouseExited

    }//GEN-LAST:event_btDoacoesMouseExited

    private void btServicosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btServicosMouseEntered

    }//GEN-LAST:event_btServicosMouseEntered

    private void btServicosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btServicosMouseExited

    }//GEN-LAST:event_btServicosMouseExited

    private void btXpromoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXpromoMouseEntered

    }//GEN-LAST:event_btXpromoMouseEntered

    private void btXpromoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXpromoMouseExited

    }//GEN-LAST:event_btXpromoMouseExited

    private void btFecharAnuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharAnuncioActionPerformed
        JOptionPane.showMessageDialog(this, "Esta opção sorteia e exibe outro anúncio!", "Em breve...", 1);
    }//GEN-LAST:event_btFecharAnuncioActionPerformed

    private void btSobreAnunciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSobreAnunciosActionPerformed
        PeSobreAnunciosFR anuncios = new PeSobreAnunciosFR();
        anuncios.setVisible(true);
    }//GEN-LAST:event_btSobreAnunciosActionPerformed

    private void btTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTodosActionPerformed
        listarAmigos(9);
        filtroPressionado = 9;
        filtroPressionado(btTodos, 15);
    }//GEN-LAST:event_btTodosActionPerformed

    private void btPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPessoasActionPerformed
        listarAmigos(0);
        filtroPressionado = 0;
        filtroPressionado(btPessoas, 16);
    }//GEN-LAST:event_btPessoasActionPerformed

    private void btEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmpresasActionPerformed
        listarAmigos(1);
        filtroPressionado = 1;
        filtroPressionado(btEmpresas, 17);
    }//GEN-LAST:event_btEmpresasActionPerformed

    private void btEntidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntidadesActionPerformed
        listarAmigos(2);
        filtroPressionado = 2;
        filtroPressionado(btEntidades, 18);
    }//GEN-LAST:event_btEntidadesActionPerformed

    private void btInteressesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInteressesActionPerformed
        pnlGeral.removeAll();
        pnlInteressesPL = new InteressesPL(pf);
        pnlGeral.add(pnlInteressesPL);
        pnlGeral.repaint();
        pnlGeral.validate();
    }//GEN-LAST:event_btInteressesActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        listarAmigos(filtroPressionado);
        verificaStatus(pf.login.getStatus());
        if (pnlInteressesPL != null) {
            pnlInteressesPL.atualizarInteresses();
        }
        lbApelido.setText(pf.getNome());
        lbEmail.setText(pf.getEmail());
    }//GEN-LAST:event_formWindowGainedFocus

    private void mitAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitAcessoActionPerformed
        PeAcessoJD jdAcesso = new PeAcessoJD(this, true, pf.getLogin());
        jdAcesso.setVisible(true);
    }//GEN-LAST:event_mitAcessoActionPerformed

    private void lbStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbStatusMouseClicked
        alteraStatus(pf.login.getStatus());
    }//GEN-LAST:event_lbStatusMouseClicked

    private void mitOpiniaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitOpiniaoActionPerformed
        PeOpiniaoJD jdOpiniao = new PeOpiniaoJD(this, true);
        jdOpiniao.setVisible(true);
    }//GEN-LAST:event_mitOpiniaoActionPerformed

    private void mitAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitAjudaActionPerformed
        PeAjudaJD a = new PeAjudaJD(null, true);
        a.setVisible(true);
    }//GEN-LAST:event_mitAjudaActionPerformed

    private void btComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btComprasActionPerformed
        PeUsuarioSuspensoJD peUsuarioSuspensoJD = new PeUsuarioSuspensoJD(this, true);
        peUsuarioSuspensoJD.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btComprasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAmizades;
    private javax.swing.JButton btAmostras;
    private javax.swing.JButton btCompras;
    private javax.swing.JButton btConversas;
    private javax.swing.JButton btDoacoes;
    private javax.swing.JButton btEmpresas;
    private javax.swing.JButton btEntidades;
    private javax.swing.JButton btFecharAnuncio;
    private javax.swing.JButton btFeira;
    private javax.swing.JButton btInteresses;
    private javax.swing.JButton btOfertas;
    private javax.swing.JButton btOpcoes;
    private javax.swing.JButton btPerfil;
    private javax.swing.JButton btPessoas;
    private javax.swing.JButton btServicos;
    private javax.swing.JButton btSobreAnuncios;
    private javax.swing.JButton btTodos;
    private javax.swing.JButton btVendas;
    private javax.swing.JButton btXpromo;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel lbAmigo;
    private javax.swing.JButton lbAnuncio;
    private javax.swing.JLabel lbApelido;
    private javax.swing.JLabel lbDescAnuncios;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbFoto;
    private javax.swing.JLabel lbLogomarca;
    private javax.swing.JLabel lbNumAmigos;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JMenuItem mitAcesso;
    private javax.swing.JMenuItem mitAjuda;
    private javax.swing.JMenuItem mitConta;
    private javax.swing.JMenuItem mitOpiniao;
    private javax.swing.JMenuItem mitSair;
    private javax.swing.JMenuItem mitSobre;
    private javax.swing.JPanel pnlAmigos;
    private javax.swing.JPanel pnlAnuncioLateral;
    private javax.swing.JPanel pnlCabecalho;
    private javax.swing.JPanel pnlCartao;
    private javax.swing.JPanel pnlControleAnuncios;
    private javax.swing.JPanel pnlExibicaoAnuncio;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPanel pnlGeral;
    private javax.swing.JPanel pnlMenuPrincipal;
    private javax.swing.JPanel pnlMenuSocial;
    private javax.swing.JPanel pnlStatus;
    private javax.swing.JPopupMenu ppmSair;
    private javax.swing.JScrollPane spnl01;
    // End of variables declaration//GEN-END:variables

    public void atualizarPerfil() {
        lbFoto.repaint();
    }

    private void listarAmigos(int i) {
        pnlAmigos.removeAll();
        List amigos = pf.perfil.getAmigos();
        lbNumAmigos.setText(amigos.size() + "");
        if (amigos.size() <= 1) {
            lbAmigo.setText("amigo");
        } else {
            lbAmigo.setText("amigos");
        }
        for (Object amigo : amigos) {
            Pessoa p = (Pessoa) amigo;
            PeCartaoAmigoPL cartaoAmigo = new PeCartaoAmigoPL(p, pf);
            if (i > 3) {
                pnlAmigos.add(cartaoAmigo);
            } else {
                if (p.login.getTipoUsuario() == i) {
                    pnlAmigos.add(cartaoAmigo);
                }
            }
        }
        this.repaint();
        this.validate();
        pnlAmigos.repaint();
        pnlAmigos.validate();
        spnl01.validate();
    }

    private void filtroPressionado(JButton bt, int i) {
        btTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlsocial/4.png")));
        btPessoas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlsocial/5.png")));
        btEmpresas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlsocial/6.png")));
        btEntidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlsocial/7.png")));
        bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/twtm/imagens/pnlsocial/" + i + ".png")));
    }

    private void alteraStatus(int status) {
        if (status == 0) {
            lbStatus.setText("Ocupado");
            pnlStatus.setBackground(new Color(223, 137, 133));
            pf.login.setStatus(1);
        } else if (status == 1) {
            lbStatus.setText("Indisponível");
            pnlStatus.setBackground(new Color(204, 204, 204));
            pf.login.setStatus(2);
        } else if (status == 2) {
            lbStatus.setText("Disponível");
            pnlStatus.setBackground(new Color(154, 207, 149));
            pf.login.setStatus(0);
        }
    }

    private void verificaStatus(int status) {
        if (status == 1) {
            lbStatus.setText("Ocupado");
            pnlStatus.setBackground(new Color(223, 137, 133));
            pf.login.setStatus(1);
        } else if (status == 2) {
            lbStatus.setText("Indisponível");
            pnlStatus.setBackground(new Color(204, 204, 204));
            pf.login.setStatus(2);
        } else if (status == 0) {
            lbStatus.setText("Disponível");
            pnlStatus.setBackground(new Color(154, 207, 149)); //51,255,102
            pf.login.setStatus(0);
        }
    }
}
