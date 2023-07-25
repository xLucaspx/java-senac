package views;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import models.Usuario;

public class Formulario extends javax.swing.JFrame {

  public Formulario() {
    initComponents();
  }
  
  private void limpaCampos() {
    inputNome.setText("");
    inputEmail.setText("");
    inputTelefone.setText("");
    inputEndereco.setText("");
    inputInteresse.setText("");
    inputIdiomas.setText("");
    inputInstituicao.setText("");
    inputCurso.setText("");
    inputEmpresa.setText("");
    inputArea.setText("");
    inputCargo.setText("");
    inputPeriodo.setText("");
  }
  
  private Usuario cadastra() {
    String nome = inputNome.getText();
    String email = inputEmail.getText();
    String telefone = inputTelefone.getText();
    String endereco = inputEndereco.getText();
    String sexo = "";
    
    if (radioMasculino.isSelected()) sexo = radioMasculino.getText();
    if (radioFeminino.isSelected()) sexo = radioFeminino.getText();
    if (radioNaoInformar.isSelected()) sexo = radioNaoInformar.getText();
    
    String interesse = inputInteresse.getText();
    String idiomas = inputIdiomas.getText();
    String instituicao = inputInstituicao.getText();
    String curso = inputCurso.getText();
    String andamento = "";
    
    if (radioConcluido.isSelected()) andamento = radioConcluido.getText();
    if (radioAndamento.isSelected()) andamento = radioAndamento.getText();
    if (radioTrancado.isSelected()) andamento = radioTrancado.getText();
    
    String empresa = inputEmpresa.getText();
    String area = inputArea.getText();
    String cargo = inputCargo.getText();
    String periodo = inputPeriodo.getText();
    String situacao = "";
    
    if (radioClt.isSelected()) situacao = radioClt.getText();
    if (radioPj.isSelected()) situacao = radioPj.getText();
    if (radioDesempregado.isSelected()) situacao = radioDesempregado.getText();
    
    return new Usuario(nome, email, telefone, endereco, sexo, interesse, idiomas, instituicao, curso, andamento, empresa, area, cargo, periodo, situacao);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    btnGroupSexo = new javax.swing.ButtonGroup();
    btnGroupAndamento = new javax.swing.ButtonGroup();
    btnGroupSituacao = new javax.swing.ButtonGroup();
    tabbedPane = new javax.swing.JTabbedPane();
    panelDados = new javax.swing.JPanel();
    labelNome = new javax.swing.JLabel();
    inputNome = new javax.swing.JTextField();
    inputEmail = new javax.swing.JTextField();
    labelEmail = new javax.swing.JLabel();
    inputTelefone = new javax.swing.JTextField();
    labelTelefone = new javax.swing.JLabel();
    inputEndereco = new javax.swing.JTextField();
    labelEndereco = new javax.swing.JLabel();
    labelSexo = new javax.swing.JLabel();
    radioMasculino = new javax.swing.JRadioButton();
    radioNaoInformar = new javax.swing.JRadioButton();
    radioFeminino = new javax.swing.JRadioButton();
    panelFormacao = new javax.swing.JPanel();
    labelInteresse = new javax.swing.JLabel();
    inputInteresse = new javax.swing.JTextField();
    inputIdiomas = new javax.swing.JTextField();
    labelIdiomas = new javax.swing.JLabel();
    inputInstituicao = new javax.swing.JTextField();
    labelInstituicao = new javax.swing.JLabel();
    inputCurso = new javax.swing.JTextField();
    labelCurso = new javax.swing.JLabel();
    labelAndamento = new javax.swing.JLabel();
    radioConcluido = new javax.swing.JRadioButton();
    radioTrancado = new javax.swing.JRadioButton();
    radioAndamento = new javax.swing.JRadioButton();
    panelExperiencia = new javax.swing.JPanel();
    labelEmpresa = new javax.swing.JLabel();
    inputEmpresa = new javax.swing.JTextField();
    inputArea = new javax.swing.JTextField();
    labelArea = new javax.swing.JLabel();
    inputCargo = new javax.swing.JTextField();
    labelCargo = new javax.swing.JLabel();
    inputPeriodo = new javax.swing.JTextField();
    labelPeriodo = new javax.swing.JLabel();
    labelSituacao = new javax.swing.JLabel();
    radioClt = new javax.swing.JRadioButton();
    radioDesempregado = new javax.swing.JRadioButton();
    radioPj = new javax.swing.JRadioButton();
    btnLimpar = new javax.swing.JButton();
    btnCadastrar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    panelDados.setBackground(new java.awt.Color(180, 180, 180));

    labelNome.setForeground(new java.awt.Color(20, 20, 20));
    labelNome.setText("Nome completo");

    inputNome.setBackground(new java.awt.Color(255, 255, 255));
    inputNome.setForeground(new java.awt.Color(40, 40, 40));
    inputNome.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        inputNomeActionPerformed(evt);
      }
    });

    inputEmail.setBackground(new java.awt.Color(255, 255, 255));
    inputEmail.setForeground(new java.awt.Color(40, 40, 40));
    inputEmail.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        inputEmailActionPerformed(evt);
      }
    });

    labelEmail.setForeground(new java.awt.Color(20, 20, 20));
    labelEmail.setText("E-mail");

    inputTelefone.setBackground(new java.awt.Color(255, 255, 255));
    inputTelefone.setForeground(new java.awt.Color(40, 40, 40));
    inputTelefone.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        inputTelefoneActionPerformed(evt);
      }
    });

    labelTelefone.setForeground(new java.awt.Color(20, 20, 20));
    labelTelefone.setText("Telefone");

    inputEndereco.setBackground(new java.awt.Color(255, 255, 255));
    inputEndereco.setForeground(new java.awt.Color(40, 40, 40));
    inputEndereco.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        inputEnderecoActionPerformed(evt);
      }
    });

    labelEndereco.setForeground(new java.awt.Color(20, 20, 20));
    labelEndereco.setText("Endereço");

    labelSexo.setForeground(new java.awt.Color(20, 20, 20));
    labelSexo.setText("Sexo");

    radioMasculino.setBackground(new java.awt.Color(180, 180, 180));
    btnGroupSexo.add(radioMasculino);
    radioMasculino.setForeground(new java.awt.Color(40, 40, 40));
    radioMasculino.setText("Masculino");

    radioNaoInformar.setBackground(new java.awt.Color(180, 180, 180));
    btnGroupSexo.add(radioNaoInformar);
    radioNaoInformar.setForeground(new java.awt.Color(40, 40, 40));
    radioNaoInformar.setSelected(true);
    radioNaoInformar.setText("Não informar");
    radioNaoInformar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        radioNaoInformarActionPerformed(evt);
      }
    });

    radioFeminino.setBackground(new java.awt.Color(180, 180, 180));
    btnGroupSexo.add(radioFeminino);
    radioFeminino.setForeground(new java.awt.Color(40, 40, 40));
    radioFeminino.setText("Feminino");
    radioFeminino.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        radioFemininoActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout panelDadosLayout = new javax.swing.GroupLayout(panelDados);
    panelDados.setLayout(panelDadosLayout);
    panelDadosLayout.setHorizontalGroup(
      panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelDadosLayout.createSequentialGroup()
        .addGap(83, 83, 83)
        .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelDadosLayout.createSequentialGroup()
            .addComponent(labelSexo)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(panelDadosLayout.createSequentialGroup()
            .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(panelDadosLayout.createSequentialGroup()
                .addComponent(radioMasculino)
                .addGap(167, 167, 167))
              .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(labelNome)
                .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(labelTelefone)
                .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
            .addComponent(radioFeminino)
            .addGap(34, 34, 34)
            .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(labelEmail)
              .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(labelEndereco)
              .addComponent(inputEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(radioNaoInformar, javax.swing.GroupLayout.Alignment.TRAILING))
            .addGap(103, 103, 103))))
    );
    panelDadosLayout.setVerticalGroup(
      panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelDadosLayout.createSequentialGroup()
        .addGap(30, 30, 30)
        .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(panelDadosLayout.createSequentialGroup()
            .addComponent(labelEmail)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDadosLayout.createSequentialGroup()
            .addComponent(labelNome)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelDadosLayout.createSequentialGroup()
            .addComponent(labelTelefone)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(panelDadosLayout.createSequentialGroup()
            .addComponent(labelEndereco)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(inputEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addComponent(labelSexo)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(radioMasculino)
          .addComponent(radioNaoInformar)
          .addComponent(radioFeminino))
        .addContainerGap(75, Short.MAX_VALUE))
    );

    tabbedPane.addTab("Dados pessoais", panelDados);

    panelFormacao.setBackground(new java.awt.Color(180, 180, 180));

    labelInteresse.setForeground(new java.awt.Color(20, 20, 20));
    labelInteresse.setText("Área de interesse");

    inputInteresse.setBackground(new java.awt.Color(255, 255, 255));
    inputInteresse.setForeground(new java.awt.Color(40, 40, 40));
    inputInteresse.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        inputInteresseActionPerformed(evt);
      }
    });

    inputIdiomas.setBackground(new java.awt.Color(255, 255, 255));
    inputIdiomas.setForeground(new java.awt.Color(40, 40, 40));
    inputIdiomas.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        inputIdiomasActionPerformed(evt);
      }
    });

    labelIdiomas.setForeground(new java.awt.Color(20, 20, 20));
    labelIdiomas.setText("Idiomas");

    inputInstituicao.setBackground(new java.awt.Color(255, 255, 255));
    inputInstituicao.setForeground(new java.awt.Color(40, 40, 40));
    inputInstituicao.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        inputInstituicaoActionPerformed(evt);
      }
    });

    labelInstituicao.setForeground(new java.awt.Color(20, 20, 20));
    labelInstituicao.setText("Instituição de ensino");

    inputCurso.setBackground(new java.awt.Color(255, 255, 255));
    inputCurso.setForeground(new java.awt.Color(40, 40, 40));
    inputCurso.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        inputCursoActionPerformed(evt);
      }
    });

    labelCurso.setForeground(new java.awt.Color(20, 20, 20));
    labelCurso.setText("Curso");

    labelAndamento.setForeground(new java.awt.Color(20, 20, 20));
    labelAndamento.setText("Andamento");

    radioConcluido.setBackground(new java.awt.Color(180, 180, 180));
    btnGroupAndamento.add(radioConcluido);
    radioConcluido.setForeground(new java.awt.Color(40, 40, 40));
    radioConcluido.setText("Concluído");

    radioTrancado.setBackground(new java.awt.Color(180, 180, 180));
    btnGroupAndamento.add(radioTrancado);
    radioTrancado.setForeground(new java.awt.Color(40, 40, 40));
    radioTrancado.setText("Trancado");
    radioTrancado.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        radioTrancadoActionPerformed(evt);
      }
    });

    radioAndamento.setBackground(new java.awt.Color(180, 180, 180));
    btnGroupAndamento.add(radioAndamento);
    radioAndamento.setForeground(new java.awt.Color(40, 40, 40));
    radioAndamento.setSelected(true);
    radioAndamento.setText("Em andamento");
    radioAndamento.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        radioAndamentoActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout panelFormacaoLayout = new javax.swing.GroupLayout(panelFormacao);
    panelFormacao.setLayout(panelFormacaoLayout);
    panelFormacaoLayout.setHorizontalGroup(
      panelFormacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelFormacaoLayout.createSequentialGroup()
        .addGap(83, 83, 83)
        .addGroup(panelFormacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelFormacaoLayout.createSequentialGroup()
            .addComponent(labelAndamento)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(panelFormacaoLayout.createSequentialGroup()
            .addGroup(panelFormacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(panelFormacaoLayout.createSequentialGroup()
                .addComponent(radioConcluido)
                .addGap(167, 167, 167))
              .addGroup(panelFormacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(labelInteresse)
                .addComponent(inputInteresse, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(labelInstituicao)
                .addComponent(inputInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
            .addComponent(radioAndamento)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panelFormacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(labelIdiomas)
              .addComponent(inputIdiomas, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(labelCurso)
              .addComponent(inputCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(radioTrancado, javax.swing.GroupLayout.Alignment.TRAILING))
            .addGap(103, 103, 103))))
    );
    panelFormacaoLayout.setVerticalGroup(
      panelFormacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelFormacaoLayout.createSequentialGroup()
        .addGap(30, 30, 30)
        .addGroup(panelFormacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(panelFormacaoLayout.createSequentialGroup()
            .addComponent(labelIdiomas)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(inputIdiomas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFormacaoLayout.createSequentialGroup()
            .addComponent(labelInteresse)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(inputInteresse, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addGroup(panelFormacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelFormacaoLayout.createSequentialGroup()
            .addComponent(labelInstituicao)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(inputInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(panelFormacaoLayout.createSequentialGroup()
            .addComponent(labelCurso)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(inputCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addComponent(labelAndamento)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(panelFormacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(radioConcluido)
          .addComponent(radioTrancado)
          .addComponent(radioAndamento))
        .addContainerGap(75, Short.MAX_VALUE))
    );

    tabbedPane.addTab("Formação acadêmica", panelFormacao);

    panelExperiencia.setBackground(new java.awt.Color(180, 180, 180));

    labelEmpresa.setForeground(new java.awt.Color(20, 20, 20));
    labelEmpresa.setText("Empresa");

    inputEmpresa.setBackground(new java.awt.Color(255, 255, 255));
    inputEmpresa.setForeground(new java.awt.Color(40, 40, 40));
    inputEmpresa.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        inputEmpresaActionPerformed(evt);
      }
    });

    inputArea.setBackground(new java.awt.Color(255, 255, 255));
    inputArea.setForeground(new java.awt.Color(40, 40, 40));
    inputArea.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        inputAreaActionPerformed(evt);
      }
    });

    labelArea.setForeground(new java.awt.Color(20, 20, 20));
    labelArea.setText("Área");

    inputCargo.setBackground(new java.awt.Color(255, 255, 255));
    inputCargo.setForeground(new java.awt.Color(40, 40, 40));
    inputCargo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        inputCargoActionPerformed(evt);
      }
    });

    labelCargo.setForeground(new java.awt.Color(20, 20, 20));
    labelCargo.setText("Cargo");

    inputPeriodo.setBackground(new java.awt.Color(255, 255, 255));
    inputPeriodo.setForeground(new java.awt.Color(40, 40, 40));
    inputPeriodo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        inputPeriodoActionPerformed(evt);
      }
    });

    labelPeriodo.setForeground(new java.awt.Color(20, 20, 20));
    labelPeriodo.setText("Período");

    labelSituacao.setForeground(new java.awt.Color(20, 20, 20));
    labelSituacao.setText("Situação");

    radioClt.setBackground(new java.awt.Color(180, 180, 180));
    btnGroupSituacao.add(radioClt);
    radioClt.setForeground(new java.awt.Color(40, 40, 40));
    radioClt.setSelected(true);
    radioClt.setText("Empregado CLT");
    radioClt.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        radioCltActionPerformed(evt);
      }
    });

    radioDesempregado.setBackground(new java.awt.Color(180, 180, 180));
    btnGroupSituacao.add(radioDesempregado);
    radioDesempregado.setForeground(new java.awt.Color(40, 40, 40));
    radioDesempregado.setText("Desempregado");
    radioDesempregado.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        radioDesempregadoActionPerformed(evt);
      }
    });

    radioPj.setBackground(new java.awt.Color(180, 180, 180));
    btnGroupSituacao.add(radioPj);
    radioPj.setForeground(new java.awt.Color(40, 40, 40));
    radioPj.setText("Empregado PJ");
    radioPj.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        radioPjActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout panelExperienciaLayout = new javax.swing.GroupLayout(panelExperiencia);
    panelExperiencia.setLayout(panelExperienciaLayout);
    panelExperienciaLayout.setHorizontalGroup(
      panelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelExperienciaLayout.createSequentialGroup()
        .addGap(83, 83, 83)
        .addGroup(panelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelExperienciaLayout.createSequentialGroup()
            .addGroup(panelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(panelExperienciaLayout.createSequentialGroup()
                .addComponent(radioClt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addComponent(radioPj)
                .addGap(19, 19, 19))
              .addGroup(panelExperienciaLayout.createSequentialGroup()
                .addGroup(panelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(labelEmpresa)
                  .addComponent(inputEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(labelCargo)
                  .addComponent(inputCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(panelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(labelArea)
              .addComponent(inputArea, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(labelPeriodo)
              .addComponent(inputPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(radioDesempregado, javax.swing.GroupLayout.Alignment.TRAILING))
            .addGap(103, 103, 103))
          .addGroup(panelExperienciaLayout.createSequentialGroup()
            .addComponent(labelSituacao)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    );
    panelExperienciaLayout.setVerticalGroup(
      panelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelExperienciaLayout.createSequentialGroup()
        .addGap(30, 30, 30)
        .addGroup(panelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(panelExperienciaLayout.createSequentialGroup()
            .addComponent(labelArea)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(inputArea, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelExperienciaLayout.createSequentialGroup()
            .addComponent(labelEmpresa)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(inputEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addGroup(panelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelExperienciaLayout.createSequentialGroup()
            .addComponent(labelCargo)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(inputCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(panelExperienciaLayout.createSequentialGroup()
            .addComponent(labelPeriodo)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(inputPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addComponent(labelSituacao)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(panelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(radioClt)
          .addComponent(radioDesempregado)
          .addComponent(radioPj))
        .addContainerGap(75, Short.MAX_VALUE))
    );

    tabbedPane.addTab("Experiência profissional", panelExperiencia);

    btnLimpar.setBackground(new java.awt.Color(240, 50, 55));
    btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
    btnLimpar.setText("Limpar");
    btnLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnLimparMouseClicked(evt);
      }
    });

    btnCadastrar.setBackground(new java.awt.Color(75, 100, 240));
    btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
    btnCadastrar.setText("Cadastrar");
    btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnCadastrarMouseClicked(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(17, 17, 17)
        .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(17, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(94, 94, 94)
        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(108, 108, 108))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(22, 22, 22)
        .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(23, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void radioFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemininoActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_radioFemininoActionPerformed

  private void radioNaoInformarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNaoInformarActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_radioNaoInformarActionPerformed

  private void inputEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEnderecoActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_inputEnderecoActionPerformed

  private void inputTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTelefoneActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_inputTelefoneActionPerformed

  private void inputEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEmailActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_inputEmailActionPerformed

  private void inputNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_inputNomeActionPerformed

  private void inputInteresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputInteresseActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_inputInteresseActionPerformed

  private void inputIdiomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdiomasActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_inputIdiomasActionPerformed

  private void inputInstituicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputInstituicaoActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_inputInstituicaoActionPerformed

  private void inputCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCursoActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_inputCursoActionPerformed

  private void radioTrancadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTrancadoActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_radioTrancadoActionPerformed

  private void radioAndamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAndamentoActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_radioAndamentoActionPerformed

  private void inputEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEmpresaActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_inputEmpresaActionPerformed

  private void inputAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAreaActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_inputAreaActionPerformed

  private void inputCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCargoActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_inputCargoActionPerformed

  private void inputPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPeriodoActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_inputPeriodoActionPerformed

  private void radioDesempregadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDesempregadoActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_radioDesempregadoActionPerformed

  private void radioPjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPjActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_radioPjActionPerformed

  private void radioCltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCltActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_radioCltActionPerformed

  private void btnLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseClicked
    limpaCampos();
  }//GEN-LAST:event_btnLimparMouseClicked

  private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked
    Usuario u = cadastra();
    JOptionPane.showMessageDialog(this, u, "Usuário cadastrado com sucesso!", JOptionPane.PLAIN_MESSAGE);
    limpaCampos();
  }//GEN-LAST:event_btnCadastrarMouseClicked

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Formulario().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCadastrar;
  private javax.swing.ButtonGroup btnGroupAndamento;
  private javax.swing.ButtonGroup btnGroupSexo;
  private javax.swing.ButtonGroup btnGroupSituacao;
  private javax.swing.JButton btnLimpar;
  private javax.swing.JTextField inputArea;
  private javax.swing.JTextField inputCargo;
  private javax.swing.JTextField inputCurso;
  private javax.swing.JTextField inputEmail;
  private javax.swing.JTextField inputEmpresa;
  private javax.swing.JTextField inputEndereco;
  private javax.swing.JTextField inputIdiomas;
  private javax.swing.JTextField inputInstituicao;
  private javax.swing.JTextField inputInteresse;
  private javax.swing.JTextField inputNome;
  private javax.swing.JTextField inputPeriodo;
  private javax.swing.JTextField inputTelefone;
  private javax.swing.JLabel labelAndamento;
  private javax.swing.JLabel labelArea;
  private javax.swing.JLabel labelCargo;
  private javax.swing.JLabel labelCurso;
  private javax.swing.JLabel labelEmail;
  private javax.swing.JLabel labelEmpresa;
  private javax.swing.JLabel labelEndereco;
  private javax.swing.JLabel labelIdiomas;
  private javax.swing.JLabel labelInstituicao;
  private javax.swing.JLabel labelInteresse;
  private javax.swing.JLabel labelNome;
  private javax.swing.JLabel labelPeriodo;
  private javax.swing.JLabel labelSexo;
  private javax.swing.JLabel labelSituacao;
  private javax.swing.JLabel labelTelefone;
  private javax.swing.JPanel panelDados;
  private javax.swing.JPanel panelExperiencia;
  private javax.swing.JPanel panelFormacao;
  private javax.swing.JRadioButton radioAndamento;
  private javax.swing.JRadioButton radioClt;
  private javax.swing.JRadioButton radioConcluido;
  private javax.swing.JRadioButton radioDesempregado;
  private javax.swing.JRadioButton radioFeminino;
  private javax.swing.JRadioButton radioMasculino;
  private javax.swing.JRadioButton radioNaoInformar;
  private javax.swing.JRadioButton radioPj;
  private javax.swing.JRadioButton radioTrancado;
  private javax.swing.JTabbedPane tabbedPane;
  // End of variables declaration//GEN-END:variables
}
