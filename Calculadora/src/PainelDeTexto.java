import javax.swing.*;
import java.awt.*;

public class PainelDeTexto extends JPanel {

    private JTextField numeroTXT;

    public PainelDeTexto(){
        setLayout(new FlowLayout());

        numeroTXT = new JTextField();
        numeroTXT.setHorizontalAlignment(JTextField.RIGHT);
        numeroTXT.setEnabled(false);
    }

    public JTextField getNumeroTXT() {
        return numeroTXT;
    }
}
