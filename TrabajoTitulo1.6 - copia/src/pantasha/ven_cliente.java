/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantasha;

import clases.Cliente;
import clases.Persona;
import clases.Validar;
import java.util.HashSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.objects.NativeString.trim;
import querys.Qcliente;
import querys.Qpersona;

/**
 *
 * @author Ivan
 */
public class ven_cliente extends javax.swing.JFrame {

    Qcliente qp = new Qcliente();

    Validar vali = new Validar(); 
    
    
    public ven_cliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        tbl_cliente.setModel(qp.cargardatos());
        cmb_cliente.setModel(cargarcmb_filtro());

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
        lbl_rut_cliente = new javax.swing.JLabel();
        lbl_nom_cliente = new javax.swing.JLabel();
        lbl_fono_cliente = new javax.swing.JLabel();
        txt_rut_cliente = new javax.swing.JTextField();
        txt_nom_cliente = new javax.swing.JTextField();
        btn_aceptar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_cliente = new javax.swing.JTable();
        btn_volver = new javax.swing.JButton();
        btn_consultar = new javax.swing.JButton();
        lbl_dir_cliente = new javax.swing.JLabel();
        txt_fono_cliente = new javax.swing.JTextField();
        cmb_cliente = new javax.swing.JComboBox<>();
        txt_dir_cliente = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        txt_cliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));

        jPanel1.setMaximumSize(new java.awt.Dimension(500, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(null);

        lbl_rut_cliente.setText("rut");
        jPanel1.add(lbl_rut_cliente);
        lbl_rut_cliente.setBounds(30, 40, 50, 20);

        lbl_nom_cliente.setText("nombre");
        jPanel1.add(lbl_nom_cliente);
        lbl_nom_cliente.setBounds(30, 80, 50, 20);

        lbl_fono_cliente.setText("fono");
        jPanel1.add(lbl_fono_cliente);
        lbl_fono_cliente.setBounds(30, 136, 50, 14);

        txt_rut_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rut_clienteActionPerformed(evt);
            }
        });
        txt_rut_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_rut_clienteKeyTyped(evt);
            }
        });
        jPanel1.add(txt_rut_cliente);
        txt_rut_cliente.setBounds(110, 40, 210, 30);

        txt_nom_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nom_clienteActionPerformed(evt);
            }
        });
        txt_nom_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nom_clienteKeyTyped(evt);
            }
        });
        jPanel1.add(txt_nom_cliente);
        txt_nom_cliente.setBounds(110, 80, 210, 30);

        btn_aceptar.setText("agregar");
        btn_aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_aceptarMouseClicked(evt);
            }
        });
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_aceptar);
        btn_aceptar.setBounds(20, 240, 71, 23);

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
        btn_eliminar.setBounds(370, 240, 110, 23);

        btn_modificar.setText("modificar");
        btn_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modificarMouseClicked(evt);
            }
        });
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_modificar);
        btn_modificar.setBounds(120, 240, 110, 23);

        tbl_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_clienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_cliente);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 300, 470, 100);

        btn_volver.setText("Volver");
        btn_volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_volverMouseClicked(evt);
            }
        });
        jPanel1.add(btn_volver);
        btn_volver.setBounds(330, 470, 150, 30);

        btn_consultar.setText("consultar");
        btn_consultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_consultarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_consultar);
        btn_consultar.setBounds(240, 240, 80, 23);

        lbl_dir_cliente.setText("direccion");
        jPanel1.add(lbl_dir_cliente);
        lbl_dir_cliente.setBounds(30, 184, 50, 20);

        txt_fono_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fono_clienteActionPerformed(evt);
            }
        });
        txt_fono_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fono_clienteKeyTyped(evt);
            }
        });
        jPanel1.add(txt_fono_cliente);
        txt_fono_cliente.setBounds(110, 130, 210, 30);

        cmb_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmb_cliente);
        cmb_cliente.setBounds(330, 90, 56, 20);

        txt_dir_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dir_clienteKeyTyped(evt);
            }
        });
        jPanel1.add(txt_dir_cliente);
        txt_dir_cliente.setBounds(110, 180, 210, 30);

        btn_limpiar.setText("limpiar");
        btn_limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_limpiarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_limpiar);
        btn_limpiar.setBounds(340, 180, 63, 23);

        txt_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_clienteKeyReleased(evt);
            }
        });
        jPanel1.add(txt_cliente);
        txt_cliente.setBounds(390, 90, 80, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_rut_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rut_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rut_clienteActionPerformed

    private void txt_nom_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nom_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nom_clienteActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed

    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
            Cliente cli = new Cliente();
                 cli.setRut_cliente(trim(txt_rut_cliente.getText()));
          if  (cli.getRut_cliente().equals("")){
              JOptionPane.showMessageDialog(null, "Seleccione o indique codigo del producto a eliminar");       
          }else{
              if (JOptionPane.showConfirmDialog(null, "Desea eliminar el cliente  " + cli.getRut_cliente(), "Eliminar cliente",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.OK_OPTION) {
                qp.eliminarcliente(cli.getRut_cliente());
                tbl_cliente.removeAll();
                actualizar();
                Limpiar();
              }
               Limpiar();
          } 

    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
          
          Cliente cli = new Cliente();
         cli.setRut_cliente(trim(txt_rut_cliente.getText()));  
         if (txt_rut_cliente.getText().equals("")) {
                 System.out.println("ingrese un  rut a eliminar");
         } else{ 
       
          qp.eliminarcliente(cli);
          tbl_cliente.removeAll();
          actualizar();
       } 
    }//GEN-LAST:event_btn_eliminarMouseClicked

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed

    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarMouseClicked
        Cliente cli = new Cliente();
        cli.setRut_cliente(trim(txt_rut_cliente.getText()));

        if (cli.getRut_cliente().equals("")) {
            JOptionPane.showMessageDialog(null, "indique rut no se puede modificar un cliente sin rut");

        } else {
            if (JOptionPane.showConfirmDialog(null, "Desea modificar el producto con codigo  " + cli.getRut_cliente(), "modificar cliente",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.OK_OPTION) {
                // PUEDE QUE SE TENGA QUE VALIDAR CUANDO EL FONO O LA DIR ES VACIA ASIGNAR NULL HAY QUE PROBAR
                cli.setNom_cliente(trim(txt_nom_cliente.getText()));
                cli.setFono_cliente(trim(txt_fono_cliente.getText()));
                cli.setDir_cliente(txt_dir_cliente.getText());
                qp.modificarcliente(cli);
                actualizar();
                Limpiar();
            }
            Limpiar();
        }
    }//GEN-LAST:event_btn_modificarMouseClicked

    private void btn_volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_volverMouseClicked
        ven_principal vp = new ven_principal();
        vp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_volverMouseClicked

    private void tbl_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_clienteMouseClicked
        txt_rut_cliente.setText(tbl_cliente.getModel().getValueAt(tbl_cliente.getSelectedRow(), 0).toString());
        txt_nom_cliente.setText(tbl_cliente.getModel().getValueAt(tbl_cliente.getSelectedRow(), 1).toString());
        txt_fono_cliente.setText(tbl_cliente.getModel().getValueAt(tbl_cliente.getSelectedRow(), 2).toString());
        txt_dir_cliente.setText(tbl_cliente.getModel().getValueAt(tbl_cliente.getSelectedRow(), 3).toString());
        
    }//GEN-LAST:event_tbl_clienteMouseClicked

    private void txt_fono_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fono_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fono_clienteActionPerformed

    private void txt_clienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_clienteKeyReleased
        String buscar = (String) cmb_cliente.getSelectedItem();
        tbl_cliente.setModel(qp.buscarDatos(txt_cliente.getText(), buscar));
    }//GEN-LAST:event_txt_clienteKeyReleased

    private void btn_aceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_aceptarMouseClicked
        Cliente cli = new Cliente();
        cli.setRut_cliente(trim(txt_rut_cliente.getText()));
        cli.setNom_cliente(trim(txt_nom_cliente.getText()));
        
        
        
        vali.validarRut(cli.getRut_cliente());
        if ( vali.validarRut(cli.getRut_cliente())== false){
              JOptionPane.showMessageDialog(null, "rut ingresado no valido");
        }
         
             
        else if (cli.getRut_cliente().length() < 9) {
             JOptionPane.showMessageDialog(null, "rut no valido, reingrese");
        } else {
              
            if (JOptionPane.showConfirmDialog(null, "Desea agregar el cliente de rut  " + cli.getRut_cliente(), "agregar cliente",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.OK_OPTION) {

                cli.setFono_cliente(txt_fono_cliente.getText());
                cli.setDir_cliente(txt_dir_cliente.getText());
                qp.agregarcliente(cli);
                actualizar();
                Limpiar();
            }

            Limpiar();
        }
    }//GEN-LAST:event_btn_aceptarMouseClicked

    private void btn_consultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_consultarMouseClicked
        Cliente cli = new Cliente();
        cli.setRut_cliente(trim(txt_rut_cliente.getText()));  
        
        if(cli.getRut_cliente().equals("")){
              JOptionPane.showMessageDialog(null, "indique rut no se puede consultar un cliente sin rut");
        }else{
       
        qp.consultarcliente(cli);
         } 
                                      
    }//GEN-LAST:event_btn_consultarMouseClicked

    private void btn_limpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limpiarMouseClicked
        Limpiar();
    }//GEN-LAST:event_btn_limpiarMouseClicked

    private void txt_rut_clienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rut_clienteKeyTyped
        // TODO add your handling code here:
          vali.validarlargoalfa(evt,txt_rut_cliente,10);
    }//GEN-LAST:event_txt_rut_clienteKeyTyped

    private void txt_nom_clienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nom_clienteKeyTyped
        // TODO add your handling code here:
          vali.validarlargoalfa(evt,txt_nom_cliente,40);
    }//GEN-LAST:event_txt_nom_clienteKeyTyped

    private void txt_fono_clienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fono_clienteKeyTyped
         vali.validarlargoalfa(evt,txt_fono_cliente,12);
    }//GEN-LAST:event_txt_fono_clienteKeyTyped

    private void txt_dir_clienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dir_clienteKeyTyped
        // TODO add your handling code here:
         vali.validarlargoalfa(evt,txt_dir_cliente,30);
    }//GEN-LAST:event_txt_dir_clienteKeyTyped

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
            java.util.logging.Logger.getLogger(ven_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ven_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ven_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ven_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ven_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JComboBox<String> cmb_cliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_dir_cliente;
    private javax.swing.JLabel lbl_fono_cliente;
    private javax.swing.JLabel lbl_nom_cliente;
    private javax.swing.JLabel lbl_rut_cliente;
    private javax.swing.JTable tbl_cliente;
    private javax.swing.JTextField txt_cliente;
    private javax.swing.JTextField txt_dir_cliente;
    private javax.swing.JTextField txt_fono_cliente;
    private javax.swing.JTextField txt_nom_cliente;
    private javax.swing.JTextField txt_rut_cliente;
    // End of variables declaration//GEN-END:variables

    public void Limpiar() {
        txt_rut_cliente.setText("");
        txt_nom_cliente.setText("");
        txt_fono_cliente.setText("");
        txt_dir_cliente.setText("");
    }

    public void actualizar() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = qp.cargardatos();
        tbl_cliente.setModel(modelo);
    }

    public DefaultComboBoxModel cargarcmb_filtro() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Rut de cliente");
        modelo.addElement("Nombre de cliente");
        modelo.addElement("Fono de cliente");
        modelo.addElement("Direccion de cliente");
        return modelo;
    }

}
