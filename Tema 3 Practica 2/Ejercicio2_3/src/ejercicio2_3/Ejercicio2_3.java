/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_3;
import javax.swing.JOptionPane;
/**
 *
 * @author Rosita
 */
public class Ejercicio2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion=0;
        do{
            try{
        opcion=Integer.parseInt(JOptionPane.showInputDialog("1.- Sumar dos numeros \n"
                + "2.- Restar dos numeros \n"
                + "3.- Visualizar la tabla de multiplicar de un número \n"
                + "4.- Visualizar el cociente y el resto de una división \n"
                + "5.- Salir del programa\n\n"
                + "Elige una opción"));
        
                if (opcion < 1 || opcion > 5)
                throw new NoValido();
        
        
            
            switch (opcion){
                case 1:
                 int n1=Integer.parseInt(JOptionPane.showInputDialog("Teclea un número entero"));
                 int n2=Integer.parseInt(JOptionPane.showInputDialog("Teclea un número entero"));
                 JOptionPane.showMessageDialog(null," El resultado de la suma es: " + (n1 + n2));
                break;
                case 2:
                   int n3=Integer.parseInt(JOptionPane.showInputDialog("Teclea un número entero"));
                   int n4=Integer.parseInt(JOptionPane.showInputDialog("Teclea un número entero")); 
                   JOptionPane.showMessageDialog(null," El resultado de la resta es: " + (n3 - n4));
                break;
                case 3:
                    String tabla="";
                    int n5 = Integer.parseInt(JOptionPane.showInputDialog("Teclea un número entero"));
                    for (int x = 0; x < 11; x++)
                    tabla = tabla + n5 + " x " + x + " = " + (n5 * x) + "\n";
                    JOptionPane.showMessageDialog(null, tabla);
                 break;
                case 4:
                    int n6 =Integer.parseInt(JOptionPane.showInputDialog("Teclea un número entero"));
                    int n7 =Integer.parseInt(JOptionPane.showInputDialog("Teclea un número entero")); 
                    JOptionPane.showMessageDialog(null," El cociente es " + (n6 / n7) + " y el resto " + (n6 % n7));
                 break;
                
                }
            }
           catch(NoValido e)
           {
               JOptionPane.showMessageDialog(null,"Hay que teclear numeros");
           }
            catch(ArithmeticException e)
           {
               JOptionPane.showMessageDialog(null,"No se puede realizar la operación con los numeros introducidos");
           }
            catch(NullPointerException | StringIndexOutOfBoundsException e)
           {
               // pulsan x en el cuadro de dialogo de entrada o en el botón de cancelar
               // charAt(0)
               JOptionPane.showMessageDialog(null,"Es obligatorio proporcionar el dato de entrada");
           }
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(null,"Problemas " + e.getClass() + e.getMessage());
           }
           
        }while (opcion != 5)  ;     
        
        
    }
    
}
