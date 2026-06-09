
package CONEXION;

import java.sql.Connection;

// Delegamos a ConexionMySQL para no romper nada que la use
class conectar {
    Connection conexion() {
        ConexionMySQL c = new ConexionMySQL();
        return c.conexion();
    }
}