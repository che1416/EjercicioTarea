/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author Che
 */
public class Estudiante {
    
    
    String nombre,direccion,cedula;
    
    public Estudiante(String nombre,String direccion, String cedula)
    {
       setNombre(nombre);
       setCedula(cedula);
       setDireccion(direccion);
    }
    
     private void setNombre(String nombre) {
        this.nombre = nombre;
    }
       public String getNombre() {
        return nombre;
    }
      private void setCedula(String cedula) {
        this.cedula= cedula;
    }
       public String getCedula() {
        return cedula;
    }
       private void setDireccion(String direccion) {
        this.direccion = direccion;
    }
       public String getDireccion() {
        return direccion;
    }
}
