/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;
import javax.swing.JOptionPane;
/**
 *
 * @author Rosita
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int dia=Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero del 1 al 7"));
        switch (dia){
            case 1:System.out.println("Es Lunes");
            break;
            case 2:System.out.println("Es Martes");
            break;
            case 3:System.out.println("Es Miercoles");
            break;
            case 4:System.out.println("Es Jueves");
            break;
            case 5:System.out.println("Es viernes");
            break;
            case 6:System.out.println("Es Sabado");
            break;
            case 7:System.out.println("Es Domingo");
            break;
            default :System.out.println("Error");
            
        }
    }
    
}
