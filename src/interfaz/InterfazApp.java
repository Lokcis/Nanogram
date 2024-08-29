/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaz;

import controlador.Controlador;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author gonza
 */
public class InterfazApp extends JFrame {

    // Relaciones
    private PanelGrilla pnlMundo;
    private PanelPistas pnlPistas;
    private Controlador ctrl;

    // Atributos   
    private JMenuBar mbrOpciones; // crear JMenuItem para las opciones

    //constructor
    public InterfazApp(Controlador ctrl) {

        //Propiedades de la interfaz o frame
        setTitle("Nonograma");
        getContentPane().setLayout(null);  //Tipo de layout, en este caso null
        setSize(620, 760);  //Tamaño del Frame
        setLocationRelativeTo(null);  //Centra el Frame
        setResizable(false);  //No permite cambiar el tamaño del frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar programa cuando se le da a la X

        //Imagen a la barra de tareas
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/BTareas2.jpg"));
        Image image = icon.getImage();
        setIconImage(image);

        //Enlaza el controlador
        this.ctrl = ctrl;

        // Instancia controles de menu
        mbrOpciones = new JMenuBar();
        //Poner los JMenuItem

        // Instancia los paneles    
        pnlMundo = new PanelGrilla(ctrl);
        pnlMundo.setBounds(145, 259, 430, 430);
        add(pnlMundo);
        
        pnlPistas = new PanelPistas();
        pnlPistas.setBounds(145, 180, 430, 75);
        add(pnlPistas);

        // Conecta controlador a los paneles   
        ctrl.conectar(pnlMundo);

    }

    public static void main(String args[]) {
        InterfazApp frmMain = new InterfazApp(new Controlador());
        frmMain.setVisible(true);
    }

}
