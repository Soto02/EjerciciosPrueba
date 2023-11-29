package Vista;

import Controller.ControllerCliente;
import DAOs.DAOClienteImpl;
import Recursos.Cliente;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dam
 */
public class PanelCRUDCliente extends javax.swing.JPanel {

    private ControllerCliente controller;

    public PanelCRUDCliente(VentanaPrincipal ventana) {
        initComponents();

        this.inicializarPanel();
        cargarTabla();
    }

    public void cargarTabla() {
        //String[] nombreColumnas = {"Nombre","DNI"};
        ControllerCliente clienteControlador = new ControllerCliente();
        List<Cliente> lstClientes = clienteControlador.listar();
        DefaultTableModel modelo = (DefaultTableModel) tablaClientes.getModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("DNI");

        Object[] registroLeido = new Object[3];
        //Object[] registroLeido = new Object[nombreColumnas.length];

        for (Cliente cliente : lstClientes) {
            registroLeido[0] = cliente.getNombre();
            registroLeido[1] = cliente.getDni();

            modelo.addRow(registroLeido);
        }
        tablaClientes.setModel(modelo);
    }

    private void btAñadirClienteActionPerformed(java.awt.event.ActionEvent evt) {

        boolean validar = validarTxt();

        if (btAñadirCliente.getText().equals("Registrar")) {
            if (validar == true) {

                Cliente cliente = new Cliente();

                cliente.setNombre(txtNombre.getText());
                cliente.setDni(txtDni.getText());

                DAOClienteImpl dao = new DAOClienteImpl();
                boolean respuesta = dao.insertarCliente(cliente);

                if (respuesta == true) {
                    JOptionPane.showMessageDialog(null, "Se registró correctamente.");
                    cargarTabla();
                    limpiarTxt();
                } else {
                    JOptionPane.showMessageDialog(null, "Hubo un error al registrar el cliente.");
                }

                System.out.println("Se registró correctamente.");
            }
        } else {
            if (validar == true) {

                datoCliente.setNombre(txtNombre.getText());
                datoCliente.setDni(txtDni.getText());

                DAOClienteImpl dao = new DAOClienteImpl();
                boolean respuesta = dao.modificarCliente(datoCliente);

                if (respuesta == true) {
                    JOptionPane.showMessageDialog(null, "Se modificó correctamente.");

                    limpiarTxt();
                } else {
                    JOptionPane.showMessageDialog(null, "Hubo un error al modificar el cliente.");
                }

                System.out.println("Se registró correctamente.");
            }
        }
    }

    private void btModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {

        Cliente cliente = new Cliente();

        int fila = tablaClientes.getSelectedRow();

        if (fila != -1) {

            cliente.setNombre(tablaClientes.getValueAt(fila, 0).toString());
            cliente.setDni(tablaClientes.getValueAt(fila, 1).toString());

            System.out.println(cliente.toString());

            establecerDatos(cliente);
        }
    }

    private void btEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {

        int fila = tablaClientes.getSelectedRow();

        if (fila != -1) {

            String dni = tablaClientes.getValueAt(fila, 1).toString();

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desae borrar el cliente?", "Advertencia", JOptionPane.WARNING_MESSAGE);

            if (respuesta == 0) {
                ControllerCliente cliente = new ControllerCliente();

                boolean respt = cliente.eliminarVehiculo(dni);
                if (respt) {
                    JOptionPane.showMessageDialog(null, "Se elimino correctamente.", "Exito", JOptionPane.INFORMATION_MESSAGE);
                    limpiarTxt();
                } else {
                    JOptionPane.showMessageDialog(null, "Hubo un error, no se pudo eliminar.", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Tiene que seleccionar un cliente de la tabla.");
        }
    }

    private void limpiarTxt() {
        txtNombre.setText("");
        txtDni.setText("");
    }

    private boolean validarTxt() {
        if (txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Introduzca el nombre del cliente.");
            return false;
        } else if (txtDni.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Introduzca el dni del cliente.");
            return false;
        }
        return true;
    }

    Cliente datoCliente = null;

    public void establecerDatos(Cliente cliente) {
        this.datoCliente = cliente;

        txtNombre.setText(datoCliente.getNombre());
        txtDni.setText(datoCliente.getDni());
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

    private javax.swing.JLabel jLabelNombre;

    private javax.swing.JLabel jLabelDni;

    private javax.swing.JTextField txtNombre;

    private javax.swing.JTextField txtDni;

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

        jScrollPane1 = new javax.swing.JScrollPane();

        tablaClientes = new javax.swing.JTable();

        txtNombre = new javax.swing.JTextField();

        txtDni = new javax.swing.JTextField();

        btAñadirCliente = new javax.swing.JButton();

        btModificarCliente = new javax.swing.JButton();

        btEliminarCliente = new javax.swing.JButton();

        jLabelNombre.setText("Nombre");

        //tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
                //new Object[][]{
                    //{null, null}
                //},
                //new String[]{
                    //"Nombre", "DNI"
                //}
        //));

        jScrollPane1.setViewportView(tablaClientes);

        txtNombre.setName("nombre");

        txtDni.setToolTipText("");

        txtDni.setName("dni");

        jLabelDni.setText("DNI");

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
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelNombre)
                                                        .addComponent(jLabelDni))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                                        .addComponent(txtDni))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btAñadirCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btModificarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btEliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap())
        );

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelNombre)
                                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelDni)
                                                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btAñadirCliente)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btModificarCliente)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btEliminarCliente)))
                                .addGap(26)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(32, Short.MAX_VALUE))
        );

        this.setLayout(layout);

    }

}
