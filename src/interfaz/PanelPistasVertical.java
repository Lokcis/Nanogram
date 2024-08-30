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
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import mundo.LoadNono;

public class PanelPistasVertical extends JPanel {

    //Atributos
    private JPanel pnlPistasVertical;
    private JLabel lblPistasVertical;
    private String pistasVerticales[][];

    public PanelPistasVertical(LoadNono loadNono) {
        setLayout(new GridLayout(10, 1, 2, 2));
        
        //Instancia de atributos
        pistasVerticales = loadNono.getCols();

        for (int i = 0; i < 10; i++) {
            pnlPistasVertical = new JPanel();
            pnlPistasVertical.setLayout(new GridLayout(1, 5));
            pnlPistasVertical.setBackground(new Color(234, 238, 249));

            // Aplicar el borde redondeado con un radio de 8 píxeles y color negro
            pnlPistasVertical.setBorder(new RoundedBorder(8, Color.BLACK));

            // Crear y agregar 5 JLabel a cada panel interno
            for (int j = 0; j < 5; j++) {
                lblPistasVertical = new JLabel(pistasVerticales[i][j]);
                lblPistasVertical.setHorizontalAlignment(JLabel.CENTER);
                lblPistasVertical.setVerticalAlignment(JLabel.CENTER);
                pnlPistasVertical.add(lblPistasVertical);
            }

            add(pnlPistasVertical);
        }

    }
}
