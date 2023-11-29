/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAOs.DAOClienteImpl;
import Recursos.Cliente;
import java.util.List;

/**
 *
 * @author dam
 */
public class ControllerCliente {

    private DAOClienteImpl dao;

    public ControllerCliente() {
        this.dao = new DAOClienteImpl();
    }

    public List<Cliente> listar() {
        List<Cliente> lstClientes = this.dao.listar();
        return lstClientes;
    }
    
    public boolean insertarVehiculo(Cliente cliente) {
        boolean insertado = this.dao.insertarCliente(cliente);

        return insertado;
    }
    
    public boolean modificarVehiculo(Cliente cliente) {
        boolean modificado = this.dao.modificarCliente(cliente);

        return modificado;
    }

    public boolean eliminarVehiculo(String dni) {
        boolean eliminado = this.dao.eliminarCliente(dni);

        return eliminado;
    }
}

