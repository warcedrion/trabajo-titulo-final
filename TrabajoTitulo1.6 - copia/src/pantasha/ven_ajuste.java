/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantasha;

import clases.Ajuste;
import clases.Validar;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;   
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.objects.NativeString.trim;
import querys.Qajuste;

//RECORDAR QUE HAY QUE CASTEAR LAS FECHAS ----------------------111!!!!!
public class ven_ajuste extends javax.swing.JFrame {

    Qajuste qaj = new Qajuste();
    Validar vali = new Validar();
    Ajuste ajuste = new Ajuste();

    public ven_ajuste() {
        initComponents();
        this.setLocationRelativeTo(null);
        tbl_ajuste.setModel(qaj.cargardatos());
        cmb_ajuste.setModel(cargarcmb_filtro());

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
        lbl_ajuste = new javax.swing.JLabel();
        txt_cod_ajuste = new javax.swing.JTextField();
        lbl_cod_prod = new javax.swing.JLabel();
        txt_cod_prod = new javax.swing.JTextField();
        lbl_tipo_ajuste = new javax.swing.JLabel();
        txt_tipo_ajuste = new javax.swing.JTextField();
        lbl_cantidad_ajuste = new javax.swing.JLabel();
        txt_cantidad_ajuste = new javax.swing.JTextField();
        lbl_fecha_ajuste = new javax.swing.JLabel();
        txt_fecha_ajuste = new javax.swing.JTextField();
        lbl_comentario = new javax.swing.JLabel();
        txt_comentario = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        btn_consultar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_ajuste = new javax.swing.JTable();
        cmb_ajuste = new javax.swing.JComboBox<>();
        txt_filtro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 700));
        setMinimumSize(new java.awt.Dimension(800, 700));

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 700));

        lbl_ajuste.setText("codigo de ajuste");

        lbl_cod_prod.setText("codigo del producto");

        lbl_tipo_ajuste.setText("tipo de ajuste");

        lbl_cantidad_ajuste.setText("cantidad de ajuste");

        lbl_fecha_ajuste.setText("fecha de ajuste");

        txt_fecha_ajuste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fecha_ajusteActionPerformed(evt);
            }
        });

        lbl_comentario.setText("comentario");

        btn_limpiar.setText("Limpiar");

        btn_agregar.setText("agregar");
        btn_agregar.setMaximumSize(new java.awt.Dimension(100, 25));
        btn_agregar.setMinimumSize(new java.awt.Dimension(100, 25));
        btn_agregar.setPreferredSize(new java.awt.Dimension(100, 25));
        btn_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarMouseClicked(evt);
            }
        });

        btn_consultar.setText("consultar");
        btn_consultar.setMaximumSize(new java.awt.Dimension(100, 25));
        btn_consultar.setMinimumSize(new java.awt.Dimension(100, 25));
        btn_consultar.setPreferredSize(new java.awt.Dimension(100, 25));
        btn_consultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_consultarMouseClicked(evt);
            }
        });

        btn_modificar.setText("modificar");
        btn_modificar.setMaximumSize(new java.awt.Dimension(100, 25));
        btn_modificar.setMinimumSize(new java.awt.Dimension(100, 25));
        btn_modificar.setPreferredSize(new java.awt.Dimension(100, 25));
        btn_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modificarMouseClicked(evt);
            }
        });

        btn_volver.setText("volver");
        btn_volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_volverMouseClicked(evt);
            }
        });

        btn_eliminar.setText("eliminar");
        btn_eliminar.setMaximumSize(new java.awt.Dimension(100, 25));
        btn_eliminar.setMinimumSize(new java.awt.Dimension(100, 25));
        btn_eliminar.setPreferredSize(new java.awt.Dimension(100, 25));
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

        tbl_ajuste.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_ajuste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ajusteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_ajuste);

        cmb_ajuste.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ajuste, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_cantidad_ajuste, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_cod_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_tipo_ajuste, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(149, 149, 149)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_cod_ajuste, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                .addComponent(txt_tipo_ajuste)
                                .addComponent(txt_cantidad_ajuste))
                            .addComponent(txt_cod_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addComponent(cmb_ajuste, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_fecha_ajuste, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_comentario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_comentario, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_limpiar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_fecha_ajuste, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_ajuste, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cod_ajuste, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_cod_prod, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_tipo_ajuste, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tipo_ajuste, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_ajuste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cod_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cantidad_ajuste, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cantidad_ajuste, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbl_fecha_ajuste, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txt_fecha_ajuste, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_comentario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_comentario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiar))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btn_volver)
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_fecha_ajusteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fecha_ajusteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fecha_ajusteActionPerformed

    private void btn_volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_volverMouseClicked
        ven_principal vp = new ven_principal();
        vp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_volverMouseClicked

    private void btn_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarMouseClicked
        // puede que en las  2 lineas de abajo este el error que no tome ambos codigos
     //   ajuste.setCod_ajuste(Integer.parseInt(txt_cod_ajuste.getText()));
        ajuste.setCod_prod(txt_cod_prod.getText());

        if /*(trim(ajuste.getCod_ajuste()).equals("") ||*/ (trim(ajuste.getCod_prod()).equals("")) {
            JOptionPane.showMessageDialog(null, "indique codigo no se puede agregar un ajuste sin codigos");

        } else {

            if (JOptionPane.showConfirmDialog(null, "Desea agregar el codigo  " + ajuste.getCod_ajuste() + "\n" + ajuste.getCod_prod(),
                    "agregar ajuste",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.OK_OPTION) {

                 ajuste.setTipo_ajuste(txt_tipo_ajuste.getText());
                
                if (txt_cantidad_ajuste.getText().equals("")) {
                    ajuste.setCant_ajuste(0);
                } else {
                    ajuste.setCant_ajuste(Integer.parseInt(txt_cantidad_ajuste.getText()));
                }

                ajuste.setFecha_ajuste(txt_fecha_ajuste.getText());

                ajuste.setComentario(txt_comentario.getText());
                try {
                    qaj.agregarajuste(ajuste);
                } catch (ParseException ex) {
                    Logger.getLogger(ven_ajuste.class.getName()).log(Level.SEVERE, null, ex);
                }

                actualizar();
                Limpiar();
            }

            Limpiar();
        }

    }//GEN-LAST:event_btn_agregarMouseClicked

    private void tbl_ajusteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ajusteMouseClicked
        txt_cod_ajuste.setText(tbl_ajuste.getModel().getValueAt(tbl_ajuste.getSelectedRow(), 0).toString());
        txt_cod_prod.setText(tbl_ajuste.getModel().getValueAt(tbl_ajuste.getSelectedRow(), 1).toString());
        txt_tipo_ajuste.setText(tbl_ajuste.getModel().getValueAt(tbl_ajuste.getSelectedRow(), 2).toString());
        txt_cantidad_ajuste.setText(tbl_ajuste.getModel().getValueAt(tbl_ajuste.getSelectedRow(), 3).toString());
        txt_fecha_ajuste.setText(tbl_ajuste.getModel().getValueAt(tbl_ajuste.getSelectedRow(), 4).toString());
        txt_comentario.setText(tbl_ajuste.getModel().getValueAt(tbl_ajuste.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_tbl_ajusteMouseClicked

    private void btn_consultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_consultarMouseClicked

        ajuste.setCod_ajuste(Integer.parseInt(txt_cod_ajuste.getText()));
        ajuste.setCod_prod(txt_cod_prod.getText());
        if (trim(ajuste.getCod_ajuste()).equals("") || trim(ajuste.getCod_prod()).equals("")) {
            JOptionPane.showMessageDialog(null, "indique codigo no se puede puede mostrar un ajuste sin codigos");
        } else {
            qaj.consultarajuste(ajuste);
        }


    }//GEN-LAST:event_btn_consultarMouseClicked

    private void btn_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarMouseClicked

        ajuste.setCod_ajuste(Integer.parseInt(txt_cod_ajuste.getText()));
        ajuste.setCod_prod(txt_cod_prod.getText());

        if (trim(ajuste.getCod_ajuste()).equals("") || trim(ajuste.getCod_prod()).equals("")) {
            JOptionPane.showMessageDialog(null, "indique codigo no se puede puede mostrar un ajuste sin codigos");

        } else {
            if (JOptionPane.showConfirmDialog(null, "Desea modificar el ajuste con codigo  " + ajuste.getCod_ajuste() + "\n" + ajuste.getCod_prod(),
                    "modificar ajuste",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.OK_OPTION) {

                ajuste.setTipo_ajuste((txt_tipo_ajuste.getText()));
                if (txt_cantidad_ajuste.getText().equals("")) {
                    ajuste.setCant_ajuste(0);
                } else {
                    ajuste.setCant_ajuste(Integer.parseInt(txt_cantidad_ajuste.getText()));
                }

                ajuste.setFecha_ajuste(txt_fecha_ajuste.getText());

                ajuste.setComentario(txt_comentario.getText());

                qaj.modificarajuste(ajuste);

                actualizar();
                Limpiar();
            }
            Limpiar();
        }
    }//GEN-LAST:event_btn_modificarMouseClicked

    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
        ajuste.setCod_ajuste(Integer.parseInt(txt_cod_ajuste.getText()));
        ajuste.setCod_prod(txt_cod_prod.getText());
        if (trim(ajuste.getCod_ajuste()).equals("") || trim(ajuste.getCod_prod()).equals("")) {
            JOptionPane.showMessageDialog(null, "ingrese codigo del ajuste a eliminar");
        } else {

            qaj.eliminarajuste(ajuste);
            tbl_ajuste.removeAll();
            actualizar();
        }


    }//GEN-LAST:event_btn_eliminarMouseClicked

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        ajuste.setCod_ajuste(Integer.parseInt(txt_cod_ajuste.getText()));
        ajuste.setCod_prod(txt_cod_prod.getText());
        if (trim(ajuste.getCod_ajuste()).equals("") || trim(ajuste.getCod_prod()).equals("")) {
            JOptionPane.showMessageDialog(null, "ingrese codigo del ajuste a eliminar");
        } else {
            if (JOptionPane.showConfirmDialog(null, "Desea eliminar el ajuste con codigo  " + ajuste.getCod_ajuste() + "\n" + ajuste.getCod_prod(),
                    "eliminar ajuste",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.OK_OPTION) {
                qaj.eliminarajuste(Integer.parseInt(txt_cod_ajuste.getText()), ajuste.getCod_prod());
                tbl_ajuste.removeAll();

                actualizar();
                Limpiar();
            }
            Limpiar();
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(ven_ajuste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ven_ajuste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ven_ajuste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ven_ajuste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ven_ajuste().setVisible(true);
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
    private javax.swing.JComboBox<String> cmb_ajuste;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_ajuste;
    private javax.swing.JLabel lbl_cantidad_ajuste;
    private javax.swing.JLabel lbl_cod_prod;
    private javax.swing.JLabel lbl_comentario;
    private javax.swing.JLabel lbl_fecha_ajuste;
    private javax.swing.JLabel lbl_tipo_ajuste;
    private javax.swing.JTable tbl_ajuste;
    private javax.swing.JTextField txt_cantidad_ajuste;
    private javax.swing.JTextField txt_cod_ajuste;
    private javax.swing.JTextField txt_cod_prod;
    private javax.swing.JTextField txt_comentario;
    private javax.swing.JTextField txt_fecha_ajuste;
    private javax.swing.JTextField txt_filtro;
    private javax.swing.JTextField txt_tipo_ajuste;
    // End of variables declaration//GEN-END:variables

    public void Limpiar() {
        txt_cod_ajuste.setText("");
        txt_cod_prod.setText("");
        txt_tipo_ajuste.setText("");
        txt_cantidad_ajuste.setText("");
        txt_fecha_ajuste.setText("");
        txt_comentario.setText("");
    }

    public void actualizar() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = qaj.cargardatos();
        tbl_ajuste.setModel(modelo);
        cmb_ajuste.setModel(cargarcmb_filtro());
    }

    public DefaultComboBoxModel cargarcmb_filtro() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Codigo de ajuste");
        modelo.addElement("Codigo de producto");
        modelo.addElement("Tipo de ajuste");
        modelo.addElement("Cantidad de ajuste");
        modelo.addElement("Fecha de ajuste");
        modelo.addElement("Comentario");
        return modelo;
    }

}