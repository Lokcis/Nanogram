package interfaz;

import java.awt.event.*;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;
import controlador.Controlador;

public class PanelGrilla extends JPanel {

    // Atributos de la clase 		
    private JLabel lblMundo;

    // Relaciones   
    private Controlador controlador;
    private PanelTimer pnlTimer;

    //Constructor
    public PanelGrilla(Controlador controlador, PanelTimer pnlTimer) {

        setLayout(new GridLayout(10, 10));
        setBackground(Color.WHITE);

        // Enlaza el Controlador, el Panel de Simulación y el timer
        this.controlador = controlador;
        this.pnlTimer = pnlTimer;

        // Instancia atributos de la clase   
        lblMundo = new JLabel();

        // Agrega los atributos al panel   
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                lblMundo = new JLabel();
                lblMundo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                lblMundo.setHorizontalAlignment(JLabel.CENTER);
                lblMundo.setVerticalAlignment(JLabel.CENTER);
                lblMundo.setEnabled(true);
                lblMundo.addMouseListener(new LabelClicMouse(i, j, lblMundo, controlador, this, pnlTimer));
                add(lblMundo);
            }
        }
    }

    public void removeLabelClicMouse() {
        for (int i = 0; i < 35; i++) {
            for (int j = 0; j < 35; j++) {
                lblMundo.removeMouseListener(lblMundo.getMouseListeners()[0]);
            }
        }
    }

}

class LabelClicMouse extends MouseAdapter {

    private JLabel label;
    private Controlador ctrl;
    private int x, y;
    private ImageIcon imgBlock, imgXN;
    private PanelGrilla pnlMundo;
    private PanelTimer pnlTimer;
    private boolean timerStarted = false;  // Para evitar que se inicie el temporizador más de una vez

    public LabelClicMouse(int x, int y, JLabel label, Controlador ctrl, PanelGrilla pnlMundo, PanelTimer pnlTimer) {
        this.label = label;
        this.ctrl = ctrl;
        this.x = x;
        this.y = y;
        this.imgBlock = new ImageIcon(getClass().getResource("/resources/image/BTareas1.jpg"));
        this.imgXN = new ImageIcon(getClass().getResource("/resources/image/xn.jpg"));
        this.pnlMundo = pnlMundo;
        this.pnlTimer = pnlTimer;
    }

    @Override
    public void mouseClicked(MouseEvent evento) {
        if (!timerStarted) {  // Verifica si el temporizador ya ha sido iniciado
            pnlTimer.startTimer();  // Inicia el temporizador
            timerStarted = true;  // Marca que el temporizador ha sido iniciado
        }

        if (evento.isShiftDown()) {
            if (evento.isMetaDown()) { // Shif+Boton derecho    	                

            } else {// Shift+Boton Izquierdo

            }
        } else {
            if (evento.isMetaDown()) // boton derecho del raton - Pone celulas o Quita celulas
            {
                if ((label.getText()).equals("") && label.getIcon() == null) {
                    label.setIcon(imgBlock);
                    System.out.println("Click derecho");
                    System.out.println("LabelClicMouse(" + x + "," + y + ")");
                    ctrl.putCell(x, y, "C");

                } else if (label.getIcon() != null) {
                    label.setIcon(null);
                    System.out.println("Quitar celula: LabelClicMouse(" + x + "," + y + ")");
                    ctrl.putCell(x, y, "-");

                } else {
                }
            } else {
                if (evento.isAltDown()) { // boton medio del raton

                } else { // boton izquierdo
                    System.out.println("Presiono el boton Izquierdo");
                    label.setIcon(imgXN);
                }
            }
        }
    }
}
