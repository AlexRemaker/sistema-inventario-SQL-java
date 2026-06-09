package CONEXION;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Index extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger =
        java.util.logging.Logger.getLogger(Index.class.getName());

    public Index() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cajaNOMBRE = new javax.swing.JTextField();
        cajaID = new javax.swing.JTextField();
        cajaPRECIO = new javax.swing.JTextField();
        cajaCANTIDAD = new javax.swing.JTextField();
        btnGUARDAR = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLAproducto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Productos ",
            javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION,
            new java.awt.Font("Segoe UI", 1, 14)));

        cajaNOMBRE.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre",
            javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
            new java.awt.Font("Segoe UI", 2, 12)));

        cajaID.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID",
            javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
            new java.awt.Font("Segoe UI", 2, 12)));
        cajaID.setEnabled(false);

        cajaPRECIO.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Precio",
            javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
            new java.awt.Font("Segoe UI", 2, 12)));

        cajaCANTIDAD.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cantidad",
            javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
            new java.awt.Font("Segoe UI", 2, 12)));

        btnGUARDAR.setText("Guardar");
        btnGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGUARDARActionPerformed(evt);
            }
        });

        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cerrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaCANTIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaPRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGUARDAR)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addComponent(cajaID, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(75, 75, 75))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(cajaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(cajaNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(cajaCANTIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(cajaPRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGUARDAR)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(16, 16, 16))
        );

        TABLAproducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String[]{"ID", "Nombre", "Cantidad", "Precio"}
        ));
        jScrollPane1.setViewportView(TABLAproducto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }

    // ── GUARDAR ───────────────────────────────────────────────────────────────
    private void btnGUARDARActionPerformed(java.awt.event.ActionEvent evt) {
        ConexionMySQL cc = new ConexionMySQL();
        Connection cn = cc.conexion();

        if (cn == null) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos");
            return;
        }

        try {
            PreparedStatement pst = cn.prepareStatement(
    "INSERT INTO productos(nombre, stock, precio) VALUES (?, ?, ?)"
);
pst.setString(1, cajaNOMBRE.getText());
pst.setInt(2, Integer.parseInt(cajaCANTIDAD.getText()));
pst.setDouble(3, Double.parseDouble(cajaPRECIO.getText()));

            int a = pst.executeUpdate();

            if (a > 0) {
                JOptionPane.showMessageDialog(null, "Registro exitoso");
                limpiarCampos();
                cargarTabla(cn);
            } else {
                JOptionPane.showMessageDialog(null, "Error al agregar");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // ── ACTUALIZAR ────────────────────────────────────────────────────────────
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        ConexionMySQL cc = new ConexionMySQL();
        Connection cn = cc.conexion();

        if (cn == null) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos");
            return;
        }
        cargarTabla(cn);
    }

    // ── CERRAR ────────────────────────────────────────────────────────────────
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    // ── HELPERS ───────────────────────────────────────────────────────────────
    private void limpiarCampos() {
        cajaNOMBRE.setText("");
        cajaPRECIO.setText("");
        cajaCANTIDAD.setText("");
    }

    private void cargarTabla(Connection cn) {
        try {
            java.sql.Statement st = cn.createStatement();
            java.sql.ResultSet rs = st.executeQuery(
    "SELECT id_productos, nombre, stock, precio FROM productos"
);

            javax.swing.table.DefaultTableModel modelo =
                (javax.swing.table.DefaultTableModel) TABLAproducto.getModel();
            modelo.setRowCount(0);

            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getString("id_productos"),
                    rs.getString("nombre"),
                    rs.getString("stock"),
                    rs.getString("precio")
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar tabla: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // ── MAIN ──────────────────────────────────────────────────────────────────
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new Index().setVisible(true));
    }

    // Variables declaration
    public javax.swing.JTable TABLAproducto;
    public javax.swing.JButton btnGUARDAR;
    public javax.swing.JTextField cajaCANTIDAD;
    private javax.swing.JTextField cajaID;
    public javax.swing.JTextField cajaNOMBRE;
    public javax.swing.JTextField cajaPRECIO;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration
}