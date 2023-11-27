package Vista;

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
 
        btModificarCliente = new javax.swing.JButton();
        
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
    }
    
    
    
    
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

}
