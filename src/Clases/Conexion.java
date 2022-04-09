//Tarea #4, Realizada por: Roniell Pérez | 2021-0032

package Clases;

//Importaciones
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Clase con patron de diseño singleton, para limitar a una sola conexion a la BD
public class Conexion {
    private static Connection conexion;
    
    private Conexion() {}
    
    public static Connection getConexion() {
        if (conexion == null) {
            try {
                //Obtencion de variables de entorno con las informaciones de conexion
                String ruta = System.getenv("URL_DB_TAREA");
                String usuario = System.getenv("USUARIO_DB_TAREA");
                String clave = System.getenv("CLAVE_DB_TAREA");
                
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
