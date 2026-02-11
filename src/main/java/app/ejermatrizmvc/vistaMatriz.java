
package app.ejermatrizmvc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class vistaMatriz extends JFrame {
  private JTextArea matrizTextArea;
    private JButton principalBtn;
    private JButton secundariaBtn;
    private JButton ambasBtn;
    private JButton cuadradoBtn;
    private JButton zetaBtn;
    private JButton flechaBtn;
    private JButton circuloBtn;
    private JButton aleatorioBtn;
    
     public vistaMatriz() {
        setTitle(" Matrices");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        
        JPanel buttonPanel = new JPanel(new GridLayout(2, 3, 10, 10));
        principalBtn = new JButton("Matriz Principal");
        secundariaBtn = new JButton("Matriz Secundaria");
        ambasBtn = new JButton("Ambas Matrices");
        cuadradoBtn = new JButton("Cuadrado");
        zetaBtn = new JButton("Zeta");
        flechaBtn = new JButton("Flecha");
        circuloBtn = new JButton("circulo");
        aleatorioBtn = new JButton("aleatorio");

        buttonPanel.add(principalBtn);
        buttonPanel.add(secundariaBtn);
        buttonPanel.add(ambasBtn);
        buttonPanel.add(cuadradoBtn);
        buttonPanel.add(zetaBtn);
        buttonPanel.add(flechaBtn);
        buttonPanel.add(circuloBtn);
        buttonPanel.add(aleatorioBtn);
      
        matrizTextArea = new JTextArea();
        matrizTextArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
        matrizTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(matrizTextArea);

        add(buttonPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    public void mostrarMatriz(modeloMatriz modelo) {
        String[][] matriz = modelo.getMatriz();
        StringBuilder sb = new StringBuilder();

        for (String[] fila : matriz) {
            for (String celda : fila) {
                sb.append(" ").append(celda).append(" ");
            }
            sb.append("\n");
        }

        matrizTextArea.setText(sb.toString());
    }

    public void addPrincipalListener(ActionListener listener) {
        principalBtn.addActionListener(listener);
    }

    public void addSecundariaListener(ActionListener listener) {
        secundariaBtn.addActionListener(listener);
    }

    public void addAmbasListener(ActionListener listener) {
        ambasBtn.addActionListener(listener);
    }

    public void addCuadradoListener(ActionListener listener) {
        cuadradoBtn.addActionListener(listener);
    }

    public void addZetaListener(ActionListener listener) {
        zetaBtn.addActionListener(listener);
    }

    public void addFlechaListener(ActionListener listener) {
        flechaBtn.addActionListener(listener);
    }
    
    public void addcirculoListener(ActionListener listener) {
       circuloBtn.addActionListener(listener);
    }

     public void addaleatorioListener(ActionListener listener) {
       aleatorioBtn.addActionListener(listener);
    }

}

