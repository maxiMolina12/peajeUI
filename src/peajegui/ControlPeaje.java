/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peajegui;

import java.util.ArrayList;



/**
 *
 * @author maxi
 */
public class ControlPeaje extends VehiculoGUI {
    
    private String nombrePeaje;
    private String departamento;
    private int totalPeaje = 0;
    private int totalAutos = 0;
    private int totalMotos = 0;
    private int totalCamiones = 0;
    
    private ArrayList<AutoGUI> autos = new ArrayList<>();
    private ArrayList<MotoGUI> motos = new ArrayList<>();
    private ArrayList<CamionGUI> camiones = new ArrayList<>();
    
    public ControlPeaje(){
        super();  
    }

    public ControlPeaje(String nombrePeaje, String departamento) {
        this.nombrePeaje = nombrePeaje;
        this.departamento = departamento;
    }
    



    public String getNombrePeaje() {
        return nombrePeaje;
    }

    public void setNombrePeaje(String nombrePeaje) {
        this.nombrePeaje = nombrePeaje;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        
        return "ControlPeaje{" + 
           "nombrePeaje=" + nombrePeaje + 
           ", departamento=" + departamento + 
           ", totalPeaje=" + totalPeaje + 
           ", totalAutos=" + totalAutos + 
           ", totalMotos=" + totalMotos + 
           ", totalCamiones=" + totalCamiones + 
           '}';
}

    @Override
    public int cobroPeajeGUI() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    //metodo para agregar un auto
    public void addAutoGUI(String placaVehiculoGui){
        
        AutoGUI auto = new AutoGUI(placaVehiculoGui);
        autos.add(auto);//añade un auto a la lista
        totalAutos++;
        totalPeaje += auto.getCobroAutoGUI();
     
    }
    public void addMotoGUI(String placaVehiculoGUI){
        MotoGUI moto = new MotoGUI(placaVehiculoGUI);
        motos.add(moto);
        totalMotos++;
        totalPeaje += moto.getCobroMotoGUI();
 
    }
    public void addCamionGUI(String placaVehiculoGUI, int numeroEjes){
        
        CamionGUI camion = new CamionGUI(numeroEjes,placaVehiculoGUI);
        
        camiones.add(camion);
        totalCamiones++;
        totalPeaje +=camion.cobroPeajeGUI();
    
    }
        //metodo para mostrar las estadisticas 
        public String mostrarEstadisticas() {
            
        
        StringBuilder cola = new StringBuilder("estadisticas del peaje\n\n");
        //concatenar con StringBuilder
        cola.append("nombre del peaje: ").append(nombrePeaje).append("\n");
        cola.append("departamento: ").append(departamento).append("\n\n");
        cola.append("total autos: ").append(totalAutos).append("\n");
        cola.append("total motos: ").append(totalMotos).append("\n");
        cola.append("total camiones: ").append(totalCamiones).append("\n");
        cola.append("total recaudado: $").append(totalPeaje).append("\n\n");

        cola.append("Maticulas de vehículos:\n"); 
        
       cola.append("Autos:\n");
       //se itera por la lista de autos
       for (AutoGUI auto : autos) {
            cola.append("- ").append(auto.getPlacaVehiculoGUI()).append("\n");
        }
        
        cola.append("\nMotos:\n");
       //se itera por la lista de motos 
       for (MotoGUI moto : motos) {
            cola.append("- ").append(moto.getPlacaVehiculoGUI()).append("\n");
        }

        cola.append("\nCamiones:\n");
       //se itera por la lista de camiones 
       for (CamionGUI camion : camiones) {
            cola.append("- ").append(camion.getPlacaVehiculoGUI()).append("\n");
        }

        return cola.toString();
    }
}
    

