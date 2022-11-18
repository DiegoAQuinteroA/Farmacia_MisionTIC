
package mvc.vista;

import javax.swing.table.DefaultTableModel;
import mvc.modelo.ProductoModel;
import mvc.controlador.ProductoControl;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FormularioProducto extends javax.swing.JFrame {
    DefaultTableModel Tproducto;
    ProductoControl servicio = new ProductoControl();
    
    public FormularioProducto() {
        initComponents();
        
        mostrarTabla();
    }
    
    public void mostrarTabla(){
        String datos[] = new String[4];
        DefaultTableModel Tproducto = new DefaultTableModel();
        Tproducto=(DefaultTableModel) tbProducto.getModel();
        Tproducto.getDataVector().clear();
        
        ArrayList<ProductoModel> listaProducto = new ArrayList();
        listaProducto = servicio.listarProducto();
        for (ProductoModel  x : listaProducto){
            datos[0] = x.getNombre();
            datos[1]= x.getId();
            datos[2]= String.valueOf(x.getTemperatura());
            datos[3]= String.valueOf(x.getValorBase());
            
            Tproducto.addRow(datos);
        }
        Tproducto=(DefaultTableModel) tbProducto.getModel();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblTemperatura = new javax.swing.JLabel();
        lblValorBase = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtTemperatura = new javax.swing.JTextField();
        txtValorBase = new javax.swing.JTextField();
        bttAgregar = new javax.swing.JButton();
        bttEliminar = new javax.swing.JButton();
        bttModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProducto = new javax.swing.JTable();
        bttLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario Productos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblNombre.setText("Nombre");

        lblId.setText("Id");

        lblTemperatura.setText("Temperatura");

        lblValorBase.setText("Valor Base");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        bttAgregar.setText("Agregar");
        bttAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttAgregarActionPerformed(evt);
            }
        });

        bttEliminar.setText("Eliminar");
        bttEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEliminarActionPerformed(evt);
            }
        });

        bttModificar.setText("Modificar");
        bttModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttModificarActionPerformed(evt);
            }
        });

        tbProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Id", "Temperatura", "Valor Base"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProducto);

        bttLimpiar.setText("Limpiar");
        bttLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblId)
                            .addComponent(lblTemperatura)
                            .addComponent(lblValorBase)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtValorBase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                .addComponent(txtTemperatura, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(bttAgregar)
                        .addGap(68, 68, 68)
                        .addComponent(bttEliminar)
                        .addGap(65, 65, 65)
                        .addComponent(bttModificar)
                        .addGap(57, 57, 57)
                        .addComponent(bttLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemperatura)
                    .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorBase)
                    .addComponent(txtValorBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttAgregar)
                    .addComponent(bttEliminar)
                    .addComponent(bttModificar)
                    .addComponent(bttLimpiar))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void bttModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttModificarActionPerformed
        // TODO add your handling code here:
        String mensaje;
        int fila;
        fila = tbProducto.getSelectedRow();
        if((fila < 0) || (txtNombre.getText().isEmpty()) || (txtTemperatura.getText().isEmpty()) || (txtValorBase.getText().isEmpty()) ){
            JOptionPane.showMessageDialog(null, "Seleccione el producto e ingrese los campos a modificar");
        }
        else{
            String id = tbProducto.getModel().getValueAt(fila, 1).toString();
            String nombre = txtNombre.getText();
            double temperatura = Double.parseDouble (txtTemperatura.getText());
            double valorBase = Double.parseDouble (txtValorBase.getText());
            mensaje = servicio.modificarProducto(nombre, id, temperatura, valorBase);
            mostrarTabla();
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }//GEN-LAST:event_bttModificarActionPerformed

    private void bttAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttAgregarActionPerformed
        // TODO add your handling code here:
        String mensaje;
        if((txtNombre.getText().isEmpty()) || (txtId.getText().isEmpty()) || (txtTemperatura.getText().isEmpty()) || (txtValorBase.getText().isEmpty()) ){
            JOptionPane.showMessageDialog(null, "Ingrese toda la información");
        }
        else{
            String nombre = txtNombre.getText();
            String id = txtId.getText();
            double temperatura = Double.parseDouble (txtTemperatura.getText());
            double valorBase = Double.parseDouble (txtValorBase.getText());
            mensaje = servicio.agregarProducto(nombre, id, temperatura, valorBase);
            mostrarTabla();
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }//GEN-LAST:event_bttAgregarActionPerformed

    private void bttEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEliminarActionPerformed
        // TODO add your handling code here:
        String mensaje;
        int fila;
        fila = tbProducto.getSelectedRow();
        if(fila >= 0){
            String id = tbProducto.getModel().getValueAt(fila, 1).toString();
            mensaje = servicio.eliminarProducto(id);
            mostrarTabla();
            JOptionPane.showMessageDialog(null, mensaje);
        }
        else{
            JOptionPane.showMessageDialog(null, "seleccione producto a eliminar");
        }
    }//GEN-LAST:event_bttEliminarActionPerformed

    private void bttLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttLimpiarActionPerformed
        txtNombre.setText("");
        txtId.setText("");
        txtTemperatura.setText("");
        txtValorBase.setText("");
    }//GEN-LAST:event_bttLimpiarActionPerformed

    private void tbProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductoMouseClicked
        int seleccionar = tbProducto.rowAtPoint(evt.getPoint());
        txtNombre.setText(String.valueOf(tbProducto.getValueAt(seleccionar, 0)));
        txtId.setText(String.valueOf(tbProducto.getValueAt(seleccionar, 1)));
        txtTemperatura.setText(String.valueOf(tbProducto.getValueAt(seleccionar, 2)));
        txtValorBase.setText(String.valueOf(tbProducto.getValueAt(seleccionar, 3)));
    }//GEN-LAST:event_tbProductoMouseClicked

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
            java.util.logging.Logger.getLogger(FormularioProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttAgregar;
    private javax.swing.JButton bttEliminar;
    private javax.swing.JButton bttLimpiar;
    private javax.swing.JButton bttModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTemperatura;
    private javax.swing.JLabel lblValorBase;
    private javax.swing.JTable tbProducto;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTemperatura;
    private javax.swing.JTextField txtValorBase;
    // End of variables declaration//GEN-END:variables
}
