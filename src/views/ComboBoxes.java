package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class ComboBoxes extends JFrame implements ItemListener {
  JPanel contentPane, panelBody;
  JLabel labelImagem;
  JComboBox<String> comboImagens;
  ArrayList<ImageIcon> imagens;
  Font fonte;

  public ComboBoxes() {
    super("Combo Boxes -- Graphic User Interface");

    setBounds(0, 0, 400, 600);
    setResizable(false);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    fonte = new Font("serif", Font.PLAIN, 24);

    imagens = new ArrayList<>();
    imagens.add(new ImageIcon(ComboBoxes.class.getResource("/imagens/cachorro.jpg")));
    imagens.add(new ImageIcon(ComboBoxes.class.getResource("/imagens/gato.jpg")));
    imagens.add(new ImageIcon(ComboBoxes.class.getResource("/imagens/rato.jpg")));
    imagens.add(new ImageIcon(ComboBoxes.class.getResource("/imagens/pica-pau.jpg")));

    contentPane = new JPanel();
    contentPane.setLayout(null);

    setContentPane(contentPane);

    panelBody = new JPanel();
    panelBody.setBounds(0, 0, 400, 600);
    panelBody.setBackground(new Color(215, 215, 215));
    panelBody.setLayout(null);

    contentPane.add(panelBody);

    comboImagens = new JComboBox<>();
    comboImagens.setBounds(50, 10, 300, 45);
    comboImagens.setBorder(new LineBorder(new Color(200, 200, 200), 1, true));
    comboImagens.setLayout(null);
    comboImagens.setFont(fonte);
    comboImagens.setModel(new DefaultComboBoxModel<>(new String[] { "Cachorro", "Gato", "Rato", "Pica-pau" }));

    comboImagens.addItemListener(this);

    panelBody.add(comboImagens);

    labelImagem = new JLabel(imagens.get(0));
    labelImagem.setBounds(50, 100, 300, 450);

    panelBody.add(labelImagem);
  }

  @Override
  public void itemStateChanged(ItemEvent e) {
    if (e.getStateChange() == ItemEvent.SELECTED)
      labelImagem.setIcon(imagens.get(comboImagens.getSelectedIndex()));
  }
}
