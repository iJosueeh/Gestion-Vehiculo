/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author HOME
 */
public class Motos extends Vehiculo {
    private int cilindraje;

    public Motos(String marca, String modelo, int cilindraje) {
        super(marca, modelo);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public void hacerRuido() {
        System.out.println("La moto esta prendiendo.. Mmmm");
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Cilindraje: " + getCilindraje());
    }
    
    
}
