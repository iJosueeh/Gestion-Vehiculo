/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author HOME
 */
public class Coche extends Vehiculo {

    private int numeroPuertas;

    public Coche(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
    @Override
    public void imprimirDatos() {
        System.out.println("Marca:" + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Número de puertas: " + getNumeroPuertas());
    }
    
    @Override
    public void hacerRuido() {
        System.out.println("El coche esta prendiendo.. !Boom!");
    }
    
}
