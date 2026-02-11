

package app.ejermatrizmvc;

import javax.swing.SwingUtilities;


public class EjermatrizMVC {

    public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
            @Override
          public void run () { 
           modeloMatriz modelo = new modeloMatriz(5);
            vistaMatriz vista = new vistaMatriz ();
            controladorMatriz controlador = new controladorMatriz(modelo, vista);
            
            
             controlador.iniciar();
          }
      });  
    }
}
