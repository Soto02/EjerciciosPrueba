/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import static DAOs.ConexionSQLServer.connection;
import static DAOs.ConexionSQLServer.result;
import Recursos.Cliente;
import java.util.List;

/**
 *
 * @author dam
 */
public class DAOClienteImpl implements IDAOCliente{
    
    private List<Cliente> falsaBDCliente;
    private static IDAOCliente dao=null;
    
    private DAOClienteImpl() {
		super();
                connection = ConexionSQLServer.enlace(connection);
                result = ConexionSQLServer.consulta();
                this.falsaBDCliente = ConexionSQLServer.imprimirConsulta(result);
            //this.falsaBD = new ArrayList<Cliente>();
    }
    
    @Override
    public int insertarCliente(Cliente cliente) {
        if(!cliente.getNombre().isEmpty() && !cliente.getDni().isEmpty() && !cliente.getMatricula().isEmpty()) {
            falsaBDCliente.add(cliente);
            connection = ConexionSQLServer.enlace(connection);
            //ConexionSQLServer.consultaInsertar(cliente);
        }
        return 1;
    }
    
    @Override
    public int eliminarCliente(String dni) {
        return 1;
    }
    
    @Override
    public int modificarCliente(Cliente cliente, String dni) {
        return 1;
    }
    
    @Override
    public List<Cliente> getClientes() {
        return this.falsaBDCliente;
    }
    
    public static IDAOCliente getInstance() {
	  if (dao== null) dao =new DAOClienteImpl();
	  
		return dao;
	}
}
