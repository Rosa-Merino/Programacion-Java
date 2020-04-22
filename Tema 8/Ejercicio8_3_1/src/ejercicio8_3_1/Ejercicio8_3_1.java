/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8_3_1;
import Modelo.*;
import java.util.ArrayList;

/**
 *
 * @author Rosita
 */
public class Ejercicio8_3_1 {

    /**
     * @param args the command line arguments
     */
    
    public static ArrayList<Productos> listaproductos;
    public static ArrayList<Proveedores> listaproveedores;
    public static ArrayList<Clientes> listaclientes;
    public static void main(String[] args) {
        // TODO code application logic here
        altaproveedores();
        altaproductos();
        
        v= new Ventana
    }
   public static void altaproveedores(){
       
       listaproveedores = new ArrayList();
       
       Proveedores p1=new Proveedores();
       p1.setNombre("Miguel");
       listaproveedores.add(p1);
       
       p1=new Proveedores();
       p1.setNombre("Rosa");
       listaproveedores.add(p1);
       
       p1=new Proveedores();
       p1.setNombre("Luis");
       listaproveedores.add(p1);
       
       p1=new Proveedores();
       p1.setNombre("Juan");
       listaproveedores.add(p1);
       
       
             
       
   }
   public static void altaproductos(){
      ArrayList<Proveedores> Proveedores= new ArrayList();
      
      Productos p=new Productos();
      p.setNombre("p1");
      p.setUnidades(40);
      p.setPrecio(0.8);
     
      Proveedores.add(listaproveedores.get(0));
      Proveedores.add(listaproveedores.get(2));
      
      p.setProveedores(Proveedores);
      
      Proveedores= new ArrayList();
      p=new Productos();
      p.setNombre("p2");
      p.setUnidades(50);
      p.setPrecio(2.8);
     
      Proveedores.add(listaproveedores.get(1));
      Proveedores.add(listaproveedores.get(2));
      
      p.setProveedores(Proveedores);
      
      Proveedores= new ArrayList();
      p=new Productos();
      p.setNombre("p3");
      p.setUnidades(30);
      p.setPrecio(2);
     
      Proveedores.add(listaproveedores.get(3));
      
      
      p.setProveedores(Proveedores);
      
      Proveedores= new ArrayList();
      p=new Productos();
      p.setNombre("p4");
      p.setUnidades(20);
      p.setPrecio(1.5);
     
      Proveedores.add(listaproveedores.get(0));
      
      
      p.setProveedores(Proveedores);
      
      Proveedores= new ArrayList();
      p=new Productos();
      p.setNombre("p5");
      p.setUnidades(25);
      p.setPrecio(1);
     
      Proveedores.add(listaproveedores.get(2));
      Proveedores.add(listaproveedores.get(3));
      
      
      p.setProveedores(Proveedores);
              
       
       
       
   }
}
