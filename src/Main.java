
import java.util.Scanner;
import modelos.Coche;
import modelos.Vehiculo;
import servicios.GestionarVehiculos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HOME
 */
public class Main {
    public static void main(String[] args) {
        GestionarVehiculos gestionarVehiculos = new GestionarVehiculos();
        Scanner scanner = new Scanner(System.in);
        
        boolean continuar = true;
        
        do {
            System.out.println("¿Cuántos vehiculos desea ingresar?: ");
            int cantidadVehiculos = scanner.nextInt();
            
            for (int i = 0; i < cantidadVehiculos; i++) {
                System.out.println("Ingresa los datos del vehiculo " + (i+1) + ": \n");
                System.out.print("Marca: ");
                String marca = scanner.nextLine();
                System.out.print("Modelo: ");
                String modelo = scanner.nextLine();
                
                scanner.nextLine();
                
                System.out.println("¿Tipo de Vehiculo?");
                System.out.println("1. Coche");
                System.out.println("2. Moto");
                System.out.print("Elija la opción disponible: ");
                String opcionMenu = scanner.nextLine();
                
                if (opcionMenu.equalsIgnoreCase("coche") && opcionMenu.equals("1")) {
                    System.out.print("Número de puertas: ");
                    int numeroPuertas = scanner.nextInt();
                    Vehiculo vehiculo = new Coche(marca, modelo, numeroPuertas);
                } else if (opcionMenu.equalsIgnoreCase("moto") && opcionMenu.equalsIgnoreCase("2")) {
                    System.out.println("Cilindraje (cc): ");
                    int cilindraje = scanner.nextInt();
                }
                
            }
        } while (!continuar);
    }
}
