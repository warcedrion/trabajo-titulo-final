/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantasha;

import clases.DetallePedido;
import clases.OrdenPedido;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import querys.QdetallePedido;
import querys.QordenDePedido;

/**
 *
 * @author Ariel
 */
public class ven_mantenedor_pedido extends javax.swing.JFrame {

    QdetallePedido qdp = new QdetallePedido();
    QordenDePedido qodp = new QordenDePedido();
    DetallePedido dp = new DetallePedido();
    OrdenPedido odp = new OrdenPedido();
    public ven_mantenedor_pedido() {
        initComponents();
        this.setLocationRelativeTo(null);
        tbl_ordenPedido.setModel(qodp.cargardatos());
        cmb_filtro_ordenPedido.setModel(cargarcmb_filtro());
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_ordenPedido = new javax.swing.JTable();
        cmb_filtro_ordenPedido = new javax.swing.JComboBox<>();
        txt_filtro_ordenPedido = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        Btn_consultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_ordenPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_ordenPedido);

        cmb_filtro_ordenPedido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txt_filtro_ordenPedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtro_ordenPedidoKeyReleased(evt);
            }
        });

        btn_agregar.setText("Agregar");
        btn_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarMouseClicked(evt);
            }
        });

        btn_modificar.setText("Modificar");
        btn_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modificarMouseClicked(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseClicked(evt);
            }
        });

        btn_volver.setText("Volver");

        Btn_consultar.setText("Consultar");
        Btn_consultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_consultarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmb_filtro_ordenPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_filtro_ordenPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(156, 156, 156))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btn_agregar)
                .addGap(42, 42, 42)
                .addComponent(btn_modificar)
                .addGap(53, 53, 53)
                .addComponent(btn_eliminar)
                .addGap(40, 40, 40)
                .addComponent(Btn_consultar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_volver)
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_filtro_ordenPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_filtro_ordenPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar)
                    .addComponent(btn_modificar)
                    .addComponent(btn_eliminar)
                    .addComponent(Btn_consultar))
                .addGap(85, 85, 85)
                .addComponent(btn_volver)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_filtro_ordenPedidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtro_ordenPedidoKeyReleased
          String buscar = (String) cmb_filtro_ordenPedido.getSelectedItem();
       tbl_ordenPedido.setModel(qodp.buscarDatos(txt_filtro_ordenPedido.getText(), buscar));
    }//GEN-LAST:event_txt_filtro_ordenPedidoKeyReleased

    private void btn_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarMouseClicked
       ven_pedido vped = new ven_pedido();
        vped.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_agregarMouseClicked

    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
      // preguntar al eduardo si est bien validado        
       int index = tbl_ordenPedido.getSelectedRow();
     String  codigo =  (String) tbl_ordenPedido.getValueAt(index,0);
      
      if (JOptionPane.showConfirmDialog(null, "Desea eliminar el pedido  " + codigo, "Eliminar pedido",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.OK_OPTION){
         qdp.eliminarDetalleDePedido(codigo);     
         qodp.eliminarOrdenDePedido(codigo);
          tbl_ordenPedido.removeAll();
          actualizar();
    } 
      
    }//GEN-LAST:event_btn_eliminarMouseClicked

    private void btn_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarMouseClicked
         odp.setCod_pedido((String) tbl_ordenPedido.getValueAt(tbl_ordenPedido.getSelectedRow(),0));
         odp.setCod_prov((String) tbl_ordenPedido.getValueAt(tbl_ordenPedido.getSelectedRow(),1));
         odp.setId_usuario((String) tbl_ordenPedido.getValueAt(tbl_ordenPedido.getSelectedRow(),2));
         odp.setFecha_pedido((String) tbl_ordenPedido.getValueAt(tbl_ordenPedido.getSelectedRow(),3));
         odp.setFecha_entrega((String) tbl_ordenPedido.getValueAt(tbl_ordenPedido.getSelectedRow(),4));
         odp.setEstado_pedido((String) tbl_ordenPedido.getValueAt(tbl_ordenPedido.getSelectedRow(),5));
        
        
        ven_pedido vped = new ven_pedido(odp);
        vped.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_modificarMouseClicked

    private void Btn_consultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_consultarMouseClicked
      odp.setCod_pedido((String) tbl_ordenPedido.getValueAt(tbl_ordenPedido.getSelectedRow(),0));
         odp.setCod_prov((String) tbl_ordenPedido.getValueAt(tbl_ordenPedido.getSelectedRow(),1));
         odp.setId_usuario((String) tbl_ordenPedido.getValueAt(tbl_ordenPedido.getSelectedRow(),2));
         odp.setFecha_pedido((String) tbl_ordenPedido.getValueAt(tbl_ordenPedido.getSelectedRow(),3));
         odp.setFecha_entrega((String) tbl_ordenPedido.getValueAt(tbl_ordenPedido.getSelectedRow(),4));
         odp.setEstado_pedido((String) tbl_ordenPedido.getValueAt(tbl_ordenPedido.getSelectedRow(),5));
        String consultar ="";
        ven_pedido vped = new ven_pedido(odp,consultar);
        vped.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_consultarMouseClicked

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
            java.util.logging.Logger.getLogger(ven_mantenedor_pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ven_mantenedor_pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ven_mantenedor_pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ven_mantenedor_pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ven_mantenedor_pedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_consultar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JComboBox<String> cmb_filtro_ordenPedido;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_ordenPedido;
    private javax.swing.JTextField txt_filtro_ordenPedido;
    // End of variables declaration//GEN-END:variables

    public void actualizar(){
         DefaultTableModel modelo = new DefaultTableModel(); 
         modelo=qodp.cargardatos();
         tbl_ordenPedido.setModel(modelo);
    }
    
    
      public DefaultComboBoxModel cargarcmb_filtro(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Codigo de Pedido");
        modelo.addElement("Codigo de Proveedor");       
        modelo.addElement("ID Usuario");
        modelo.addElement("Fecha de Pedido");
        modelo.addElement("Fecha de Entrega");
        modelo.addElement("Estado del Pedido");
        return modelo;
    }
    


}
