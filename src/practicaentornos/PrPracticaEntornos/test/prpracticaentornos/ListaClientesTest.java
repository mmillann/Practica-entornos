/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package prpracticaentornos;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pablo
 */
public class ListaClientesTest {

    public ListaClientesTest() {
    }

    /**
     * Test of NuevoCliente method, of class ListaClientes.
     */
    @Test
    public void testNuevoCliente() {
        // 1.- Preparar datos de la prueba
        ListaClientes fru = new ListaClientes();
        Cliente c1 = new Cliente("Paco", "Garcia", 33);

        // 2.- Prueba en si
        fru.NuevoCliente(c1);

        // 3.- Verificar
        assertEquals(21, fru.getListaClientes().size());
        assertEquals(c1, fru.getListaClientes().get(20));

    }

    /**
     * Test of AdelantarCliente method, of class ListaClientes.
     */
    @Test
    public void testAdelantarCliente() {
        ListaClientes fru = new ListaClientes();
        Cliente c1 = new Cliente("Paco", "Garcia", 33);
        fru.NuevoCliente(c1);
        fru.AdelantarCliente(c1);

        assertEquals(21, fru.getListaClientes().size());
        assertEquals(c1, fru.getListaClientes().get(19));

    }

    /**
     * Test of clienteAbandona method, of class ListaClientes.
     */
    @Test
    public void testClienteAbandona() {
        ListaClientes fru = new ListaClientes();
        Cliente c1 = new Cliente("Paco", "Garcia", 33);
        fru.NuevoCliente(c1);
        assertTrue(fru.clienteAbandona(c1));
        assertEquals(20, fru.getListaClientes().size());

    }

    /**
     * Test of RetrasarCliente method, of class ListaClientes.
     */
    @Test
    public void testRetrasarCliente() {
        ListaClientes fru = new ListaClientes();
        Cliente c1 = new Cliente("Paco", "Garcia", 33);
        Cliente c2 = new Cliente("Paco", "Garcia", 33);
        fru.NuevoCliente(c1);
        fru.NuevoCliente(c2);

        fru.RetrasarCliente(c1);

        assertEquals(c1, fru.getListaClientes().get(21));

    }

    /**
     * Test of AtenderCliente method, of class ListaClientes.
     */
    @Test
    public void testAtenderCliente() {
        ListaClientes fru = new ListaClientes();

        Cliente c2 = new Cliente("Paco", "Garcia", 33);
        fru.NuevoCliente(c2);

        Cliente c3 = fru.getListaClientes().get(0);
        assertEquals(fru.getListaClientes().get(0), c3);
        fru.AtenderCliente();

        //assertEquals(c2, fru.getListaClientes().get(20));
        //Crea un nuevo cliente en la posición 0 del arrayList para comprobar que una vez atendido, ya no siga estando en la posición 0
        assertEquals(1, fru.getListaClientesAtendidos().size());
        assertNotEquals(fru.getListaClientes().get(0), c3);

    }

    /**
     * Test of dejarPasar method, of class ListaClientes.
     */
    @Test
    public void testDejarPasar() {
        ListaClientes fru = new ListaClientes();
        Cliente c1 = fru.getListaClientes().get(0);
        Cliente c2 = fru.getListaClientes().get(1);

        fru.dejarPasar();

        assertEquals(c1, fru.getListaClientes().get(1));
        assertEquals(c2, fru.getListaClientes().get(0));

    }

    /**
     * Test of ClientesAtendidos method, of class ListaClientes.
     */
    @Test
    public void testClientesAtendidos() {

    }

    /**
     * Test of ClientesNoAtendidos method, of class ListaClientes.
     */
    @Test
    public void testClientesNoAtendidos() {
    }

    /**
     * Test of preferencia method, of class ListaClientes.
     */
    @Test
    public void testPreferencia() {
    }

}
