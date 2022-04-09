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
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;

public class Principal extends JFrame {
    //Instancias
    MetodosForms MFObj = new MetodosForms();
    ManejoUsuarios MUObj = new ManejoUsuarios();
    FabricaDialog FD = new FabricaDialog();
    IDialog AdvModal = FD.obtenerDialog("ADVERTENCIA", this);
    IDialog msjModal = FD.obtenerDialog("MENSAJE", this);
    
    //Constructor
    public Principal() {
        //Se llema el método que inicializa componentes
        initComponents();
        
        //Se asigna el titulo de la ventana
        setTitle("Gestión de usuarios | Sesión del usuario: " + Login.usuario);
        
        //Agregación de imagenes
        MFObj.agregarImagen(jLabel_FondoP1, "/Imagenes/Purple.png");
        MFObj.agregarImagen(jLabel_FondoP2, "/Imagenes/FondoG.jpg");
        MFObj.agregarImagen(jLabel_Logo, "/Imagenes/LogoMain.png");
        MFObj.agregarImagen(jButton_Agregar, "/Imagenes/registrarBtn.png");
        MFObj.agregarImagen(jButton_Actualizar, "/Imagenes/actualizarBtn.png");
        MFObj.agregarImagen(jButton_Borrar, "/Imagenes/borrarBtn.png");
        MFObj.agregarImagen(jButton_CerrarSesion, "/Imagenes/cerrarSesionBtn.jpg");
        
        //Se llama el método que agrega los usuarios registrados a la tabla
        agregarUsuarios();
        
        //Se agrega las grid(grillas o lineas) de la tabla
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
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
    
    //Método que agrega los usuarios registrados a la tabla
    private void agregarUsuarios() {
        //Se obtiene el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        //Se obtiene listado de los usuarios registrados
        LinkedList<Usuario> listaUsuarios = MUObj.obtenerUsuarios();
        //Se obtiene la cantidad de usuarios registrados
        int cantidadUsuarios = listaUsuarios.size();
        //Objeto para guardar las informaciones de un usuario
        Object[] fila = new Object[5];
        
        //Bucle para añadir los usuarios a la tabla
        for (int i = 0; i < cantidadUsuarios; i++) {
            fila[0] = listaUsuarios.get(i).getNombre();
            fila[1] = listaUsuarios.get(i).getApellido();
            fila[2] = listaUsuarios.get(i).getTelefono();
            fila[3] = listaUsuarios.get(i).getCorreo();
            fila[4] = listaUsuarios.get(i).getUsuario();
            model.addRow(fila);
        }
    }
    
    //Método para actualizar los datos de la tabla
    public void actualizarTabla() {
        //Se obtiene el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        //Se borran las filas
        model.setRowCount(0);
        //Se agregan los usuarios
        agregarUsuarios();
    }
    
    //Método que advierte que se debe seleccionar un usuario en la tabla
    public void advertenciaSeleccionUsuario() {
        AdvModal.setTitulo(
            "Primero debes seleccionar un usuario para llevar acabo esta acción."
        );
        AdvModal.mostrarDialog();
    }
    
    //Método de inicializa los componentes de la ventana
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton_Agregar = new javax.swing.JButton();
        jButton_Actualizar = new javax.swing.JButton();
        jButton_Borrar = new javax.swing.JButton();
        jButton_CerrarSesion = new javax.swing.JButton();
        jLabel_Agregar = new javax.swing.JLabel();
        jLabel_Actualizar = new javax.swing.JLabel();
        jLabel_Borrar = new javax.swing.JLabel();
        jLabel_CerrarSesion = new javax.swing.JLabel();
        jLabel_FondoP1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_Logo = new javax.swing.JLabel();
        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_FondoP2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_Titulo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Agregar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton_Agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 100, 90));

        jButton_Actualizar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton_Actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 125, 100, 90));

        jButton_Borrar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton_Borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BorrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 100, 90));

        jButton_CerrarSesion.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton_CerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_CerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 355, 100, 90));

        jLabel_Agregar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel_Agregar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Agregar.setText("Agregar");
        jPanel1.add(jLabel_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel_Actualizar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel_Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Actualizar.setText("Actualizar");
        jPanel1.add(jLabel_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 215, -1, -1));

        jLabel_Borrar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel_Borrar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Borrar.setText("Borrar");
        jPanel1.add(jLabel_Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 330, -1, -1));

        jLabel_CerrarSesion.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel_CerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_CerrarSesion.setText("Cerrar sesión");
        jPanel1.add(jLabel_CerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 440, -1, -1));
        jPanel1.add(jLabel_FondoP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 220, 470));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 60, 50));

        jLabel_Titulo.setFont(new java.awt.Font("Comic Sans MS", 3, 30)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(94, 3, 140));
        jLabel_Titulo.setText("Gestión de usuarios");
        jPanel2.add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));
        jPanel2.add(jLabel_FondoP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 70));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 70));

        jPanel3.setBackground(new java.awt.Color(153, 51, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Titulo1.setFont(new java.awt.Font("Comic Sans MS", 3, 26)); // NOI18N
        jLabel_Titulo1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo1.setText("Listado de usuarios");
        jPanel3.add(jLabel_Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setBackground(new java.awt.Color(204, 153, 255));
        jTable1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Teléfono", "Correo", "Usuario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setGridColor(new java.awt.Color(153, 51, 255));
        jTable1.setSelectionBackground(new java.awt.Color(153, 153, 255));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(50);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(150);
            jTable1.getColumnModel().getColumn(1).setMinWidth(50);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(150);
            jTable1.getColumnModel().getColumn(2).setMinWidth(50);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(150);
            jTable1.getColumnModel().getColumn(3).setMinWidth(80);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(180);
            jTable1.getColumnModel().getColumn(4).setMinWidth(50);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(150);
        }

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 60, 510, 380));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 530, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Método de la accion que ocurre cuando cerramos la ventana 
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new Login().setVisible(true);
    }//GEN-LAST:event_formWindowClosing
    
    //Método de la acción que ocurre cuando se clickea el botón agregar
    private void jButton_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AgregarActionPerformed
        //Se le asigna este formulario la variable estatica de la clase Registro
        Registro.ventanaPrincipal = this;
        //Se abre la ventana Registro
        new Registro().setVisible(true);
        //Se cierra esta ventana
        dispose();
    }//GEN-LAST:event_jButton_AgregarActionPerformed

    //Método de la acción que ocurre cuando se clickea el botón actualizar
    private void jButton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarActionPerformed
        //Obtención de la fila seleccionada
        int filaSeleccionada = jTable1.getSelectedRow();

        //Comprobación de que se ha seleccionado un usuario
        if (filaSeleccionada != -1) {
            //Obtención del usuario
            String usuario = (String) jTable1.getValueAt(filaSeleccionada, 4);
            //Se le asigna el nombre del usuario a actualizar la variable estatica de la clase Actualizar
            Actualizar.usuario_a_actualizar = usuario;
            //Se le asigna este formulario la variable estatica de la clase Actualizar
            Actualizar.ventanaPrincipal = this;
            //Se abre la ventana Actualizar
            new Actualizar().setVisible(true);
            //Se cierra esta ventana
            dispose();
        }
        //En caso de que no se seleccione un usuario de la tabla
        else {
            advertenciaSeleccionUsuario();  
        }
    }//GEN-LAST:event_jButton_ActualizarActionPerformed

    //Método de la acción que ocurre cuando se clickea el botón borrar
    private void jButton_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BorrarActionPerformed
        //Obtención de la fila seleccionada
        int filaSeleccionada = jTable1.getSelectedRow(); 

        //En caso de que se ha seleccionado un usuario
        if (filaSeleccionada != -1) {
            //Obtención del usuario
            String usuario = (String) jTable1.getValueAt(filaSeleccionada, 4);
            
            //Eliminación del usuario
            MUObj.eliminarUsuario(usuario);
            
            //Mensaje de usuario eliminado
            msjModal.setTitulo(
            "El usuario: '" + usuario + "', ha sido eliminado exitosamente."
            );
            msjModal.mostrarDialog();
            
            //Actualización del contenido de la tabla
            actualizarTabla();
        } else {
            //Si no se selecciona un usuario mostramos mensaje de advertencia
            advertenciaSeleccionUsuario();
        }
    }//GEN-LAST:event_jButton_BorrarActionPerformed

    //Método de la acción que ocurre cuando se clickea el botón cerrar sesión
    private void jButton_CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CerrarSesionActionPerformed
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton_CerrarSesionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Actualizar;
    private javax.swing.JButton jButton_Agregar;
    private javax.swing.JButton jButton_Borrar;
    private javax.swing.JButton jButton_CerrarSesion;
    private javax.swing.JLabel jLabel_Actualizar;
    private javax.swing.JLabel jLabel_Agregar;
    private javax.swing.JLabel jLabel_Borrar;
    private javax.swing.JLabel jLabel_CerrarSesion;
    private javax.swing.JLabel jLabel_FondoP1;
    private javax.swing.JLabel jLabel_FondoP2;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Titulo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
