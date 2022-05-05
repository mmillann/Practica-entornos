/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prpracticaentornos;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class PrPracticaEntornos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaClientes lista1 = new ListaClientes();
        Cliente David = new Cliente("David", "Broncano Aguilar", 35);
        ListaClientes lista2 = new ListaClientes(David);
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la fruteria ");
        String menu = "\nElige una de estas opciones: \n"
                + "1. Nuevo cliente \n"
                + "2. Despachar o atender cliente\n"
                + "3. Cliente abandona la cola\n"
                + "4. Adelantar 1 puesto a un cliente\n"
                + "5. Retrasar 1 puesto a un cliente \n"
                + "6. Dejar pasar al siguiente cliente \n"
                + "7. Mostrar el listado de clientes que aún no han sido atendidos\n"
                + "8. Mostrar el listado de clientes ya atendidos\n"
                + "9. Las personas mayores tienen preferencia"
                + "10. Salir";
        do {
            System.out.println(menu);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Nombre del cliente: ");
                    String nombre = sc.next();
                    System.out.println("Apellido del cliente: ");
                    String apellido = sc.next();
                    System.out.println("Edad del cliente: ");
                    int edad = sc.nextInt();
                    Cliente nuevo = new Cliente(nombre, apellido, edad);
                    lista1.NuevoCliente(nuevo);
                    System.out.println("Cliente añadido con éxito");

                    break;
                case 2:
                    lista1.AtenderCliente();
                    System.out.println("Cliente atendido de forma exitosa");
                    break;
                case 3:
                    System.out.println("Puesto del cliente que abandona la cola:");
                    int i = sc.nextInt();
                    lista1.clienteAbandona(lista1.getListaClientes().get(i));
                    break;
                case 4:
                    System.out.println("Puesto del cliente que abandona la cola:");
                    i = sc.nextInt();
                    lista1.AdelantarCliente(lista1.getListaClientes().get(i));
                    System.out.println("El cliente ha sido adelantado en la cola");
                    break;
                case 5:
                    System.out.println("Puesto del cliente que abandona la cola:");
                    i = sc.nextInt();
                    lista1.RetrasarCliente(lista1.getListaClientes().get(i));
                    System.out.println("El cliente ha sido retrasado en la cola");
                    break;
                case 6:
                    lista1.dejarPasar();
                    System.out.println("Se ha dejado pasar de forma exitosa");
                    break;
                case 7:

                    System.out.println(lista1.ClientesNoAtendidos());

                    break;
                case 8:
                    System.out.println(lista1.ClientesAtendidos());
                    break;
                case 9:
                    lista1.preferencia();
                    System.out.println("Ahora los mayores de 65 tienen preferencia");
                    break;
                case 10:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (opcion != 9);
    }

}
