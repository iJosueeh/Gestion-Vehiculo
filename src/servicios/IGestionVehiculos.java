/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicios;

import modelos.Vehiculo;

/**
 *
 * @author HOME
 */
public interface IGestionVehiculos {
    public void agregarVehiculo(Vehiculo vehiculo);
    public void eliminarVehiculo(Vehiculo vehiculo); 
    public void mostrarVehiculos();
}
