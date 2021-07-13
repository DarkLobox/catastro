package vista;

import config.Coneccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaZonaUrbana extends javax.swing.JFrame {
    Coneccion con = new Coneccion();
    Connection cn;
    PreparedStatement st;
    ResultSet rs;
    DefaultTableModel modelo;
    String zonUrbCodSelect;
    int flag = 0;
    int rowTable;

    public VistaZonaUrbana() {
        initComponents();
        setLocationRelativeTo(null);
        listarRegNom();
        listar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputZonUrbNom = new javax.swing.JTextField();
        cboxMunCod = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        inputZonUrbCod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        inputZonUrbOd = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMunicipios = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnAdicionar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnInactivar = new javax.swing.JButton();
        btnReactivar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ZONA URBANA");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de Zona Urbana"));

        jLabel1.setText("Nombre de Zona Urbana:");

        jLabel2.setText("Codigo de Municipio:");

        inputZonUrbNom.setEnabled(false);
        inputZonUrbNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputZonUrbNomActionPerformed(evt);
            }
        });

        cboxMunCod.setEnabled(false);
        cboxMunCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxMunCodActionPerformed(evt);
            }
        });

        jLabel3.setText("Codigo de Zona Urbana:");

        inputZonUrbCod.setEnabled(false);

        jLabel4.setText("Comentario de Zona Urbana:");

        inputZonUrbOd.setColumns(20);
        inputZonUrbOd.setRows(5);
        inputZonUrbOd.setEnabled(false);
        jScrollPane2.setViewportView(inputZonUrbOd);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(inputZonUrbNom)
                                .addComponent(cboxMunCod, 0, 186, Short.MAX_VALUE))
                            .addComponent(inputZonUrbCod, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputZonUrbCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputZonUrbNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxMunCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla_Zonas_Urbanas"));

        tableMunicipios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Zona Urbana", "Nombre Zona Urbana", "Od Zona Urbana", "Codigo Municipio", "Estado Zona Urbana"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMunicipios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMunicipiosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMunicipios);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnInactivar.setText("Inactivar");
        btnInactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInactivarActionPerformed(evt);
            }
        });

        btnReactivar.setText("Reactivar");
        btnReactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReactivarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInactivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificar)
                    .addComponent(btnReactivar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(129, 129, 129))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInactivar)
                    .addComponent(btnReactivar)
                    .addComponent(btnActualizar)
                    .addComponent(btnSalir))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputZonUrbNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputZonUrbNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputZonUrbNomActionPerformed

    private void cboxMunCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxMunCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxMunCodActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        inputZonUrbCod.setEnabled(false);
        inputZonUrbNom.setEnabled(true);
        inputZonUrbOd.setEnabled(true);
        cboxMunCod.setEnabled(true);
        limpiarInputs();
        flag = 1;
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(zonUrbCodSelect.compareTo("")!=0){
            inputZonUrbCod.setEnabled(false);
            inputZonUrbNom.setEnabled(true);
            inputZonUrbOd.setEnabled(true);
            cboxMunCod.setEnabled(true);
            llenarDatos();
            flag = 2;
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void tableMunicipiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMunicipiosMouseClicked
        rowTable = tableMunicipios.getSelectedRow();
        if (rowTable == -1) {
            JOptionPane.showMessageDialog(null, "No se Selecciono");
        }
        else {
            zonUrbCodSelect = tableMunicipios.getValueAt(rowTable, 0).toString();
        }
    }//GEN-LAST:event_tableMunicipiosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(zonUrbCodSelect.compareTo("")!=0){
            inputZonUrbCod.setEnabled(false);
            inputZonUrbNom.setEnabled(false);
            inputZonUrbOd.setEnabled(false);
            cboxMunCod.setEnabled(false);
            llenarDatos();
            flag = 3;
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        inputZonUrbCod.setEnabled(false);
        inputZonUrbNom.setEnabled(false);
        inputZonUrbOd.setEnabled(false);
        cboxMunCod.setEnabled(false);
        limpiarInputs();
        flag = 0;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnInactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInactivarActionPerformed
        if(zonUrbCodSelect.compareTo("")!=0){
            inputZonUrbCod.setEnabled(false);
            inputZonUrbNom.setEnabled(false);
            inputZonUrbOd.setEnabled(false);
            cboxMunCod.setEnabled(false);
            llenarDatos();
            flag = 4;
        }
    }//GEN-LAST:event_btnInactivarActionPerformed

    private void btnReactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReactivarActionPerformed
        if(zonUrbCodSelect.compareTo("")!=0){
            inputZonUrbCod.setEnabled(false);
            inputZonUrbNom.setEnabled(false);
            inputZonUrbOd.setEnabled(false);
            cboxMunCod.setEnabled(false);
            llenarDatos();
            flag = 5;
        }
    }//GEN-LAST:event_btnReactivarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(flag==0){
            JOptionPane.showMessageDialog(null, "Ninguna Opcion Seleccionada");
        }
        if(flag==1){
            String zonUrbNom = inputZonUrbNom.getText();
            if (zonUrbNom.equals("")) {
                JOptionPane.showMessageDialog(null, "Complete los datos");
            } 
            else {
                try {
                    cn = con.getConeccion();
                    st = cn.prepareStatement("INSERT INTO zonas_urbanas (ZonUrbNom, ZonUrbOd, MunCod, ZonUrbEst) VALUES (?, ?, ?, ?)");
                    st.setString(1, zonUrbNom);
                    st.setString(2, inputZonUrbOd.getText());
                    st.setString(3, cboxMunCod.getSelectedItem().toString());
                    st.setString(4, "A");
                    st.executeUpdate();
                    //limpiarInputs();
                    actualizar();
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }
        }
        if(flag==2){
            String zonUrbNom = inputZonUrbNom.getText();
            if (zonUrbNom.equals("") || zonUrbCodSelect.equals("")) {
                JOptionPane.showMessageDialog(null, "No selecciono un municipio");
            } 
            else {
                try {
                    cn = con.getConeccion();
                    st = cn.prepareStatement("UPDATE zonas_urbanas SET ZonUrbNom = ?, ZonUrbOd = ?, MunCod = ? WHERE ZonUrbCod = ?");
                    st.setString(1, zonUrbNom);
                    st.setString(2, inputZonUrbOd.getText());
                    st.setString(3, cboxMunCod.getSelectedItem().toString());
                    st.setString(4, zonUrbCodSelect);
                    st.executeUpdate();
                    //limpiarInputs();
                    actualizar();
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }
        }
        if(flag==3){
            if (zonUrbCodSelect.equals("")) {
                JOptionPane.showMessageDialog(null, "No selecciono un municipio");
            } 
            else {
                try {
                    cn = con.getConeccion();
                    st = cn.prepareStatement("UPDATE zonas_urbanas SET ZonUrbEst = ? WHERE ZonUrbCod = ?");
                    st.setString(1, "*");
                    st.setString(2, zonUrbCodSelect);
                    st.executeUpdate();
                    //limpiarInputs();
                    actualizar();
                } catch (Exception e) {
                    if (e instanceof SQLIntegrityConstraintViolationException) {
                        JOptionPane.showMessageDialog(null, "Otros elementos hacen referencia al campo: " + zonUrbCodSelect);
                    }
                    System.out.println("Error: " + e);
                }
            }
        }
        if(flag==4){
            if (zonUrbCodSelect.equals("")) {
                JOptionPane.showMessageDialog(null, "No selecciono un municipio");
            } 
            else {
                try {
                    cn = con.getConeccion();
                    st = cn.prepareStatement("UPDATE zonas_urbanas SET ZonUrbEst = ? WHERE ZonUrbCod = ?");
                    st.setString(1, "I");
                    st.setString(2, zonUrbCodSelect);
                    st.executeUpdate();
                    //limpiarInputs();
                    actualizar();
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }
        }
        if(flag==5){
            if (zonUrbCodSelect.equals("")) {
                JOptionPane.showMessageDialog(null, "No selecciono un municipio");
            } 
            else {
                try {
                    cn = con.getConeccion();
                    st = cn.prepareStatement("UPDATE zonas_urbanas SET ZonUrbEst = ? WHERE ZonUrbCod = ?");
                    st.setString(1, "A");
                    st.setString(2, zonUrbCodSelect);
                    st.executeUpdate();
                    //limpiarInputs();
                    actualizar();
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }
        }
        
        inputZonUrbCod.setEnabled(false);
        inputZonUrbNom.setEnabled(false);
        inputZonUrbOd.setEnabled(false);
        cboxMunCod.setEnabled(false);
        flag = 0;
            
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        limpiarInputs();
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaZonaUrbana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaZonaUrbana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaZonaUrbana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaZonaUrbana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaZonaUrbana().setVisible(true);
            }
        });
    }
    void listarRegNom(){
        cboxMunCod.removeAllItems();
        try{
            cn = con.getConeccion();
            st = cn.prepareStatement("SELECT MunCod FROM municipios");
            rs = st.executeQuery();
            while(rs.next()){
                cboxMunCod.addItem(rs.getString("MunCod"));
            }

        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }

    void actualizar(){
        limpiarTabla();
        listar();
    }

    void listar(){
        try{
            cn = con.getConeccion();
            st = cn.prepareStatement("SELECT * FROM zonas_urbanas");
            rs = st.executeQuery();
            Object [] zonas = new Object[5];
            modelo = (DefaultTableModel) tableMunicipios.getModel();
            while(rs.next()){
                zonas[0] = rs.getString("ZonUrbCod");
                zonas[1] = rs.getString("ZonUrbNom");
                zonas[2] = rs.getString("ZonUrbOd");
                zonas[3] = rs.getString("MunCod");
                zonas[4] = rs.getString("ZonUrbEst");
                modelo.addRow(zonas);
            }
            tableMunicipios.setModel(modelo);
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }

    void limpiarInputs(){
        inputZonUrbCod.setText("");
        inputZonUrbNom.setText("");
        inputZonUrbOd.setText("");
        zonUrbCodSelect = "";
    }

    void limpiarTabla(){
        int count = tableMunicipios.getRowCount()-1;
        for(int i=0;i<=count;i++){
            modelo.removeRow(0);
        }
    }
    
    private void llenarDatos(){
        inputZonUrbCod.setText(zonUrbCodSelect);
        inputZonUrbNom.setText(tableMunicipios.getValueAt(rowTable, 1).toString());
        inputZonUrbOd.setText(tableMunicipios.getValueAt(rowTable, 2).toString());
        cboxMunCod.setSelectedItem(tableMunicipios.getValueAt(rowTable, 3).toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInactivar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnReactivar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboxMunCod;
    private javax.swing.JTextField inputZonUrbCod;
    private javax.swing.JTextField inputZonUrbNom;
    private javax.swing.JTextArea inputZonUrbOd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tableMunicipios;
    // End of variables declaration//GEN-END:variables
}
