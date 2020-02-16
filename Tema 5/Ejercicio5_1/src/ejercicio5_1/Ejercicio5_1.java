/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosita
 */
public class Ejercicio5_1 {

   
        
         private static ArrayList<Double> operaciones=new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion=0;
        boolean correcto=true;
        
        RellenarArray();
   do{ 
       try{
        opcion=ElegirMenu();
        switch (opcion){
            case 1:
                MaximoMinimo();
                break;
            case 2:
                Buscar();
                break;
            case 3:
                BuscarBorrar();
                break;
            case 4:
                Convertir();
                break;
            case 5:
                MostrarElementos();
                break;
            case 6:
                InsertarFinal();
                break;
            case 7:
                InsertarPosicion();
                break;
            case 8:
                BorrarPosicion();
                break;
            case 9:
                SumaMedia();
                break;
            case 10:
                    correcto=false;
                break;
            default:
                throw new datoNovalido();
            
            
        }
        
       }catch (datoNovalido e){
            JOptionPane.showMessageDialog(null,"el dato introducido no es correcto");
                correcto=false; 
       
       
       } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"el dato introducido no es correcto");
                correcto=false; 
       }catch (NullPointerException e){
           JOptionPane.showMessageDialog(null,"el dato introducido no es correcto");
                correcto=false; 
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,"el dato introducido no es correcto" + e.getMessage()+ e.getClass());
                correcto=false; 
       }
      
    }while(!correcto);
   
    }
    
    public static void RellenarArray() {
        int programa=0;
        
        
        do{
            
                double numeros=Double.parseDouble(JOptionPane.showInputDialog("Introduce  numeros"));
                operaciones.add(numeros);
                programa=JOptionPane.showConfirmDialog(null, "pulsa no o cancelar si no quieres continuar");
                
           
                
            
            
        }while(programa==0);
        
}   
    
    

    public static int ElegirMenu() throws Exception{
         boolean correcto=true;
       
        
        int opcion=Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion \n" +
                                    "1. Visualizar el valor maximo y el mınimo. \n"
                                    + "2.Solicitar un numero y buscarlo \n" 
                                    +"3. Solicitar un numero, buscarlo y borrarlo.\n "
                                    +"4. Convertir el arrayList en un array.\n"
                                    +"5. Si no esta vac´ıo, mostrar el n´umero de elementos que contiene.\n"
                                    +"6. Insertar un nuevo elemento por el ﬁnal.\n"
                                    +"7. Insertar un nuevo elemento en la posicion que quieras\n"
                                    +"8. Borrar un elemento de una posicion concreta.\n"
                                    + "9. Calcular la suma y la media aritm´etica\n"
                                    +"10. Finalizar."    ));
        if(opcion<1 && opcion>10){
            throw new datoNovalido(); 
        }
       
        
      return opcion;  
    }
    
    public static void  MaximoMinimo() throws Exception{
       
       double cantidadMinima = operaciones.get(0);
       double cantidadMaxima = operaciones.get(0);
       
       for( int x=1;x<operaciones.size();x++){
        
        if(operaciones.get(x)>cantidadMaxima ){
         cantidadMaxima =operaciones.get(x);
        }
        else if(operaciones.get(x)<cantidadMinima) {
           cantidadMinima=operaciones.get(x);
       }
        
        }
        JOptionPane.showMessageDialog(null,"El maximo valor  " + cantidadMaxima+ " y el mínimo "+ cantidadMinima);
    }
    public static void Buscar() throws Exception{
        
      double n1=Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
        
        if(operaciones.contains((n1))){
            
            JOptionPane.showMessageDialog(null, "El numero introducido si esta en el arraylist y se encuentra en " + operaciones.indexOf(n1));
            
        }else {
            JOptionPane.showMessageDialog(null, "El numero introducido no esta en el arraylist");
        }
    }
    public static void  BuscarBorrar() throws Exception{
       double n1=Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
       
        if(operaciones.contains((n1))){
            
            operaciones.remove(n1);
             JOptionPane.showMessageDialog(null, "el numero ha sido borrado");
        }else {
            JOptionPane.showMessageDialog(null, "ERRO!El numero introducido no esta en el arraylist");
        }
    }
    
    public static void Convertir() throws Exception{
        operaciones.toArray();
        JOptionPane.showMessageDialog(null, "el arraylist se ha combvertido en array");
    }
  
    public static void MostrarElementos() throws Exception{
        
        if(!operaciones.isEmpty()){
            
           JOptionPane.showMessageDialog(null, "los elementos que hay son " + operaciones.get(operaciones.size()));
           
            
        }
    }
    
    public static void InsertarFinal()throws Exception{
      double n1=Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
       
       operaciones.add(n1);
    }
    public static void InsertarPosicion(){
         double n1=Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
         int posicion=Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion en al que quieres insertar el numero"));
         operaciones.add(posicion,n1);
         
         
    }
    public static void BorrarPosicion() throws Exception{
        int posicion=Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion en al que quieres borrar el elemento"));
        operaciones.remove(posicion);
    }    
    public static void  SumaMedia()throws Exception{
        double suma=0;
        double media=0;
        for(int x=0;x<operaciones.size();x++){
           suma= suma + operaciones.get(x) ;
          media=suma/operaciones.size();
          
            JOptionPane.showMessageDialog(null, "la suma total es "+ suma + "la media es " + media);
           
        }
    }
    
}   




   
    

