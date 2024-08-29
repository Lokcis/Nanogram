/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author asus
 */
public class PanelPistas extends JPanel {

    //Atributos
    private JPanel pnlPistasHorizontales[];
    private JLabel lblPistasHorizontales;

    public PanelPistas() {
        setLayout(new GridLayout(1, 10));
        
        //Instancia atributos de la clase
        pnlPistasHorizontales = new JPanel[10];
        
        for (int i = 0; i < 10; i++) {
            pnlPistasHorizontales[i] = new JPanel();
            pnlPistasHorizontales[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            pnlPistasHorizontales[i].setLayout(new GridLayout(5,1));
            
            // Crear y agregar 5 JLabel a cada panel interno
            for (int j = 0; j < 5; j++) {
                lblPistasHorizontales = new JLabel("1");
                lblPistasHorizontales.setHorizontalAlignment(JLabel.CENTER);
                lblPistasHorizontales.setVerticalAlignment(JLabel.CENTER);
                pnlPistasHorizontales[i].add(lblPistasHorizontales);
            }
            
            
            
            
            
            
            add(pnlPistasHorizontales[i]);
        }
    }

}
