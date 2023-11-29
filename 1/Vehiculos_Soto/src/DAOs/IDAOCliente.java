package DAOs;

import Recursos.Cliente;
import java.util.List;

public interface IDAOCliente 
{
    public List<Cliente> listar();
    public boolean insertarCliente(Cliente cliente);
    public boolean eliminarCliente(String dni);
    public boolean modificarCliente(Cliente cliente);
    public List<Cliente> getClientes();
}
