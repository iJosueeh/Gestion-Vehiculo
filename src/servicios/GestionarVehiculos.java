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
    
    @Override
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehiculo almacenado correctamente.");
    }

    @Override
    public void eliminarVehiculo(Vehiculo vehiculo) {
        vehiculos.remove(vehiculo);
        System.out.println("Vehiculo eliminado correctamente.");
    }

    @Override
    public void mostrarVehiculos() {
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.imprimirDatos();
            vehiculo.hacerRuido();
            System.out.println("----------------------");
        }
    }
    
}
