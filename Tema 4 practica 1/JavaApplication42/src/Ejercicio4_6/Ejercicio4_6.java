/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4_6;

import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */
public class Ejercicio4_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //char caracter=97;otra manera de conseguir ek abecedario
        int arrayContadores[]=new int[25];
        char  abecedario[] =new char[25];
        String cadena="";
        boolean programa=true;
        String mensaje="";
        for(int x=0;x<abecedario.length;x++){
               abecedario[x]=(char)('A' + x);
               //abecedario[x]=caracter++ Otra manera
               
        }       
       do{        
        try{
            cadena=JOptionPane.showInputDialog("introduce un frase");
            cadena=cadena.toUpperCase();
            if(cadena.isEmpty()){
                throw new Novalida();
                           
            }
        }catch(Novalida e){
            JOptionPane.showMessageDialog(null, " tienes que introducir una frase ");
            programa=false;   
        } 
       }while(!programa);
       
       
       for(int x=0;x<cadena.length();x++){
            for(int y=0;y<abecedario.length;y++){
           
                if(cadena.charAt(x)==abecedario[y]){
                    arrayContadores[y]=arrayContadores[y]+1;
                    
           }
         }  
       }
       for(int i=0;i<abecedario.length;i++){
           mensaje=mensaje + ("La letra " + abecedario[i] + " se repite "+ arrayContadores[i] + " veces" + "\n");
           
       }
      JOptionPane.showMessageDialog(null, mensaje); 
   
    
  }
}    
