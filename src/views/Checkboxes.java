package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Checkboxes extends JFrame implements ItemListener {
  JPanel contentPane, panelBody;
  JLabel titulo, labelNegrito, labelItalico;
  JCheckBox boxNegrito, boxItalico;
  Font fonte;

  public Checkboxes() {
    super("Checkboxes -- Graphic User Interface");

    setBounds(0, 0, 400, 600);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    fonte = new Font("serif", Font.PLAIN, 24);

    contentPane = new JPanel();
    contentPane.setLayout(null);
    
    setContentPane(contentPane);
    
    panelBody = new JPanel();
    panelBody.setBounds(0, 0, 400, 600);
    panelBody.setBackground(new Color(215, 215, 215));
    panelBody.setLayout(null);

    contentPane.add(panelBody);

    titulo = new JLabel("Senac Tech");
    titulo.setBounds(140, 20, 150, 25);
    titulo.setFont(fonte);
    titulo.setForeground(new Color(10, 10, 10));
    titulo.setToolTipText("Técnico em Desenvolvimento de Sistemas");

    panelBody.add(titulo);

    boxItalico = new JCheckBox();
    boxItalico.setBounds(66, 100, 100, 50);
    boxItalico.setLayout(null);
    boxItalico.addItemListener(this);

    panelBody.add(boxItalico);

    labelItalico = new JLabel("Itálico", SwingConstants.CENTER);
    labelItalico.setBounds(00, 0, 100, 50);

    boxItalico.add(labelItalico);

    boxNegrito = new JCheckBox();
    boxNegrito.setBounds(233, 100, 100, 50);
    boxNegrito.setLayout(null);
    boxNegrito.addItemListener(this);

    panelBody.add(boxNegrito);

    labelNegrito = new JLabel("Negrito", SwingConstants.CENTER);
    labelNegrito.setBounds(0, 0, 100, 50);

    boxNegrito.add(labelNegrito);
  }

  @Override
  public void itemStateChanged(ItemEvent e) {
    if (boxNegrito.isSelected() && boxItalico.isSelected())
      titulo.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 24));

    else if (boxNegrito.isSelected())
      titulo.setFont(new Font("Serif", Font.BOLD, 24));

    else if (boxItalico.isSelected())
      titulo.setFont(new Font("Serif", Font.ITALIC, 24));

    else
      titulo.setFont(new Font("Serif", Font.PLAIN, 24));
  }
}
