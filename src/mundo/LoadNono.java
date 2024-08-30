package mundo;

import javax.swing.*;
import java.awt.Color;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoadNono {

    private String rows[][], cols[][];
    private String nono[][];

    public LoadNono() {
        rows = new String[5][];
        cols = new String[10][];
        nono = new String[10][];
    }

    public String[][] getRows() {
        return rows;
    }

    public String[][] getCols() {
        return cols;
    }

    public String[][] getNono() {
        return nono;
    }

    public void readNono(String fileIn) {
        BufferedReader buffer = null;
        String line;

        try {
            buffer = new BufferedReader(new FileReader(fileIn));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            for (int i = 0; i < 5; i++) { // Lee pistas de las filas
                line = buffer.readLine();
                rows[i] = line.split(" ");
            }
            for (int i = 0; i < 10; i++) { // Lee pistas de las columnas
                line = buffer.readLine();
                cols[i] = line.split(" ");
            }
            for (int i = 0; i < 10; i++) { // Lee el nonograma
                line = buffer.readLine();
                nono[i] = line.split(" ");
            }
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
/*
    public boolean verificarSolucion(JLabel[][] tablero) {
        for (int i = 0; i < nono.length; i++) {
            for (int j = 0; j < nono[i].length; j++) {
                // Verificar la imagen según la matriz 'nono'
                if (nono[i][j].equals("X")) {
                    if (!esImagenCorrecta(tablero[i][j], "ruta/de/la/imagen/X.png")) {
                        return false;
                    }
                } else if (nono[i][j].equals("0")) {
                    if (!esImagenCorrecta(tablero[i][j], "ruta/de/la/imagen/cuadro_negro.png")) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
*/
    private boolean esImagenCorrecta(JLabel label, String rutaImagenEsperada) {
        Icon icon = label.getIcon();
        if (icon instanceof ImageIcon) {
            ImageIcon imageIcon = (ImageIcon) icon;
            return imageIcon.getDescription().equals(rutaImagenEsperada);
        }
        return false;
    }
}

