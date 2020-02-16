/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_7;

import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */
public class Ejercicio4_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   

    
       boolean programa=false;
        while(!programa)
        {
            try
            {
            
            double vueltas=Vueltas();
            float[] dinero ={0.01f,0.02f,0.05f,0.1f,0.2f,0.5f,1,2f,5f,10f,20f,50f,100f,500f} ;
            int[] contador = new int[14];
             for(int x=dinero.length-1;x>-1;x--)
             {
                 if(vueltas>=dinero[x])
                 {
                 do
                 {
                    vueltas= vueltas-dinero[x];
                    contador[x]=contador[x]+1;
                 }
                 while(vueltas>=dinero[x]);
                 }
             }
             String respuesta="";
             for(int x=contador.length-1;x>-1;x--)
             {
                 respuesta=respuesta+"Billete/Moneda de "+dinero[x]+" - Cantidad a devolver: "+contador[x]+"\n\n";
             }
             JOptionPane.showMessageDialog(null, respuesta);
            programa=true;
        }
            catch(Exception e)
                    {
                     JOptionPane.showMessageDialog(null, "ERROR!");
                    }
            
        }
    }
    public static double Vueltas() throws Exception
    {
            double importe = Double.parseDouble(JOptionPane.showInputDialog("Importe de la compra"));
            double pago = Double.parseDouble(JOptionPane.showInputDialog("Pago del cliente"));
            JOptionPane.showMessageDialog(null, "Las vueltas son "+(pago-importe));
            return  pago-importe;
    }
}
    