/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intefaz;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author gonza
 */
public class InterfazApp extends JFrame {

    public InterfazApp() {
        //Propiedades de la interfaz o frame
        setTitle("Nonograma");
        getContentPane().setLayout(null);  //Tipo de layout, en este caso null
        setSize(480, 325);  //Tamaño del Frame
        setLocationRelativeTo(null);  //Centra el Frame
        setResizable(false);  //No permite cambiar el tamaño del frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar programa cuando se le da a la X
        
        //Imagen a la barra de tareas
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/icono6.png"));
        Image image = icon.getImage();
        setIconImage(image);
        
    }

    public static void main(String[] args) {

    }

}
