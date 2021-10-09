import javax.swing.*;
import java.awt.*;

public class PainelDeTexto extends JPanel {

    private JTextField numeroTXT;

    public PainelDeTexto(){
        setLayout(new FlowLayout());

        numeroTXT = new JTextField(15);
        numeroTXT.setHorizontalAlignment(JTextField.RIGHT);
        numeroTXT.setEnabled(false);
        add(numeroTXT);
    }

    public JTextField getNumeroTXT() {
        return numeroTXT;
    }
}
