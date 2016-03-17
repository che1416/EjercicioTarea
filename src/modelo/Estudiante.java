/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Che
 */
public class Estudiante {

    static void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    String nombre,correo,cedula;
    
    public Estudiante(String nombre,String correo, String cedula)
    {
       setNombre(nombre);
       setCedula(cedula);
       setCorreo(correo);
    }
    
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }
       public String getNombre() {
        return nombre;
    }
      public  void setCedula(String cedula) {
        this.cedula= cedula;
    }
       public String getCedula() {
        return cedula;
    }
       public void setCorreo(String correo) {
        this.correo = correo;
    }
       public String getCorreo() {
        return correo;
    }
}
