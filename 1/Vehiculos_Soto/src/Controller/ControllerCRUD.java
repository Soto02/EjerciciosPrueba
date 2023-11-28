package Controller;

import java.util.List;

import javax.swing.JTable;

import DAOs.DAOVehiculoImpl;
import Recursos.Vehiculo;
import Vista.PanelCRUD;

public class ControllerCRUD
{
    private DAOVehiculoImpl dao;
    
    public ControllerCRUD() {
        this.dao = new DAOVehiculoImpl();
    }
        
        public List<Vehiculo> listar() {
            List<Vehiculo> lstVehiculos = this.dao.listar();
            return lstVehiculos;
        }
	
	
	public boolean insertarVehiculo( Vehiculo vehiculo, PanelCRUD frmVehiculo, JTable tablaVehiculos)
	{ 
            boolean insertado= this.dao.insertarVehiculo(vehiculo);
            
            return insertado;		
	}
        
        public boolean modificarVehiculo(Vehiculo vehiculo) 
        {
            boolean modificado = this.dao.modificarVehiculo(vehiculo);
            
            return modificado;
        }
        
        public boolean eliminarVehiculo(String matricula) 
        {
            boolean eliminado = this.dao.eliminarVehiculo(matricula);
            
            return eliminado;
        }
}

/*
Vehiculo vehiculo=new Vehiculo();

            vehiculo.setMarca(frmVehiculo.getTxtMarca().getText());

            vehiculo.setModelo(frmVehiculo.getTxtModelo().getText());

            vehiculo.setMatricula(frmVehiculo.getTxtMatricula().getText());

                   if (DAOVehiculoImpl.getInstance().insertarVehiculo(vehiculo)!=0)
                   {
                        insertado=true;
                        cargarTabla( tablaVehiculos);
                   }
*/
/*
public static String obtenerDato(JTable tabla) {
            String dato = String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), tabla.getSelectedColumn()));
            return dato;
        }
        
        public static String obtenerMatricula(JTable table, String dato) {
            String matricula = "";
            for(int i = 0; i < table.getRowCount(); i++) {
                for(int j = 0; j < table.getColumnCount(); j++) {
                    if(table.getValueAt(j, j) == dato) {
                        matricula = (String) table.getValueAt(1, 2);
                    }
                }
            }
            return matricula;
        }
*/
/*
public void cargarTabla( JTable tablaVehiculos)
	{ //DefaultTableModel modeloDeDatosTabla = (DefaultTableModel) tablaVehiculos.getModel();
            //List<Vehiculo> lstVehiculos = DAOVehiculoImpl.getInstance().getVehiculos();
            List<Vehiculo> lstVehiculos = this.dao.listar();
		
            DefaultTableModel modelo=new DefaultTableModel();

            modelo.addColumn("Marca");

            modelo.addColumn("Modelo");

            modelo.addColumn("Matricula");

            Object[] registroLeido = new Object [3];

            for(Vehiculo vehiculo:lstVehiculos)
            {	 

                           registroLeido[0]= vehiculo.getMarca();

                           registroLeido[1]= vehiculo.getModelo();

                           registroLeido[2]=  vehiculo.getMatricula();

                    modelo.addRow(registroLeido);

            }

            tablaVehiculos.setModel(modelo);
	}SS
*/
