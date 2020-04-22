/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.*;
/**
 *
 * @author Rosita
 */
public class BaseDatos {
    
    private Connection con;

    public BaseDatos() {
    }
    
   public void conectar(){
    try{
       Class.forName("com.mysql.jdbc.Driver");
       
       String bd="baseejeruno";
       String url="jdbc:mysql://localhost:3306/"+bd;
       String login="root";
       String password="";
       con=DriverManager.getConnection(url, login, password);
       
       if(con==null){
           throw new Exception("problemas con la conexion");
       }
       
       
    
   } catch (Exception e)
   {
    System.out.println(e.getMessage());
            
   }
    
   }
   
   
   public void desconectar(){
       try{
           con.close();
       }
       catch(Exception e){
           System.out.println("Problemas cerrando la conexion");
       }
   }
   
   public Connection getCon(){
       return con;
   }
}



