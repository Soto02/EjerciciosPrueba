/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Recursos.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dam
 */
public class DAOClienteImpl implements IDAOCliente {

    private ConexionSQLServer fabricaConexion;
    private List<Cliente> falsaBDCliente;
    private static IDAOCliente dao = null;

    public DAOClienteImpl() {
        super();
        this.fabricaConexion = new ConexionSQLServer();
        //this.falsaBD = new ArrayList<Cliente>();
    }

    @Override
    public List<Cliente> listar() {
        List<Cliente> listaClientes = new ArrayList<>();

        try {
            String sql = "SELECT * from clientes";
            Connection connection = this.fabricaConexion.getConnection();

            PreparedStatement sentencia = connection.prepareStatement(sql);

            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {

                Cliente cliente = new Cliente();

                cliente.setNombre(resultado.getString(1));
                cliente.setDni(resultado.getString(2));

                listaClientes.add(cliente);
            }

            resultado.close();
            sentencia.close();
            connection.close();

        } catch (Exception e) {
            System.out.println("Hubo un error al listar los clientes.");
        }
        return listaClientes;
    }

    @Override
    public boolean insertarCliente(Cliente cliente) {

        try {

            String sql = "INSERT INTO clientes(nombre, dni) VALUES(?,?)";

            Connection connection = (Connection) this.fabricaConexion.getConnection();

            PreparedStatement sentencia = connection.prepareStatement(sql);

            sentencia.setString(1, cliente.getNombre());
            sentencia.setString(2, cliente.getDni());

            sentencia.executeUpdate();
            sentencia.close();
            connection.close();

            return true;

        } catch (Exception e) {
            System.out.println("Hubo un error en el proceso de registrar un cliente.");
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean modificarCliente(Cliente cliente) {
        try {
            String sql = "UPDATE clientes SET nombre=? WHERE dni=?";

            Connection connection = this.fabricaConexion.getConnection();
            PreparedStatement sentencia = connection.prepareStatement(sql);

            sentencia.setString(1, cliente.getNombre());
            sentencia.setString(2, cliente.getDni());

            sentencia.executeUpdate();
            sentencia.close();
            connection.close();

            return true;

        } catch (Exception e) {
            System.out.println("Hubo un error al modificar el cliente.");
            return false;
        }
    }

    @Override
    public boolean eliminarCliente(String dni) {

        try {
            String sql = "DELETE FROM vehiculos WHERE dni=?";

            Connection connection = this.fabricaConexion.getConnection();
            PreparedStatement sentencia = connection.prepareStatement(sql);
            
            sentencia.setString(2, dni);

            sentencia.executeUpdate();
            sentencia.close();
            connection.close();

            return true;

        } catch (Exception e) {
            System.out.println("Hubo un error al eliminar el cliente.");
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Cliente> getClientes() {
        return this.falsaBDCliente;
    }

    public static IDAOCliente getInstance() {
        if (dao == null) {
            dao = new DAOClienteImpl();
        }

        return dao;
    }
}
