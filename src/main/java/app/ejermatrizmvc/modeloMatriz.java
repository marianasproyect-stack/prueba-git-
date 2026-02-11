package app.ejermatrizmvc;

import java.util.Random;
import java.util.Scanner;

public class modeloMatriz {
    
    private static void imprimirmatriz() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
     public static int n = 6, m = 6;
    public static controladorMatriz c;
    private String[][] matriz;
    public static Random random = new Random();
    static Scanner teclado = new Scanner(System.in);
    private int i,j,k;
    
   
   

    public modeloMatriz(int n) {
    this.n = n;
    this.matriz = new String[n][n];
     }

   private void inicializarMatriz() {
    matriz = new String[n][n];
    }

    public void generarMatrizPrincipal() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (i == j) ? "x" : "o";
            }
        }
    }

    public void generarMatrizSecundaria() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (j == (n - (i + 1))) ? "y" : "o";
            }
        }
    }

    public void generarMatrizAmbas() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matriz[i][j] = "x";
                } else if (j == (n - (i + 1))) {
                    matriz[i][j] = "y";
                } else {
                    matriz[i][j] = "o";
                }
            }
        }
    }

    public void generarCuadrado() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = ((i == 0) || (j == 0) || (i == n - 1) || (j == n - 1)) ? "x" : "o";
            }
        }
    }

    public void generarZeta() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = ((i == 0) || (i == n - 1) || (i == (n - (j + 1)))) ? "x" : "o";
            }
        }
    }

    public void generarFlecha() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = ((i == 0) || (i == j) || (j == 0)) ? "x" : "o";
            }
        }
    }

    public  void generaraleatorio() {

       System.out.println("Digite la cantidad de datos a ingresar:");
        k = teclado.nextInt();

        if (k < 2 || k > (n * m)) {
            System.out.println("Debe ingresar un número entre 2 y " + (n * m));
            return; // Salimos del método si no es válido
        }

        System.out.println("Los datos se ubican en posiciones aleatorias de la matriz\n");

        int contador = 0;
        while (contador < k) {
            int na = random.nextInt(n); // Índice aleatorio de fila
            int ma = random.nextInt(m); // Índice aleatorio de columna

           if (matriz[na][ma].equals(" ")) { // Solo asigna si la posición está vacía
                matriz[na][ma] = String.valueOf(random.nextInt(10) + 1); // Números del 1 al 10
                contador++; // Aumentamos el contador solo si asignamos un número
            }
        }

        // Mostrar la matriz generada
        imprimirMatriz();
    }

    public  void imprimirMatriz() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
   
    
    
    
  
    public String[][] getMatriz() {
        return matriz;
    }

    public int getN() {
        return n;
    } 
     
       
    }
     
  
       
       

      


    

