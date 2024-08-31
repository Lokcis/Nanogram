package interfaz;

import java.awt.Color;
import java.awt.FlowLayout;
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
    private JLabel[] lblVida;
    private ImageIcon icon;

    //Constructor
    public PanelVidas() {
          setLayout(new GridLayout());
        lblVida = new JLabel[3];
        setBackground(Color.WHITE);
       
        //Instancia de clase
        icon = new ImageIcon(getClass().getResource("/resources/image/vida64.png"));
        
        for (int i = 0; i < 3; i++) {
            lblVida[i] = new JLabel(icon);
            lblVida[i].setIcon(icon);
            lblVida[i].setBounds(1, 1, 64, 64);
            add(lblVida[i]);
        }
        

    }
    public void actualizarVidas(int vidasRestantes) {
        for (int i = 0; i < lblVida.length; i++) {
            lblVida[i].setVisible(i < vidasRestantes);
        }
    }
}
