/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peajegui;

/**
 *
 * @author maxi
 */
public class AutoGUI extends VehiculoGUI {
    
    private int cobroAutoGUI = 10000;

    public AutoGUI(String placaVehiculoGui) {
        super(placaVehiculoGui);
        
    }

    public int getCobroAutoGUI() {
        return cobroAutoGUI;
    }

    public void setCobroAutoGUI(int cobroAutoGUI) {
        this.cobroAutoGUI = cobroAutoGUI;
    }

    @Override
    public String toString() {
        return "Auto{" + "cobroAuto=" + super.getPlacaVehiculoGUI()+ cobroAutoGUI + cobroAutoGUI + '}';
        
    }


    

    
    
    @Override
    public int cobroPeajeGUI() {
        
        return this.cobroAutoGUI;
    }
    
    
    
    
}
