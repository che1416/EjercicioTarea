/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

//import java.util.Locale;

import controlador.Controlador_FRM_ventanaPrincipal;


/**
 *
 * @author administrador
 */
public class FDM_ventanaPrincipal extends javax.swing.JFrame {
      
     JF_mantenimientoEstudiantes mantenimientoEstudiantes;
     Controlador_FRM_ventanaPrincipal ventanaPrincipal;
     
    private Object salir;
    /**
     * Creates new form FDM_ventanaPrincipal
     */
    public FDM_ventanaPrincipal() {
        
        
        initComponents();
        this.setLocation(200,200);
        mantenimientoEstudiantes = new JF_mantenimientoEstudiantes();
        ventanaPrincipal= new Controlador_FRM_ventanaPrincipal();
        
        agregarEventos();
    }
   
      public void agregarEventos()
      {
          this.jM_Salir.addActionListener( ventanaPrincipal);
      
      }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BarraMenu = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        jM_Salir = new javax.swing.JMenuItem();
        Mantenimiento = new javax.swing.JMenu();
        Estudiantes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/firma-ucr-ico.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        Archivo.setText("Archivo");

        jM_Salir.setText("salir");
        jM_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_SalirActionPerformed(evt);
            }
        });
        Archivo.add(jM_Salir);

        BarraMenu.add(Archivo);

        Mantenimiento.setText("Mantenimiento");

        Estudiantes.setText("Estudiantes");
        Estudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstudiantesActionPerformed(evt);
            }
        });
        Mantenimiento.add(Estudiantes);

        BarraMenu.add(Mantenimiento);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jM_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jM_SalirActionPerformed

    private void EstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstudiantesActionPerformed
          this.mantenimientoEstudiantes.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_EstudiantesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FDM_ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FDM_ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FDM_ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FDM_ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FDM_ventanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Archivo;
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenuItem Estudiantes;
    private javax.swing.JMenu Mantenimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jM_Salir;
    // End of variables declaration//GEN-END:variables
}
