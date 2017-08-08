package br.com.twtm.gui;

import br.com.twtm.xpromo.Pessoa;

public class AdmEstatisticasDenunciaPL extends javax.swing.JPanel {

    private Pessoa p;

    public AdmEstatisticasDenunciaPL(Pessoa p) {
        initComponents();
        this.p = p;
        pintarBarras();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEstatisticas = new javax.swing.JPanel();
        pnlGrafico = new javax.swing.JPanel();
        lbPorc4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pgb4 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        pgb5 = new javax.swing.JProgressBar();
        lbPorc3 = new javax.swing.JLabel();
        pgb1 = new javax.swing.JProgressBar();
        lbPorc1 = new javax.swing.JLabel();
        pgb3 = new javax.swing.JProgressBar();
        lbPorc2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pgb2 = new javax.swing.JProgressBar();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbPorc5 = new javax.swing.JLabel();
        lbDenunciaram = new javax.swing.JLabel();
        pnlSeparador = new javax.swing.JPanel();
        pnlTextoDenunciaram = new javax.swing.JLabel();

        pnlEstatisticas.setBackground(new java.awt.Color(255, 255, 255));

        pnlGrafico.setBackground(new java.awt.Color(255, 255, 255));

        lbPorc4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbPorc4.setForeground(new java.awt.Color(51, 51, 51));
        lbPorc4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPorc4.setText("XX");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Discurso de ódio ou apologia ao crime");

        pgb4.setBackground(new java.awt.Color(204, 204, 204));
        pgb4.setForeground(new java.awt.Color(153, 0, 102));
        pgb4.setBorderPainted(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Conta possivelmente invadida");

        pgb5.setBackground(new java.awt.Color(204, 204, 204));
        pgb5.setForeground(new java.awt.Color(153, 0, 102));
        pgb5.setBorderPainted(false);

        lbPorc3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbPorc3.setForeground(new java.awt.Color(51, 51, 51));
        lbPorc3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPorc3.setText("XX");

        pgb1.setBackground(new java.awt.Color(204, 204, 204));
        pgb1.setForeground(new java.awt.Color(153, 0, 102));
        pgb1.setBorderPainted(false);

        lbPorc1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbPorc1.setForeground(new java.awt.Color(51, 51, 51));
        lbPorc1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPorc1.setText("XX");

        pgb3.setBackground(new java.awt.Color(204, 204, 204));
        pgb3.setForeground(new java.awt.Color(153, 0, 102));
        pgb3.setBorderPainted(false);

        lbPorc2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbPorc2.setForeground(new java.awt.Color(51, 51, 51));
        lbPorc2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPorc2.setText("XX");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Spam ou fraude");

        pgb2.setBackground(new java.awt.Color(204, 204, 204));
        pgb2.setForeground(new java.awt.Color(153, 0, 102));
        pgb2.setBorderPainted(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Conteúdo sexualmente explícito");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Comportamento violento ou perigoso");

        lbPorc5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbPorc5.setForeground(new java.awt.Color(51, 51, 51));
        lbPorc5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPorc5.setText("XX");

        javax.swing.GroupLayout pnlGraficoLayout = new javax.swing.GroupLayout(pnlGrafico);
        pnlGrafico.setLayout(pnlGraficoLayout);
        pnlGraficoLayout.setHorizontalGroup(
            pnlGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGraficoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlGraficoLayout.createSequentialGroup()
                        .addComponent(pgb5, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPorc5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlGraficoLayout.createSequentialGroup()
                        .addGroup(pnlGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(pgb4, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPorc4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlGraficoLayout.createSequentialGroup()
                        .addComponent(pgb3, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPorc3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlGraficoLayout.createSequentialGroup()
                        .addGroup(pnlGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pgb2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pgb1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbPorc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbPorc2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlGraficoLayout.setVerticalGroup(
            pnlGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGraficoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbPorc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pgb1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbPorc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pgb2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbPorc3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pgb3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbPorc4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pgb4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbPorc5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pgb5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lbDenunciaram.setFont(new java.awt.Font("Segoe UI Light", 0, 140)); // NOI18N
        lbDenunciaram.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDenunciaram.setText("XX");

        pnlSeparador.setBackground(new java.awt.Color(229, 229, 229));
        pnlSeparador.setMaximumSize(new java.awt.Dimension(32767, 2));
        pnlSeparador.setMinimumSize(new java.awt.Dimension(100, 2));
        pnlSeparador.setPreferredSize(new java.awt.Dimension(221, 2));

        javax.swing.GroupLayout pnlSeparadorLayout = new javax.swing.GroupLayout(pnlSeparador);
        pnlSeparador.setLayout(pnlSeparadorLayout);
        pnlSeparadorLayout.setHorizontalGroup(
            pnlSeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );
        pnlSeparadorLayout.setVerticalGroup(
            pnlSeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        pnlTextoDenunciaram.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        pnlTextoDenunciaram.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlTextoDenunciaram.setText("Denunciaram");

        javax.swing.GroupLayout pnlEstatisticasLayout = new javax.swing.GroupLayout(pnlEstatisticas);
        pnlEstatisticas.setLayout(pnlEstatisticasLayout);
        pnlEstatisticasLayout.setHorizontalGroup(
            pnlEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEstatisticasLayout.createSequentialGroup()
                .addGroup(pnlEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEstatisticasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlTextoDenunciaram, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                            .addComponent(lbDenunciaram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(pnlEstatisticasLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(pnlSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(pnlGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlEstatisticasLayout.setVerticalGroup(
            pnlEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstatisticasLayout.createSequentialGroup()
                .addGroup(pnlEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlEstatisticasLayout.createSequentialGroup()
                        .addComponent(lbDenunciaram)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlTextoDenunciaram)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEstatisticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlEstatisticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbDenunciaram;
    private javax.swing.JLabel lbPorc1;
    private javax.swing.JLabel lbPorc2;
    private javax.swing.JLabel lbPorc3;
    private javax.swing.JLabel lbPorc4;
    private javax.swing.JLabel lbPorc5;
    private javax.swing.JProgressBar pgb1;
    private javax.swing.JProgressBar pgb2;
    private javax.swing.JProgressBar pgb3;
    private javax.swing.JProgressBar pgb4;
    private javax.swing.JProgressBar pgb5;
    private javax.swing.JPanel pnlEstatisticas;
    private javax.swing.JPanel pnlGrafico;
    private javax.swing.JPanel pnlSeparador;
    private javax.swing.JLabel pnlTextoDenunciaram;
    // End of variables declaration//GEN-END:variables

    public void pintarBarras() {
        double denunciaram, item1, item2, item3, item4, item5;
        denunciaram = p.perfil.valorItemDenuncia(0);
        lbDenunciaram.setText(Math.round(denunciaram) + "");
        item1 = (p.perfil.valorItemDenuncia(1) / denunciaram) * 100;
        item2 = (p.perfil.valorItemDenuncia(2) / denunciaram) * 100;
        item3 = (p.perfil.valorItemDenuncia(3) / denunciaram) * 100;
        item4 = (p.perfil.valorItemDenuncia(4) / denunciaram) * 100;
        item5 = (p.perfil.valorItemDenuncia(5) / denunciaram) * 100;
        lbPorc1.setText(Math.round(item1) + "%");
        lbPorc2.setText(Math.round(item2) + "%");
        lbPorc3.setText(Math.round(item3) + "%");
        lbPorc4.setText(Math.round(item4) + "%");
        lbPorc5.setText(Math.round(item5) + "%");
        pgb1.setValue((int) item1);
        pgb2.setValue((int) item2);
        pgb3.setValue((int) item3);
        pgb4.setValue((int) item4);
        pgb5.setValue((int) item5);
    }

}
