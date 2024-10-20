/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author HOME
 */
public class Vehiculo implements IVehiculo {

    private int idVehiculo;
    private static int contador = 1;
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.idVehiculo = contador++;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    @Override
    public void imprimirDatos(){
        System.out.println("ID: " + getIdVehiculo());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
    }
    
    @Override
    public void hacerRuido(){
        System.out.println("El auto esta prendiendo.. zum zum");
    }
    
}
