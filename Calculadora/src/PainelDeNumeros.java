import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PainelDeNumeros extends JPanel implements ActionListener {

    private JTextField textoTxt;

    public PainelDeNumeros(JTextField textoTxt){
        this.textoTxt = textoTxt;

        setLayout(new GridLayout(4,3));

        JButton bot1 = new JButton("1");
        bot1.addActionListener(this);
        add(bot1);

        JButton bot2 = new JButton("2");
        bot2.addActionListener(this);
        add(bot2);

        JButton bot3 = new JButton("3");
        bot3.addActionListener(this);
        add(bot3);

        JButton bot4 = new JButton("4");
        bot4.addActionListener(this);
        
        add(bot4);

        JButton bot5 = new JButton("5");
        bot5.addActionListener(this);
        add(bot5);

        JButton bot6 = new JButton("6");
        bot6.addActionListener(this);
        add(bot6);

        JButton bot7 = new JButton("7");
        bot7.addActionListener(this);
        add(bot7);

        JButton bot8 = new JButton("8");
        bot8.addActionListener(this);
        add(bot8);

        JButton bot9 = new JButton("9");
        bot9.addActionListener(this);
        add(bot9);

        JButton botaovazio = new JButton();
        botaovazio.setEnabled(false);
        add(botaovazio);

        JButton bot0 = new JButton("0");
        bot0.addActionListener(this);
        add(bot0);

        JButton botaovazio2 = new JButton();
        botaovazio2.setEnabled(false);
        add(botaovazio2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // Para de digitar quando chega a 10 números digitados
        if (textoTxt.getText().length() == 10){
            return;
        }

        JButton botao = (JButton) e.getSource();
        String numero = botao.getText();
        textoTxt.setText(textoTxt.getText() + numero);
    }
}
