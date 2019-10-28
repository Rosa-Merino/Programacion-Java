/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;
import javax.swing.JOptionPane;
/**
 *
 * @author Rosita
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2,n3,contador;
        int numfinal=Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros quieres de la serie fibonacci"));
        n1=1;
        System.out.println(n1);
        n2=1;
        System.out.println(n2);
        contador=2;
        while(contador<numfinal)
        {
            n3=n1+n2;
            System.out.println(n3);
            contador++;
            n1=n2;
            n2=n3;
        }
    }
    
}
