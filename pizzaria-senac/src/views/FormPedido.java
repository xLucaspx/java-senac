package views;

import enums.Sabor;
import javax.swing.DefaultComboBoxModel;

public class FormPedido extends javax.swing.JFrame {


  public FormPedido() {
    super("Papa's Pizzeria - Novo Pedido");
    setSize(675, 880);
    initComponents();
  }


  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    btnGroupSabor = new javax.swing.ButtonGroup();
    labelLogo = new javax.swing.JLabel();
    labelSubtitulo = new javax.swing.JLabel();
    labelTitulo = new javax.swing.JLabel();
    labelNome = new javax.swing.JLabel();
    inputNome = new javax.swing.JTextField();
    labelTelefone = new javax.swing.JLabel();
    inputTelefone = new javax.swing.JTextField();
    labelEndereco = new javax.swing.JLabel();
    inputEndereco = new javax.swing.JTextField();
    labelCidade = new javax.swing.JLabel();
    comboCidades = new javax.swing.JComboBox<>();
    labelCalabresa = new javax.swing.JLabel();
    radioCalabresa = new javax.swing.JRadioButton();
    labelBasca = new javax.swing.JLabel();
    radioBasca = new javax.swing.JRadioButton();
    labelFrango = new javax.swing.JLabel();
    radioFrango = new javax.swing.JRadioButton();
    labelQueijos = new javax.swing.JLabel();
    radioQueijos = new javax.swing.JRadioButton();
    labelChocolate = new javax.swing.JLabel();
    radioChocolate = new javax.swing.JRadioButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(200, 200, 200));
    setPreferredSize(new java.awt.Dimension(675, 880));
    setResizable(false);

    labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

    labelSubtitulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    labelSubtitulo.setForeground(new java.awt.Color(40, 40, 40));
    labelSubtitulo.setText("- Pedido - ");

    labelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    labelTitulo.setForeground(new java.awt.Color(40, 40, 40));
    labelTitulo.setText("Papa's Pizzeria");

    labelNome.setBackground(new java.awt.Color(200, 200, 200));
    labelNome.setForeground(new java.awt.Color(40, 40, 40));
    labelNome.setText("Nome do cliente:");

    inputNome.setBackground(new java.awt.Color(255, 255, 255));
    inputNome.setForeground(new java.awt.Color(40, 40, 40));

    labelTelefone.setBackground(new java.awt.Color(200, 200, 200));
    labelTelefone.setForeground(new java.awt.Color(40, 40, 40));
    labelTelefone.setText("Telefone:");

    inputTelefone.setBackground(new java.awt.Color(255, 255, 255));
    inputTelefone.setForeground(new java.awt.Color(40, 40, 40));

    labelEndereco.setBackground(new java.awt.Color(200, 200, 200));
    labelEndereco.setForeground(new java.awt.Color(40, 40, 40));
    labelEndereco.setText("Endereço:");

    inputEndereco.setBackground(new java.awt.Color(255, 255, 255));
    inputEndereco.setForeground(new java.awt.Color(40, 40, 40));

    labelCidade.setBackground(new java.awt.Color(200, 200, 200));
    labelCidade.setForeground(new java.awt.Color(40, 40, 40));
    labelCidade.setText("Cidade:");

    comboCidades.setBackground(new java.awt.Color(255, 255, 255));
    comboCidades.setForeground(new java.awt.Color(40, 40, 40));
    comboCidades.setModel(new DefaultComboBoxModel<>(new String[] {
      "Porto Alegre", "Canoas", "Cachoeirinha", "Gravataí", "Alvorada"
    }));

    labelCalabresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    labelCalabresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sabores/calabresa.png"))); // NOI18N

    btnGroupSabor.add(radioCalabresa);
    radioCalabresa.setForeground(new java.awt.Color(40, 40, 40));
    radioCalabresa.setSelected(true);
    radioCalabresa.setText("Calabresa");
    radioCalabresa.setActionCommand(Sabor.CALABRESA.toString());
    radioCalabresa.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        radioCalabresaActionPerformed(evt);
      }
    });

    labelBasca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    labelBasca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sabores/basca.png"))); // NOI18N

    btnGroupSabor.add(radioBasca);
    radioBasca.setForeground(new java.awt.Color(40, 40, 40));
    radioBasca.setText("Basca");
    radioBasca.setActionCommand(Sabor.BASCA.toString());
    radioBasca.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        radioBascaActionPerformed(evt);
      }
    });

    labelFrango.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    labelFrango.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sabores/frango-catupiry.png"))); // NOI18N

    btnGroupSabor.add(radioFrango);
    radioFrango.setForeground(new java.awt.Color(40, 40, 40));
    radioFrango.setText("Frango c/ Catupiry");
    radioFrango.setActionCommand(Sabor.FRANGO_CATUPIRY.toString());
    radioFrango.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        radioFrangoActionPerformed(evt);
      }
    });

    labelQueijos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    labelQueijos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sabores/quatro-queijos.png"))); // NOI18N

    btnGroupSabor.add(radioQueijos);
    radioQueijos.setForeground(new java.awt.Color(40, 40, 40));
    radioQueijos.setText("Quatro-queijos");
    radioQueijos.setActionCommand(Sabor.QUATRO_QUEIJOS.toString());
    radioQueijos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        radioQueijosActionPerformed(evt);
      }
    });

    labelChocolate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    labelChocolate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sabores/chocolate-morango.png"))); // NOI18N

    btnGroupSabor.add(radioChocolate);
    radioChocolate.setForeground(new java.awt.Color(40, 40, 40));
    radioChocolate.setText("Chocolate c/ morango");
    radioChocolate.setActionCommand(Sabor.CHOCOLATE_MORANGO.toString());
    radioChocolate.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        radioChocolateActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(6, 6, 6)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(labelNome)
              .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(labelEndereco)
              .addComponent(inputEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(labelTelefone)
              .addComponent(inputTelefone)
              .addComponent(labelCidade)
              .addComponent(comboCidades, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(labelLogo)
              .addComponent(labelCalabresa)
              .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(radioCalabresa)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(labelTitulo))
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addGroup(layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(labelSubtitulo))
                  .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(labelBasca))
                      .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(radioBasca)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(radioFrango))
                      .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(labelFrango)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(labelQueijos)
                  .addComponent(radioQueijos))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(labelChocolate))
                  .addGroup(layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(radioChocolate)))))
            .addGap(0, 0, Short.MAX_VALUE)))
        .addGap(18, 18, 18))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(labelTelefone)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(labelCidade)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(comboCidades, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(labelLogo)
              .addGroup(layout.createSequentialGroup()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(labelNome)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(labelEndereco)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(inputEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(labelQueijos)
            .addGap(26, 26, 26))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(labelCalabresa)
                  .addComponent(labelBasca)
                  .addComponent(labelFrango))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
              .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addComponent(labelChocolate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(radioCalabresa)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(radioChocolate)
                .addComponent(radioFrango)
                .addComponent(radioQueijos))
              .addComponent(radioBasca))))
        .addContainerGap(523, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void radioCalabresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCalabresaActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_radioCalabresaActionPerformed

  private void radioBascaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBascaActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_radioBascaActionPerformed

  private void radioFrangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFrangoActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_radioFrangoActionPerformed

  private void radioChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioChocolateActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_radioChocolateActionPerformed

  private void radioQueijosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioQueijosActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_radioQueijosActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.ButtonGroup btnGroupSabor;
  private javax.swing.JComboBox<String> comboCidades;
  private javax.swing.JTextField inputEndereco;
  private javax.swing.JTextField inputNome;
  private javax.swing.JTextField inputTelefone;
  private javax.swing.JLabel labelBasca;
  private javax.swing.JLabel labelCalabresa;
  private javax.swing.JLabel labelChocolate;
  private javax.swing.JLabel labelCidade;
  private javax.swing.JLabel labelEndereco;
  private javax.swing.JLabel labelFrango;
  private javax.swing.JLabel labelLogo;
  private javax.swing.JLabel labelNome;
  private javax.swing.JLabel labelQueijos;
  private javax.swing.JLabel labelSubtitulo;
  private javax.swing.JLabel labelTelefone;
  private javax.swing.JLabel labelTitulo;
  private javax.swing.JRadioButton radioBasca;
  private javax.swing.JRadioButton radioCalabresa;
  private javax.swing.JRadioButton radioChocolate;
  private javax.swing.JRadioButton radioFrango;
  private javax.swing.JRadioButton radioQueijos;
  // End of variables declaration//GEN-END:variables
}
