/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantasha;

import clases.Persona;
import clases.Producto;
import clases.Validar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.objects.NativeString.trim;
import querys.Qpersona;
import querys.Qproductos;

/**
 *
 * @author Ivan
 */
public class ven_prod extends javax.swing.JFrame {

    /**
     * Creates new form ven_prod
     */
    Qproductos qp = new Qproductos();
    Validar vali = new Validar(); 
    public ven_prod() {
        initComponents();
        this.setLocationRelativeTo(null);
        tbl_productos.setModel(qp.cargardatos());
        cmb_filtro.setModel(cargarcmb_filtro());
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_cod_prod = new javax.swing.JTextField();
        txt_prod = new javax.swing.JTextField();
        txt_pre = new javax.swing.JTextField();
        txt_can = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_consultar = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_productos = new javax.swing.JTable();
        lbl_descripcion = new javax.swing.JLabel();
        txt_desc = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        txt_filtro = new javax.swing.JTextField();
        cmb_filtro = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));

        jPanel1.setMaximumSize(new java.awt.Dimension(500, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(null);

        jLabel1.setText("codigo producto");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 6, 100, 30);

        jLabel2.setText("nombre producto");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 57, 105, 30);

        jLabel3.setText("precio");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 96, 87, 30);

        jLabel4.setText("cantidad(stock)");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 138, 87, 30);

        txt_cod_prod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cod_prodKeyTyped(evt);
            }
        });
        jPanel1.add(txt_cod_prod);
        txt_cod_prod.setBounds(150, 8, 186, 30);

        txt_prod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_prodKeyTyped(evt);
            }
        });
        jPanel1.add(txt_prod);
        txt_prod.setBounds(150, 47, 188, 30);

        txt_pre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_preKeyTyped(evt);
            }
        });
        jPanel1.add(txt_pre);
        txt_pre.setBounds(150, 96, 188, 30);

        txt_can.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_canKeyTyped(evt);
            }
        });
        jPanel1.add(txt_can);
        txt_can.setBounds(150, 138, 188, 30);

        btn_agregar.setText("Agregar");
        btn_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarMouseClicked(evt);
            }
        });
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregar);
        btn_agregar.setBounds(10, 230, 90, 30);

        btn_eliminar.setText("eliminar");
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseClicked(evt);
            }
        });
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminar);
        btn_eliminar.setBounds(120, 230, 90, 30);

        btn_modificar.setText("modificar");
        btn_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modificarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_modificar);
        btn_modificar.setBounds(230, 230, 100, 30);

        btn_consultar.setText("consultar");
        btn_consultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_consultarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_consultar);
        btn_consultar.setBounds(350, 230, 110, 30);

        btn_volver.setText("volver");
        btn_volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_volverMouseClicked(evt);
            }
        });
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        jPanel1.add(btn_volver);
        btn_volver.setBounds(410, 450, 90, 30);

        tbl_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_productosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_productos);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 270, 452, 170);

        lbl_descripcion.setText("descripcion");
        jPanel1.add(lbl_descripcion);
        lbl_descripcion.setBounds(30, 184, 90, 30);

        txt_desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descActionPerformed(evt);
            }
        });
        txt_desc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_descKeyTyped(evt);
            }
        });
        jPanel1.add(txt_desc);
        txt_desc.setBounds(150, 180, 190, 30);

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_limpiarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_limpiar);
        btn_limpiar.setBounds(370, 190, 73, 23);

        txt_filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroKeyReleased(evt);
            }
        });
        jPanel1.add(txt_filtro);
        txt_filtro.setBounds(440, 50, 110, 20);

        cmb_filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmb_filtro);
        cmb_filtro.setBounds(360, 50, 80, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarMouseClicked
        Producto productos = new Producto();
        productos.setCod_prod(trim(txt_cod_prod.getText()));
        productos.setNom_prod(trim(txt_prod.getText()));
        
    if  (trim(productos.getCod_prod()).equals("") || trim(productos.getNom_prod()).equals("")){
              JOptionPane.showMessageDialog(null, "indique codigo no se puede agregar un producto sin codigo o sin nombre");
              
          }else{
           
        
              if                                  
                      (JOptionPane.showConfirmDialog(null, "Desea agregar el codigo  " + productos.getCod_prod(), "agregar producto",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.OK_OPTION) {     
                  
                        
                          if(txt_pre.getText().equals("")){
                              productos.setPrecio_unitprod(0);
                          }else{
                         productos.setPrecio_unitprod(Integer.parseInt(trim(txt_pre.getText())));
                        } 
                     if(txt_pre.getText().equals("")){
                              productos.setExistencia(0);
                        } else{
                         productos.setExistencia(Integer.parseInt(trim(txt_can.getText())));
                        } 
                           productos.setDesc_prod(trim(txt_desc.getText()));
                  
                                qp.agregarproducto(productos);
                              /*   tbl_productos.removeAll();
                                  tbl_productos.setModel(qp.cargardatos()); */
                                    actualizar();
                                     Limpiar();
    }//GEN-LAST:event_btn_agregarMouseClicked

               Limpiar();
         }  
          } 
                 
    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
        
        Producto productos = new Producto();
         productos.setCod_prod(trim(txt_cod_prod.getText()));  
         if (txt_cod_prod.getText().equals("")) {
                 System.out.println("ingrese un codigo a eliminar");
         } else{ 
        Qproductos query = new Qproductos();
          query.eliminarproducto(productos);
          tbl_productos.removeAll();
          actualizar();
       } 
             
    }//GEN-LAST:event_btn_eliminarMouseClicked

    private void btn_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarMouseClicked
        Producto productos = new Producto();
        productos.setCod_prod(trim(txt_cod_prod.getText()));
        
    if(productos.getCod_prod().equals("")){
              JOptionPane.showMessageDialog(null, "indique codigo no se puede modificar un producto sin codigo");
              
          }else{
              if (JOptionPane.showConfirmDialog(null, "Desea modificar el producto con codigo  " + productos.getCod_prod(), "modificar producto",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.OK_OPTION) {  
                        
                  productos.setNom_prod(trim(txt_prod.getText()));
                     if(txt_pre.getText().equals("")){
                              productos.setPrecio_unitprod(0);
                          }else{
                         productos.setPrecio_unitprod(Integer.parseInt(txt_pre.getText()));
                        } 
                     if(txt_pre.getText().equals("")){
                              productos.setExistencia(0);
                        } else{
                         productos.setExistencia(Integer.parseInt(trim(txt_can.getText())));
                        } 
                         productos.setDesc_prod(trim(txt_desc.getText()));
                  
                    qp.modificarproducto(productos); 
                    actualizar();
                    Limpiar();
                  }
           Limpiar(); 
          }        
    }//GEN-LAST:event_btn_modificarMouseClicked

    private void btn_consultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_consultarMouseClicked
        Producto productos = new Producto();
        productos.setCod_prod(trim(txt_cod_prod.getText()));  
        
        if(productos.getCod_prod().equals("")){
              JOptionPane.showMessageDialog(null, "indique codigo no se puede consultar un producto sin codigo");
        }else{
        Qproductos qp = new Qproductos();
        qp.consultarproducto(productos);
       
        
         } 
    }//GEN-LAST:event_btn_consultarMouseClicked

    private void btn_volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_volverMouseClicked
        ven_principal vp = new ven_principal();
        vp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_volverMouseClicked

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        
                 Producto productos = new Producto();
                 productos.setCod_prod(trim(txt_cod_prod.getText()));
          if  (productos.getCod_prod().equals("")){
              JOptionPane.showMessageDialog(null, "Seleccione o indique codigo del producto a eliminar");
              
          }else{
              if (JOptionPane.showConfirmDialog(null, "Desea eliminar el codigo  " + productos.getCod_prod(), "Eliminar producto",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.OK_OPTION) {
                qp.eliminarproducto(productos.getCod_prod());
                tbl_productos.removeAll();
                
                actualizar();
                Limpiar();
              }
               Limpiar();
          } 

          
             /*
        String tbl_codigo = "";
        try {
            
            tbl_codigo = tbl_productos.getModel().getValueAt(tbl_productos.getSelectedRow(), 0).toString();
        } catch (Exception e) {
            
            if (tbl_productos.getSelectedRow() == -1) {
                tbl_codigo = "";
            }
        }
        if (tbl_codigo.equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccione o indique codigo del Producto a eliminar");
        } else {

            if (JOptionPane.showConfirmDialog(null, "Desea eliminar " + tbl_codigo, "Eliminar Producto",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.OK_OPTION) {
                qp.eliminarproducto(tbl_codigo);
                tbl_productos.removeAll();
                tbl_productos.setModel(qp.cargardatos());
                Limpiar();
            }
        }

      */
          
          
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void tbl_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_productosMouseClicked

        txt_cod_prod.setText(tbl_productos.getModel().getValueAt(tbl_productos.getSelectedRow(), 0).toString());
        txt_prod.setText(tbl_productos.getModel().getValueAt(tbl_productos.getSelectedRow(), 1).toString());
        txt_pre.setText(tbl_productos.getModel().getValueAt(tbl_productos.getSelectedRow(), 2).toString());
        txt_can.setText(tbl_productos.getModel().getValueAt(tbl_productos.getSelectedRow(), 3).toString());
        txt_desc.setText(tbl_productos.getModel().getValueAt(tbl_productos.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_tbl_productosMouseClicked

    private void txt_descActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descActionPerformed

    private void txt_preKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_preKeyTyped
       vali.solonumerospositivos(evt);
       vali.validarlargonumerico(evt,txt_pre,10);
    }//GEN-LAST:event_txt_preKeyTyped

    private void txt_canKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_canKeyTyped
       vali.validarstocknumerico(evt);
       vali.validarlargonumerico(evt,txt_can,5);
    }//GEN-LAST:event_txt_canKeyTyped

    private void txt_cod_prodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cod_prodKeyTyped
        vali.validarlargoalfa(evt,txt_cod_prod,30);
    }//GEN-LAST:event_txt_cod_prodKeyTyped

    private void txt_prodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_prodKeyTyped
        vali.validarlargoalfa(evt, txt_prod,30);
    }//GEN-LAST:event_txt_prodKeyTyped

    private void txt_descKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_descKeyTyped
       vali.validarlargoalfa(evt,txt_desc,30);
    }//GEN-LAST:event_txt_descKeyTyped

    private void btn_limpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limpiarMouseClicked
        Limpiar();
    }//GEN-LAST:event_btn_limpiarMouseClicked

    private void txt_filtroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroKeyReleased
       String buscar = (String) cmb_filtro.getSelectedItem();
       Qproductos qp = new  Qproductos();
       tbl_productos.setModel(qp.buscarDatos(txt_filtro.getText(), buscar));
    }//GEN-LAST:event_txt_filtroKeyReleased

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
            java.util.logging.Logger.getLogger(ven_prod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ven_prod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ven_prod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ven_prod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ven_prod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JComboBox<String> cmb_filtro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_descripcion;
    private javax.swing.JTable tbl_productos;
    private javax.swing.JTextField txt_can;
    private javax.swing.JTextField txt_cod_prod;
    private javax.swing.JTextField txt_desc;
    private javax.swing.JTextField txt_filtro;
    private javax.swing.JTextField txt_pre;
    private javax.swing.JTextField txt_prod;
    // End of variables declaration//GEN-END:variables

    public void Limpiar() {
        txt_can.setText("");
        txt_cod_prod.setText("");
        txt_prod.setText("");
        txt_pre.setText("");
        txt_desc.setText("");
    }

       public void actualizar(){
         DefaultTableModel modelo = new DefaultTableModel();
        Qproductos qp= new Qproductos();
         modelo=qp.cargardatos();
         tbl_productos.setModel(modelo);
    }
    
    
      public DefaultComboBoxModel cargarcmb_filtro(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Codigo de producto");
        modelo.addElement("Nombre de producto");       
        modelo.addElement("Precio");
        modelo.addElement("Cantidad");
        modelo.addElement("Descripcion");
        return modelo;
    }
    
}
