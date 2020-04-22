/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Rosita
 */
public class tablapersonas {
    
    private Connection con;
    
    public tablapersonas(Connection con ){
        this.con=con;
        
    }
    
    public void insertar(Personas p) throws Exception{
       
        String plantilla="INSERT INTO personas VALUES (?,?,?,?);";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ps.setString(1,p.getNombre());
        ps.setInt(2,p.getEdad());
        ps.setString(3, p.getProfesion());
        ps.setString(4, p.getTelefono());
        
        int n=ps.executeUpdate();
        ps.close();
        if (n!=1){
            throw new Exception("El numero de filas actualizadas no es uno");
        }
    }    
        
    public  Personas seleccionUna(String nombre) throws Exception{
        String plantilla="select * from tablapersonas where nombre=?;";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ps.setString(1,nombre);
        
        ResultSet resultado=ps.executeQuery();
        
        if(resultado.next())
        {
            Personas p=new Personas();
            
            p.setNombre(resultado.getString("nombre"));
            p.setEdad(resultado.getInt("edad"));
            p.setProfesion(resultado.getString("profesion"));
            p.setTelefono(resultado.getString("telefono"));
            
            return p;
        }
        else 
            return null;
    }
    
    public ArrayList<Personas> seleccionTodo() throws Exception{
        
         ArrayList<Personas> listaper =new ArrayList();
        
       
        String plantilla="select * from tablapersonas;";
        PreparedStatement ps=con.prepareStatement(plantilla);
        
        ResultSet resultado=ps.executeQuery();
        
        while(resultado.next()){
             Personas p=new Personas();
            
            p.setNombre(resultado.getString("nombre"));
            p.setEdad(resultado.getInt("edad"));
            p.setProfesion(resultado.getString("profesion"));
            p.setTelefono(resultado.getString("telefono"));
            
            listaper.add(p);
            
        }
        return listaper;
    }
    
}
