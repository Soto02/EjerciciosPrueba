package com.mycompany.piscinabuena;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dam
 */
public class VentanaPiscina extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPiscina
     */
    //PiscinaBuena piscina = new PiscinaBuena();
    
    public VentanaPiscina() {
        initComponents();
        panelLlenar.setVisible(false);
        MostrarPanel();
    }

    private void MostrarPanel() {
        if(btnProbar.isSelected()) {
            panelLlenar.setVisible(true);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLlenar = new javax.swing.JPanel();
        btnLlenar = new javax.swing.JButton();
        btnVaciar = new javax.swing.JButton();
        sCapacidad = new javax.swing.JSlider();
        panelProbar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLista = new javax.swing.JList<>();
        btnProbar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLlenar.setBackground(new java.awt.Color(51, 255, 51));
        btnLlenar.setText("Llenar");

        btnVaciar.setBackground(new java.awt.Color(255, 0, 0));
        btnVaciar.setText("Vaciar");

        javax.swing.GroupLayout panelLlenarLayout = new javax.swing.GroupLayout(panelLlenar);
        panelLlenar.setLayout(panelLlenarLayout);
        panelLlenarLayout.setHorizontalGroup(
            panelLlenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLlenarLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnLlenar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVaciar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLlenarLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(sCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        panelLlenarLayout.setVerticalGroup(
            panelLlenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLlenarLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelLlenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLlenar)
                    .addComponent(btnVaciar))
                .addGap(53, 53, 53)
                .addComponent(sCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        sCapacidad.setMinimum(0);
        sCapacidad.setMajorTickSpacing(100);
        sCapacidad.setMinorTickSpacing(10);
        sCapacidad.setValue(0);
        sCapacidad.setPaintTicks(true);
        sCapacidad.setPaintLabels(true);
        sCapacidad.setEnabled(false);

        jLista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1.0", "1.1", "1.2", "1.3", "1.4", "1.5", "1.6", "1.7", "1.8", "1.9", "2.0" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jLista);

        btnProbar.setBackground(new java.awt.Color(51, 153, 255));
        btnProbar.setText("Probar Piscina");

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Capacidad de la piscina en metros cúbicos");

        javax.swing.GroupLayout panelProbarLayout = new javax.swing.GroupLayout(panelProbar);
        panelProbar.setLayout(panelProbarLayout);
        panelProbarLayout.setHorizontalGroup(
            panelProbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelProbarLayout.createSequentialGroup()
                        .addComponent(btnProbar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        panelProbarLayout.setVerticalGroup(
            panelProbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelProbarLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnProbar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelProbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelLlenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(panelProbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panelLlenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLlenar;
    private javax.swing.JButton btnProbar;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jLista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelLlenar;
    private javax.swing.JPanel panelProbar;
    private javax.swing.JSlider sCapacidad;
    // End of variables declaration//GEN-END:variables

}
