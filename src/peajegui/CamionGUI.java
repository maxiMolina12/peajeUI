/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peajegui;

/**
 *
 * @author maxi
 */
public class CamionGUI extends VehiculoGUI {
    private int numeroEjes;
    private int cobroCamionGUI = 5000;
    

    public CamionGUI(int numeroEjes, String placaVehiculoGui) {
        super(placaVehiculoGui);
        this.numeroEjes = numeroEjes;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public int getCobroCamionGUI() {
        return cobroCamionGUI* numeroEjes;
    }

    public void setCobroCamionGUI(int cobroCamionGUI) {
        this.cobroCamionGUI = cobroCamionGUI;
    }

    @Override
    public String toString() {
        return "Camion{" + "placa "+super.getPlacaVehiculoGUI() +" numeroEjes= " + this.numeroEjes + ", cobroCamion=" + this.cobroPeajeGUI() + '}';
    }

    
    @Override
    public int cobroPeajeGUI() {
        
        
        return this.cobroCamionGUI * this.numeroEjes;
    }
}
