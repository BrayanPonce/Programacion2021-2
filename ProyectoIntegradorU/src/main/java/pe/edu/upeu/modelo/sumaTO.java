package pe.edu.upeu.modelo;

import pe.edu.upeu.util.*;

public class sumaTO {

    static LeerTeclado lt = new LeerTeclado();

    public void suma () {
        int matriz_uno[][] = new int[20][20];
        int matriz_dos[][] = new int[20][20];
        int matriz_resultante[][] = new int[20][20];
        int limite;


        limite = lt.leer(0, "Ingrese el numero de elementos");
        
        // Llenado de la primera matriz
        System.out.println ("Matriz uno");
        for (int i = 0; i < limite; i++) //columnas
        {
            for (int j = 0; j < limite; j++) //filas
            {
                System.out.print("Fila " + (i + 1) + " Columna " + (j + 1) + " = ");
                matriz_uno[i][j] = lt.leer (0, "");
            }
        }
        //Llenado de la segunda matriz
        System.out.println ("Matriz dos");
        for (int i = 0; i < limite; i++) 
        {
            for (int j = 0; j < limite; j++) 
            {
                System.out.print("Fila " + (i + 1) + " Columna " + (j + 1) + " = ");
                matriz_dos[i][j] = lt.leer (0, "");
            }
        }
        //Suma de matrices
        for (int i = 0; i < limite; i++) 
        {
            for (int j = 0; j < limite; j++) 
            {
                matriz_resultante[i][j] = matriz_uno[i][j] + matriz_dos[i][j];
            }
        }
        // imprimiendo las matrices
        for (int i = 0; i < limite; i++)
        {

            for (int j = 0; j < limite; j++) 
            {
                System.out.print("[" + matriz_uno[i][j] + "]");
            }

            if (i == 1) {
                System.out.print("   +  ");
            } else {
                System.out.print("      ");
            }

            for (int j = 0; j < limite; j++) 
            {
                System.out.print("[" + matriz_dos[i][j] + "]");
            }

            if (i == 1) 
            {
                System.out.print("  =   ");
            } else {
                System.out.print("      ");
            }

            for (int j = 0; j < limite; j++) 
            {
                System.out.print("[" + matriz_resultante[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
