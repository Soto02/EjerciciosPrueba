package DAOs;


import static DAOs.ConexionSQLServer.con;
import static DAOs.ConexionSQLServer.rs;
import static DAOs.ConexionSQLServer.cerrarSesion;
import java.util.ArrayList;
import java.util.List;
import Recursos.Vehiculo;
import java.sql.ResultSet;


public class DAOVehiculoImpl implements IDAOVehiculo {
	
	private List<Vehiculo> falsaBD;
	private static IDAOVehiculo dao=null; 

	private DAOVehiculoImpl() {
		super();
                con = ConexionSQLServer.enlace(con);
                rs = ConexionSQLServer.consulta();
                this.falsaBD = ConexionSQLServer.imprimirConsulta(rs);
            //this.falsaBD = new ArrayList<Vehiculo>();
	}

	@Override
	public int insertarVehiculo(Vehiculo vehiculo) {
            if(!vehiculo.getMarca().isEmpty() && !vehiculo.getModelo().isEmpty() && !vehiculo.getMatricula().isEmpty()) {
                falsaBD.add(vehiculo);
                con = ConexionSQLServer.enlace(con);
                ConexionSQLServer.consultaInsertar(vehiculo);
                cerrarSesion();
            }
		return 1;
	}
        
        @Override
	public int eliminarVehiculo(String matricula) {
	
            Vehiculo vehiculo = new Vehiculo();
            
            for(int i = 0; i < falsaBD.size(); i++) {
                if(falsaBD.get(i).getMatricula().equals(matricula) == true) {
                    vehiculo = falsaBD.get(i);
                    falsaBD.remove(vehiculo);
                }
            }
            con = ConexionSQLServer.enlace(con);
            ConexionSQLServer.consultaBorrar(matricula);
            cerrarSesion();
            
            return 1;
	}
        
        @Override
        public int modificarVehiculo(Vehiculo vehiculo, int id) {
            int contador = 0;
            String matricula = "";
            for(int i = 0; i < falsaBD.size(); i++) {
                if(i == id) {
                    matricula = falsaBD.get(i).getMatricula();
                    falsaBD.set(i,vehiculo);
                    contador++;
                }
            }
            con = ConexionSQLServer.enlace(con);
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
		return this.falsaBD;
	}

	
	public static IDAOVehiculo getInstance() {
	  if (dao== null) dao =new DAOVehiculoImpl();
	  
		return dao;
	}
}
