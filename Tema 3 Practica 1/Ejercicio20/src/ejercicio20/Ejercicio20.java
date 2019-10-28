/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author Rosita
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int aleatorio=(int)(Math.random()*100);
             String acabar;   
           
				
	    int intentos=0;
	    
	    do {
	    	
	    	intentos++;
	    	
	    	int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número, por favor.Cuando quieras rendirte escribe FIN"));
           
	    	acabar=JOptionPane.showInputDialog("Cuando quieras rendirte escribe FIN");
	    	
	    	
	    	if(aleatorio<numero) {
	    		
	    		System.out.println("Más bajo");
	    		
	    	
	    	}
	    	
	    	else if (aleatorio>numero) {
	    		
	    		System.out.println("Más alto");
	    		
	    	}
	    }  while (!acabar.equals("FIN"));
		
		System.out.println("Correcto.Lo has conseguido en "+ intentos + " intentos");
    }
    
}
