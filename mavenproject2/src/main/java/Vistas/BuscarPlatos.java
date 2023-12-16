/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.sql.Connection;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Platos;
import modelo.General;
import util.SQLConexion;

/**
 *
 * @author ACER
 */
public class BuscarPlatos extends javax.swing.JFrame {

    Connection cn;
    public BuscarPlatos() {
        initComponents();
        SQLConexion con = new SQLConexion();
        cn = con.getConexion();
        iniciar();
    }

    private void Limpiar(JTable tablas) {
        while (tablas.getRowCount() > 0) {
            ((DefaultTableModel) tablas.getModel()).removeRow(0);
        }
    }
    
    private void iniciar() {
        Limpiar(tabPla);
        DefaultTableModel modelo1 = (DefaultTableModel) tabPla.getModel();
        Platos p = new Platos();
        p.LLenarDatos(modelo1);
    }
    private void BuscarPlatos(String buscar) {
        Limpiar(tabPla);
        DefaultTableModel modelo1 = (DefaultTableModel) tabPla.getModel();
        Platos p = new Platos();
        p.BuscarDatosPla(modelo1, buscar);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtbuscarP = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        AgreP = new javax.swing.JButton();
        btnNuevoPla = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabPla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("BUSCAR PLATOS: ");

        txtbuscarP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarPKeyReleased(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/reload (1).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        AgreP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/siguiente (1).png"))); // NOI18N
        AgreP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgrePActionPerformed(evt);
            }
        });

        btnNuevoPla.setText("Registrar Platos");
        btnNuevoPla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPlaActionPerformed(evt);
            }
        });

        tabPla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "PRECIO", "DISPONIBILIDAD"
            }
        ));
        jScrollPane1.setViewportView(tabPla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AgreP, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevoPla)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevoPla)
                    .addComponent(AgreP)
                    .addComponent(jButton1)
                    .addComponent(txtbuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbuscarPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarPKeyReleased
        BuscarPlatos(txtbuscarP.getText());
    }//GEN-LAST:event_txtbuscarPKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        iniciar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AgrePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgrePActionPerformed
        Platos plato = General.plat;
        DefaultTableModel modelo = (DefaultTableModel) tabPla.getModel();
        plato.setId(modelo.getValueAt(tabPla.getSelectedRow(), 0).toString());
        plato.setNombre(modelo.getValueAt(tabPla.getSelectedRow(), 1).toString());
        plato.setPrecio(modelo.getValueAt(tabPla.getSelectedRow(), 2).toString());
        plato.setDisponibilidad(modelo.getValueAt(tabPla.getSelectedRow(), 3).toString());
        

        this.dispose();

    }//GEN-LAST:event_AgrePActionPerformed

    private void btnNuevoPlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPlaActionPerformed

        new FrmPlatos().setVisible(true); // Muestra el nuevo formulario
    }//GEN-LAST:event_btnNuevoPlaActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarPlatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarPlatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarPlatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarPlatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarPlatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgreP;
    private javax.swing.JButton btnNuevoPla;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabPla;
    private javax.swing.JTextField txtbuscarP;
    // End of variables declaration//GEN-END:variables
}
