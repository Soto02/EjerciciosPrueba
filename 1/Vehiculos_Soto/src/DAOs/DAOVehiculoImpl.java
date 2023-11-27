package DAOs;


import static DAOs.ConexionSQLServer.cerrarSesion;
import java.util.ArrayList;
import java.util.List;
import Recursos.Vehiculo;
import static DAOs.ConexionSQLServer.connection;
import static DAOs.ConexionSQLServer.result;
import Recursos.Cliente;


public class DAOVehiculoImpl implements IDAOVehiculo {
	
	private List<Vehiculo> falsaBDVehiculo;
	private static IDAOVehiculo dao=null; 

	private DAOVehiculoImpl() {
		super();
                connection = ConexionSQLServer.enlace(connection);
                result = ConexionSQLServer.consulta();
                this.falsaBDVehiculo = ConexionSQLServer.imprimirConsulta(result);
            //this.falsaBD = new ArrayList<Vehiculo>();
	}

	@Override
	public int insertarVehiculo(Vehiculo vehiculo) {
            if(!vehiculo.getMarca().isEmpty() && !vehiculo.getModelo().isEmpty() && !vehiculo.getMatricula().isEmpty()) {
                falsaBDVehiculo.add(vehiculo);
                connection = ConexionSQLServer.enlace(connection);
                ConexionSQLServer.consultaInsertar(vehiculo);
                cerrarSesion();
            }
		return 1;
	}
        
        @Override
	public int eliminarVehiculo(String matricula) {
	
            Vehiculo vehiculo = new Vehiculo();
            
            for(int i = 0; i < falsaBDVehiculo.size(); i++) {
                if(falsaBDVehiculo.get(i).getMatricula().equals(matricula) == true) {
                    vehiculo = falsaBDVehiculo.get(i);
                    falsaBDVehiculo.remove(vehiculo);
                }
            }
            connection = ConexionSQLServer.enlace(connection);
            ConexionSQLServer.consultaBorrar(matricula);
            cerrarSesion();
            
            return 1;
	}
        
        @Override
        public int modificarVehiculo(Vehiculo vehiculo, int id) {
            int contador = 0;
            String matricula = "";
            for(int i = 0; i < falsaBDVehiculo.size(); i++) {
                if(i == id) {
                    matricula = falsaBDVehiculo.get(i).getMatricula();
                    falsaBDVehiculo.set(i,vehiculo);
                    contador++;
                }
            }
            connection = ConexionSQLServer.enlace(connection);
            ConexionSQLServer.consultaModificar(vehiculo, matricula);
            cerrarSesion();
            return contador;
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

	
	public static IDAOVehiculo getInstance() {
	  if (dao== null) dao =new DAOVehiculoImpl();
	  
		return dao;
	}
}
