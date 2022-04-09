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

public class Login extends JFrame {
    //Variables
    public static String usuario = "";
    String clave = "";
    
    //Instancias
    MetodosForms MFObj = new MetodosForms();
    ManejoUsuarios MUObj = new ManejoUsuarios();
    FabricaDialog FD = new FabricaDialog();
    IDialog AdvModal = FD.obtenerDialog("ADVERTENCIA", this);
   
    //Constructor
    public Login() {
        //Se llema el método que inicializa componentes
        initComponents();
        
        //Se le da focus al botón
        jButton_Ingresar.requestFocusInWindow();
        
        //Agregación de imagenes
        MFObj.agregarImagen(jLabel_FondoP2, "/Imagenes/FondoSi.jpg");
        MFObj.agregarImagen(jLabel_FondoP1, "/Imagenes/Purple.png");
        MFObj.agregarImagen(jLabel_UserIcon, "/Imagenes/UserIcon.png");
        MFObj.agregarImagen(jLabel_PassIcon, "/Imagenes/PassIcon.png");
        MFObj.agregarImagen(jLabel_Login, "/Imagenes/LoginIcono.png");
        MFObj.agregarImagen(jLabel_Tarea,"/Imagenes/TareaIcon.jpg"); 
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
    
    //Método que inicializa componentes
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Login = new javax.swing.JLabel();
        jLabel_Creador = new javax.swing.JLabel();
        jLabel_Tarea = new javax.swing.JLabel();
        jLabel_TituloP1 = new javax.swing.JLabel();
        jLabel_FondoP1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel_Contrasennia = new javax.swing.JLabel();
        jLabel_Usuario = new javax.swing.JLabel();
        jLabel_UserIcon = new javax.swing.JLabel();
        jLabel_PassIcon = new javax.swing.JLabel();
        jLabel_Titulo = new javax.swing.JLabel();
        jButton_Ingresar = new javax.swing.JButton();
        jButton_Registrarse = new javax.swing.JButton();
        jLabel_FondoP2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login | Tarea4");
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 220, 210));

        jLabel_Creador.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_Creador.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Creador.setText("Creador: Roniell Perez | 2021-0032 ®");
        jPanel1.add(jLabel_Creador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));
        jPanel1.add(jLabel_Tarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 80));

        jLabel_TituloP1.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel_TituloP1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TituloP1.setText("Tarea 4");
        jPanel1.add(jLabel_TituloP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));
        jPanel1.add(jLabel_FondoP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 500));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField.setFont(new java.awt.Font("Segoe UI Light", 3, 20)); // NOI18N
        jTextField.setForeground(new java.awt.Color(204, 204, 255));
        jTextField.setText("Ingrese el usuario...");
        jTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(94, 3, 140)));
        jTextField.setNextFocusableComponent(this);
        jTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldFocusLost(evt);
            }
        });
        jPanel2.add(jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 250, 50));

        jPasswordField.setFont(new java.awt.Font("Segoe UI Light", 3, 20)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(204, 204, 255));
        jPasswordField.setText("Un poco de texto");
        jPasswordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(94, 3, 140)));
        jPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusLost(evt);
            }
        });
        jPanel2.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 250, 50));

        jLabel_Contrasennia.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel_Contrasennia.setForeground(new java.awt.Color(94, 3, 140));
        jLabel_Contrasennia.setText("Contraseña:");
        jPanel2.add(jLabel_Contrasennia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel_Usuario.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel_Usuario.setForeground(new java.awt.Color(94, 3, 140));
        jLabel_Usuario.setText("Usuario:");
        jPanel2.add(jLabel_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));
        jPanel2.add(jLabel_UserIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 150, 40, 40));
        jPanel2.add(jLabel_PassIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 280, 40, 40));

        jLabel_Titulo.setFont(new java.awt.Font("Comic Sans MS", 3, 30)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(94, 3, 140));
        jLabel_Titulo.setText("Inicio de sesión");
        jPanel2.add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jButton_Ingresar.setBackground(new java.awt.Color(94, 3, 140));
        jButton_Ingresar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton_Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Ingresar.setText("Ingresar");
        jButton_Ingresar.setBorder(null);
        jButton_Ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IngresarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 250, 40));

        jButton_Registrarse.setBackground(new java.awt.Color(94, 3, 140));
        jButton_Registrarse.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton_Registrarse.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Registrarse.setText("Registrarse");
        jButton_Registrarse.setBorder(null);
        jButton_Registrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistrarseActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 250, 40));
        jPanel2.add(jLabel_FondoP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 500, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Método para asignar evento cuando el campo de texto obtiene el focus
    private void jTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldFocusGained
        MFObj.quitarPlaceholder(jTextField, "Ingrese el usuario...", 20);
    }//GEN-LAST:event_jTextFieldFocusGained

    //Método para asignar cuando el campo de texto pierde el focus
    private void jTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldFocusLost
        MFObj.agregarPlaceholder(jTextField, "Ingrese el usuario...", 20);  
    }//GEN-LAST:event_jTextFieldFocusLost

    //Método para asignar evento cuando el campo de la contraseña obtiene el focus
    private void jPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusGained
        MFObj.quitarPlaceholder(jPasswordField, "Un poco de texto", 20);
    }//GEN-LAST:event_jPasswordFieldFocusGained

    //Método para asignar evento cuando el campo de la contraseña pierde el focus
    private void jPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusLost
        MFObj.agregarPlaceholder(jPasswordField, "Un poco de texto", 20);
    }//GEN-LAST:event_jPasswordFieldFocusLost

    //Método para asignar el evento del boton ingresar
    private void jButton_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IngresarActionPerformed
        //Obtención de valores
        usuario = jTextField.getText().trim();
        clave = jPasswordField.getText();
        
        //Verificación del placeholder
        if (usuario.equals("Ingrese el usuario...")) usuario = "";
        if (clave.equals("Un poco de texto")) clave = "";
       
        //Validacion de inicio de sesión
        //Si ambos campos están llenos
        if (!usuario.equals("") && !clave.equals("")) {
            //Se obtiene el usuario ingresado
            Usuario usuarioObtenido = MUObj.obtenerUsuario(usuario);
            
            //Si el usuario no existe
            if(usuarioObtenido == null) {
                AdvModal.setTitulo("El usuario que escribió no esta registrado.");
                AdvModal.mostrarDialog();
            }
            //Si el usuario existe, pero la contraseña es incorrecta
            else if (!usuarioObtenido.getContrasennia().equals(clave)) {
                AdvModal.setTitulo("La constraseña del usuario es incorrecta.");
                AdvModal.mostrarDialog();
            } 
            //Se inicia de sesión con exito
            else {
                //Cerrar ventana
                dispose();
                //Abre ventana de la clase Principal
                new Principal().setVisible(true);
            } 
        } 
        //En caso de que falte un campo
        else {
            AdvModal.setTitulo(
                "Debe ingresar su usuario y contraseña, si no está registrado debe registrarse"
            );
            AdvModal.mostrarDialog();
        } 
        
    }//GEN-LAST:event_jButton_IngresarActionPerformed

    //Método para asignar evento del boton registrarse
    private void jButton_RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrarseActionPerformed
        //Se muestra la ventana Registro
        new Registro().setVisible(true);
        //Se cierra la ventana
        dispose();
    }//GEN-LAST:event_jButton_RegistrarseActionPerformed

    //Método main del proyecto
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Ingresar;
    private javax.swing.JButton jButton_Registrarse;
    private javax.swing.JLabel jLabel_Contrasennia;
    private javax.swing.JLabel jLabel_Creador;
    private javax.swing.JLabel jLabel_FondoP1;
    private javax.swing.JLabel jLabel_FondoP2;
    private javax.swing.JLabel jLabel_Login;
    private javax.swing.JLabel jLabel_PassIcon;
    private javax.swing.JLabel jLabel_Tarea;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_TituloP1;
    private javax.swing.JLabel jLabel_UserIcon;
    private javax.swing.JLabel jLabel_Usuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextField;
    // End of variables declaration//GEN-END:variables
}
