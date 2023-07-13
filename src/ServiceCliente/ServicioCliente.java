package ServiceCliente;
import Entidades.Cliente;

import java.util.ArrayList;
import java.util.Scanner;
public class ServicioCliente {
    Scanner leer = new Scanner(System.in);
    Cliente Cliente1 = new Cliente();
    public Cliente registrarCliente()
    {


        System.out.println("INGRESE SU NOMBRE");

        Cliente1.setNombre(leer.nextLine());

        System.out.println("INGRESE SU ID");

        Cliente1.setId(leer.nextInt());

        System.out.println("INGRESE SU EDAD");

        Cliente1.setEdad(leer.nextInt());

        System.out.println("INGRESE SU ALTURA");

        Cliente1.setAltura(leer.nextInt());

        System.out.println("INGRESE SU PESO ; ");

        Cliente1.setPeso(leer.nextDouble());

        System.out.println("INGRESE SU OBJETIVO : ");


        Cliente1.setObjetivo(leer.nextLine());
        leer.nextLine();

        return Cliente1;

    }
     public void obtenerClientes(ArrayList<Cliente> clientes){

         for (Cliente i: clientes) {
             System.out.println(i);
         }
     }

}
