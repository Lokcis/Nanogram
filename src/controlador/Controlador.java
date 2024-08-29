package controlador;

import interfaz.PanelGrilla;

public class Controlador {

    //Relaciones
    private PanelGrilla pnlMundo;

    //Atributos
    //Constructor
    public Controlador() {

    }

    public void conectar(PanelGrilla pnlMundo) {
        this.pnlMundo = pnlMundo;

    }

    public void putCell(int x, int y, String cell) {
        System.out.println("ctrl: (" + x + "," + y + ") " + cell);
    }
}
