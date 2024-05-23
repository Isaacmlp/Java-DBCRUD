package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    public static Connection getConnection() {
        Connection Conexion = null;
        String Database = "java";
        String Direccion = "jdbc:mysql://localhost:3306/" + Database;
        String usuario = "root";
        String clave = "Sacler123#";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Conexion = DriverManager.getConnection(Direccion,usuario,clave);
        } catch (ClassNotFoundException | SQLException e) {

        }

        return null;
    }


}
