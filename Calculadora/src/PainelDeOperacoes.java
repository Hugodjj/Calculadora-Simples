import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PainelDeOperacoes extends JPanel implements ActionListener {

    private JTextField textoTxt;

    private char operacao;
    private double valor1;
    private double valor2;

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

        //Caso a caixa de texto estiver vazia ignora.
        if (textoTxt.getText().isEmpty()){
            return;
        }

        JButton botao = (JButton) e.getSource();

        //Limpa caixa de texto
        if (botao == botaoLimpar){
            operacao = '\u0000';
            textoTxt.setText("");
        }

        else if (botao == botaoIgualdade){
            valor2 = Double.parseDouble(textoTxt.getText());

            double resultado = 0.0;

            switch (operacao){
                case '+':
                    resultado = valor1 + valor2;
                    break;
                case '-':
                    resultado = valor1 - valor2;
                    break;
                case '*':
                    resultado = valor1 * valor2;
                    break;
                case '/':
                    resultado = valor1 / valor2;
                    break;
            }
            textoTxt.setText(String.valueOf(resultado));
            operacao = '\u0000';
            valor1 = resultado;
            valor2 = 0;
        } else {
            operacao = botao.getText().charAt(0);
            valor1 = Double.parseDouble(textoTxt.getText());
            textoTxt.setText("");
        }
    }
}
