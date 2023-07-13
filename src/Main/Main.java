package Main;
import java.util.Scanner;
import Entidades.Cliente;

import ServiceCliente.ServicioCliente;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Scanner leer = new Scanner(System.in);

        boolean trueOrFalse = true;
        String ingreso;
        ArrayList<Cliente> clientes = new ArrayList<>();
        do {
            ServicioCliente SC1 = new ServicioCliente();
            System.out.println("----MENU----");
            System.out.println("1: Crear Cliente");
            System.out.println("2: Mostrar Base de datos");
            int oneOr = scanner.nextInt();
            System.out.println("Tamaño: " + clientes.size());
            switch (oneOr) {
                case 1:
                    System.out.println("Ingrese un cliente ");
                    Cliente C1 = SC1.registrarCliente();
                    System.out.println("si quiere dejar de ingresar clientes ingrese BASTA ");

                    ingreso = leer.nextLine();
                    clientes.add(C1);
                    if (ingreso.equalsIgnoreCase("BASTA")) {
                        trueOrFalse = false;
                    }
                    break;
                case 2:
                    SC1.obtenerClientes(clientes);
            }
            if (!trueOrFalse) {
                break;
            }
        } while (true);
    }
}