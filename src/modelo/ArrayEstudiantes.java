/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Che
 */
public class ArrayEstudiantes {
    
    private final  ArrayList<Estudiante> solicitud;
    private Estudiante estudiante;
     String nombre="";
    String direccion="";
    String cedula="";
    
    public ArrayEstudiantes()
    {
         solicitud=new ArrayList<>();   //como jalo el objeto. 
    }
    
    public void agregar(Estudiante estudiante)
    {
        solicitud.add(estudiante);
        JOptionPane.showMessageDialog(null,"ya");
    }
    public Estudiante buscar(String cedula)
    {
        Estudiante estudiante=null;
        for(int i=0;i<solicitud.size();i++)
        {
            if(solicitud.get(i).getCedula().equals(cedula))
            {
               estudiante=estudiante;
            }
        }
          return estudiante;
    }
    
    public void modificar(String nombre,String cedula,String correo)
    {
        for(int i=0;i<solicitud.size();i++)
        {
         if(solicitud.get(i).getCedula().equals(cedula))
         {
            solicitud.get(i).setNombre(nombre);
            solicitud.get(i).setCorreo(correo);
         }
        }
    }
    
    public void eliminar(String cedula)
    {
       for(int i=0;i<solicitud.size();i++)
       {
          if(solicitud.get(i).getCedula().equals(cedula))
          {
             solicitud.remove(i);      
          }
       }
    }
}//fin
