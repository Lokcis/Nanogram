package interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author asus
 */
public class PanelVidas extends JPanel {

    //Atributos
    private JLabel lblVida;
    private ImageIcon icon;

    //Constructor
    public PanelVidas() {
        
        setLayout(new GridLayout(1, 3));
        setBackground(Color.WHITE);
       
        //Instancia de clase
        icon = new ImageIcon(getClass().getResource("/resources/image/vida64.png"));
        
        for (int i = 0; i < 3; i++) {
            lblVida = new JLabel(icon);
            lblVida.setIcon(icon);
            lblVida.setBounds(1, 1, 64, 64);
            add(lblVida);
        }

    }
}
