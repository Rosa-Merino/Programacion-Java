/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */
public class Ejercicio4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char [] abecedario =new char[25];
        int x;
        String cadena="";
        for(x=0;x<abecedario.length;x++){
               abecedario[x]=(char)('A' + x);
        }   
         cadena= entradadatos(abecedario);
         JOptionPane.showMessageDialog(null,cadena);
        
        
    }
    public static String entradadatos(char[] abecedario){
        String cadena="";
        int j=0;
        do{
            try{
             j=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
            if (j>25){
                throw new Novalida();
            }if(j!=-1)
            
             cadena += abecedario[j];    
        
                        
            }catch (Novalida e){
                    JOptionPane.showMessageDialog(null,"El numero no es valido");
                    }
        catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null,"El numero no es valido");
        }
         catch(NullPointerException e){
             JOptionPane.showMessageDialog(null,"El numero no es valido");
         }
            catch(Exception e){
               JOptionPane.showMessageDialog(null,"El numero no es valido" + e.getMessage() + e.getClass());
               }
        }while(j!=-1);
        return cadena;
     
         }
            
    
    
        
    }
    

