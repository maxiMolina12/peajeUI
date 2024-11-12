/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peajegui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author maxi
 */
public class GUIPeaje extends JFrame  {
    private ControlPeaje peaje;
    
    public GUIPeaje(){
        peaje = new ControlPeaje("nombre del peaje "," departamento x");
        setTitle("sistema de peaje");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//para detener el programa 
        setLayout(new FlowLayout());
        
        //boton para cada opcion
        JButton addAutoBoton = new JButton("agregar auto");
        JButton addMotoBoton = new JButton("agregar moto");
        JButton addCamionBoton = new JButton("agregar camion");
        JButton ESPeaje = new JButton("ver estadisticas");
        
        //los botones para la el frame
        add(addAutoBoton);
        add(addMotoBoton);
        add(addCamionBoton);
        add(ESPeaje);
        
        //eventos para los botones del los autos 
        addAutoBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //agregar autos
                String placa = JOptionPane.showInputDialog("ingrese la placa del auto");
                
                //verificar si se ingresa un valor valido
                if(placa != null && !placa.trim().isEmpty()){
                    peaje.addAutoGUI(placa);
                
                }
                
            }  
    
    });
        
        //evento para el boton de las motos
         addMotoBoton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {  
                String placa = JOptionPane.showInputDialog("ingrese la placa de la motos");
                if (placa != null && !placa.trim().isEmpty()){
                    peaje.addMotoGUI(placa);
                
                }
                
            }    
        });
         
         //boton para los camiones
         addCamionBoton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String placa = JOptionPane.showInputDialog("ingrese la placa del camion");
                
                if (placa != null && !placa.trim().isEmpty()){
                    String ejes = JOptionPane.showInputDialog("ingrese el numero de ejes");
                    
                    //try para validar que el numero de ejes tenga el formato correcto
                    try{
                        int NumEjes = Integer.parseInt(ejes);
                        peaje.addCamionGUI(placa, NumEjes);
                        
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(null,"numero de ejes no valido","Error", JOptionPane.ERROR_MESSAGE);
                    
                    
                    }                
                }                
            }
        }   
         
         );
            //boton para las estadisticas del peaje
            ESPeaje.addActionListener(e ->{
            
            String estadisticas = peaje.mostrarEstadisticas();
                JOptionPane.showMessageDialog(null, peaje.toString());
                JOptionPane.showMessageDialog(this, estadisticas, "estadisticas del Peaje", JOptionPane.INFORMATION_MESSAGE);
                
            
            
            
            } );
            
         
         
         setVisible(true);
    
    }
    
    
    
}
