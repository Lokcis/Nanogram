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

    // Atributos de los botones y del controlador
    private JButton btnNivel1, btnNivel2, btnReset;
    private Controlador ctrl;

    private PanelGrilla panelGrilla;
    private PanelVidas panelVidas;
    private PanelTimer panelTimer;

    /**
     * Constructor de la clase PanelBotones.
     *
     * @param ctrl El controlador del juego.
     * @param panelGrilla El panel de la grilla.
     * @param panelVidas El panel de las vidas.
     * @param panelTimer El panel del temporizador.
     */
    public PanelBotones(Controlador ctrl, PanelGrilla panelGrilla, PanelVidas panelVidas, PanelTimer panelTimer) {
        setLayout(new FlowLayout());//Distribución de los botones.
        setBackground(Color.WHITE);//Color del fondo del panel.

        // Inicializar y configurar los botones
        btnNivel1 = crearBoton("Nivel 1");
        btnNivel2 = crearBoton("Nivel 2");
        btnReset = crearBoton("Jugar de Nuevo");
        btnReset.addActionListener(this);

        this.ctrl = ctrl;
        this.panelGrilla = panelGrilla;
        this.panelVidas = panelVidas;
        this.panelTimer = panelTimer;
    }

    private JButton crearBoton(String texto) {
        JButton boton = new JButton(texto);
        boton.setBorder(new RoundedBorder(8, Color.BLACK));
        boton.setBackground(new Color(234, 238, 249));
        boton.addActionListener(this);
        add(boton);
        return boton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        if (comando.equals("Jugar de Nuevo")) {
            ctrl.reiniciarJuego();
        } else if (comando.equals("Nivel 1")) {
            ctrl.cargarNivel("nono0");
        } else if (comando.equals("Nivel 2")) {
            ctrl.cargarNivel("nono2");
        }
    }

}
