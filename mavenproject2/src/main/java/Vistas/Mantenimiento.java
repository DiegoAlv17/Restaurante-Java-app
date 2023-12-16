/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import util.SQLConexion;
public class Mantenimiento extends javax.swing.JFrame {
    Connection cn;

    public Mantenimiento() {
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
        Limpiar(TabcliM);
        DefaultTableModel modelo = (DefaultTableModel) TabcliM.getModel();
        Cliente e = new Cliente();
        e.LLenarDatosCli(modelo);
        
        Limpiar(tabMeseM);
        DefaultTableModel modelom = (DefaultTableModel) tabMeseM.getModel();
        Mesero m = new Mesero();
        m.LLenarDatosMese(modelom);
        
        Limpiar(TablePlatosM);
        DefaultTableModel modelop = (DefaultTableModel) TablePlatosM.getModel();
        Platos p = new Platos();
        p.LLenarDatos(modelop);
        
        Limpiar(tabMesaM);
        DefaultTableModel modelos = (DefaultTableModel)tabMesaM.getModel();
        Mesa s = new Mesa();
        s.LLenarDatosMesa(modelos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabMesaM = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txtIdmesaM = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtComensalesM = new javax.swing.JTextField();
        txtUbicacionM = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnLimpiar2 = new javax.swing.JButton();
        btnRegistrar2 = new javax.swing.JButton();
        btnActualizar2 = new javax.swing.JButton();
        btnEliminar2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablePlatosM = new javax.swing.JTable();
        txtIdplatoM = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNombreplatoM = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPrecioM = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbxDispoM = new javax.swing.JComboBox<>();
        btnLimpiar1 = new javax.swing.JButton();
        btnRegistrar1 = new javax.swing.JButton();
        btnActualizar1 = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabcliM = new javax.swing.JTable();
        txtCodigoM = new javax.swing.JTextField();
        txtNombreclienteM = new javax.swing.JTextField();
        txtApellidoclienteM = new javax.swing.JTextField();
        txtDniM = new javax.swing.JTextField();
        btnLimpiarM = new javax.swing.JButton();
        btnRegistrarM = new javax.swing.JButton();
        btnActualizarM = new javax.swing.JButton();
        btnEliminarM = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabMeseM = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtIdmeseroM = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtnombremeseroM = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtfecingreM = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 204, 204));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        tabMesaM.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.red));
        tabMesaM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "MAX COMENSALES", "UBICACION"
            }
        ));
        tabMesaM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMesaMMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabMesaM);

        jLabel12.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel12.setText("Id:");

        txtIdmesaM.setEditable(false);
        txtIdmesaM.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel13.setText("Comensales:");

        txtComensalesM.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtUbicacionM.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel14.setText("Ubicación");

        btnLimpiar2.setBackground(new java.awt.Color(51, 255, 51));
        btnLimpiar2.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        btnLimpiar2.setText("Limpiar");
        btnLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar2ActionPerformed(evt);
            }
        });

        btnRegistrar2.setBackground(new java.awt.Color(51, 255, 51));
        btnRegistrar2.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        btnRegistrar2.setText("Registrar");
        btnRegistrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar2ActionPerformed(evt);
            }
        });

        btnActualizar2.setBackground(new java.awt.Color(51, 255, 51));
        btnActualizar2.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        btnActualizar2.setText("Actualizar");
        btnActualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar2ActionPerformed(evt);
            }
        });

        btnEliminar2.setBackground(new java.awt.Color(51, 255, 51));
        btnEliminar2.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        btnEliminar2.setText("Eliminar");
        btnEliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUbicacionM, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComensalesM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdmesaM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(btnLimpiar2)
                .addGap(39, 39, 39)
                .addComponent(btnRegistrar2)
                .addGap(48, 48, 48)
                .addComponent(btnActualizar2)
                .addGap(45, 45, 45)
                .addComponent(btnEliminar2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtIdmesaM))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtComensalesM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtUbicacionM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar2)
                    .addComponent(btnRegistrar2)
                    .addComponent(btnActualizar2)
                    .addComponent(btnEliminar2))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mesa", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        TablePlatosM.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.red));
        TablePlatosM.setModel(new javax.swing.table.DefaultTableModel(
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
        TablePlatosM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePlatosMMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TablePlatosM);

        txtIdplatoM.setEditable(false);
        txtIdplatoM.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel8.setText("Id:");

        txtNombreplatoM.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNombreplatoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreplatoMActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel9.setText("Nombre:");

        txtPrecioM.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtPrecioM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioMActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel10.setText("Precio:");

        jLabel11.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel11.setText("Disponibilidad:");

        cbxDispoM.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbxDispoM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));

        btnLimpiar1.setBackground(new java.awt.Color(255, 153, 0));
        btnLimpiar1.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        btnLimpiar1.setText("Limpiar");
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });

        btnRegistrar1.setBackground(new java.awt.Color(255, 153, 0));
        btnRegistrar1.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        btnRegistrar1.setText("Registrar");
        btnRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar1ActionPerformed(evt);
            }
        });

        btnActualizar1.setBackground(new java.awt.Color(255, 153, 0));
        btnActualizar1.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        btnActualizar1.setText("Actualizar");
        btnActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar1ActionPerformed(evt);
            }
        });

        btnEliminar1.setBackground(new java.awt.Color(255, 153, 0));
        btnEliminar1.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        btnEliminar1.setText("Eliminar");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxDispoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreplatoM, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioM, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdplatoM, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnLimpiar1)
                .addGap(92, 92, 92)
                .addComponent(btnRegistrar1)
                .addGap(91, 91, 91)
                .addComponent(btnActualizar1)
                .addGap(94, 94, 94)
                .addComponent(btnEliminar1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtIdplatoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtNombreplatoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtPrecioM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cbxDispoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar1)
                    .addComponent(btnRegistrar1)
                    .addComponent(btnActualizar1)
                    .addComponent(btnEliminar1))
                .addGap(35, 35, 35))
        );

        jTabbedPane1.addTab("Platos", jPanel4);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel1.setText("Codigo:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel4.setText("Dni:");

        TabcliM.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.red));
        TabcliM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO", "NOMBRE", "APELLIDO", "DNI"
            }
        ));
        TabcliM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabcliMMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabcliM);

        txtCodigoM.setEditable(false);
        txtCodigoM.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtNombreclienteM.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtApellidoclienteM.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtDniM.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        btnLimpiarM.setBackground(new java.awt.Color(255, 102, 102));
        btnLimpiarM.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        btnLimpiarM.setText("Limpiar");
        btnLimpiarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarMActionPerformed(evt);
            }
        });

        btnRegistrarM.setBackground(new java.awt.Color(255, 102, 102));
        btnRegistrarM.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        btnRegistrarM.setText("Registrar");
        btnRegistrarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarMActionPerformed(evt);
            }
        });

        btnActualizarM.setBackground(new java.awt.Color(255, 102, 102));
        btnActualizarM.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        btnActualizarM.setText("Actualizar");
        btnActualizarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarMActionPerformed(evt);
            }
        });

        btnEliminarM.setBackground(new java.awt.Color(255, 102, 102));
        btnEliminarM.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        btnEliminarM.setText("Eliminar");
        btnEliminarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLimpiarM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrarM))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(78, 78, 78)
                        .addComponent(txtDniM))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(34, 34, 34)
                        .addComponent(txtApellidoclienteM))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addComponent(txtNombreclienteM))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                        .addComponent(txtCodigoM, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnActualizarM)
                        .addGap(105, 105, 105)
                        .addComponent(btnEliminarM)))
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCodigoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombreclienteM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtApellidoclienteM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDniM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiarM)
                    .addComponent(btnRegistrarM)
                    .addComponent(btnActualizarM)
                    .addComponent(btnEliminarM))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cliente", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        tabMeseM.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.red, java.awt.Color.pink));
        tabMeseM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "FECHA DE INGRESO"
            }
        ));
        tabMeseM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMeseMMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabMeseM);

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel5.setText("Id:");

        txtIdmeseroM.setEditable(false);
        txtIdmeseroM.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel6.setText("Nombre:");

        txtnombremeseroM.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel7.setText("Fecha de Ingreso:");

        txtfecingreM.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        btnActualizar.setBackground(new java.awt.Color(102, 102, 255));
        btnActualizar.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(102, 102, 255));
        btnEliminar.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(102, 102, 255));
        btnLimpiar.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(102, 102, 255));
        btnRegistrar.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(85, 85, 85)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombremeseroM)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtIdmeseroM, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfecingreM)))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnLimpiar)
                .addGap(97, 97, 97)
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addGap(104, 104, 104)
                .addComponent(btnEliminar)
                .addGap(57, 57, 57))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtIdmeseroM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtnombremeseroM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtfecingreM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnEliminar)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mesero", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TabcliMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabcliMMouseClicked
        DefaultTableModel modelo=(DefaultTableModel) TabcliM.getModel();
        txtCodigoM.setText(modelo.getValueAt(TabcliM.getSelectedRow(), 0)+" ");
        txtNombreclienteM.setText(modelo.getValueAt(TabcliM.getSelectedRow(), 1)+" ");
        txtApellidoclienteM.setText(modelo.getValueAt(TabcliM.getSelectedRow(), 2)+" ");
        txtDniM.setText(modelo.getValueAt(TabcliM.getSelectedRow(), 3)+" ");
    }//GEN-LAST:event_TabcliMMouseClicked

    private void btnLimpiarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarMActionPerformed
        txtCodigoM.setText("");
        txtNombreclienteM.setText("");
        txtApellidoclienteM.setText("");
        txtDniM.setText("");
    }//GEN-LAST:event_btnLimpiarMActionPerformed

    private void btnRegistrarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMActionPerformed
        // TODO add your handling code here:
        Cliente p= new Cliente();
        String nombreCli=txtNombreclienteM.getText();
        String apellidoCli=txtApellidoclienteM.getText();
        String dniCli= txtDniM.getText();
        p.AgregarCli(nombreCli,apellidoCli,dniCli);
        iniciar();
    }//GEN-LAST:event_btnRegistrarMActionPerformed

    private void btnActualizarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarMActionPerformed
        // TODO add your handling code here:
        try {
            PreparedStatement pst= cn.prepareStatement("UPDATE Cliente SET nombre='"+txtNombreclienteM.getText()+
                "',Apellido='"+txtApellidoclienteM.getText()+"',Dni='"+txtDniM.getText()+"'WHERE cod_cli='"+txtCodigoM.getText()+"'");
            pst.executeUpdate();
            iniciar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnActualizarMActionPerformed

    private void btnEliminarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMActionPerformed
        int fila=TabcliM.getSelectedRow();
        String cod="";
        cod=TabcliM.getValueAt(fila, 0).toString();
        try {

            PreparedStatement pst=cn.prepareStatement("DELETE FROM Cliente WHERE cod_cli='"+cod+"'");

            pst.executeUpdate();
            iniciar();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnEliminarMActionPerformed

    private void tabMeseMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMeseMMouseClicked
        DefaultTableModel modelo=(DefaultTableModel) tabMeseM.getModel();
        txtIdmeseroM.setText(modelo.getValueAt(tabMeseM.getSelectedRow(), 0)+" ");
        txtnombremeseroM.setText(modelo.getValueAt(tabMeseM.getSelectedRow(), 1)+" ");
        txtfecingreM.setText(modelo.getValueAt(tabMeseM.getSelectedRow(), 2)+" ");

    }//GEN-LAST:event_tabMeseMMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            PreparedStatement pst = cn.prepareStatement("UPDATE Mesero SET nom_mesero='" + txtnombremeseroM.getText()
                + "',fec_ingre='" + txtfecingreM.getText() + "'WHERE id_mesero='" + txtIdmeseroM.getText() + "'");
            pst.executeUpdate();
            iniciar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila=tabMeseM.getSelectedRow();
        String cod="";
        cod=tabMeseM.getValueAt(fila, 0).toString();
        try {

            PreparedStatement pst=cn.prepareStatement("DELETE FROM Mesero WHERE id_mesero='"+cod+"'");

            pst.executeUpdate();
            iniciar();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtIdmeseroM.setText("");
        txtfecingreM.setText("");
        txtnombremeseroM.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Mesero p = new Mesero();
        String nombreMese = txtnombremeseroM.getText();
        p.AgregarMese(nombreMese);
        iniciar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void TablePlatosMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePlatosMMouseClicked

        DefaultTableModel modelo=(DefaultTableModel) TablePlatosM.getModel();
        txtIdplatoM.setText(modelo.getValueAt(TablePlatosM.getSelectedRow(), 0)+" ");
        txtNombreplatoM.setText(modelo.getValueAt(TablePlatosM.getSelectedRow(), 1)+" ");
        txtPrecioM.setText(modelo.getValueAt(TablePlatosM.getSelectedRow(), 2)+" ");
        cbxDispoM.setSelectedItem(modelo.getValueAt(TablePlatosM.getSelectedRow(), 3));
    }//GEN-LAST:event_TablePlatosMMouseClicked

    private void txtNombreplatoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreplatoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreplatoMActionPerformed

    private void txtPrecioMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioMActionPerformed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        txtIdplatoM.setText("");
        txtNombreplatoM.setText("");
        txtPrecioM.setText("");

    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void btnRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar1ActionPerformed
        // TODO add your handling code here:
        Platos p= new Platos();
        String nombrePla=txtNombreplatoM.getText();
        double precioPla=Double.parseDouble(txtPrecioM.getText());
        String dispoPla=(String) cbxDispoM.getSelectedItem();
        p.Agregar1(nombrePla,precioPla,dispoPla);
        iniciar();
    }//GEN-LAST:event_btnRegistrar1ActionPerformed

    private void btnActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar1ActionPerformed
        try {
            PreparedStatement pst= cn.prepareStatement("UPDATE Platos SET nom_plato='"+txtNombreplatoM.getText()+
                "',Precio='"+txtPrecioM.getText()+"',Dispon='"+cbxDispoM.getSelectedItem()+"'WHERE id_plato='"+txtIdplatoM.getText()+"'");
            pst.executeUpdate();
            iniciar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnActualizar1ActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        int fila=TablePlatosM.getSelectedRow();
        String cod="";
        cod=TablePlatosM.getValueAt(fila, 0).toString();
        try {

            PreparedStatement pst=cn.prepareStatement("DELETE FROM Platos WHERE id_plato='"+cod+"'");

            pst.executeUpdate();
            iniciar();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void tabMesaMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMesaMMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) tabMesaM.getModel();
        txtIdmesaM.setText(modelo.getValueAt(tabMesaM.getSelectedRow(), 0) + " ");
        txtComensalesM.setText(modelo.getValueAt(tabMesaM.getSelectedRow(), 1) + " ");
        txtUbicacionM.setText(modelo.getValueAt(tabMesaM.getSelectedRow(), 2) + " ");

    }//GEN-LAST:event_tabMesaMMouseClicked

    private void btnLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar2ActionPerformed
        // TODO add your handling code here:
        txtIdmesaM.setText("");
        txtComensalesM.setText("");
        txtUbicacionM.setText("");
    }//GEN-LAST:event_btnLimpiar2ActionPerformed

    private void btnRegistrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar2ActionPerformed
        Mesa p = new Mesa();
        int comensales = Integer.parseInt(txtComensalesM.getText());
        String ubicacion = txtUbicacionM.getText();
        p.AgregarMesa(comensales, ubicacion);
        iniciar();
    }//GEN-LAST:event_btnRegistrar2ActionPerformed

    private void btnActualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar2ActionPerformed
        try {
            PreparedStatement pst = cn.prepareStatement("UPDATE Mesa SET max_comen='" + txtComensalesM.getText()
                + "',Ubicacion='" + txtUbicacionM.getText() + "'WHERE id_mesa='" + txtIdmesaM.getText() + "'");
            pst.executeUpdate();
            iniciar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnActualizar2ActionPerformed

    private void btnEliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar2ActionPerformed
        int fila = tabMesaM.getSelectedRow();
        String cod = "";
        cod = tabMesaM.getValueAt(fila, 0).toString();
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM Mesa WHERE id_mesa='" + cod + "'");

            pst.executeUpdate();
            iniciar();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnEliminar2ActionPerformed

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
            java.util.logging.Logger.getLogger(Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mantenimiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabcliM;
    private javax.swing.JTable TablePlatosM;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnActualizar1;
    private javax.swing.JButton btnActualizar2;
    private javax.swing.JButton btnActualizarM;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnEliminar2;
    private javax.swing.JButton btnEliminarM;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnLimpiar2;
    private javax.swing.JButton btnLimpiarM;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrar1;
    private javax.swing.JButton btnRegistrar2;
    private javax.swing.JButton btnRegistrarM;
    private javax.swing.JComboBox<String> cbxDispoM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabMesaM;
    private javax.swing.JTable tabMeseM;
    private javax.swing.JTextField txtApellidoclienteM;
    private javax.swing.JTextField txtCodigoM;
    private javax.swing.JTextField txtComensalesM;
    private javax.swing.JTextField txtDniM;
    private javax.swing.JTextField txtIdmesaM;
    private javax.swing.JTextField txtIdmeseroM;
    private javax.swing.JTextField txtIdplatoM;
    private javax.swing.JTextField txtNombreclienteM;
    private javax.swing.JTextField txtNombreplatoM;
    private javax.swing.JTextField txtPrecioM;
    private javax.swing.JTextField txtUbicacionM;
    private javax.swing.JTextField txtfecingreM;
    private javax.swing.JTextField txtnombremeseroM;
    // End of variables declaration//GEN-END:variables
}
