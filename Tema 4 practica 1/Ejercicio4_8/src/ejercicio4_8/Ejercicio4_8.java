/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_8;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */
public class Ejercicio4_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      boolean programa=false;
     while(!programa)
             {
       try{
        String[] codigos = new String[5];
        for(int x=0;x<5;x++)
        {
            codigos[x]="";
        }
        int[] faltas = new int[5];
        int falta=0;
        String codigo="";
        int contadorcodigos=0;
        String resultado="";
        int condi=0;
        do
        {
            codigo=JOptionPane.showInputDialog("Código del alumno");
            falta=Integer.parseInt(JOptionPane.showInputDialog("Número de faltas"));
            if(falta!=0)
            {
             if(Arrays.asList(codigos).contains(codigo)==false)
            {
                for(int x=0;x<codigos.length;x++)
                {
                    if(codigos[x].isEmpty())
                    {
                        codigos[x]=codigo;
                        contadorcodigos++;
                        faltas[x]=faltas[x]+falta;
                        x=5;
                    }
                }
            }
             else
                 {
                        for(int x=0;x<codigos.length;x++)
                        {
                            if(codigo.equals(codigos[x]))
                            {
                                faltas[x]=faltas[x]+falta;
                            }
                            }
                  }
        }
            if(contadorcodigos!=5)
                {
                    condi = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
                }
        }
        while(condi==0 && contadorcodigos!=5);
        for(int x=0;x<contadorcodigos;x++)
        {
          resultado=resultado+"El alumno con el código "+ codigos[x] +" tiene "+ faltas[x] +" faltas\n\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
        programa=true;
    }
      catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, "ERROR!");
    }
    }
    }
    
}
