package DAOs;

import Recursos.Cliente;
import java.util.List;

public interface IDAOCliente {
    public int insertarCliente(Cliente cliente);
    public int eliminarCliente(String dni);
    public int modificarCliente(Cliente cliente, String dni);
    public List<Cliente> getClientes();
}
