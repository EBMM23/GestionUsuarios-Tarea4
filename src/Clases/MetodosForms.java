//Tarea #4, Realizada por: Roniell Pérez | 2021-0032

package Clases;

//Importaciones
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MetodosForms {  
    //Metodo para quitar placeholder de un JTextField
    public void quitarPlaceholder(JTextField jTextField, String msg, int sz){
        if (jTextField.getText().equals(msg)) {
            jTextField.setText("");
            jTextField.setFont(new java.awt.Font("Segoe UI Light", 1, sz));
            jTextField.setForeground(new java.awt.Color(94, 3, 140));
        }
    }
    
    //Metodo para quitar placeholder de un JPasswordField
    public void quitarPlaceholder(JPasswordField jPasswordField, String msg, int sz){
        if (jPasswordField.getText().equals(msg)) {
            jPasswordField.setText("");
            jPasswordField.setFont(new java.awt.Font("Segoe UI Light", 1, sz));
            jPasswordField.setForeground(new java.awt.Color(94, 3, 140));
        }
    }
    
    //Metodo para agragar placeholder de un JTextField
    public void agregarPlaceholder(JTextField jTextField, String msg, int sz){
        if (jTextField.getText().isEmpty()) {
            jTextField.setText(msg);
            jTextField.setFont(new java.awt.Font("Segoe UI Light", 3, sz));
            jTextField.setForeground(new java.awt.Color(204, 204, 255));
        }
    }
    
    //Metodo para agregar placeholder de un JPasswordField
    public void agregarPlaceholder(JPasswordField jPasswordField, String msg, int sz){
        if (jPasswordField.getText().isEmpty()) {
            jPasswordField.setText(msg);
            jPasswordField.setFont(new java.awt.Font("Segoe UI Light", 3, sz));
            jPasswordField.setForeground(new java.awt.Color(204, 204, 255));
        }
    }
    
    //Metodo para poner imagen en un JLabel
    public void agregarImagen(JLabel jLabel, String ruta) {
        //Obtención de la imagen
        ImageIcon img = new ImageIcon(getClass().getResource(ruta));
        
        //Ajuste de la imagen al tamaño del label
        Icon imgAjustada = new ImageIcon(img.getImage().getScaledInstance(
            jLabel.getWidth(),
            jLabel.getHeight(),
            Image.SCALE_SMOOTH
        ));
        
        //Se añade la imagen al label
        jLabel.setIcon(imgAjustada);
    }
    
    //Metodo para poner imagen en un JButton
    public void agregarImagen(JButton jButton, String ruta) {
        //Obtención de la imagen
        ImageIcon img = new ImageIcon(getClass().getResource(ruta));
        
        //Ajuste de la imagen al tamaño del label
        Icon imgAjustada = new ImageIcon(img.getImage().getScaledInstance(
            jButton.getWidth(),
            jButton.getHeight(),
            Image.SCALE_SMOOTH
        ));
        
        //Se añade la imagen al label
        jButton.setIcon(imgAjustada);
    }
}
