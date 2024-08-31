package controlador;

import interfaz.PanelGrilla;
import interfaz.PanelTimer;
import interfaz.PanelVidas;
import javax.swing.JOptionPane;
import mundo.LoadNono;
import mundo.Nonograma;

public class Controlador {

    private PanelGrilla panelGrilla;
    private PanelVidas panelVidas;
    private PanelTimer pnlTimer;
    private Nonograma juegoNonograma;
    private int vidasRestantes;
    public Controlador() {

    }

    public void conectar(PanelGrilla panelGrilla, PanelVidas panelVidas, LoadNono loadNono, PanelTimer pnlTimer,Nonograma juegoNonograma) {
        this.panelGrilla = panelGrilla;
        this.panelVidas = panelVidas;
        this.pnlTimer = pnlTimer;
        this.juegoNonograma =  juegoNonograma;
        this.vidasRestantes =3;
    }

    public void verificarSolucion(int x, int y) {
        if (!juegoNonograma.verificarSolucion(x, y)) {
            restarVida();
        } else {
            if (juegoNonograma.verificarVictoria()) {
                mostrarMensajeVictoria();
            }
        }
    }

    
    private void restarVida() {
         vidasRestantes--;
        panelVidas.actualizarVidas(vidasRestantes);

        if (vidasRestantes <= 0) {
            pnlTimer.stopTimer();
            JOptionPane.showMessageDialog(null, "¡Has perdido el juego!");
        }
    }

    private void mostrarMensajeVictoria() {
        pnlTimer.stopTimer();
        JOptionPane.showMessageDialog(null, "¡Felicidades! ¡Has ganado!");
    }
}
