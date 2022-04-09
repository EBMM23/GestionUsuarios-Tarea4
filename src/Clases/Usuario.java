package Clases;

public class Usuario {
    //-------------------------------Atributos----------------------------------
    private String usuario, nombre, apellido, telefono, correo, contrasennia;
    
    //------------------------------Constructores-------------------------------
    public Usuario () {}
    
    public Usuario (
        String usuario, String nombre, String apellido,
        String telefono, String correo, String contrasennia
    ) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.contrasennia = contrasennia;
    }
    
    //---------------------------Métodos Getters--------------------------------
    public String getUsuario() {
        return usuario;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public String getCorreo() {
        return correo;
    }
    
    public String getContrasennia() {
        return contrasennia;
    }
    
    //---------------------------Métodos Setters--------------------------------
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public void setContrasennia(String contrasennia) {
        this.contrasennia = contrasennia;
    }
    
    //-------------------------------Métodos------------------------------------
    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", nombre=" + nombre 
            + ", apellido=" + apellido + ", telefono=" + telefono 
            + ", correo=" + correo + ", contrasennia=" + contrasennia + '}';
    }
    
}
