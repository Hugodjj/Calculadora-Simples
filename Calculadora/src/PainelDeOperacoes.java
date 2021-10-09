import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PainelDeOperacoes extends JPanel implements ActionListener {

    private JTextField textoTxt;

    private JButton botaoSomar;
    private JButton botaoSubtrair;
    private JButton botaoMultiplicar;
    private JButton botaoDividir;
    private JButton botaoIgualdade;
    private JButton botaoLimpar;


    public PainelDeOperacoes(JTextField textoTxt){
        this.textoTxt = textoTxt;

        setLayout(new GridLayout(3,2));

        botaoSomar = new JButton("+");
        botaoSomar.addActionListener(this);
        add(botaoSomar);

        botaoSubtrair = new JButton("-");
        botaoSomar.addActionListener(this);
        add(botaoSubtrair);

        botaoMultiplicar = new JButton("*");
        botaoMultiplicar.addActionListener(this);
        add(botaoMultiplicar);

        botaoDividir = new JButton("/");
        botaoDividir.addActionListener(this);
        add(botaoDividir);

        botaoIgualdade = new JButton("=");
        botaoIgualdade.addActionListener(this);
        add(botaoIgualdade);

        botaoLimpar = new JButton("C");
        botaoLimpar.addActionListener(this);
        add(botaoLimpar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
