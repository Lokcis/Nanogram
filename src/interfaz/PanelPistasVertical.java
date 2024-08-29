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

public class PanelPistasVertical extends JPanel{

    //Atributos
    private JPanel pnlPistasVertical[];
    private JLabel lblPistasVertical;
    
    public PanelPistasVertical(){
        setLayout(new GridLayout(10, 1));
        
        //Instancia de antributos
        pnlPistasVertical = new JPanel[10];
        
        for (int i = 0; i < 10; i++) {
            pnlPistasVertical[i] = new JPanel();
            pnlPistasVertical[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            pnlPistasVertical[i].setLayout(new GridLayout(1, 5));
            
            // Crear y agregar 5 JLabel a cada panel interno
            for (int j = 0; j < 5; j++) {
                lblPistasVertical = new JLabel("1");
                lblPistasVertical.setHorizontalAlignment(JLabel.CENTER);
                lblPistasVertical.setVerticalAlignment(JLabel.CENTER);
                pnlPistasVertical[i].add(lblPistasVertical);
            }

            add(pnlPistasVertical[i]);
        }
        
    }
}
