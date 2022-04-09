//Tarea #4, Realizada por: Roniell Pérez | 2021-0032

package FabricaDialog;

//Clase concreta de la fabrica
public class ModalMensaje extends javax.swing.JDialog implements IDialog {
    //Constructor
    public ModalMensaje(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    //Sobreescritura de metodos
    @Override
    public void mostrarDialog() {
        this.setVisible(true);
    }
    
    @Override
    public void setTitulo(String titulo) {
       //Se utiliza html para generar saltos de linea en la etiqueta
       jLabel_Mensaje.setText(
        "<html><p style=\"width:250px\">" + titulo + "</p></html>"
       ); 
    }
 
    //Método donde se dan los estilos a los componentes de la ventana
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel_Mensaje = new javax.swing.JLabel();
        jButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mensaje");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Mensaje.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel_Mensaje.setForeground(new java.awt.Color(94, 3, 140));
        jLabel_Mensaje.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel_Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 320, 80));

        jButton.setBackground(new java.awt.Color(94, 3, 140));
        jButton.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jButton.setForeground(new java.awt.Color(255, 255, 255));
        jButton.setText("Entendido");
        jButton.setBorder(null);
        jButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });
        jPanel2.add(jButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 220, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 350, 170));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Método de la acción del botón
    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
        //Cierra la ventana
        dispose();
    }//GEN-LAST:event_jButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton;
    private javax.swing.JLabel jLabel_Mensaje;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
