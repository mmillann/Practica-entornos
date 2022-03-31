/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
<<<<<<< HEAD
package fruteria;
=======
package prpracticaentornos;
>>>>>>> main

/**
 *
 * @author Pablo
 */
public class Cliente {
<<<<<<< HEAD

    private String nombre;
=======
        private String nombre;
>>>>>>> main
    private String apellidos;
    private int edad;
    private boolean amable;
    private boolean atendido;
<<<<<<< HEAD

    public Cliente(String nombre, String apellidos, int edad) {
=======
	
	public Cliente(String nombre, String apellidos, int edad) {
>>>>>>> main
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.amable = true;
        this.atendido = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isAmable() {
        return amable;
    }

    public void setAmable(boolean amable) {
        this.amable = amable;
    }

    public boolean isAtendido() {
        return atendido;
    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }
<<<<<<< HEAD

    public void atenderCliente() {
        System.out.println("El cliente está comprando...");
        this.atendido = true;
    }

    @Override
    public String toString() {
        return "\nCliente:" + " Nombre:" + this.nombre + " Apellidos: " + this.apellidos + " Edad: " + this.edad;
    }

=======
>>>>>>> main
}
