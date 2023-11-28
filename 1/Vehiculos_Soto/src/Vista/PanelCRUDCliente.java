package Vista;

import Controller.ControllerCliente;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;

/**
 *
 * @author dam
 */
public class PanelCRUDCliente extends javax.swing.JPanel {
    
    private VentanaPrincipal ventana;
    
    public PanelCRUDCliente(VentanaPrincipal ventana) {
        initComponents();
        
        this.ventana = ventana;
        this.inicializarPanel();
        ControllerCliente.cargarTabla(tablaClientes);
    }

    public javax.swing.JTextField getTxtNombre() {
	return txtNombre;
    }
    public void setTxtNombre(javax.swing.JTextField txtNombre) {
	this.txtNombre = txtNombre;
    }
    public javax.swing.JTextField getTxtDni() {
	return txtDni;
    }
    public void setTxtDni(javax.swing.JTextField txtDni) {
	this.txtDni = txtDni;
    }
    public javax.swing.JTextField getTxtMatricula() {
        return txtMatricula;
    }
    public void setTxtMatricula(javax.swing.JTextField txtMatricula) {
        this.txtMatricula = txtMatricula;
    }
    
    private void btAñadirClienteActionPerformed(java.awt.event.ActionEvent evt) {
                ControllerCliente.insertarCliente(this, tablaClientes);
    }
    
    private void btModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {
                
    }
    
    private void btEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {
                ControllerCliente.insertarCliente(this, tablaClientes);
    }
    
    private javax.swing.JLabel jLabelNombre;
 
    private javax.swing.JLabel jLabelDni;
 
    private javax.swing.JLabel jLabelMatricula;
    
    private javax.swing.JTextField txtNombre;
    
    private javax.swing.JTextField txtDni;
     
    private javax.swing.JTextField txtMatricula;
 
    private javax.swing.JTable tablaClientes;
    
    private javax.swing.JButton btAñadirCliente;
    
    private javax.swing.JButton btEliminarCliente;
    
    private javax.swing.JButton btModificarCliente;
    
    private javax.swing.JScrollPane jScrollPane1;
 
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
    
    private void inicializarPanel() {
        
        jLabelNombre = new javax.swing.JLabel();
         
	jLabelDni = new javax.swing.JLabel();
 
	jLabelMatricula = new javax.swing.JLabel();
 
	jScrollPane1 = new javax.swing.JScrollPane();
 
	tablaClientes = new javax.swing.JTable();
 
	txtNombre = new javax.swing.JTextField();
 
	txtDni = new javax.swing.JTextField();

 	txtMatricula = new javax.swing.JTextField();
 
	btAñadirCliente = new javax.swing.JButton();
         
        btModificarCliente = new javax.swing.JButton();
 
        btEliminarCliente = new javax.swing.JButton();
        
        jLabelNombre.setText("Nombre");
        
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {      
		{null, null, null}
            },
            new String [] {
        	 "Marca", "Modelo", "Matricula"
            }
	));
        
        jScrollPane1.setViewportView(tablaClientes);
        
        txtNombre.setName("nombre");
        
        txtDni.setToolTipText("");
 
	txtDni.setName("dni");
        
        jLabelDni.setText("DNI");
 
	jLabelMatricula.setText("Matricula");
 
	txtMatricula.setToolTipText("");
        
        btAñadirCliente.setText("Añadir");
	btAñadirCliente.setActionCommand("btAñadirCliente");
	btAñadirCliente.setName("btAñadirCliente"); // NOI18N
	btAñadirCliente.addActionListener(new java.awt.event.ActionListener() {
 
                public void actionPerformed(java.awt.event.ActionEvent evt) {
 
                    btAñadirClienteActionPerformed(evt);
		}
	});
        
        btModificarCliente.setText("Modificar");
        btModificarCliente.setToolTipText("");
        btModificarCliente.setActionCommand("btModificarCliente");
        btModificarCliente.setName("btModificarCliente");
        btModificarCliente.addActionListener(new java.awt.event.ActionListener() {
             
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarClienteActionPerformed(evt);
            }
        });
        
        btEliminarCliente.setText("Eliminar");
        btEliminarCliente.setToolTipText("");
        btEliminarCliente.setActionCommand("btEliminarCliente");
        btEliminarCliente.setName("btEliminarCliente");
        btEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarClienteActionPerformed(evt);
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
	 						.addComponent(jLabelNombre)
	 						.addComponent(jLabelDni)
	 						.addComponent(jLabelMatricula))
	 					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
	 					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	 						.addComponent(txtDni)
	 						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
	 							.addComponent(txtNombre)
	 							.addComponent(txtMatricula, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)))
	 					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
	 					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
	 						.addComponent(btAñadirCliente, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btModificarCliente, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	 						.addComponent(btEliminarCliente, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
	 			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	 );
	 layout.setVerticalGroup(
	 	layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	 		.addGroup(layout.createSequentialGroup()
	 			.addContainerGap()
	 			.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	 				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	 					.addComponent(jLabelNombre)
	 					.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	 				.addComponent(btAñadirCliente))
	 			.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	 				.addGroup(layout.createSequentialGroup()
	 					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
	 					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	 						.addComponent(jLabelDni)
	 						.addComponent(txtDni, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
	 					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
	 					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	 						.addComponent(jLabelMatricula)
	 						.addComponent(txtMatricula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
	 				.addGroup(layout.createSequentialGroup()
	 					.addGap(15)
                                        .addComponent(btEliminarCliente)
                                                .addGap(15)
                                        .addComponent(btModificarCliente)))
	 			.addGap(26)
	 			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
	 			.addContainerGap(32, Short.MAX_VALUE))
	 );
	 this.setLayout(layout);
        
        
    }
    
    

}
