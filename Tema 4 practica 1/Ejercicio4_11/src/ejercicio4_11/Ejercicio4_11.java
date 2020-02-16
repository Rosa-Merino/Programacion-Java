/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_11;

import javax.swing.JOptionPane;


/**
 *
 * @author Rosita
 */
public class Ejercicio4_11 {
    
  public static String[][] golosina = new String[4][4];
   public static int[][] cantidades = new int[4][4];
    public static float[][] precio = new float[4][4];
    public static int [][]ventas =new int[4][4];
    
   
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{
       InicializarGolosinas();
       InicializarCantidades();
       InicializarPrecios();
      
       
       
      int opcion;
       do
       {
           
               opcion = ElegirOpcionMenu();
               switch(opcion)
               {
                   case 1:
                       PedirGolosina();
                       break;
                   case 2:
                       MostrarGolosinas();
                       break;
                   case 3:
                       RellenarMaquina();
                       break;
                   case 4:
                       ApagarMaquina();
                       
               }
           
       }while (opcion !=4);
       }
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(null, "Por favor introduce una opción válida" + e.getMessage());
           }
       }
    
    public static void InicializarGolosinas()
    {
        golosina[0][0]="KitKat";
        golosina[0][1]="Chicle de fresa";
        golosina[0][2]="Lacasitos";
        golosina[0][3]="Palotes";
        
        golosina[1][0]="Kinder Bueno";
        golosina[1][1]="Bolsa variada Haribo";
        golosina[1][2]="Chetoos";
        golosina[1][3]="Twix";
       
        golosina[2][0]="Kinder bueno";
        golosina[2][1]="M&M";
        golosina[2][2]="Papa Delta";
        golosina[2][3]="Chicles de menta";
       
        golosina[3][0]="Lacasitos";
        golosina[3][1]="Crunch";
        golosina[3][2]="Milkybar";
        golosina[3][3]="KitKat";
    }
   
    public static void InicializarPrecios()
    {
        
        precio[0][0]=1.1f;
        precio[0][1]=1.8f;
        precio[0][2]=1.8f;
        precio[0][3]=1.5f;
                
        precio[1][0]=0.8f;
        precio[1][1]=1f;
        precio[1][2]=1.3f;
        precio[1][3]=1.1f;
                
        precio[2][0]=1.5f;
        precio[2][1]=1.2f;
        precio[2][2]=1.2f;
        precio[2][3]=1.1f;
                
        precio[3][0]=0.9f;
        precio[3][1]=1f;
        precio[3][2]=0.8f;
        precio[3][3]=1.1f;       
    }
    public static void InicializarCantidades(){
      
        for(int x=0;x<cantidades.length;x++)
            for(int y=0;y<cantidades[x].length;y++)
                cantidades[x][y]=5;
    }
    public static int ElegirOpcionMenu()
    {
        int opcion =0;
        boolean proceso = true;
        while(proceso)
        {
            try{
                 opcion = Integer.parseInt(JOptionPane.showInputDialog
        ("ELIGE UNA OPCION\n\n"
                + "1) Pedir golosina\n"
                + "2) Mostrar golosinas disponibles\n"
                + "3) Rellenar golosinas\n"
                + "4) Apagar máquina"));
                 proceso=false;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Por favor introduce un numero asignado a una opcion");
            }
           
        }
        return opcion;
    }
    public static void PedirGolosina()
    {
      
        
            try
            {
              String opcion = JOptionPane.showInputDialog("Código de la golosina a pedir");  
              if(opcion.length()!=2)
              {
                  throw new OpcionNoValida();
              }
               int fila = (int)opcion.charAt(0) - '0';
               int columna = (int)opcion.charAt(1) - '0';
              if(cantidades[fila][columna]==0)
              {
                  JOptionPane.showMessageDialog(null, "No quedan "+golosina[fila][columna]+" disponibles");
              }
              else{
                  cantidades[fila][columna]=cantidades[fila][columna]-1;
                  cantidades[fila][columna]=cantidades[fila][columna]+1;
                  JOptionPane.showMessageDialog(null, "Has comprado 1 "+golosina[fila][columna]);
                  
              }
            }
            catch(OpcionNoValida e)
            {
                JOptionPane.showMessageDialog(null, "por favor introduce un código válido");
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                JOptionPane.showMessageDialog(null, "Por favor introduce un código disponible");
            } 
        } 
    
    public static void MostrarGolosinas()
    {
        String mensaje="";
        for(int x=0;x<4;x++)
        {
            for(int y=0;y<4;y++)
            {
                if(cantidades[x][y]!=0)
                {
                    mensaje = mensaje + "Nombre: " + golosina[x][y] + " Código: " + x + y + " Precio: " + precio[x][y] + "\n";
                }
            }
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
    public static void RellenarMaquina()
    {
       String pass = JOptionPane.showInputDialog("Contraseña exclusiva");
       if(pass.equals("MaquinaExpendedora2019"))
       {
           String posicion = JOptionPane.showInputDialog("Indica la posición");
            int fila = posicion.charAt(0) - '0';
            int columna = posicion.charAt(1) - '0';
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Teclea la cantidad"));
            cantidades[fila][columna] += cantidad;
            
               }
        else
            JOptionPane.showMessageDialog(null, "No eres el técnico");
    }
       
    public static void ApagarMaquina()
    {
            String mensaje="";
        for(int x = 0; x < golosina.length; x++)
            for(int y=0; y < golosina[x].length; y++)
                if (ventas[x][y]!=0)
                {
                    mensaje += "Nombre: " + golosina[x][y] + " Código: " + x + y + " Precio: " + precio[x][y] + " Se han vendido:" + ventas[x][y] + "\n";
                }
        if (mensaje.equals(""))
            JOptionPane.showMessageDialog(null, "Hoy no se ha vendido nada");
        else
            JOptionPane.showMessageDialog(null, mensaje);
    }
}
