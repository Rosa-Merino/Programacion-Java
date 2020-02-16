/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_2versionfacil;

import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */
public class Ejercicio5_2versionfacil {

    /**
     * @param args the command line arguments
     */
    static  int[][] alumnos=new int [3][4];
    static String[] idiomas={"Ingles","Frances","Aleman","Ruso"};
    static String[] niveles={"Basico","Intermedio","Perfeccionamiento"};
    public static void main(String[] args) {
        // TODO code application logic here
     int continuar=0;
        do{
        
        
        int opcion= MenuIdiomas();
        
           switch(opcion){
            case 1:
                niveles();
                break;
            case 2:
                 niveles();
                break;
            case 3:
                niveles();
                break;
            case 4:
                niveles();
                break;
            default:
                JOptionPane.showMessageDialog(null,"no existe este idioma");
                break;
        }
        continuar=JOptionPane.showConfirmDialog(null, "pulsa no o cancelar si no quieres continuar");    
      }while(continuar==0);
    }
    public static int MenuIdiomas(){
        int opcion;
        opcion=Integer.parseInt(JOptionPane.showInputDialog("Introduce el idioma \n"
                                +"1.-Ingles \n"
                                +"2.-Frances \n"
                                +"3.-Ruso \n"
                                +"4.-Aleman \n"));
        
     
        
        return opcion;
        
    }
    public static int niveles(){
        int opcion=Integer.parseInt(JOptionPane.showInputDialog("Elige el nivel \n"
                                                                +"1.-Basico \n"
                                                                +"2.-Intermedio \n"
                                                                +"3.-Perfeccionamiento"));
        return opcion;
    }
    
    
}
