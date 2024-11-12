/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peajegui;

/**
 *
 * @author maxi
 */
public abstract class VehiculoGUI {
    private String placaVehiculoGui;

    public VehiculoGUI(){
        super();
    }
     
    
    public VehiculoGUI(String placaVehiculoGui) {
        this.placaVehiculoGui = placaVehiculoGui;
    }

    public String getPlacaVehiculoGUI() {
        return placaVehiculoGui;
    }

    public void setPlacaVehiculoGUI(String placaVehiculoGui) {
        this.placaVehiculoGui = placaVehiculoGui;
    }

    @Override
    public String toString() {
        return "VehiculoGui{" + "placaVehiculoGui=" + placaVehiculoGui + '}';
    }
    
    public abstract int cobroPeajeGUI();
}
