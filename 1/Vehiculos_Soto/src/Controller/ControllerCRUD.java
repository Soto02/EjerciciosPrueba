package Controller;




import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DAOs.DAOVehiculoImpl;
import Recursos.Vehiculo;
import Vista.PanelCRUD;

public class ControllerCRUD
{

	public static void cargarTabla( JTable tablaVehiculos)
	{ //DefaultTableModel modeloDeDatosTabla = (DefaultTableModel) tablaVehiculos.getModel();
		List<Vehiculo> lstVehiculos = DAOVehiculoImpl.getInstance().getVehiculos();
		
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
	}
	
	
	public static boolean insertarVehiculo( PanelCRUD frmVehiculo, JTable tablaVehiculos)
	{ 
            boolean insertado=false;
            Vehiculo vehiculo=new Vehiculo();

            vehiculo.setMarca(frmVehiculo.getTxtMarca().getText());

            vehiculo.setModelo(frmVehiculo.getTxtModelo().getText());

            vehiculo.setMatricula(frmVehiculo.getTxtMatricula().getText());

                   if (DAOVehiculoImpl.getInstance().insertarVehiculo(vehiculo)!=0)
                   {
                        insertado=true;
                        cargarTabla( tablaVehiculos);
                   }
        return insertado;		
	}
        
        public static boolean EliminarVehiculo(PanelCRUD frmVehiculo, JTable tablaVehiculos) 
        {
            boolean eliminado = false;
            //String aEliminar;
            //Vehiculo vehiculo = new Vehiculo();
            
            Vehiculo vehiculo=new Vehiculo();

            vehiculo.setMarca(frmVehiculo.getTxtMarca().getText());

            vehiculo.setModelo(frmVehiculo.getTxtModelo().getText());

            vehiculo.setMatricula(frmVehiculo.getTxtMatricula().getText());
            
            if(DAOVehiculoImpl.getInstance().eliminarVehiculo(vehiculo) !=0 ) {
               
                tablaVehiculos.remove(frmVehiculo.getTxtMatricula());
                tablaVehiculos.remove(frmVehiculo.getTxtModelo());
                tablaVehiculos.remove(frmVehiculo.getTxtMarca());
                cargarTabla(tablaVehiculos);
                 eliminado = true;
            }       
            return eliminado;
        }
}
