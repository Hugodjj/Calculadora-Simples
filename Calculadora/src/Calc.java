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

        JTextPane painelTexto = new JTextPane();
        add(BorderLayout.NORTH,painelTexto);

        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        new Calc();
    }
}
