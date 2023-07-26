package views;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Aluno;

public class FormularioCadastro extends JFrame {
  private ArrayList<Aluno> alunos;
  private DefaultTableModel modelTabelaAlunos;

  public FormularioCadastro() {
    super("Cadastro de aluno");
    setResizable(false);
    initComponents();
    alunos = new ArrayList<>();
    modelTabelaAlunos = (DefaultTableModel) tableAlunos.getModel();
  }
  
  private void cadastra() {
    String nome = inputNome.getText();
    String cpf = inputCpf.getText();
    String matricula = inputMatricula.getText();
    String escolaridade = btnGroupEscolaridade.getSelection().getActionCommand();
    
    alunos.add(new Aluno(nome, cpf, escolaridade, matricula));
    listaAlunos();
    limpaCampos();
  }
  
  private void listaAlunos() {
    modelTabelaAlunos.getDataVector().clear();
    
    for (int i = 0; i < alunos.size(); i++) {
      Aluno a = alunos.get(i);
      modelTabelaAlunos.addRow(new Object[]{(i+1), a.getNome(), a.getCpf(), a.getMatricula(), a.getEscolaridade()});
    }
  }
  
  private void limpaCampos() {
    inputNome.setText("");
    inputCpf.setText("");
    inputMatricula.setText("");
    radioFundamental.setSelected(true);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    btnGroupEscolaridade = new javax.swing.ButtonGroup();
    body = new javax.swing.JPanel();
    labelNome = new javax.swing.JLabel();
    inputNome = new javax.swing.JTextField();
    labelCpf = new javax.swing.JLabel();
    inputCpf = new javax.swing.JTextField();
    labelMatricula = new javax.swing.JLabel();
    inputMatricula = new javax.swing.JTextField();
    labelEscolaridade = new javax.swing.JLabel();
    radioFundamental = new javax.swing.JRadioButton();
    radioMedio = new javax.swing.JRadioButton();
    radioSuperior = new javax.swing.JRadioButton();
    btnAdicionar = new javax.swing.JButton();
    btnImprimir = new javax.swing.JButton();
    btnLimpar = new javax.swing.JButton();
    tableScrollPane = new javax.swing.JScrollPane();
    tableAlunos = new javax.swing.JTable();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(200, 200, 200));

    body.setBackground(new java.awt.Color(200, 200, 200));
    body.setForeground(new java.awt.Color(40, 40, 40));

    labelNome.setForeground(new java.awt.Color(40, 40, 40));
    labelNome.setText("Nome completo:");

    inputNome.setBackground(new java.awt.Color(255, 255, 255));
    inputNome.setForeground(new java.awt.Color(40, 40, 40));

    labelCpf.setForeground(new java.awt.Color(40, 40, 40));
    labelCpf.setText("CPF:");

    inputCpf.setBackground(new java.awt.Color(255, 255, 255));
    inputCpf.setForeground(new java.awt.Color(40, 40, 40));

    labelMatricula.setForeground(new java.awt.Color(40, 40, 40));
    labelMatricula.setText("Matrícula:");

    inputMatricula.setBackground(new java.awt.Color(255, 255, 255));
    inputMatricula.setForeground(new java.awt.Color(40, 40, 40));

    labelEscolaridade.setForeground(new java.awt.Color(40, 40, 40));
    labelEscolaridade.setText("Escolaridade:");

    radioFundamental.setBackground(new java.awt.Color(200, 200, 200));
    btnGroupEscolaridade.add(radioFundamental);
    radioFundamental.setForeground(new java.awt.Color(40, 40, 40));
    radioFundamental.setSelected(true);
    radioFundamental.setText("Ensino fundamental");
    radioFundamental.setActionCommand("Ensino fundamental");
    radioFundamental.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        radioFundamentalActionPerformed(evt);
      }
    });

    radioMedio.setBackground(new java.awt.Color(200, 200, 200));
    btnGroupEscolaridade.add(radioMedio);
    radioMedio.setForeground(new java.awt.Color(40, 40, 40));
    radioMedio.setText("Ensino médio");
    radioMedio.setActionCommand("Ensino médio");

    radioSuperior.setBackground(new java.awt.Color(200, 200, 200));
    btnGroupEscolaridade.add(radioSuperior);
    radioSuperior.setForeground(new java.awt.Color(40, 40, 40));
    radioSuperior.setText("Ensino superior");
    radioSuperior.setActionCommand("Ensino superior");

    btnAdicionar.setBackground(new java.awt.Color(20, 230, 120));
    btnAdicionar.setForeground(new java.awt.Color(255, 255, 255));
    btnAdicionar.setText("Adicionar aluno");
    btnAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnAdicionarMouseClicked(evt);
      }
    });

    btnImprimir.setBackground(new java.awt.Color(121, 171, 255));
    btnImprimir.setForeground(new java.awt.Color(255, 255, 255));
    btnImprimir.setText("Imprimir lista");
    btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnImprimirMouseClicked(evt);
      }
    });

    btnLimpar.setBackground(new java.awt.Color(255, 85, 85));
    btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
    btnLimpar.setText("Limpar campos");
    btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnLimparMouseClicked(evt);
      }
    });

    javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
    body.setLayout(bodyLayout);
    bodyLayout.setHorizontalGroup(
      bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(bodyLayout.createSequentialGroup()
        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(bodyLayout.createSequentialGroup()
            .addGap(16, 16, 16)
            .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(labelEscolaridade)
              .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(bodyLayout.createSequentialGroup()
                  .addComponent(radioFundamental)
                  .addGap(35, 35, 35)
                  .addComponent(radioMedio)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(radioSuperior))
                .addGroup(bodyLayout.createSequentialGroup()
                  .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNome)
                    .addComponent(labelCpf)
                    .addComponent(labelMatricula))
                  .addGap(18, 18, 18)
                  .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))))
          .addGroup(bodyLayout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(11, Short.MAX_VALUE))
    );
    bodyLayout.setVerticalGroup(
      bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(bodyLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(labelCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(inputCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(labelMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(inputMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addComponent(labelEscolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(radioFundamental)
          .addComponent(radioMedio)
          .addComponent(radioSuperior))
        .addGap(18, 18, 18)
        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    tableAlunos.setBackground(new java.awt.Color(255, 255, 255));
    tableAlunos.setForeground(new java.awt.Color(40, 40, 40));
    tableAlunos.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Índice", "Nome", "CPF", "Matrícula", "Escolaridade"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    tableScrollPane.setViewportView(tableAlunos);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void radioFundamentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFundamentalActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_radioFundamentalActionPerformed

  private void btnLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseClicked
    limpaCampos();
  }//GEN-LAST:event_btnLimparMouseClicked

  private void btnAdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarMouseClicked
    cadastra();
  }//GEN-LAST:event_btnAdicionarMouseClicked

  private void btnImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseClicked
    String lista = "Nome - Matrícula:\n";
    for (Aluno a : alunos) lista += String.format("%s - %s\n", a.getNome(), a.getMatricula());
    
    JOptionPane.showMessageDialog(this, lista, "Lista de alunos", JOptionPane.PLAIN_MESSAGE);
  }//GEN-LAST:event_btnImprimirMouseClicked


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel body;
  private javax.swing.JButton btnAdicionar;
  private javax.swing.ButtonGroup btnGroupEscolaridade;
  private javax.swing.JButton btnImprimir;
  private javax.swing.JButton btnLimpar;
  private javax.swing.JTextField inputCpf;
  private javax.swing.JTextField inputMatricula;
  private javax.swing.JTextField inputNome;
  private javax.swing.JLabel labelCpf;
  private javax.swing.JLabel labelEscolaridade;
  private javax.swing.JLabel labelMatricula;
  private javax.swing.JLabel labelNome;
  private javax.swing.JRadioButton radioFundamental;
  private javax.swing.JRadioButton radioMedio;
  private javax.swing.JRadioButton radioSuperior;
  private javax.swing.JTable tableAlunos;
  private javax.swing.JScrollPane tableScrollPane;
  // End of variables declaration//GEN-END:variables
}
