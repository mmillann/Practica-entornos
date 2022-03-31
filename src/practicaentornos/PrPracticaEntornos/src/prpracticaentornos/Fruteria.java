/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fruteria;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Fruteria {

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
                + "Despachar o atender cliente\n"
                + "Cliente abandona la cola\n"
                + "Adelantar 1 puesto a un cliente\n"
                + "Retrasar 1 puesto a un cliente \n"
                + "Dejar pasar al siguiente cliente \n"
                + "Mostrar el listado de clientes que aún no han sido atendidos\n"
                + "Mostrar el listado de clientes ya atendidos\n"
                + "Las personas mayores tienen preferencia"
                + "Salir";
        opcion = sc.nextInt();
        do {
            System.out.println(menu);
            switch (opcion) {
                case 1:
                    System.out.println("Has elegido 7 y media.");
                    Mazo mazo = new Mazo();
                    ManoSieteyMedia jugador = new ManoSieteyMedia();
                    ManoSieteyMedia banca = new ManoSieteyMedia();

                    //Se reparten las cartas iniciales: 
                    //Una al jugador y una a la banca
                    jugador.agnadeCarte(mazo.darCarta());
                    banca.agnadeCarte(mazo.darCarta());

                    //El jugador pide cartas mientras según su estrategia
                    while (jugador.cuentaPuntos() <= 5) {
                        System.out.println(
                                "El jugador pide una carta extra");
                        jugador.agnadeCarte(mazo.darCarta());
                    }

                    //La banca se planta si el jugador se ha pasado.
                    //En caso contrario pide cartas
                    if (jugador.cuentaPuntos() <= 7.5) {
                        //el jugador no se ha pasado
                        while (banca.cuentaPuntos() < 7.5
                                && banca.cuentaPuntos() < jugador.cuentaPuntos()) {
                            System.out.println(
                                    "La banca pide una carta extra");
                            banca.agnadeCarte(mazo.darCarta());
                        }
                    }
                    //Se cuentan los puntos obtenidos y se decide el ganador
                    double puntosJ = jugador.cuentaPuntos();
                    double puntosB = banca.cuentaPuntos();

                    if (puntosJ <= 7.5 && (puntosB > 7.5 || puntosJ > puntosB)) {

                        System.out.println("Gana el jugador con " + jugador
                                + " (" + puntosJ + " puntos) frente a " + banca
                                + " (" + puntosB + " puntos) de la banca");
                    } else if (puntosB <= 7.5) {
                        System.out.println("Gana la banca con "
                                + banca + " (" + puntosB
                                + " puntos) frente a " + jugador + " ("
                                + puntosJ + " puntos) del jugador");
                    } else {
                        System.out.println("No hay ganador: Jugador "
                                + jugador + " (" + puntosJ + " puntos) y banca "
                                + banca + " ("
                                + puntosB + " puntos) se han pasado");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Error de elección.");
                    break;
            }
        } while (opcion != 3);

    }

}
