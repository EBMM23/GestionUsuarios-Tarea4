//Tarea #4, Realizada por: Roniell Pérez | 2021-0032

package Formularios;

//Importaciones
import Clases.ManejoUsuarios;
import Clases.MetodosForms;
import Clases.Usuario;
import FabricaDialog.FabricaDialog;
import FabricaDialog.IDialog;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Actualizar extends JFrame {
    //Variables
    public static Principal ventanaPrincipal = null;
    public static String usuario_a_actualizar = "";
    private String usuario = "", nombre = "", apellido = "", correo = "", telefono = "";
    private String clave = "", confirmaClave = "";

    //Instancias
    MetodosForms MFObj = new MetodosForms();
    ManejoUsuarios MUObj = new ManejoUsuarios();
    FabricaDialog FD = new FabricaDialog();
    IDialog AdvModal = FD.obtenerDialog("ADVERTENCIA", this);
    IDialog msjModal = FD.obtenerDialog("MENSAJE", this);
    
    //Informacion actual del usuario a actualizar
    Usuario usuarioActual = MUObj.obtenerUsuario(usuario_a_actualizar);
    
    //Constructor
    public Actualizar() {
        //Se llama al método que inicializa componentes
        initComponents();
        
        //Se le da focus al botón
        jButton_Registrar.requestFocusInWindow();
        
        //Agregación de imagenes
        MFObj.agregarImagen(jLabel_FondoP2, "/Imagenes/Purple.png");
        MFObj.agregarImagen(jButton_Registrar, "/Imagenes/actualizarBtn.png");
        
        //Agregación de la información actual del usuario a los campos
        jTextField_Usuario.setText(usuarioActual.getUsuario());
        jTextField_Nombre.setText(usuarioActual.getNombre());
        jTextField_Apellido.setText(usuarioActual.getApellido());
        jTextField_Correo.setText(usuarioActual.getCorreo());
        jTextField_Telefono.setText(usuarioActual.getTelefono());
        jPasswordField_Clave.setText(usuarioActual.getContrasennia());
        jPasswordField_ConfirmaClave.setText(usuarioActual.getContrasennia());
    }
    
    //Método para poner logo al JFrame
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit()
            .getImage(
                ClassLoader.getSystemResource("Imagenes/FormIcon.png")
            );
        
        return retValue;
    }
    
    //Método para verificar el cierre de la ventana
    private void checkCerrarVentana(){
        /*
         *Si la ventanaPrincipal es diferente de null, quiere decir que
         *la ventana anterior fue la principal
        */
        if (ventanaPrincipal != null) {
            //Actualización de los valores de la tabla
            ventanaPrincipal.actualizarTabla();
            //Volvemos a abrir la venta principal
            ventanaPrincipal.setVisible(true);
            //La variable estatica vuelve a ser null
            ventanaPrincipal = null;
        }
        /*
         *Si la ventanaPrincipal es null, quiere decir que
         *la ventana anterior fue la de login
        */
        else {
            //Se abre la ventana de login
            new Login().setVisible(true);
        }
    }
    
    //Método que inicializa componentes
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Usuario = new javax.swing.JLabel();
        jLabel_Titulo = new javax.swing.JLabel();
        jTextField_Usuario = new javax.swing.JTextField();
        jTextField_Nombre = new javax.swing.JTextField();
        jTextField_Apellido = new javax.swing.JTextField();
        jTextField_Correo = new javax.swing.JTextField();
        jTextField_Telefono = new javax.swing.JTextField();
        jPasswordField_ConfirmaClave = new javax.swing.JPasswordField();
        jPasswordField_Clave = new javax.swing.JPasswordField();
        jLabel_Nombre = new javax.swing.JLabel();
        jLabel_Apellido = new javax.swing.JLabel();
        jLabel_Correo = new javax.swing.JLabel();
        jLabel_Telefono = new javax.swing.JLabel();
        jLabel_Clave = new javax.swing.JLabel();
        jLabel_ConfirmarClave = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton_Cancelar = new javax.swing.JButton();
        jButton_Registrar = new javax.swing.JButton();
        jLabel_Btn = new javax.swing.JLabel();
        jLabel_FondoP2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Usuario");
        setIconImage(getIconImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Usuario.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel_Usuario.setForeground(new java.awt.Color(94, 3, 140));
        jLabel_Usuario.setText("Usuario:");
        jPanel1.add(jLabel_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 75, -1, -1));

        jLabel_Titulo.setFont(new java.awt.Font("Comic Sans MS", 3, 26)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(94, 3, 140));
        jLabel_Titulo.setText("Actualización de usuario");
        jPanel1.add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jTextField_Usuario.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jTextField_Usuario.setForeground(new java.awt.Color(94, 3, 140));
        jTextField_Usuario.setText("Ingrese el usuario...");
        jTextField_Usuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(94, 3, 140)));
        jTextField_Usuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_UsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_UsuarioFocusLost(evt);
            }
        });
        jPanel1.add(jTextField_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 190, 40));

        jTextField_Nombre.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jTextField_Nombre.setForeground(new java.awt.Color(94, 3, 140));
        jTextField_Nombre.setText("Ingrese el nombre...");
        jTextField_Nombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(94, 3, 140)));
        jTextField_Nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_NombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_NombreFocusLost(evt);
            }
        });
        jPanel1.add(jTextField_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 185, 190, 40));

        jTextField_Apellido.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jTextField_Apellido.setForeground(new java.awt.Color(94, 3, 140));
        jTextField_Apellido.setText("Ingrese el apellido...");
        jTextField_Apellido.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(94, 3, 140)));
        jTextField_Apellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_ApellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_ApellidoFocusLost(evt);
            }
        });
        jPanel1.add(jTextField_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 265, 190, 40));

        jTextField_Correo.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jTextField_Correo.setForeground(new java.awt.Color(94, 3, 140));
        jTextField_Correo.setText("Ingrese el correo...");
        jTextField_Correo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(94, 3, 140)));
        jTextField_Correo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_CorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_CorreoFocusLost(evt);
            }
        });
        jPanel1.add(jTextField_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 190, 40));

        jTextField_Telefono.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jTextField_Telefono.setForeground(new java.awt.Color(94, 3, 140));
        jTextField_Telefono.setText("Ingrese el teléfono...");
        jTextField_Telefono.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(94, 3, 140)));
        jTextField_Telefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_TelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_TelefonoFocusLost(evt);
            }
        });
        jPanel1.add(jTextField_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 190, 40));

        jPasswordField_ConfirmaClave.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jPasswordField_ConfirmaClave.setForeground(new java.awt.Color(94, 3, 140));
        jPasswordField_ConfirmaClave.setText("Un poco de texto");
        jPasswordField_ConfirmaClave.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(94, 3, 140)));
        jPasswordField_ConfirmaClave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField_ConfirmaClaveFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField_ConfirmaClaveFocusLost(evt);
            }
        });
        jPanel1.add(jPasswordField_ConfirmaClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 265, 190, 40));

        jPasswordField_Clave.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jPasswordField_Clave.setForeground(new java.awt.Color(94, 3, 140));
        jPasswordField_Clave.setText("Un poco de texto");
        jPasswordField_Clave.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(94, 3, 140)));
        jPasswordField_Clave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField_ClaveFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField_ClaveFocusLost(evt);
            }
        });
        jPanel1.add(jPasswordField_Clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 185, 190, 40));

        jLabel_Nombre.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel_Nombre.setForeground(new java.awt.Color(94, 3, 140));
        jLabel_Nombre.setText("Nombre:");
        jPanel1.add(jLabel_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel_Apellido.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel_Apellido.setForeground(new java.awt.Color(94, 3, 140));
        jLabel_Apellido.setText("Apellido:");
        jPanel1.add(jLabel_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel_Correo.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel_Correo.setForeground(new java.awt.Color(94, 3, 140));
        jLabel_Correo.setText("Correo electrónico:");
        jPanel1.add(jLabel_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 75, -1, -1));

        jLabel_Telefono.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel_Telefono.setForeground(new java.awt.Color(94, 3, 140));
        jLabel_Telefono.setText("Teléfono:");
        jPanel1.add(jLabel_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 325, -1, -1));

        jLabel_Clave.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel_Clave.setForeground(new java.awt.Color(94, 3, 140));
        jLabel_Clave.setText("Contraseña:");
        jPanel1.add(jLabel_Clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        jLabel_ConfirmarClave.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel_ConfirmarClave.setForeground(new java.awt.Color(94, 3, 140));
        jLabel_ConfirmarClave.setText("Confirmar contraseña:");
        jPanel1.add(jLabel_ConfirmarClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 440));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Cancelar.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Cancelar.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jButton_Cancelar.setForeground(new java.awt.Color(102, 55, 152));
        jButton_Cancelar.setText("Cancelar");
        jButton_Cancelar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton_Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 400, 100, 30));

        jButton_Registrar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton_Registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 160, 100, 90));

        jLabel_Btn.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel_Btn.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Btn.setText("Actualizar");
        jPanel2.add(jLabel_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));
        jPanel2.add(jLabel_FondoP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 440));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 150, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /****Métodos para controlar los eventos cuando los campos obtienen y pierden el focus***/
    private void jTextField_UsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_UsuarioFocusGained
        MFObj.quitarPlaceholder(jTextField_Usuario, "Ingrese el usuario...", 18);
    }//GEN-LAST:event_jTextField_UsuarioFocusGained

    private void jTextField_UsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_UsuarioFocusLost
        MFObj.agregarPlaceholder(jTextField_Usuario, "Ingrese el usuario...", 18);
    }//GEN-LAST:event_jTextField_UsuarioFocusLost

    private void jTextField_NombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_NombreFocusGained
        MFObj.quitarPlaceholder(jTextField_Nombre, "Ingrese el nombre...", 18);
    }//GEN-LAST:event_jTextField_NombreFocusGained

    private void jTextField_NombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_NombreFocusLost
        MFObj.agregarPlaceholder(jTextField_Nombre, "Ingrese el nombre...", 18);
    }//GEN-LAST:event_jTextField_NombreFocusLost

    private void jTextField_ApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_ApellidoFocusGained
        MFObj.quitarPlaceholder(jTextField_Apellido, "Ingrese el apellido...", 18);
    }//GEN-LAST:event_jTextField_ApellidoFocusGained

    private void jTextField_ApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_ApellidoFocusLost
        MFObj.agregarPlaceholder(jTextField_Apellido, "Ingrese el apellido...", 18);
    }//GEN-LAST:event_jTextField_ApellidoFocusLost

    private void jTextField_CorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_CorreoFocusGained
        MFObj.quitarPlaceholder(jTextField_Correo, "Ingrese el correo...", 18);
    }//GEN-LAST:event_jTextField_CorreoFocusGained

    private void jTextField_CorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_CorreoFocusLost
        MFObj.agregarPlaceholder(jTextField_Correo, "Ingrese el correo...", 18);
    }//GEN-LAST:event_jTextField_CorreoFocusLost

    private void jTextField_TelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_TelefonoFocusGained
        MFObj.quitarPlaceholder(jTextField_Telefono, "Ingrese el teléfono...", 18);
    }//GEN-LAST:event_jTextField_TelefonoFocusGained

    private void jTextField_TelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_TelefonoFocusLost
        MFObj.agregarPlaceholder(jTextField_Telefono, "Ingrese el teléfono...", 18);
    }//GEN-LAST:event_jTextField_TelefonoFocusLost

    private void jPasswordField_ConfirmaClaveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_ConfirmaClaveFocusGained
        MFObj.quitarPlaceholder(jPasswordField_ConfirmaClave, "Un poco de texto", 18);
    }//GEN-LAST:event_jPasswordField_ConfirmaClaveFocusGained

    private void jPasswordField_ConfirmaClaveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_ConfirmaClaveFocusLost
        MFObj.agregarPlaceholder(jPasswordField_ConfirmaClave, "Un poco de texto", 18);
    }//GEN-LAST:event_jPasswordField_ConfirmaClaveFocusLost

    private void jPasswordField_ClaveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_ClaveFocusGained
        MFObj.quitarPlaceholder(jPasswordField_Clave, "Un poco de texto", 18);
    }//GEN-LAST:event_jPasswordField_ClaveFocusGained

    private void jPasswordField_ClaveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_ClaveFocusLost
        MFObj.agregarPlaceholder(jPasswordField_Clave, "Un poco de texto", 18);
    }//GEN-LAST:event_jPasswordField_ClaveFocusLost
    /****Métodos para controlar los eventos cuando los campos obtienen y pierden el focus***/
    
    //Método para manejar el evento del botón registrar
    private void jButton_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrarActionPerformed
        //Obtención de valores de los campos
        usuario = jTextField_Usuario.getText().trim();
        nombre = jTextField_Nombre.getText().trim();
        apellido = jTextField_Apellido.getText().trim();
        correo = jTextField_Correo.getText().trim();
        telefono = jTextField_Telefono.getText().trim();
        clave = jPasswordField_Clave.getText();
        confirmaClave = jPasswordField_ConfirmaClave.getText();

        //Verificacion del placeholder
        if (usuario.equals("Ingrese el usuario...")) usuario = "";
        if (nombre.equals("Ingrese el nombre...")) nombre = "";
        if (apellido.equals("Ingrese el apellido...")) apellido = "";
        if (correo.equals("Ingrese el correo...")) correo = "";
        if (telefono.equals("Ingrese el teléfono...")) telefono = "";
        if (clave.equals("Un poco de texto")) clave = "";
        if (confirmaClave.equals("Un poco de texto")) confirmaClave = "";

        //En caso de que todos los campos esten llenos
        if (!usuario.equals("") && !nombre.equals("") &&
            !apellido.equals("") && !correo.equals("") &&
            !telefono.equals("") && !clave.equals("") &&
            !confirmaClave.equals("")
        ){
            //Se busca el usuario ingresado
            Usuario busquedaUsuario = MUObj.obtenerUsuario(usuario);
            
            //Verificación de que el nombre de usuario exista, sin contar el del usuario a actualizar
            if (busquedaUsuario != null && !busquedaUsuario.getUsuario().equals(usuario_a_actualizar)) {
                AdvModal.setTitulo(
                    "El nombre de usuario que escribiste ya existe, pruebe con otro."
                );
                AdvModal.mostrarDialog();
            }
            //Verificación de que las contraseñas coincidan
            else if(!(clave.equals(confirmaClave))) {
                AdvModal.setTitulo(
                    "Las contraseñas que escribiste no coinciden, vuelva a intentarlo"
                );
                AdvModal.mostrarDialog();
            }
            //Actualización del usuario
            else {
                //Creación de objeto de la clase Usuario
                Usuario usuarioActualizado = new Usuario(
                    usuario, nombre, apellido, telefono, correo, clave
                );
                
                //Se actualiza el usuario en la BD
                MUObj.actualizarUsuario(usuario_a_actualizar, usuarioActualizado);
                
                //Se le hace saber al usuario que se actualizó el usuario 
                msjModal.setTitulo("Usuario actualizado con exito.");
                msjModal.mostrarDialog();
                
                //Se cierra la ventana
                dispose();
                checkCerrarVentana();
            }
        } 
        //En caso de que falten todos los campos
        else if (
            usuario.equals("") && nombre.equals("") &&
            apellido.equals("") && correo.equals("") &&
            telefono.equals("") && clave.equals("") &&
            confirmaClave.equals("")
        ){
            AdvModal.setTitulo("Debes llenar todos los campos para actualizar el usuario.");
            AdvModal.mostrarDialog();
        }
        //En caso de que falte el campo usuario
        else if (usuario.equals("")) {
            AdvModal.setTitulo("Debes llenar el campo de usuario para actualizar el usuario.");
            AdvModal.mostrarDialog();
        }
        //En caso de que falte el campo nombre
        else if (nombre.equals("")) {
            AdvModal.setTitulo("Debes llenar el campo de nombre para actualizar el usuario.");
            AdvModal.mostrarDialog();
        }
        //En caso de que falte el campo apellido
        else if (apellido.equals("")) {
            AdvModal.setTitulo("Debes llenar el campo de apellido para actualizar el usuario.");
            AdvModal.mostrarDialog();
        }
        //En caso de que falte el campo telefono
        else if (telefono.equals("")) {
            AdvModal.setTitulo("Debes llenar el campo de telefono para actualizar el usuario.");
            AdvModal.mostrarDialog();
        }
        //En caso de que falte el campo correo
        else if (correo.equals("")) {
            AdvModal.setTitulo("Debes llenar el campo de correo para actualizar el usuario");
            AdvModal.mostrarDialog();
        }
        //En caso de que falte el campo contraseña
        else if (clave.equals("")) {
            AdvModal.setTitulo("Debes llenar el campo de contraseña ppara actualizar el usuario");
            AdvModal.mostrarDialog();
        }
        //En caso de que falte el campo confirmar contraseña
        else {
            AdvModal.setTitulo("Debes confirmar la contraseña para actualizar el usuario");
            AdvModal.mostrarDialog();
        }
    }//GEN-LAST:event_jButton_RegistrarActionPerformed

    //Método de la accion que ocurre cuando cerramos la ventana 
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        checkCerrarVentana();
    }//GEN-LAST:event_formWindowClosing

    //Método del botón cancelar
    private void jButton_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelarActionPerformed
        dispose();
        checkCerrarVentana();
    }//GEN-LAST:event_jButton_CancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cancelar;
    private javax.swing.JButton jButton_Registrar;
    private javax.swing.JLabel jLabel_Apellido;
    private javax.swing.JLabel jLabel_Btn;
    private javax.swing.JLabel jLabel_Clave;
    private javax.swing.JLabel jLabel_ConfirmarClave;
    private javax.swing.JLabel jLabel_Correo;
    private javax.swing.JLabel jLabel_FondoP2;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_Telefono;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Usuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField_Clave;
    private javax.swing.JPasswordField jPasswordField_ConfirmaClave;
    private javax.swing.JTextField jTextField_Apellido;
    private javax.swing.JTextField jTextField_Correo;
    private javax.swing.JTextField jTextField_Nombre;
    private javax.swing.JTextField jTextField_Telefono;
    private javax.swing.JTextField jTextField_Usuario;
    // End of variables declaration//GEN-END:variables
}
