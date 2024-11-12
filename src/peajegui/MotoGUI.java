/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peajegui;

/**
 *
 * @author maxi
 */
public class MotoGUI extends VehiculoGUI {
    
    private int cobroMotoGUI = 5000;


    public MotoGUI(String placaVehiculoGui) {
        super(placaVehiculoGui);
    }

    public int getCobroMotoGUI() {
        return cobroMotoGUI;
    }

    public void setCobroMotoGUI(int cobroMotoGUI) {
        this.cobroMotoGUI = cobroMotoGUI;
    }

    @Override
    public String toString() {
        return "Moto{" + "cobroMoto=" +super.getPlacaVehiculoGUI()+ cobroMotoGUI + this.cobroMotoGUI +'}';
    }
    
    
    

    @Override
    public int cobroPeajeGUI() {
        return this.cobroMotoGUI;


    }
    
    
}
