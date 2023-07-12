package views;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Formulario extends JFrame {
  JPanel contentPane, body, btnLimpar, btnCadastrar;
  JLabel labelNome, labelCidade, labelEmail, labelSenha, labelIdioma1, labelIdioma2, labelSkill, labelBack, labelFront,
      labelBanco, labelBtnLimpar, labelBtnCadastrar;
  JTextField inputNome, inputCidade, inputEmail;
  JPasswordField inputSenha;
  JComboBox<String> comboIdioma1, comboIdioma2;
  JCheckBox boxBack, boxFront, boxBanco;
  Color corFundo, corFonte, branco, azul, azulForte, vermelho, vermelhoForte, cinza;
  Font fonte;
  String[] idiomas;

  public Formulario() {
    super("Formulário | Graphic User Interface");

    setBounds(0, 0, 960, 600);
    setResizable(false);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    corFundo = new Color(233, 233, 233);
    corFonte = new Color(76, 76, 76);
    branco = new Color(255, 255, 255);
    azul = new Color(12, 132, 240);
    azulForte = new Color(10, 90, 200);
    vermelho = new Color(230, 70, 70);
    vermelhoForte = new Color(240, 35, 35);
    cinza = new Color(145, 145, 145);

    fonte = new Font("Roboto", Font.PLAIN, 18);

    idiomas = new String[] { "Português", "Inglês", "Espanhol", "Francês", "Alemão" };

    contentPane = new JPanel();
    contentPane.setLayout(null);

    setContentPane(contentPane);

    body = new JPanel();
    body.setBounds(0, 0, 950, 600);
    body.setBackground(corFundo);
    body.setLayout(null);

    contentPane.add(body);

    labelNome = new JLabel("Nome:");
    labelNome.setBounds(45, 20, 400, 20);
    labelNome.setFont(fonte);
    labelNome.setForeground(corFonte);

    body.add(labelNome);

    inputNome = new JTextField("Digite seu nome.", 50);
    inputNome.setBounds(20, 50, 445, 45);
    inputNome.setFont(fonte);
    inputNome.setForeground(cinza);
    inputNome.setHorizontalAlignment(SwingConstants.LEFT);

    body.add(inputNome);

    labelCidade = new JLabel("Cidade:");
    labelCidade.setBounds(510, 20, 400, 20);
    labelCidade.setFont(fonte);
    labelCidade.setForeground(corFonte);

    body.add(labelCidade);

    inputCidade = new JTextField("Digite sua cidade.", 50);
    inputCidade.setBounds(485, 50, 445, 45);
    inputCidade.setFont(fonte);
    inputCidade.setForeground(cinza);
    inputCidade.setHorizontalAlignment(SwingConstants.LEFT);

    body.add(inputCidade);

    labelEmail = new JLabel("E-mail:");
    labelEmail.setBounds(45, 110, 400, 20);
    labelEmail.setFont(fonte);
    labelEmail.setForeground(corFonte);

    body.add(labelEmail);

    inputEmail = new JTextField("Digite seu e-mail.", 50);
    inputEmail.setBounds(20, 135, 445, 45);
    inputEmail.setFont(fonte);
    inputEmail.setForeground(cinza);
    inputEmail.setHorizontalAlignment(SwingConstants.LEFT);

    body.add(inputEmail);

    labelSenha = new JLabel("Senha:");
    labelSenha.setBounds(510, 110, 400, 20);
    labelSenha.setFont(fonte);
    labelSenha.setForeground(corFonte);

    body.add(labelSenha);

    inputSenha = new JPasswordField("**********", 50); // 10 *
    inputSenha.setBounds(485, 135, 445, 45);
    inputSenha.setFont(fonte);
    inputSenha.setForeground(cinza);
    inputSenha.setHorizontalAlignment(SwingConstants.LEFT);

    body.add(inputSenha);

    labelSkill = new JLabel("Skills:");
    labelSkill.setBounds(45, 220, 400, 20);
    labelSkill.setFont(fonte);
    labelSkill.setForeground(corFonte);

    body.add(labelSkill);

    boxBack = new JCheckBox();
    boxBack.setBounds(20, 255, 285, 20);
    boxBack.setBackground(corFundo);
    boxBack.setLayout(null);

    body.add(boxBack);

    labelBack = new JLabel("Back-end", SwingConstants.CENTER);
    labelBack.setBounds(0, 0, 285, 20);
    labelBack.setFont(fonte);
    labelBack.setForeground(corFonte);

    boxBack.add(labelBack);

    boxFront = new JCheckBox();
    boxFront.setBounds(325, 255, 285, 20);
    boxFront.setBackground(corFundo);
    boxFront.setLayout(null);

    body.add(boxFront);

    labelFront = new JLabel("Front-end", SwingConstants.CENTER);
    labelFront.setBounds(0, 0, 285, 20);
    labelFront.setFont(fonte);
    labelFront.setForeground(corFonte);

    boxFront.add(labelFront);

    boxBanco = new JCheckBox();
    boxBanco.setBounds(630, 255, 285, 20);
    boxBanco.setBackground(corFundo);
    boxBanco.setLayout(null);

    body.add(boxBanco);

    labelBanco = new JLabel("Banco de dados", SwingConstants.CENTER);
    labelBanco.setBounds(0, 0, 285, 20);
    labelBanco.setFont(fonte);
    labelBanco.setForeground(corFonte);

    boxBanco.add(labelBanco);

    labelIdioma1 = new JLabel("Idioma preferencial:");
    labelIdioma1.setBounds(45, 315, 400, 20);
    labelIdioma1.setFont(fonte);
    labelIdioma1.setForeground(corFonte);

    body.add(labelIdioma1);

    comboIdioma1 = new JComboBox<>();
    comboIdioma1.setBounds(20, 345, 445, 45);
    comboIdioma1.setFont(fonte);
    comboIdioma1.setForeground(corFonte);
    comboIdioma1.setBackground(branco);
    comboIdioma1.setModel(new DefaultComboBoxModel<>(idiomas));

    body.add(comboIdioma1);

    labelIdioma2 = new JLabel("Idioma secundário:");
    labelIdioma2.setBounds(510, 315, 400, 20);
    labelIdioma2.setFont(fonte);
    labelIdioma2.setForeground(corFonte);
    labelIdioma1.setForeground(corFonte);

    body.add(labelIdioma2);

    comboIdioma2 = new JComboBox<>();
    comboIdioma2.setBounds(485, 345, 445, 45);
    comboIdioma2.setFont(fonte);
    comboIdioma2.setForeground(corFonte);
    comboIdioma2.setBackground(branco);
    comboIdioma2.setModel(new DefaultComboBoxModel<>(idiomas));

    body.add(comboIdioma2);

    btnCadastrar = new JPanel();
    btnCadastrar.setBounds(205, 440, 245, 50);
    btnCadastrar.setBackground(azul);
    btnCadastrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    btnCadastrar.setLayout(null);

    body.add(btnCadastrar);

    labelBtnCadastrar = new JLabel("Cadastrar", SwingConstants.CENTER);
    labelBtnCadastrar.setBounds(0, 0, 245, 50);
    labelBtnCadastrar.setForeground(branco);
    labelBtnCadastrar.setFont(fonte);

    btnCadastrar.add(labelBtnCadastrar);

    btnLimpar = new JPanel();
    btnLimpar.setBounds(500, 440, 245, 50);
    btnLimpar.setBackground(vermelho);
    btnLimpar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    btnLimpar.setLayout(null);

    body.add(btnLimpar);

    labelBtnLimpar = new JLabel("Limpar", SwingConstants.CENTER);
    labelBtnLimpar.setBounds(0, 0, 245, 50);
    labelBtnLimpar.setForeground(branco);
    labelBtnLimpar.setFont(fonte);

    btnLimpar.add(labelBtnLimpar);

    inputNome.addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(MouseEvent e) {
        if (inputNome.getText().equals("Digite seu nome.")) {
          inputNome.setForeground(corFonte);
          inputNome.setText("");
        }

        if (inputCidade.getText().trim().isEmpty()) {
          inputCidade.setForeground(cinza);
          inputCidade.setText("Digite sua cidade.");
          ;
        }

        if (inputEmail.getText().trim().isEmpty()) {
          inputEmail.setForeground(cinza);
          inputEmail.setText("Digite seu e-mail.");
          ;
        }

        if (String.valueOf(inputSenha.getPassword()).isEmpty()) {
          inputSenha.setForeground(cinza);
          inputSenha.setText("**********");
          ;
        }
      }
    });

    inputCidade.addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(MouseEvent e) {
        if (inputCidade.getText().equals("Digite sua cidade.")) {
          inputCidade.setForeground(corFonte);
          inputCidade.setText("");
        }

        if (inputNome.getText().trim().isEmpty()) {
          inputNome.setForeground(cinza);
          inputNome.setText("Digite seu nome.");
          ;
        }

        if (inputEmail.getText().trim().isEmpty()) {
          inputEmail.setForeground(cinza);
          inputEmail.setText("Digite seu e-mail.");
          ;
        }

        if (String.valueOf(inputSenha.getPassword()).isEmpty()) {
          inputSenha.setForeground(cinza);
          inputSenha.setText("**********");
          ;
        }
      }
    });

    inputEmail.addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(MouseEvent e) {
        if (inputEmail.getText().equals("Digite seu e-mail.")) {
          inputEmail.setForeground(corFonte);
          inputEmail.setText("");
        }

        if (inputNome.getText().trim().isEmpty()) {
          inputNome.setForeground(cinza);
          inputNome.setText("Digite seu nome.");
          ;
        }

        if (inputCidade.getText().trim().isEmpty()) {
          inputCidade.setForeground(cinza);
          inputCidade.setText("Digite sua cidade.");
          ;
        }

        if (String.valueOf(inputSenha.getPassword()).isEmpty()) {
          inputSenha.setForeground(cinza);
          inputSenha.setText("**********");
          ;
        }
      }
    });

    inputSenha.addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(MouseEvent e) {
        if (String.valueOf(inputSenha.getPassword()).equals("**********")) {
          inputSenha.setForeground(corFonte);
          inputSenha.setText("");
        }

        if (inputNome.getText().trim().isEmpty()) {
          inputNome.setForeground(cinza);
          inputNome.setText("Digite seu nome.");
          ;
        }

        if (inputCidade.getText().trim().isEmpty()) {
          inputCidade.setForeground(cinza);
          inputCidade.setText("Digite sua cidade.");
          ;
        }

        if (inputEmail.getText().trim().isEmpty()) {
          inputEmail.setForeground(cinza);
          inputEmail.setText("Digite seu e-mail.");
          ;
        }
      }
    });

    btnCadastrar.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseEntered(MouseEvent e) {
        btnCadastrar.setBackground(azulForte);
      }

      @Override
      public void mouseExited(MouseEvent e) {
        btnCadastrar.setBackground(azul);
      }

      @Override
      public void mouseClicked(MouseEvent e) {
        
      }
    });

    btnLimpar.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseEntered(MouseEvent e) {
        btnLimpar.setBackground(vermelhoForte);
      }

      @Override
      public void mouseExited(MouseEvent e) {
        btnLimpar.setBackground(vermelho);
      }

      @Override
      public void mouseClicked(MouseEvent e) {
        
      }
    });
  }
}
