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
    private ArrayList<Cliente> ListaClientes = new ArrayList<Cliente>(20);
    private Random r = new Random();

    public ListaClientes(Cliente CL) {
        ListaClientes.add(CL);
    }

    public ListaClientes() {
        for (int i = 0; i < ListaClientes.size(); i++) {
            String Nombre = "Nombre " + Integer.toString(i);
            String Apellido = "Apellido " + Integer.toString(i);
            int edad = r.nextInt(70) + 18;
            Cliente CL = new Cliente(Nombre, Apellido, edad);
        }
    }
}
