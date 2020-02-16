/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_9;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */
public class Ejercicio4_9 {
  
      private static String[] codigos = {"10", "23", "30", "47", "55", "65", "135", "256", "526", "663"};
      private static int[] contadores = new int[10];
      private static int[] contadoresordenados = new int[10];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         boolean programa = false;
      
        while(!programa)
       {
        try{
            PedirCodigoYUnidades();
            String[] codigosordenados=BuscarPosicionYOrdenar();
            GenerarRespuesta(codigosordenados);
            programa=true;
    }
        catch(CodigoErroneo e)
       {
           JOptionPane.showMessageDialog(null, "El código introducido no es el código de ningun producto");
       }
 
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, "ERROR!");
       }
       
    }
    }
  public static void PedirCodigoYUnidades() throws Exception
    {
        boolean pedircodigoyunidades=false;
        do
        {
            try
            {
          int unidades=0;
         String codigo;
            do
            {
            codigo = JOptionPane.showInputDialog("Código del producto");
            //BuscarCodigo(codigos,codigo);
            if(Arrays.asList(codigos).contains(codigo)==false)
              {
                  throw new CodigoErroneo();
              }
              else
              {
                  unidades = Integer.parseInt(JOptionPane.showInputDialog("Unidades vendidas?"));
                  contadores[Arrays.binarySearch(codigos, codigo)]=contadores[Arrays.binarySearch(codigos, codigo)]+unidades;
              }
            }
            while(JOptionPane.showConfirmDialog(null, "Continuar?")==0); 
            pedircodigoyunidades=true;
        }
                  catch(NumberFormatException e)
             {
                    JOptionPane.showMessageDialog(null, "Cantidad de unidades no válida");
             } 
    }while(pedircodigoyunidades==false);
        }
  public static String[] BuscarPosicionYOrdenar()
  {
      int posicion=0;
            String[] codigosordenados = new String[10];
        for(int x=0;x<codigosordenados.length;x++)
        {
            codigosordenados[x]="";
        }
            for(int x=0;x<codigosordenados.length;x++)
        {
            for(int y=0;y<codigosordenados.length;y++)
            {
                if(contadores[x]<contadores[y])
                {
                    posicion = posicion+1;
                }
            }
            while(!codigosordenados[posicion].isEmpty())
            {
                posicion=posicion+1;
            }
            contadoresordenados[posicion]=contadores[x];
            codigosordenados[posicion]=codigos[x];
            posicion=0;
        }
        
        return codigosordenados;
  }
  public static String GenerarRespuesta(String [] codigosordenados)
  {
      String respuesta="";
        for(int x=0;x<codigosordenados.length;x++)
        {
            respuesta=respuesta+"El producto con el código "+ codigosordenados[x] + " ha vendido " + contadoresordenados[x] + " unidades\n\n";
        }
        JOptionPane.showMessageDialog(null, respuesta);
        
        return respuesta;
    }
    
}
