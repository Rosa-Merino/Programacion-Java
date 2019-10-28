/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;
import javax.swing.JOptionPane;
/**
 *
 * @author Rosita
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double pago=0;
        int min=Integer.parseInt(JOptionPane.showInputDialog("Escribe los minutos consumidos"));
        
	if (min >= 300){
		if (min > 500) 
                {
			pago = 300 * 0.03 + (min- 300) * 0.02;
			if (min > 800) 
                        {
				pago = pago - (pago * 1.25)/100;
                        }
                        else
                            pago= min * 0.03;
                
                 }
                
	else
                    pago = min * 0.04;
		
        }
		
	
	JOptionPane.showMessageDialog(null, "Tienes que pagar "+ pago );
    }
    
}
