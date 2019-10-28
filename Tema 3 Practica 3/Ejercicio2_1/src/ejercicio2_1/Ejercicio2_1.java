/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_1;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */
public class Ejercicio2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        
        String S,C,V,D;
        String P,M;
        String estado,nivel;
        int horas;
         do{
         horas=Integer.parseInt(JOptionPane.showInputDialog("Introduce las horas trabajadas"));
         estado=JOptionPane.showInputDialog("Introduce tu estado civil S de soltero,C de casado,V de viudoy D de divorciado");
         nivel=JOptionPane.showInputDialog("Introduce tu novel de estudios nivel de estudios puede ser P de primario, M de medo y S de superior");
        
       }
        while (!estado.equalsIgnoreCase("S") && !estado.equalsIgnoreCase("V") && !estado.equalsIgnoreCase("C") && !estado.equalsIgnoreCase("D"));
        
         if((estado.equalsIgnoreCase("S")) || ((estado.equalsIgnoreCase("V")&& (nivel.equalsIgnoreCase("S") || nivel.equalsIgnoreCase("P")))) || (estado.equalsIgnoreCase("C") && nivel.equalsIgnoreCase("S")) || (estado.equalsIgnoreCase("D") && nivel.equalsIgnoreCase("S")) ){
            
            int pagototal=CalculoPago(horas)+100;
            JOptionPane.showMessageDialog(null,"el total a pagar es " +pagototal);
            
        }
        else
        
        JOptionPane.showMessageDialog(null,"El total a pagar es "+ CalculoPago(horas));
        
        
    }    
        public static int CalculoPago(int horas){
        int pago;    
        final int pagohora=10;
        final int pagohoraex=15;
            
            if(horas<40){
            pago=horas*pagohora;
        }
        else{
            pago=((horas-40)*pagohoraex)+40*pagohora;
            
            }
            return pago;
       
    }
    
    
}
