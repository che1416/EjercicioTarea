/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Che
 */
public class ArrayEstudiantes {
    
    ArrayList<Estudiante>array;

    public ArrayEstudiantes()
    {
         array=new ArrayList<Estudiante>();   //como jalo el objeto. 
    }
    
    public void agregar(Estudiante estudiante)
    {
        array.add(estudiante);
        JOptionPane.showMessageDialog(null,"ya");
    }
}
