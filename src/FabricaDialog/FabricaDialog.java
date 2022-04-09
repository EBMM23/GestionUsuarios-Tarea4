//Tarea #4, Realizada por: Roniell Pérez | 2021-0032

package FabricaDialog;

//Importaciones
import javax.swing.JFrame;

//Clase fabrica que genera instancias de las clases concretas segun el tipo
public class FabricaDialog {
    public IDialog obtenerDialog(String tipo, JFrame padre) {
        //Si el tipo o el JFrame recibidos son null, retornamos null
        if (tipo == null || padre == null) return null;
       
        //Busqueda del tipo
        if (tipo.equalsIgnoreCase("MENSAJE")) {
            return new ModalMensaje(padre, true);  
        } else if (tipo.equalsIgnoreCase("ADVERTENCIA")) {
            return new ModalAdvertencia(padre, true);
        }
        
        //Si no se encontró el tipo
        return null;
    }
}
