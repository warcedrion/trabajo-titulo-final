/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantasha;

import clases.Validar;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Ivan
 */
public class ven_principal extends javax.swing.JFrame {

    /**
     * Creates new form ven_inicio
     */
    public ven_principal() {
        initComponents();
        this.setLocationRelativeTo(null);
             }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btn_manusu = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        btn_manper = new javax.swing.JButton();
        btn_manpro = new javax.swing.JButton();
        btn_ajustes = new javax.swing.JButton();
        btn_proveedores = new javax.swing.JButton();
        btn_ciudad = new javax.swing.JButton();
        btn_cargo = new javax.swing.JButton();
        btn_ventas = new javax.swing.JButton();
        btn_pedidos = new javax.swing.JButton();
        btn_factura = new javax.swing.JButton();
        btn_eliminarventas = new javax.swing.JButton();
        btn_producto_mas_ven = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        jPanel2.setMaximumSize(new java.awt.Dimension(600, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(600, 600));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel2.setLayout(null);

        btn_manusu.setText("Mantenedor de usuarios");
        btn_manusu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_manusuMouseClicked(evt);
            }
        });
        jPanel2.add(btn_manusu);
        btn_manusu.setBounds(20, 149, 180, 40);

        btn_exit.setText("Cerrar Sesion");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        jPanel2.add(btn_exit);
        btn_exit.setBounds(460, 410, 105, 40);

        btn_manper.setText("Mantenedor de clientes");
        btn_manper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_manperMouseClicked(evt);
            }
        });
        jPanel2.add(btn_manper);
        btn_manper.setBounds(20, 80, 180, 40);

        btn_manpro.setText("Mantenedor de productos");
        btn_manpro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_manproMouseClicked(evt);
            }
        });
        btn_manpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manproActionPerformed(evt);
            }
        });
        jPanel2.add(btn_manpro);
        btn_manpro.setBounds(20, 20, 180, 40);

        btn_ajustes.setText("Mantendor de ajustes");
        btn_ajustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ajustesMouseClicked(evt);
            }
        });
        jPanel2.add(btn_ajustes);
        btn_ajustes.setBounds(20, 210, 180, 40);

        btn_proveedores.setText("Mantenedor de proveedores");
        btn_proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_proveedoresMouseClicked(evt);
            }
        });
        jPanel2.add(btn_proveedores);
        btn_proveedores.setBounds(20, 270, 180, 40);

        btn_ciudad.setText("Mantenedor ciudad");
        btn_ciudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ciudadMouseClicked(evt);
            }
        });
        btn_ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ciudadActionPerformed(evt);
            }
        });
        jPanel2.add(btn_ciudad);
        btn_ciudad.setBounds(20, 330, 180, 40);

        btn_cargo.setText("Cargo");
        btn_cargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cargoMouseClicked(evt);
            }
        });
        jPanel2.add(btn_cargo);
        btn_cargo.setBounds(270, 20, 180, 40);

        btn_ventas.setText("Mantenedor ventas");
        btn_ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ventasMouseClicked(evt);
            }
        });
        jPanel2.add(btn_ventas);
        btn_ventas.setBounds(270, 80, 180, 40);

        btn_pedidos.setText("Mantenedor pedido");
        btn_pedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pedidosMouseClicked(evt);
            }
        });
        jPanel2.add(btn_pedidos);
        btn_pedidos.setBounds(270, 150, 180, 40);

        btn_factura.setText("Mantenedor factura");
        btn_factura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_facturaMouseClicked(evt);
            }
        });
        jPanel2.add(btn_factura);
        btn_factura.setBounds(270, 210, 180, 40);

        btn_eliminarventas.setText("Eliminar ventas anteriores");
        btn_eliminarventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarventasMouseClicked(evt);
            }
        });
        jPanel2.add(btn_eliminarventas);
        btn_eliminarventas.setBounds(270, 270, 180, 40);

        btn_producto_mas_ven.setText("Producto mas vendido");
        btn_producto_mas_ven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_producto_mas_venMouseClicked(evt);
            }
        });
        jPanel2.add(btn_producto_mas_ven);
        btn_producto_mas_ven.setBounds(270, 330, 180, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 580, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_manproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manproActionPerformed
        
    }//GEN-LAST:event_btn_manproActionPerformed

    private void btn_manperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_manperMouseClicked
        ven_cliente vper = new ven_cliente();
        vper.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_manperMouseClicked

    private void btn_manproMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_manproMouseClicked
        ven_prod vp = new ven_prod();
        vp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_manproMouseClicked

    private void btn_manusuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_manusuMouseClicked
        ven_usuario vu = new ven_usuario();
        vu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_manusuMouseClicked

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        inicio i = new inicio();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_ajustesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ajustesMouseClicked
        ven_ajuste ajuste =new ven_ajuste();
        ajuste.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ajustesMouseClicked

    private void btn_proveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_proveedoresMouseClicked
        ven_proveedor proveedor = new ven_proveedor();
        proveedor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_proveedoresMouseClicked

    private void btn_ciudadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ciudadMouseClicked
       ven_ciudad ciudad = new ven_ciudad();
       ciudad.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btn_ciudadMouseClicked

    private void btn_ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ciudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ciudadActionPerformed

    private void btn_cargoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cargoMouseClicked
       ven_cargo vc = new ven_cargo();
       vc.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btn_cargoMouseClicked

    private void btn_ventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ventasMouseClicked
     ven_mantenedor_ventas vmv = new ven_mantenedor_ventas();
     vmv.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_btn_ventasMouseClicked

    private void btn_pedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pedidosMouseClicked
     ven_mantenedor_pedido vmp = new ven_mantenedor_pedido();
     vmp.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_btn_pedidosMouseClicked

    private void btn_facturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_facturaMouseClicked
      ven_mantenedor_factura vmf = new ven_mantenedor_factura();
      vmf.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btn_facturaMouseClicked

    private void btn_eliminarventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarventasMouseClicked
        try {
            ven_eliminar_ventas_antiguas veva = new ven_eliminar_ventas_antiguas();
            veva.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(ven_principal.class.getName()).log(Level.SEVERE, null, ex);
        }
     
       this.dispose();
    }//GEN-LAST:event_btn_eliminarventasMouseClicked

    private void btn_producto_mas_venMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_producto_mas_venMouseClicked
    ven_productos_masVendidos vpmv = new ven_productos_masVendidos();
    vpmv.setVisible(true);
    this.dispose();
        
    }//GEN-LAST:event_btn_producto_mas_venMouseClicked

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
            java.util.logging.Logger.getLogger(ven_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ven_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ven_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ven_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ven_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ajustes;
    private javax.swing.JButton btn_cargo;
    private javax.swing.JButton btn_ciudad;
    private javax.swing.JButton btn_eliminarventas;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_factura;
    private javax.swing.JButton btn_manper;
    private javax.swing.JButton btn_manpro;
    private javax.swing.JButton btn_manusu;
    private javax.swing.JButton btn_pedidos;
    private javax.swing.JButton btn_producto_mas_ven;
    private javax.swing.JButton btn_proveedores;
    private javax.swing.JButton btn_ventas;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
