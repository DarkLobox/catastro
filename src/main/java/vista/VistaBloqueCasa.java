package vista;

import config.Coneccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaBloqueCasa extends javax.swing.JFrame {
    Coneccion con = new Coneccion();
    Connection cn;
    PreparedStatement st;
    ResultSet rs;
    DefaultTableModel modelo;
    String vivCodSelect;
    int flag = 0;
    int rowTable;

    public VistaBloqueCasa() {
        initComponents();
        setLocationRelativeTo(null);
        listarVivCod();
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
        inputBloCasMet = new javax.swing.JTextField();
        cboxVivCod = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        inputBloCasOd = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBloquesCasas = new javax.swing.JTable();
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
        setTitle("BLOQUE CASA");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de Bloque Casa"));

        jLabel1.setText("Metros de Bloque Casa:");

        jLabel2.setText("Codigo de Vivienda:");

        inputBloCasMet.setEnabled(false);
        inputBloCasMet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBloCasMetActionPerformed(evt);
            }
        });

        cboxVivCod.setEnabled(false);
        cboxVivCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxVivCodActionPerformed(evt);
            }
        });

        jLabel4.setText("Comentario de Bloque Casa:");

        inputBloCasOd.setColumns(20);
        inputBloCasOd.setRows(5);
        inputBloCasOd.setEnabled(false);
        jScrollPane2.setViewportView(inputBloCasOd);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputBloCasMet, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboxVivCod, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboxVivCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputBloCasMet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 83, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla_Bloques_Casas"));

        tableBloquesCasas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Vivienda", "Metros Bloque Casa", "Od Bloque Casa", "Estado Bloque Casa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableBloquesCasas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBloquesCasasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBloquesCasas);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(71, 71, 71))
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

    private void inputBloCasMetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBloCasMetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBloCasMetActionPerformed

    private void cboxVivCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxVivCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxVivCodActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        inputBloCasMet.setEnabled(true);
        inputBloCasOd.setEnabled(true);
        cboxVivCod.setEnabled(true);
        limpiarInputs();
        flag = 1;
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(vivCodSelect.compareTo("")!=0){
            inputBloCasMet.setEnabled(true);
            inputBloCasOd.setEnabled(true);
            cboxVivCod.setEnabled(false);
            llenarDatos();
            flag = 2;
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void tableBloquesCasasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBloquesCasasMouseClicked
        rowTable = tableBloquesCasas.getSelectedRow();
        if (rowTable == -1) {
            JOptionPane.showMessageDialog(null, "No se Selecciono");
        }
        else {
            vivCodSelect = tableBloquesCasas.getValueAt(rowTable, 0).toString();
        }
    }//GEN-LAST:event_tableBloquesCasasMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(vivCodSelect.compareTo("")!=0){
            inputBloCasMet.setEnabled(false);
            inputBloCasOd.setEnabled(false);
            cboxVivCod.setEnabled(false);
            llenarDatos();
            flag = 3;
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        inputBloCasMet.setEnabled(false);
        inputBloCasOd.setEnabled(false);
        cboxVivCod.setEnabled(false);
        limpiarInputs();
        flag = 0;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnInactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInactivarActionPerformed
        if(vivCodSelect.compareTo("")!=0){
            inputBloCasMet.setEnabled(false);
            inputBloCasOd.setEnabled(false);
            cboxVivCod.setEnabled(false);
            llenarDatos();
            flag = 4;
        }
    }//GEN-LAST:event_btnInactivarActionPerformed

    private void btnReactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReactivarActionPerformed
        if(vivCodSelect.compareTo("")!=0){
            inputBloCasMet.setEnabled(false);
            inputBloCasOd.setEnabled(false);
            cboxVivCod.setEnabled(false);
            llenarDatos();
            flag = 5;
        }
    }//GEN-LAST:event_btnReactivarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(flag==0){
            JOptionPane.showMessageDialog(null, "Ninguna Opcion Seleccionada");
        }
        if(flag==1){
            String vivCod = cboxVivCod.getSelectedItem().toString();
            if (vivCod.equals("")) {
                JOptionPane.showMessageDialog(null, "Complete los datos");
            } 
            else {
                try {
                    cn = con.getConeccion();
                    st = cn.prepareStatement("INSERT INTO bloques_casas (VivCod, BloCasMet, BloCasOd, BloCasEst) VALUES (?, ?, ?, ?)");
                    st.setString(1, vivCod);
                    st.setString(2, inputBloCasMet.getText());
                    st.setString(3, inputBloCasOd.getText());
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
            String vivCod = cboxVivCod.getSelectedItem().toString();
            if (vivCod.equals("") || vivCodSelect.equals("")) {
                JOptionPane.showMessageDialog(null, "No selecciono un municipio");
            } 
            else {
                try {
                    cn = con.getConeccion();
                    st = cn.prepareStatement("UPDATE bloques_casas SET BloCasMet = ?, BloCasOd = ? WHERE VivCod = ?");
                    st.setString(1, inputBloCasMet.getText());
                    st.setString(2, inputBloCasOd.getText());
                    st.setString(3, vivCodSelect);
                    st.executeUpdate();
                    //limpiarInputs();
                    actualizar();
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }
        }
        if(flag==3){
            if (vivCodSelect.equals("")) {
                JOptionPane.showMessageDialog(null, "No selecciono un municipio");
            } 
            else {
                try {
                    cn = con.getConeccion();
                    st = cn.prepareStatement("UPDATE bloques_casas SET BloCasEst = ? WHERE VivCod = ?");
                    st.setString(1, "*");
                    st.setString(2, vivCodSelect);
                    st.executeUpdate();
                    //limpiarInputs();
                    actualizar();
                } catch (Exception e) {
                    if (e instanceof SQLIntegrityConstraintViolationException) {
                        JOptionPane.showMessageDialog(null, "Otros elementos hacen referencia al campo: " + vivCodSelect);
                    }
                    System.out.println("Error: " + e);
                }
            }
        }
        if(flag==4){
            if (vivCodSelect.equals("")) {
                JOptionPane.showMessageDialog(null, "No selecciono un municipio");
            } 
            else {
                try {
                    cn = con.getConeccion();
                    st = cn.prepareStatement("UPDATE bloques_casas SET BloCasEst = ? WHERE VivCod = ?");
                    st.setString(1, "I");
                    st.setString(2, vivCodSelect);
                    st.executeUpdate();
                    //limpiarInputs();
                    actualizar();
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }
        }
        if(flag==5){
            if (vivCodSelect.equals("")) {
                JOptionPane.showMessageDialog(null, "No selecciono un municipio");
            } 
            else {
                try {
                    cn = con.getConeccion();
                    st = cn.prepareStatement("UPDATE bloques_casas SET BloCasEst = ? WHERE VivCod = ?");
                    st.setString(1, "A");
                    st.setString(2, vivCodSelect);
                    st.executeUpdate();
                    //limpiarInputs();
                    actualizar();
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }
        }
        
        inputBloCasMet.setEnabled(false);
        inputBloCasOd.setEnabled(false);
        cboxVivCod.setEnabled(false);
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
            java.util.logging.Logger.getLogger(VistaBloqueCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaBloqueCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaBloqueCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaBloqueCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaBloqueCasa().setVisible(true);
            }
        });
    }
    void listarVivCod(){
        cboxVivCod.removeAllItems();
        try{
            cn = con.getConeccion();
            st = cn.prepareStatement("SELECT VivCod FROM viviendas");
            rs = st.executeQuery();
            while(rs.next()){
                cboxVivCod.addItem(rs.getString("VivCod"));
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
            st = cn.prepareStatement("SELECT * FROM bloques_casas");
            rs = st.executeQuery();
            Object [] zonas = new Object[4];
            modelo = (DefaultTableModel) tableBloquesCasas.getModel();
            while(rs.next()){
                zonas[0] = rs.getString("VivCod");
                zonas[1] = rs.getString("BloCasMet");
                zonas[2] = rs.getString("BloCasOd");
                zonas[3] = rs.getString("BloCasEst");
                modelo.addRow(zonas);
            }
            tableBloquesCasas.setModel(modelo);
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }

    void limpiarInputs(){
        inputBloCasMet.setText("");
        inputBloCasOd.setText("");
        vivCodSelect = "";
    }

    void limpiarTabla(){
        int count = tableBloquesCasas.getRowCount()-1;
        for(int i=0;i<=count;i++){
            modelo.removeRow(0);
        }
    }
    
    private void llenarDatos(){
        cboxVivCod.setSelectedItem(vivCodSelect);
        inputBloCasMet.setText(tableBloquesCasas.getValueAt(rowTable, 1).toString());
        inputBloCasOd.setText(tableBloquesCasas.getValueAt(rowTable, 2).toString());
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
    private javax.swing.JComboBox<String> cboxVivCod;
    private javax.swing.JTextField inputBloCasMet;
    private javax.swing.JTextArea inputBloCasOd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tableBloquesCasas;
    // End of variables declaration//GEN-END:variables
}