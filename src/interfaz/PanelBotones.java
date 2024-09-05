package interfaz;

import controlador.Controlador;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author lokci
 */
public class PanelBotones extends JPanel implements ActionListener {

    //Se crean los atributos de los botones y del cargue del Nonograma
    private JButton btnNivel1, btnNivel2, btnReset;
    private Controlador ctrl;

    private PanelGrilla panelGrilla;
    private PanelVidas panelVidas;
    private PanelTimer panelTimer;

    //Constructor de el panel de los botones
    public PanelBotones(Controlador ctrl, PanelGrilla panelGrilla, PanelVidas panelVidas, PanelTimer panelTimer) {
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
        btnReset.addActionListener(this);
        add(btnReset);

        this.ctrl = ctrl;
        this.panelGrilla = panelGrilla;
        this.panelVidas = panelVidas;
        this.panelTimer = panelTimer;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Jugar de Nuevo")) {
            panelGrilla.reiniciarGrilla();
            panelVidas.reiniciarVidas();
            panelTimer.reiniciarTimer();
        }
    }

}
