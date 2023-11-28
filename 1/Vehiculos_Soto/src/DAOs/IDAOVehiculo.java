package DAOs;

import java.util.List;

import Recursos.Vehiculo;
	public interface IDAOVehiculo 
	{ 
          public List<Vehiculo> listar();
          public boolean insertarVehiculo(Vehiculo vehiculo);
	  public boolean eliminarVehiculo(String matricula);
          public boolean modificarVehiculo(Vehiculo vehiculo);
	  public int eliminarVehiculos(List<Vehiculo> lstVehiculos);
	  public Vehiculo getVehiculo(String matricula);
	  public  List<Vehiculo> getVehiculos();
}
