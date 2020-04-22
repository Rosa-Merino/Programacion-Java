/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9_1;
import Modelo.*;
import Vista.VentanaPer;
import Vista.menu;
import java.util.ArrayList;
/**
 *
 * @author Rosita
 */
public class Ejercicio9_1 {
    
    private static BaseDatos basedatos;
    private static tablapersonas tablap;
    private static Personas p;
    private static ArrayList<Personas> listapersonas;
    private static  menu vmenu=new menu();
    private static VentanaPer vregis=new VentanaPer();
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
     
        
        try{
            
            basedatos=new BaseDatos();
            basedatos.conectar();
            
            tablap=new tablapersonas(basedatos.getCon());
            vmenu.setVisible(true);
            vregis.setVisible(false);
            
           
            
            
        }
        catch (Exception e)
        {
            basedatos.desconectar();
            System.out.println(e.getMessage());
        }
    }
    public static void AltaPersonas(){
        vmenu.setVisible(false);
        vregis.setVisible(true);
    
    }
}
