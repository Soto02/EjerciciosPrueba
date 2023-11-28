package Vista;


import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;

import Controller.ControllerCRUD;
import DAOs.DAOVehiculoImpl;
import Recursos.Vehiculo;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis
 */
public class PanelCRUD extends javax.swing.JPanel {

    private ControllerCRUD controller;
    
       public PanelCRUD() {
        initComponents();
        
        this.inicializarPanel();
        cargarTabla();       
    } 
       
    public void cargarTabla() {
        String[] nombreColumnas = {"Marca","Modelo","Matricula"};
        
        DefaultTableModel modelo=new DefaultTableModel();
        
        ControllerCRUD vehiculoControlador = new ControllerCRUD();
        List<Vehiculo> lstVehiculos = vehiculoControlador.listar();
        
        for(Vehiculo vehiculo:lstVehiculos)
        {	 
            Object[] dato = new Object[nombreColumnas.length];
            
            dato[0]= vehiculo.getMarca();

            dato[1]= vehiculo.getModelo();

            dato[2]=  vehiculo.getMatricula();

            modelo.addRow(dato);
        }
        tablaVehiculos.setModel(modelo);
    }
 
private void btRegistrarActionPerformed(java.awt.event.ActionEvent evt) {										

    boolean validar = validarTxt();
    
    if(btRegistrar.getText().equals("Registrar")) {
        if(validar == true) {
        
            Vehiculo vehiculo = new Vehiculo();

            vehiculo.setMarca(txtMarca.getText());
            vehiculo.setModelo(txtModelo.getText());
            vehiculo.setMatricula(txtMatricula.getText());

            DAOVehiculoImpl dao = new DAOVehiculoImpl();
            boolean respuesta = dao.insertarVehiculo(vehiculo);

            if(respuesta == true) {
                JOptionPane.showMessageDialog(null, "Se registró correctamente.");

                limpiarTxt();
            } else {
                JOptionPane.showMessageDialog(null, "Hubo un error al registrar el vehiculo.");
            }

            System.out.println("Se registró correctamente.");
        }
    } else {
        if(validar == true) {
            
            datoVehiculo.setMarca(txtMarca.getText());
            datoVehiculo.setModelo(txtModelo.getText());
            datoVehiculo.setMatricula(txtMatricula.getText());

            DAOVehiculoImpl dao = new DAOVehiculoImpl();
            boolean respuesta = dao.modificarVehiculo(datoVehiculo);

            if(respuesta == true) {
                JOptionPane.showMessageDialog(null, "Se modificó correctamente.");

                limpiarTxt();
            } else {
                JOptionPane.showMessageDialog(null, "Hubo un error al modificar el vehiculo.");
            }

            System.out.println("Se registró correctamente.");
        }
    }
    
}

private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {
    
    Vehiculo vehiculo = new Vehiculo();
    
    int fila = tablaVehiculos.getSelectedRow();
    
    if(fila != -1) {
        
        vehiculo.setMarca(tablaVehiculos.getValueAt(fila, 0).toString());
        vehiculo.setModelo(tablaVehiculos.getValueAt(fila, 1).toString());
        vehiculo.setMatricula(tablaVehiculos.getValueAt(fila, 2).toString());
    
        System.out.println(vehiculo.toString());
        
        establecerDatos(vehiculo);
        
    } else {
        JOptionPane.showMessageDialog(null, "Tiene que seleccionar un vehiculo de la tabla.");
    }
    
}
 
private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {
   
    int fila = tablaVehiculos.getSelectedRow();
    
    if(fila != -1) {
        
        String matricula = tablaVehiculos.getValueAt(fila, 2).toString();
        
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desae borrar el vehiculo?", "Advertencia", JOptionPane.WARNING_MESSAGE);
        
        if(respuesta == 0) {
            ControllerCRUD vehiculo = new ControllerCRUD();
            
            boolean respt = vehiculo.eliminarVehiculo(matricula);
            if(respt) {
                JOptionPane.showMessageDialog(null,"Se elimino correctamente.","Exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,"hubo un error, no se pudo eliminar.","Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Tiene que seleccionar un vehiculo de la tabla.");
    }
    
    
}

private void limpiarTxt() {
    txtMarca.setText("");
    txtModelo.setText("");
    txtMatricula.setText("");
}

private boolean validarTxt() {
    if(txtMarca.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "Introduzca la marca del vehiculo.");
        return false;
    } else if(txtModelo.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "Introduzca el modelo del vehiculo.");
        return false;
    } else if(txtMatricula.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "Introduzca la matricula del vehiculo.");
        return false;
    }
    
    return true;
}

Vehiculo datoVehiculo = null;

public void establecerDatos(Vehiculo vehiculo) {
    this.datoVehiculo = vehiculo;
    
    txtMarca.setText(datoVehiculo.getMarca());
    txtModelo.setText(datoVehiculo.getModelo());
    txtMatricula.setText(datoVehiculo.getMatricula());
}

 
 
public javax.swing.JTextField getTxtMatricula() {
	return txtMatricula;
}



public void setTxtMatricula(javax.swing.JTextField txtMatricula) {
	this.txtMatricula = txtMatricula;
}



public javax.swing.JTextField getTxtMarca() {
	return txtMarca;
}



public void setTxtMarca(javax.swing.JTextField txtMarca) {
	this.txtMarca = txtMarca;
}



public javax.swing.JTextField getTxtModelo() {
	return txtModelo;
}



public void setTxtModelo(javax.swing.JTextField txtModelo) {
	this.txtModelo = txtModelo;
}
 
private javax.swing.JButton btRegistrar;

private javax.swing.JButton btModificar;

private javax.swing.JButton btEliminar;
 
private javax.swing.JLabel jLabel1;
 
private javax.swing.JLabel jLabel2;
 
private javax.swing.JLabel jLabelMatricula;
 
private javax.swing.JScrollPane jScrollPane1;
 
private javax.swing.JTable tablaVehiculos;
 
private javax.swing.JTextField txtMatricula;
 
private javax.swing.JTextField txtMarca;
 
private javax.swing.JTextField txtModelo;
    /**
     * Creates new form PanelCRUD
     */
 
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables


private void inicializarPanel() {
 
	 jLabel1 = new javax.swing.JLabel();
 
	 jScrollPane1 = new javax.swing.JScrollPane();
 
	 tablaVehiculos = new javax.swing.JTable();
 
	 txtMarca = new javax.swing.JTextField();
 
	 txtModelo = new javax.swing.JTextField();
 
	 jLabel2 = new javax.swing.JLabel();
 
	 jLabelMatricula = new javax.swing.JLabel();
 
	 txtMatricula = new javax.swing.JTextField();
 
	 btRegistrar = new javax.swing.JButton();
         
         btModificar = new javax.swing.JButton();
 
         btEliminar = new javax.swing.JButton();

         
	 jLabel1.setText("Marca");
 
 
 
	 tablaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
 
		 new Object [][] {
                     
			 {null, null, null}
 
		 },
 
		 new String [] {
 
			 "Marca", "Modelo", "Matricula"
 
		 }
 
	 ));
 
	 jScrollPane1.setViewportView(tablaVehiculos);
 
 
 
	 txtMarca.setName("marca"); // NOI18N

         
	 txtModelo.setToolTipText("");
 
	 txtModelo.setName("modelo"); // NOI18N
 
	 //txtModelo.addActionListener(new java.awt.event.ActionListener() {
 
		 //public void actionPerformed(java.awt.event.ActionEvent evt) {
 
			 //txtModeloActionPerformed(evt);
		 //}
	 //});

	 jLabel2.setText("Modelo");
 
	 jLabelMatricula.setText("Matricula");
 
	 txtMatricula.setToolTipText("");
 
 
	 btRegistrar.setText("Registrar");
	 btRegistrar.setActionCommand("btRegistrar");
	 btRegistrar.setName("btRegistrar"); // NOI18N
	 btRegistrar.addActionListener(new java.awt.event.ActionListener() {
 
		 public void actionPerformed(java.awt.event.ActionEvent evt) {
 
			 btRegistrarActionPerformed(evt);
 
		 }
	 });
         
         btModificar.setText("Modificar");
         btModificar.setToolTipText("");
         btModificar.setActionCommand("btModificar");
         btModificar.setName("btModificar");
         btModificar.addActionListener(new java.awt.event.ActionListener() {
             
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 btModificarActionPerformed(evt);
             }
         });
         
         btEliminar.setText("Eliminar");
         btEliminar.setToolTipText("");
         btEliminar.setActionCommand("btEliminar");
         btEliminar.setName("btEliminar");
         btEliminar.addActionListener(new java.awt.event.ActionListener() {
             
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 btEliminarActionPerformed(evt);
             }
         });
 
	 javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
	 layout.setHorizontalGroup(
	 	layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	 		.addGroup(layout.createSequentialGroup()
	 			.addContainerGap()
	 			.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	 				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)
	 				.addGroup(layout.createSequentialGroup()
	 					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	 						.addComponent(jLabel1)
	 						.addComponent(jLabel2)
	 						.addComponent(jLabelMatricula))
	 					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
	 					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	 						.addComponent(txtModelo)
	 						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
	 							.addComponent(txtMarca)
	 							.addComponent(txtMatricula, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)))
	 					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
	 					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
	 						.addComponent(btRegistrar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btModificar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	 						.addComponent(btEliminar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
	 			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	 );
	 layout.setVerticalGroup(
	 	layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	 		.addGroup(layout.createSequentialGroup()
	 			.addContainerGap()
	 			.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	 				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	 					.addComponent(jLabel1)
	 					.addComponent(txtMarca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	 				.addComponent(btRegistrar))
	 			.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	 				.addGroup(layout.createSequentialGroup()
	 					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
	 					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	 						.addComponent(jLabel2)
	 						.addComponent(txtModelo, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
	 					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
	 					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	 						.addComponent(jLabelMatricula)
	 						.addComponent(txtMatricula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
	 				.addGroup(layout.createSequentialGroup()
	 					.addGap(15)
                                        .addComponent(btEliminar)
                                                .addGap(15)
                                        .addComponent(btModificar)))
	 			.addGap(26)
	 			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
	 			.addContainerGap(32, Short.MAX_VALUE))
	 );
	 this.setLayout(layout); 
    }// </editor-fold>	
}
