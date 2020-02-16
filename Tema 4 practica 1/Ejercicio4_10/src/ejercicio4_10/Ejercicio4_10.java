/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_10;

import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */

public class Ejercicio4_10 {
     private static int matriz[][];
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

     try
    {
        matriz = new int[4][4];
        int opcion=0;
        boolean rellena = false;
        while(opcion != 7)
        {
            opcion=mostrarMenu();
            switch(opcion)
            {
                case 1:
                    rellenar();
                    rellena = true;
                    break;
                case 2:
                    if (rellena)
                        sumarFila();
                    else
                        throw new NoValida ();
                    break;
                case 3:
                    if (rellena)
                        sumarColumna();
                    else
                        throw new NoValida ();
                    break;
                case 4:
                    if (rellena)
                        sumarDiagonalPrincipal();
                    else
                        throw new NoValida ();
                    break;
                 case 5:
                    if (rellena)
                        sumarDiagonalInversa();
                    else
                        throw new NoValida ();
                    break;
                 case 6:
                    if (rellena)
                        calcularMedia();
                    else
                        throw new NoValida ();
                    break;
                 case 7:
                     JOptionPane.showMessageDialog(null,"Hasta otra");
                     break;
                 default:
                     throw new NoValida ();
                    
            }
        }
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, "Problemas no identificados " + e.getMessage());
    }
        
    }
    
    public static int mostrarMenu() throws Exception
    {
        int opcion=0;
        boolean correcto;
        do
        {
            try
            {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"1.- Rellenar toda la matriz \n" +
                                              "2.- Suma de una fila\n" +
                                              "3.- Suma de una columna\n" +
                                              "4.- Sumar la diagonal principal\n" +
                                              "5.- Sumar la diagonal inversa\n" +
                                              "6.- La media de todos los valores de la matriz.\n" +
                                              "7.- Salir. "));
                correcto = true;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "La opción tiene que ser un número");
                correcto = false;
            }
            catch(NullPointerException e)
            {
                JOptionPane.showMessageDialog(null, "7.- Salir");
                correcto = false;
            }
        }
        while(!correcto);
        return opcion;
    }
    
    public static void rellenar() throws Exception
    {
        for(int x = 0; x < matriz.length; x++)
            for(int y=0; y < matriz[x].length; y++)
                matriz[x][y] = solicitarNumero("Teclea el número de la fila " + x + " y columna " + y);
    }
    
    public static int solicitarNumero(String mensaje) throws Exception
    {
        boolean correcto;
        int nro=0;
        do{
            try
            {
                nro=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                correcto = true;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "El dato debe ser numérico");
                correcto = false;
            }
            catch(NullPointerException e)
            {
                JOptionPane.showMessageDialog(null, "7.- Salir");
                correcto = false;
            }
        }
        while(!correcto);
        return nro;
    }
    
    public static void sumarFila() throws Exception{
        boolean error = false;
        do
        {
            try
            {
                 int fila=solicitarNumero("Teclea el número de la fila (0-3)");
                 if (fila < 0 || fila > 3)
                     throw new NoValida ();
                 int suma = 0;
                 for(int x = 0; x < matriz[fila].length; x++)
                     suma+=matriz[fila][x];
                 JOptionPane.showMessageDialog(null, " La suma de todos los números de la fila " + fila + " es igual a " + suma);
                 error = false;
            }
            catch(NoValida  e)
            {
                JOptionPane.showMessageDialog(null, "La fila indicada no es correcta");
                error = true;
            }
            catch(NullPointerException e)
            {
                JOptionPane.showMessageDialog(null, "7.- Salir");
                error = false;
            }
        }
        while(error);
    }
    
    public static void sumarColumna() throws Exception{
        boolean error = false;
        do
        {
            try
            {
                 int col=solicitarNumero("Teclea el número de la columna (0-3)");
                 if (col < 0 || col > 3)
                     throw new NoValida ();
                 int suma = 0;
                 for(int x = 0; x < matriz[0].length; x++)
                     suma+=matriz[x][col];
                 JOptionPane.showMessageDialog(null, " La suma de todos los números de la columna " + col + " es igual a " + suma);
                 error = false;
            }
            catch(NoValida  e)
            {
                JOptionPane.showMessageDialog(null, "La columna indicada no es correcta");
                error = true;
            }
            catch(NullPointerException e)
            {
                JOptionPane.showMessageDialog(null, "7.- Salir");
                error = false;
            }
        }
        while(error);
    }
    
    public static void sumarDiagonalPrincipal() throws Exception{
        int suma = 0;
        for(int x = 0; x < matriz.length; x++)
            suma+=matriz[x][x];
        JOptionPane.showMessageDialog(null, " La suma de todos los números de la diagonal principal es igual a " + suma);
    }
    
    public static void sumarDiagonalInversa() throws Exception{
        int suma = 0;
        for(int x = 0,y=3; y >=0; x++,y--)
            suma+=matriz[x][y];
        JOptionPane.showMessageDialog(null, " La suma de todos los números de la diagonal inversa es igual a " + suma);
    }
    
    public static void calcularMedia() throws Exception{
        int suma = 0;
        for(int x = 0; x < matriz.length; x++)
            for(int y = 0; y < matriz[x].length; y++)
                suma+=matriz[x][y];
        int media = suma/(matriz.length * matriz[0].length);
        JOptionPane.showMessageDialog(null, " La media es igual a " + media);
    }
    
}

