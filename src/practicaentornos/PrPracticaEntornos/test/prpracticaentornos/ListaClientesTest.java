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
        assertEquals( 21, fru.getListaClientes().size());
        assertEquals( c1, fru.getListaClientes().get(20));
  
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
        
        assertEquals( 21, fru.getListaClientes().size());
        assertEquals( c1, fru.getListaClientes().get(19));
        
    }

    /**
     * Test of clienteAbandona method, of class ListaClientes.
     */
    @Test
    public void testClienteAbandona() {
        ListaClientes fru = new ListaClientes();
        Cliente c1 = new Cliente("Paco", "Garcia", 33);
        Cliente c2 = new Cliente("Paco", "Garcia", 33);
        fru.NuevoCliente(c1);

        ListaClientes fruVacia = new ListaClientes(c1);
        fruVacia.NuevoCliente(c2);
        assertTrue(fru.clienteAbandona(c1));
        assertFalse(fru.clienteAbandona(c2));
        assertFalse(fruVacia.clienteAbandona(c2));
        assertEquals(0, fruVacia.getListaClientes().size());

        
        
    }

    /**
     * Test of RetrasarCliente method, of class ListaClientes.
     */
    @Test
    public void testRetrasarCliente() {
    }

    /**
     * Test of AtenderCliente method, of class ListaClientes.
     */
    @Test
    public void testAtenderCliente() {
    }

    /**
     * Test of dejarPasar method, of class ListaClientes.
     */
    @Test
    public void testDejarPasar() {
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
