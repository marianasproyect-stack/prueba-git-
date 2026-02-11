
package app.ejermatrizmvc;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class controladorMatriz {
   
    private modeloMatriz modelo;
    private vistaMatriz vista;

    // Constructor corregido
    public controladorMatriz(modeloMatriz modelo, vistaMatriz vista) {
        this.modelo = modelo;
        this.vista = vista;

        // Añadir listeners a los botones dentro del constructor
        this.vista.addPrincipalListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.generarMatrizPrincipal();
                vista.mostrarMatriz(modelo);
            }
        });

        this.vista.addSecundariaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.generarMatrizSecundaria();
                vista.mostrarMatriz(modelo);
            }
        });

        this.vista.addAmbasListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.generarMatrizAmbas();
                vista.mostrarMatriz(modelo);
            }
        });

        this.vista.addCuadradoListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.generarCuadrado();
                vista.mostrarMatriz(modelo);
            }
        });

        this.vista.addZetaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.generarZeta();
                vista.mostrarMatriz(modelo);
            }
        });

        this.vista.addFlechaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.generarFlecha();
                vista.mostrarMatriz(modelo);
            }
        });
    
    
         this.vista.addFlechaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.generarFlecha();
                vista.mostrarMatriz(modelo);
            }
        });
    
         
         this.vista.addFlechaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.generarFlecha();
                vista.mostrarMatriz(modelo);
            }
        }); 
         
         
    }

    
    
    
    public void iniciar() {
        vista.setVisible(true); 
    }
  
}
