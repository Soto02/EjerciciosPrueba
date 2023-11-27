/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAOs.DAOClienteImpl;
import Recursos.Cliente;
import Vista.PanelCRUDCliente;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dam
 */
public class ControllerCliente {
    
    public static void cargarTabla( JTable tablaClientes)
	{ //DefaultTableModel modeloDeDatosTabla = (DefaultTableModel) tablaVehiculos.getModel();
            List<Cliente> lstCliente = DAOClienteImpl.getInstance().getClientes();
		
            DefaultTableModel modelo=new DefaultTableModel();

            modelo.addColumn("Nombre");

            modelo.addColumn("DNI");

            modelo.addColumn("Matricula");

            Object[] registroLeido = new Object [3];

            for(Cliente vehiculo:lstCliente)

            {	 

                           registroLeido[0]= vehiculo.getNombre();

                           registroLeido[1]= vehiculo.getDni();

                           registroLeido[2]=  vehiculo.getMatricula();

                    modelo.addRow(registroLeido);

            }

            tablaClientes.setModel(modelo);
	}
    
    public static boolean insertarCliente( PanelCRUDCliente frmCliente, JTable tablaClientes) 
    {
        boolean insrtado = false;
        Cliente cliente = new Cliente();
        
        cliente.setNombre(frmCliente)
    }
}
