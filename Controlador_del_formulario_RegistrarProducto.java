
package CONEXION;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionMySQL {
    Connection cn=null;
    
    public Connection conexion() {
 
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");// Driver antiguo
            cn = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/PAPELERIA?useSSL=false&serverTimezone=UTC",
    "root",
    "12345678"
);
 
 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion de la base de datos");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro el driver JDBC");
        }
 
        return cn;
    }
}
