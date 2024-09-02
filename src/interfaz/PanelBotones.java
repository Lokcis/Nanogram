package interfaz;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import mundo.LoadNono;

/**
 *
 * @author lokci
 */
public class PanelBotones extends JPanel implements ActionListener {

    //Se crean los atributos de los botones y del cargue del Nonograma
    private JButton btnNivel1, btnNivel2, btnReset;
    private LoadNono loadNono;

    //Constructor de el panel de los botones
    public PanelBotones() {
        setLayout(new FlowLayout());//Distribución de los botones.
        setBackground(Color.WHITE);//Color del fondo del panel.

        //Botones con la forma de su borde y color.
        btnNivel1 = new JButton("Nivel 1");
        btnNivel1.setBorder(new RoundedBorder(8, Color.BLACK));
        btnNivel1.setBackground(new Color(234, 238, 249));
        add(btnNivel1);

        btnNivel2 = new JButton("Nivel 2");
        btnNivel2.setBorder(new RoundedBorder(8, Color.BLACK));
        btnNivel2.setBackground(new Color(234, 238, 249));
        add(btnNivel2);

        btnReset = new JButton("Jugar de Nuevo");
        btnReset.setBorder(new RoundedBorder(8, Color.BLACK));
        btnReset.setBackground(new Color(234, 238, 249));
        add(btnReset);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Nivel 1")) {
            
        }
    }

}
