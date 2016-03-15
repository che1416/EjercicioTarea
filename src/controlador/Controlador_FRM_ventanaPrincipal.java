/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.JF_mantenimientoEstudiantes;

/**
 *
 * @author Che
 */
public class Controlador_FRM_ventanaPrincipal implements ActionListener {
    
    JF_mantenimentoEstudiantes mantenimientoEstudiantes;
    
    public Controlador_FRM_ventanaPrincipal()
    {
       mantenimientoEstudiantes= new JF_mantenimentoEstudiantes();
        
    }
    
    
    
    public void actionPerformed( ActionEvent e)
    {
       if(e.getActionCommand().equals("salir"))
               {
                 System.exit(0);
               }
       if(e.getActionCommand().equals(" Estudiantes"))
       {
           if(e.getActionCommand().equals("agregar"))
           {
              
           }
       }
    }
}
