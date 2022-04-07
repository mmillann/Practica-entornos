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
        String menu = "\nElige una de estas opciones: Nuevo cliente\n"
                + "1. Despachar o atender cliente\n"
                + "2. Cliente abandona la cola\n"
                + "3. Adelantar 1 puesto a un cliente\n"
                + "4. Retrasar 1 puesto a un cliente \n"
                + "5. Dejar pasar al siguiente cliente \n"
                + "6. Mostrar el listado de clientes que aún no han sido atendidos\n"
                + "7. Mostrar el listado de clientes ya atendidos\n"
                + "8. Las personas mayores tienen preferencia"
                + "9. Salir";
        opcion = sc.nextInt();
        do {
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    break;
                default:
                    break;
            }
        } while (opcion != 9);
    }

}
