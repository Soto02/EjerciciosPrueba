package DAOs;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;
import Recursos.Vehiculo;
import DAOs.ConexionSQLServer.*;
import java.util.ArrayList;
//import com.sun.jdi.connect.spi.Connection;


public class DAOVehiculoImpl implements IDAOVehiculo {
	
    private ConexionSQLServer fabricaConexion;
	private List<Vehiculo> falsaBDVehiculo;
	private IDAOVehiculo dao=null; 

	public DAOVehiculoImpl() {
            super();
            this.fabricaConexion = new ConexionSQLServer();
                
            //connection = ConexionSQLServer.enlace(connection);
            //result = ConexionSQLServer.consulta();
            //this.falsaBDVehiculo = ConexionSQLServer.imprimirConsulta(result);
            //this.falsaBD = new ArrayList<Vehiculo>();
	}
        
        @Override
        public List<Vehiculo> listar() {
            List<Vehiculo> listaVehiculos = new ArrayList<>();
            
            try {
                String sql = "SELECT * from vehiculo;";
                
                Connection connection = this.fabricaConexion.getConnection();
                
                PreparedStatement sentencia = connection.prepareStatement(sql);
                
                ResultSet resultado = sentencia.executeQuery();
                
                while(resultado.next()) {
                    
                    Vehiculo vehiculo = new Vehiculo();
                    
                    vehiculo.setId(resultado.getInt(1));
                    vehiculo.setMarca(resultado.getString(2));
                    vehiculo.setModelo(resultado.getString(3));
                    vehiculo.setMatricula(resultado.getString(4));
                    
                    listaVehiculos.add(vehiculo);
                }
                
                resultado.close();
                sentencia.close();
                connection.close();
                
            } catch (Exception e) {
                System.out.println("Hubo un error al listar los vehiculos.");
            }
            return listaVehiculos;
        }

	@Override
	public boolean insertarVehiculo(Vehiculo vehiculo) {
            
            try {
                
                String sql = "INSERT INTO vehiculo(marca, modelo, matricula) VALUES(?,?,?);";
                
                Connection connection = (Connection) this.fabricaConexion.getConnection();
                
                PreparedStatement sentencia = connection.prepareStatement(sql);
                
                sentencia.setString(1, vehiculo.getMarca());
                sentencia.setString(2, vehiculo.getModelo());
                sentencia.setString(3, vehiculo.getMatricula());
                
                sentencia.executeUpdate();
                sentencia.close();
                connection.close();
                
                return true;
                
            } catch(Exception e) {
                System.out.println("hubo un error en el proceso de registrar un vehiculo.");
                return false;
            }
	}
        
        @Override
        public boolean modificarVehiculo(Vehiculo vehiculo) {
            
            try {
                String sql = "UPDATE vehiculo SET marca=?, modelo=?, matricula=? WHERE id=?;";
                
                Connection connection = this.fabricaConexion.getConnection();
                PreparedStatement sentencia = connection.prepareStatement(sql);
                
                sentencia.setString(0, vehiculo.getMarca());
                sentencia.setString(1, vehiculo.getModelo());
                sentencia.setString(2, vehiculo.getMatricula());
                
                sentencia.setInt(3, vehiculo.getId());
                
                sentencia.executeUpdate();
                sentencia.close();
                connection.close();
                
                return true;
                
            } catch (Exception e) {
                System.out.println("Hubo un error al modificar el vehiculo.");
                return false;
            }
        }

        @Override
	public boolean eliminarVehiculo(String matricula) {
            
            try {
                String sql = "DELETE FROM vehiculo WHERE matricula=?;";
                
                Connection connection = this.fabricaConexion.getConnection();
                PreparedStatement sentencia = connection.prepareStatement(sql);
                
                sentencia.setString(2, matricula);
                
                sentencia.executeUpdate();
                sentencia.close();
                connection.close();
                
                return true;
                    
            } catch (Exception e) {
                System.out.println("Hubo un error al eliminar el vehiculo.");
                return false;
            }
	}
	@Override
	public int eliminarVehiculos(List<Vehiculo> lstVehiculos) {
		
		return 0;
	}

	@Override
	public Vehiculo getVehiculo(String matricula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vehiculo> getVehiculos() {
		// TODO Auto-generated method stub
		return this.falsaBDVehiculo;
	}

	
	public IDAOVehiculo getInstance() {
	  if (dao== null) dao =new DAOVehiculoImpl();
	  
		return dao;
	}
}
