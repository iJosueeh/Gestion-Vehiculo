/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import java.util.ArrayList;
import java.util.List;
import modelos.Vehiculo;

/**
 *
 * @author HOME
 */
public class GestionarVehiculos implements IGestionVehiculos {

    private List<Vehiculo> vehiculos;

    public GestionarVehiculos() {
        this.vehiculos = new ArrayList<>();
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
 
    @Override
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehiculo almacenado correctamente.\n");
    }

    @Override
    public void eliminarVehiculo(Vehiculo vehiculo) {
        vehiculos.remove(vehiculo);
        System.out.println("Vehiculo eliminado correctamente.\n");
    }

    @Override
    public void mostrarVehiculos() {
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.imprimirDatos();
            System.out.println("----------------------");
        }
    }
    
}
