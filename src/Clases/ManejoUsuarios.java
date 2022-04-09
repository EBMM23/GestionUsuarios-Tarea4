//Tarea #4, Realizada por: Roniell Pérez | 2021-0032

package Clases;

//Importaciones
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class ManejoUsuarios {
    //Método para insertar un registro a la tabla 
    public void registrarUsuario(Usuario usuario){ 
        //Si el objeto de la clase Usuario recibido por parametro es null, no realizamos nada
        if (usuario == null) return;
        
        //Query(Consulta) a realizar
        String query = 
            "INSERT INTO Clientes VALUES (?,?,?,?,?,?,?)";
        
        try {
            //Obtención de la conexión
            Connection cn = Conexion.getConexion();
            //Objeto con la consulta realizada
            PreparedStatement pst = cn.prepareStatement(query);
            
            //Colocación de valores faltantes de la consulta
            pst.setInt(1, 0);
            pst.setString(2, usuario.getUsuario());
            pst.setString(3, usuario.getNombre());
            pst.setString(4, usuario.getApellido());
            pst.setString(5, usuario.getTelefono());
            pst.setString(6, usuario.getCorreo());
            pst.setString(7, usuario.getContrasennia());
            
            //Ejecución de la consulta
            pst.executeUpdate();
            
            System.out.println("Usuario registrado con exito.");
        } catch (SQLException e) {
            System.err.println("Error al registrar usuario:\n" + e);
        }
    }
    
    //Método para actualizar un registro de la tabla filtrado por usuario
    public void actualizarUsuario(String usuario, Usuario usuarioActualizado){
        //Query(Consulta) a realizar
        String query = "UPDATE Clientes SET "
            + "usuario=?, nombre=?, apellido=?,"
            + " telefono=?, correo=?, contrasennia=?"
            + " WHERE usuario ='" + usuario + "'";
        
        try {
            //Obtención de la conexión
            Connection cn = Conexion.getConexion();
            //Objeto con la consulta realizada
            PreparedStatement pst = cn.prepareStatement(query);
            
            //Colocación de valores faltantes de la consulta
            pst.setString(1, usuarioActualizado.getUsuario());
            pst.setString(2, usuarioActualizado.getNombre());
            pst.setString(3, usuarioActualizado.getApellido());
            pst.setString(4, usuarioActualizado.getTelefono());
            pst.setString(5, usuarioActualizado.getCorreo());
            pst.setString(6, usuarioActualizado.getContrasennia());
            
            //Ejecución de la consulta
            pst.executeUpdate();
            
            System.out.println("usuario actualizado con exito.");
        } catch (SQLException e) {
            System.err.println(
                "Error al actualizar la informacion del usuario:\n" +e
            );
        } 
    }
    
    //Método para eliminar un registro de la tabla filtrado por usuario
    public void eliminarUsuario(String usuario){
        //Query(Consulta) a realizar
        String query = "DELETE FROM Clientes WHERE usuario='" + usuario +"'";
        
        try {
            //Obtención de la conexión
            Connection cn = Conexion.getConexion();
            //Objeto con la consulta realizada
            PreparedStatement pst = cn.prepareStatement(query);
            //Ejecución de la consulta
            pst.executeUpdate();
            
            System.out.println("Usuario eliminado con exito.");
        } catch (SQLException e) {
            System.err.println(
                "Error al eliminar usuario:\n" +e
            );
        } 
    }
    
    //Método para eliminar un registro de la tabla filtrado por usuario
    public Usuario obtenerUsuario(String usuario){
        //Inicialización del objeto de la clase Usuario
        Usuario usuarioBuscado = null;
        
        //Query(Consulta) a realizar
        String query = "SELECT * FROM Clientes WHERE usuario='" + usuario +"'";
        
        try {
            //Obtención de la conexión
            Connection cn = Conexion.getConexion();
            //Objeto con la consulta realizada
            PreparedStatement pst = cn.prepareStatement(query);
            //Ejecución de la consulta
            ResultSet rs = pst.executeQuery();
            
            //Si el usurio existe
            if (rs.next()) {
                    //Inicialización del objeto de la clase Usuario
                    usuarioBuscado = new Usuario();
                
                    //Obtención de los valores del usuario buscado
                    usuarioBuscado.setUsuario(rs.getString("usuario"));
                    usuarioBuscado.setNombre(rs.getString("nombre"));
                    usuarioBuscado.setApellido(rs.getString("apellido"));
                    usuarioBuscado.setTelefono(rs.getString("telefono"));
                    usuarioBuscado.setCorreo(rs.getString("correo"));
                    usuarioBuscado.setContrasennia(rs.getString("contrasennia"));
            } else {
                //El usuario no existe
                System.out.println("Usuario no registrado.");
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar el usuario\n" + e);
        }
        
        return usuarioBuscado;
    }
    
    //Método para obtener todos los registros de la tabls
    public  LinkedList<Usuario> obtenerUsuarios(){
        //Linked list donde guardaremos los usuarios
        LinkedList<Usuario> listaUsuarios = new LinkedList<>();
        
        //Query(Consulta) a realizar
        String query = "SELECT * FROM Clientes";
        
        try {
            //Obtención de la conexión
            Connection cn = Conexion.getConexion();
            //Objeto con la consulta realizada
            PreparedStatement pst = cn.prepareStatement(query);
            //Ejecución de la consulta
            ResultSet rs = pst.executeQuery();
            
            //Verificación de que el resultado de la consulta no este vacío
            if (rs != null) {
                //Bucle para guardar los resultados en la Linked List
                while (rs.next()) {
                    //Creación de objeto de la  clase Usuario
                    Usuario actualUsuario = new Usuario();
                    
                    //Obtención de los datos del usuario actual
                    actualUsuario.setUsuario(rs.getString("usuario"));
                    actualUsuario.setNombre(rs.getString("nombre"));
                    actualUsuario.setApellido(rs.getString("apellido"));
                    actualUsuario.setTelefono(rs.getString("telefono"));
                    actualUsuario.setCorreo(rs.getString("correo"));
                    actualUsuario.setContrasennia(rs.getString("contrasennia"));
                    
                    //Se añade el usuario actual a la Linked list
                    listaUsuarios.add(actualUsuario);
                }
            } else {
                System.out.println("No hay ningun usuario registrado.");
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener lista de usuarios\n" + e);
        }
                
        
        return listaUsuarios;
    }
}
