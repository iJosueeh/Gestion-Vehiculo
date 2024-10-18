
import java.util.Scanner;
import modelos.Coche;
import modelos.Motos;
import modelos.Vehiculo;
import servicios.GestionarVehiculos;

public class Main {

    public static void main(String[] args) {
        GestionarVehiculos gestionarVehiculos = new GestionarVehiculos();
        Vehiculo vehiculo;
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        do {
            System.out.print("¿Cuántos vehiculos desea ingresar?: ");
            int cantidadVehiculos = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < cantidadVehiculos; i++) {
                System.out.println("Ingresa los datos del vehiculo " + (i + 1) + ": \n");

                System.out.print("Marca: ");
                String marca = scanner.nextLine();

                System.out.print("Modelo: ");
                String modelo = scanner.nextLine();

                System.out.println("¿Tipo de Vehiculo?");
                System.out.println("1. Coche");
                System.out.println("2. Moto");
                System.out.print("Elija la opción disponible: ");
                String opcionMenu = scanner.nextLine().toLowerCase();

                if (opcionMenu.equals("1")) {
                    System.out.print("Número de puertas: ");
                    int numeroPuertas = scanner.nextInt();
                    scanner.nextLine();
                    vehiculo = new Coche(marca, modelo, numeroPuertas);
                    gestionarVehiculos.agregarVehiculo(vehiculo);
                } else if (opcionMenu.equals("2")) {
                    System.out.print("Cilindraje (cc): ");
                    int cilindraje = scanner.nextInt();
                    scanner.nextLine();
                    vehiculo = new Motos(marca, modelo, cilindraje);
                    gestionarVehiculos.agregarVehiculo(vehiculo);
                } else {
                    System.out.println("Opción no válida.");
                }
            }

            System.out.println("Lista de Vehiculos almacenados: ");
            gestionarVehiculos.mostrarVehiculos();

            System.out.println("\n¿Desea eliminar un Vehiculo?: ");
            System.out.println("1. Si");
            System.out.println("2. No");
            System.out.print("Seleccione la opción disponible: ");
            String opcionEliminar = scanner.nextLine();

            if (opcionEliminar.equalsIgnoreCase("si") || opcionEliminar.equals("1")) {
                System.out.print("Escriba el ID del vehículo: ");
                int idVehiculo = scanner.nextInt();
                
                scanner.nextLine();

                Vehiculo vehiculoEliminar = null;

                for (Vehiculo vehi : gestionarVehiculos.getVehiculos()) {
                    if (vehi.getIdVehiculo() == idVehiculo) {
                        vehiculoEliminar = vehi;
                        break;
                    }
                }

                if (vehiculoEliminar != null) {
                    gestionarVehiculos.eliminarVehiculo(vehiculoEliminar);
                } else {
                    System.out.println("No se ha encontrado un vehículo con ese ID.");
                }
            }

            System.out.println("¿Deseas continuar en el programa?: ");
            System.out.println("1. Si");
            System.out.println("2. No");
            System.out.print("Seleccione la opción correcta.");
            String opcionContinuar = scanner.nextLine();

            if (opcionContinuar.equals("2")) {
                System.out.println("Saliendo del programa... ¡vuelve pronto!");
                continuar = false;
            }

        } while (continuar);
    }
}
