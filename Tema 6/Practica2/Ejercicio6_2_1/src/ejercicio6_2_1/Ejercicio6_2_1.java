/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_2_1 ;
   
import Calses.Estudio;
import Calses.Pelicula;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;


public class Ejercicio6_2_1 {
     private static Estudio[] listaEstudios= new Estudio [4];
    
     private static ArrayList <Pelicula> listaPeliculas=new ArrayList();
    public static void main(String[] args) {
        try{
            crearEstudios();
            crearPeliculas();
            buscarPelicula();
            buscarEstudio();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getClass());
        }
    }
    
    public static void crearEstudios(){
    
    ;
    
    ArrayList<String> telefonos=new ArrayList();
    telefonos.add("1235587");
    telefonos.add("1256573");
    listaEstudios[0] =new Estudio("Fox","California","C/brasil,","www.fox.com",LocalDate.of(1923, 4, 6),"EEUU",telefonos);
    
    telefonos =new ArrayList();
    telefonos.add("13456454");
    telefonos.add("46546898");
    listaEstudios[1]=new Estudio("Universal", "Los Angeles"," C/ a","www.universal.es",LocalDate.of(1950, 4, 9),"EEUU",telefonos);
   
    telefonos = new ArrayList();
    telefonos.add("333333333");
    telefonos.add("333333334");
        //listaEstudios[2] = new Estudio("Warner Bros", "California"," C/ c","www.warner.es",sdf.parse("1956-01-10"),"EEUU",telefonos);
        listaEstudios[2] = new Estudio();
        listaEstudios[2].setNombre("Warner Bros");
        listaEstudios[2].setPais("EEUU");
        listaEstudios[2].setCiudad("California");
        listaEstudios[2].setDireccion(" C/ c");
        listaEstudios[2].setFechaFundacion(null);
        listaEstudios[2].setDirWeb("www.warner.es");
        listaEstudios[2].setTelefonos(telefonos);
        listaEstudios[2].setFechaFundacion(LocalDate.of(1956, 1 ,12));
    
     telefonos = new ArrayList();
        telefonos.add("444444444");
        telefonos.add("444444445");
        listaEstudios[3] = new Estudio("Paramount", "Los Angeles"," C/ d","www.paramount.es",LocalDate.of(1955, 8 ,30),"EEUU",telefonos);
    
    
    }
   public static void crearPeliculas(){
      ArrayList <Estudio> lista = new ArrayList();
        lista.add(listaEstudios[0]);
        lista.add(listaEstudios[2]);
        Pelicula p = new Pelicula("ET",1989,90.7f,"Infantil",lista);
        listaPeliculas.add(p); 
       
        lista = new ArrayList();
        lista.add(listaEstudios[1]);
        lista.add(listaEstudios[2]);
        listaPeliculas.add(new Pelicula("Titanic",1985,180f,"Romántica",lista));
    lista = new ArrayList();
        lista.add(listaEstudios[4]);
        listaPeliculas.add(new Pelicula("El señor de los anillos",2001,133f,"Ciencia ficción",lista));
     lista = new ArrayList();
        lista.add(listaEstudios[3]);
        lista.add(listaEstudios[4]);
        lista.add(listaEstudios[1]);
        lista.add(listaEstudios[2]);
        listaPeliculas.add(new Pelicula("Piratas del Caribe",2010,220f,"Aventuras",lista));
   
     lista = new ArrayList();
        lista.add(listaEstudios[1]);
        listaPeliculas.add(new Pelicula("El rey león",1995,97f,"Infantil",lista));
   
   } 
   public static void  buscarPelicula(){
        float maximo = 0;
        Pelicula objeto=null;
        for(int x=0; x < listaPeliculas.size();x++)
        {
            if (listaPeliculas.get(x).getDuracion() > maximo)
            {
                maximo = listaPeliculas.get(x).getDuracion();
                objeto = listaPeliculas.get(x);
                // También me puedo quedar con la posición
            }
        }
        
        // Nombre de todos los estudios que han producido la película
        String mensaje = "";
        for (int x = 0; x < objeto.getListaEstudios().size();x++)
            mensaje += " " + objeto.getListaEstudios().get(x).getNombre();
        
        javax.swing.JOptionPane.showMessageDialog(null," La pelicula más larga es " + objeto.getTitulo()+ " y se ha producido en " + mensaje);
     /* int posicion = 0;
        float mayor = 0;
        ArrayList <Pelicula> listaPeliculas=new ArrayList();
        for(int x=0;x<listaPeliculas.size();x++)
        {
            float duracion = listaPeliculas.get(x).getDuracion();
            if (duracion>mayor)
            {
               mayor = duracion;
              
            }
        }
        String mensaje="";
        for(int x=0;x<listaPeliculas.get(x).getListaEstudios().size();x++)
        {
         mensaje += listaPeliculas.get(posicion).getListaEstudios().get(x).getNombre()+"  ";
        }
        JOptionPane.showMessageDialog(null, "La pelicula mas larga es "+listaPeliculas.get(posicion).getTitulo()+" con "+listaPeliculas.get(posicion).getDuracion()+" minutos"
        +"\n\nSe ha producido en "+mensaje);
       */
   }
   
   public static void buscarEstudio(){
       
       int numeroPeliculas[] = new int[5];
        Arrays.fill(numeroPeliculas, 0);
        
        // Por cada Estudio recorro la lista de todas las películas para ver si está o no.
        for(int z = 0;z < listaEstudios.length; z++)
            for(int x=0; x < listaPeliculas.size();x++)
            {
                boolean salir = false;
                for(int y=0; y < listaPeliculas.get(x).getListaEstudios().size() && salir == false; y++)
                {
                    if (listaPeliculas.get(x).getListaEstudios().get(y)== listaEstudios[z])
                    {
                        numeroPeliculas[z]+= 1;
                        salir = true;                    
                    }
                }
            }
        
        // Busco el máximo contador
        int maximo = 0;
        int posicion = 0;
        for (int x = 0; x < numeroPeliculas.length; x++)
            if(numeroPeliculas[x] > maximo)
            {
                maximo = numeroPeliculas[x];
                posicion = x;
            }
        
        javax.swing.JOptionPane.showMessageDialog(null,"El estudio que más películas ha producido es: " + listaEstudios[posicion].getNombre() + " y ha producido "+ maximo);
    }
}
 
   
   
  
       
   
    
    

