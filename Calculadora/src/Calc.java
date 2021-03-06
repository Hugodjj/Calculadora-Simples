import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Calc extends JFrame {

    public Calc() throws Exception{
        super("Calculadora");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setLocation(400,200);

        setLayout(new BorderLayout());

        PainelDeTexto painelTexto = new PainelDeTexto();
        add(BorderLayout.NORTH,painelTexto);

        JPanel painelDeDigitos = new JPanel();
        painelDeDigitos.setLayout(new BorderLayout());
        painelDeDigitos.add(BorderLayout.CENTER,new PainelDeNumeros(painelTexto.getNumeroTXT()));
        painelDeDigitos.add(BorderLayout.EAST,new PainelDeOperacoes(painelTexto.getNumeroTXT()));



        add(BorderLayout.CENTER,painelDeDigitos);

        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        new Calc();
    }
}
