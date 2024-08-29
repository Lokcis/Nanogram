/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author asus
 */
public class PanelPistasHorizontal extends JPanel {

    //Atributos
    private JPanel pnlPistasHorizontal[];
    private JLabel lblPistasHorizontal;

    public PanelPistasHorizontal() {
        setLayout(new GridLayout(1, 10));

        //Instancia atributos de la clase
        pnlPistasHorizontal = new JPanel[10];
        
        //Crear y agregar un arreglo de paneles al panel principal
        for (int i = 0; i < 10; i++) {
            pnlPistasHorizontal[i] = new JPanel();
            pnlPistasHorizontal[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            pnlPistasHorizontal[i].setLayout(new GridLayout(5, 1));

            // Crear y agregar 5 JLabel a cada panel interno
            for (int j = 0; j < 5; j++) {
                lblPistasHorizontal = new JLabel("1");
                lblPistasHorizontal.setHorizontalAlignment(JLabel.CENTER);
                lblPistasHorizontal.setVerticalAlignment(JLabel.CENTER);
                pnlPistasHorizontal[i].add(lblPistasHorizontal);
            }

            add(pnlPistasHorizontal[i]);
        }
    }

}
