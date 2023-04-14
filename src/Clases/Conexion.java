

package Clases;

//Importaciones
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

//Clase con patron de diseño singleton, para limitar a una sola conexion a la BD
public class Conexion {
    private static Connection conexion;
    
    private Conexion() {}
    
    public static Connection getConexion() {
        if (conexion == null) {
            try {
                //Obtencion de prodpiedades con las informaciones de conexion
                ResourceBundle reader = ResourceBundle.getBundle("Clases.dbconfig");
                String ruta = reader.getString("db.url");
                String usuario = reader.getString("db.usuario");
                String clave = reader.getString("db.clave");
                
                //Obtención de la conexion a la BD
                conexion = DriverManager.getConnection(ruta, usuario, clave);
                
                System.out.println("Conexion realizada con exito");
                
            } catch(SQLException e) {
                System.err.println(
                    "No se pudo conectar con la base de datos.\nExcepcion: " + e
                );
            }
        }
        
        return conexion;
    }
}
