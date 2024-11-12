/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package peajegui;

import javax.swing.SwingUtilities;

/**
 *
 * @author maxi
 */
public class PeajeGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
              SwingUtilities.invokeLater(() -> {
            new GUIPeaje();  // crea e inicia la GUI del sistema de peaje
        });
       
    }
    }
    

