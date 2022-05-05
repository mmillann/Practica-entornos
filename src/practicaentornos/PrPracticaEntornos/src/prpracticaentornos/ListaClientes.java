/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prpracticaentornos;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Pablo
 */
public class ListaClientes {

    private ArrayList<Cliente> ListaClientes = new ArrayList<Cliente>();
    private Random r = new Random();
    private ArrayList<Cliente> ListaClientesAtendidos = new ArrayList<Cliente>();

    public ListaClientes(Cliente CL) {
        ListaClientes.add(CL);
    }

    public ArrayList<Cliente> getListaClientes() {
        return ListaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> ListaClientes) {
        this.ListaClientes = ListaClientes;
    }

    public ArrayList<Cliente> getListaClientesAtendidos() {
        return ListaClientesAtendidos;
    }

    public void setListaClientesAtendidos(ArrayList<Cliente> ListaClientesAtendidos) {
        this.ListaClientesAtendidos = ListaClientesAtendidos;
    }

    public ListaClientes() {
        for (int i = 0; i < 20; i++) {
            String Nombre = "Nombre " + Integer.toString(i);
            String Apellido = "Apellido " + Integer.toString(i);
            int edad = r.nextInt(70) + 18;
            Cliente CL = new Cliente(Nombre, Apellido, edad);
            ListaClientes.add(CL);
        }
    }

    public void NuevoCliente(Cliente nuevo) {
        ListaClientes.add(nuevo);
    }

    public void AdelantarCliente(Cliente cliente) {

        int indice = ListaClientes.indexOf(cliente);
        if (indice != -1) {
            System.out.println("El cliente ha pasado del puesto " + indice + " al puesto " + (indice - 1));

            Cliente primero;
            primero = ListaClientes.get(indice - 1);
            ListaClientes.set(indice - 1, cliente);
            ListaClientes.set(indice, primero);

        } else {
            System.out.println("El cliente no existe");
        }
    }

    public boolean clienteAbandona(Cliente c) {
        boolean sePuedeIr = false;
        if(ListaClientes.size()>0){
        if (ListaClientes.indexOf(c) == -1) {
            System.out.println("No existe ese cliente");
        } else {
            ListaClientes.remove(ListaClientes.get(ListaClientes.indexOf(c)));
            dejarPasar();
            sePuedeIr=true;
        }
        }else{
            System.out.println("No hay clientes");
        }

        return sePuedeIr;
    }

    public void RetrasarCliente(Cliente cliente) {

        int indice = ListaClientes.indexOf(cliente);
        if (indice != -1) {
            System.out.println("El cliente ha pasado del puesto " + indice + " al puesto " + (indice + 1));

            Cliente primero;
            primero = ListaClientes.get(indice + 1);
            ListaClientes.set(indice + 1, cliente);
            ListaClientes.set(indice, primero);

        } else {
            System.out.println("El cliente no existe");
        }
    }

    public void AtenderCliente() {
        if (!ListaClientes.get(0).isAtendido()) {
            ListaClientes.get(0).atenderCliente();
            ListaClientesAtendidos.add(ListaClientes.get(0));
            ListaClientes.remove(ListaClientes.get(0));
            for (int i = 1; i < ListaClientes.size(); i++) {
                ListaClientes.set(i - 1, ListaClientes.get(i));
            }
        }
    }

    public void dejarPasar() {
        Cliente primero;
        primero = ListaClientes.get(0);
        ListaClientes.set(0, ListaClientes.get(1));
        ListaClientes.set(1, primero);
    }

    public String ClientesAtendidos() {
        String lista = "";
        for (int i = 0; i < ListaClientesAtendidos.size(); i++) {
            if (ListaClientesAtendidos.get(i).isAtendido()) {
                lista += "\n" + ListaClientesAtendidos.get(i).toString();
            }
        }
        return lista;
    }

    public String ClientesNoAtendidos() {
        String lista = "";

        for (int i = 0; i < ListaClientes.size(); i++) {
            if (!ListaClientes.get(i).isAtendido()) {
                lista += "\n" + ListaClientes.get(i).toString();
            }
        }
        return lista;
    }

    public void preferencia() {
        int num = 65;
        for (int i = 0; i < ListaClientes.size(); i++) {
            if (ListaClientes.get(i).getEdad() > 65) {
                if (ListaClientes.get(i).getEdad() > num) {
                    ListaClientes.set(0, ListaClientes.get(i));
                    num = ListaClientes.get(i).getEdad();
                }
            }
        }

    }
}
