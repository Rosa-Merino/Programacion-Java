/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_2_2;
import MisClases.*;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Rosita
 */
public class Ejercicio6_2_2 {




    static ArrayList<Pelicula> peliculas = new ArrayList();
    static ArrayList<Estudio> estudios = new ArrayList();
    public static void main(String[] args) {
        
        ArrayList<String> telefonos = new ArrayList();
        telefonos.add("999999");
        Estudio estudio = new Estudio();
        estudio.setNombre("Columbia Pictures");
        estudio.setFechaFundacion(LocalDate.of(1994, 01, 01));
        estudio.setCiudad("Washington DC");
        estudio.setDireccion("su direccion 1");
        estudio.setDrweb("pagina 1");
        estudio.setPais("USA");
        estudio.setTelefono(telefonos);
        estudios.add(estudio);
        
        telefonos = new ArrayList();
        telefonos.add("777777");
        telefonos.add("888888");
        estudio = new Estudio();
        estudio.setNombre("Century Fox");
        estudio.setFechaFundacion(LocalDate.of(1915, 01, 01));
        estudio.setCiudad("Los Angeles");
        estudio.setDireccion("su direccion 2");
        estudio.setDrweb("pagina 2");
        estudio.setPais("USA");
        estudio.setTelefono(telefonos);
        estudios.add(estudio);
        
        telefonos = new ArrayList();
        telefonos.add("666666");
        telefonos.add("555555");
        estudio = new Estudio();
        estudio.setNombre("Warner Bros");
        estudio.setFechaFundacion(LocalDate.of(1923, 04, 06));
        estudio.setCiudad("Las Vegas");
        estudio.setDireccion("su direccion 3");
        estudio.setDrweb("pagina 3");
        estudio.setPais("USA");
        estudio.setTelefono(telefonos);
        estudios.add(estudio);
        
        ArrayList<Estudio> estudiosmain = new ArrayList();
        estudiosmain.add(estudios.get(2));
        estudiosmain.add(estudios.get(0));
        Pelicula pelicula = new Pelicula();
        pelicula.setTitulo("Cadena Perpetua");
        pelicula.setDuracion(125.3f);
        pelicula.setAno("2002");
        pelicula.setTipo("Drama");
        pelicula.setEstudio(estudiosmain);
        peliculas.add(pelicula);
        
        estudiosmain = new ArrayList();
        estudiosmain.add(estudios.get(2));
        estudiosmain.add(estudios.get(1));
        pelicula = new Pelicula();
        pelicula.setTitulo("Titanic");
        pelicula.setDuracion(118.8f);
        pelicula.setAno("2001");
        pelicula.setTipo("Drama");
        pelicula.setEstudio(estudiosmain);
        peliculas.add(pelicula);
        
        estudiosmain = new ArrayList();
        estudiosmain.add(estudios.get(0));
        estudiosmain.add(estudios.get(1));
        estudiosmain.add(estudios.get(2));
        pelicula = new Pelicula();
        pelicula.setTitulo("Pelicula 3");
        pelicula.setDuracion(100.8f);
        pelicula.setAno("2019");
        pelicula.setTipo("Comedia");
        pelicula.setEstudio(estudiosmain);
        peliculas.add(pelicula);
        
        estudiosmain = new ArrayList();
        estudiosmain.add(estudios.get(0));
        pelicula = new Pelicula();
        pelicula.setTitulo("Peli 4");
        pelicula.setDuracion(96.3f);
        pelicula.setAno("1990");
        pelicula.setTipo("terror");
        pelicula.setEstudio(estudiosmain);
        peliculas.add(pelicula);
        
        ArrayList<Pelicula> peliculas2 = new ArrayList();
        peliculas2.add(peliculas.get(0));
        peliculas2.add(peliculas.get(2));
        peliculas2.add(peliculas.get(3));
        estudios.get(0).setPelicula(peliculas2);
        
        peliculas2 = new ArrayList();
        peliculas2.add(peliculas.get(1));
        peliculas2.add(peliculas.get(2));
        estudios.get(1).setPelicula(peliculas2);
        
        peliculas2 = new ArrayList();
        peliculas2.add(peliculas.get(0));
        peliculas2.add(peliculas.get(1));
        peliculas2.add(peliculas.get(2));
        estudios.get(2).setPelicula(peliculas2);
        
        
       int posicion = 0;
        float mayor = 0;
        for(int x=0;x<peliculas.size();x++)
        {
            float duracion = peliculas.get(x).getDuracion();
            if (duracion>mayor)
            {
               mayor = duracion;
               posicion = x;
            }
        }
        String stringestudios="";
        for(int x=0;x<peliculas.get(posicion).getEstudio().size();x++)
        {
            stringestudios += peliculas.get(posicion).getEstudio().get(x).getNombre()+"  ";
        }
        JOptionPane.showMessageDialog(null, "La pelicula mas larga es "+peliculas.get(posicion).getTitulo()+" con "+peliculas.get(posicion).getDuracion()+" minutos"
        +"\n\nSe ha producido en "+stringestudios);
        
        int maximo=-1;
        String maspelis = "";
        for(int x=0; x<estudios.size();x++)
        {   
            if(estudios.get(x).getPelicula().size()==maximo)
            {
                maspelis += "\n\n"+estudios.get(x).getNombre()+" con "+estudios.get(x).getPelicula().size()+" peliculas";
            }
            if(estudios.get(x).getPelicula().size()>maximo)
            {
                maspelis = "El/Los estudio/s con mas peliculas producidas es/son:\n\n "+estudios.get(x).getNombre()+" con "+estudios.get(x).getPelicula().size()+" peliculas";
                maximo = estudios.get(x).getPelicula().size();
            }
            
        }
        JOptionPane.showMessageDialog(null, maspelis);
    }
    
}
    
    
    
    
    
    

