/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Reto5.vistas;

import com.example.Reto5.Reto5Application;
import com.example.Reto5.SpringContext;
import com.example.Reto5.modelos.Usuarios;
import com.example.Reto5.repositorio.UsuarioRepositorio;
import java.util.Optional;

/**
 *
 * @author Family
 */
public class UsuarioVista extends javax.swing.JFrame {
    UsuarioRepositorio usuariorepositorio;
    /**
     * Creates new form UsuarioVista
     */
    public UsuarioVista() {
        initComponents();
        String [] args = {};
        Reto5Application.IniciarSpring();
         
        usuariorepositorio = SpringContext.getBean(UsuarioRepositorio.class);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CampoUsuario = new javax.swing.JTextField();
        CampoNombre = new javax.swing.JTextField();
        CampoApellidos = new javax.swing.JTextField();
        CampoContrasena = new javax.swing.JTextField();
        CampoEmail = new javax.swing.JTextField();
        CampoCelular = new javax.swing.JTextField();
        CampoBorn = new javax.swing.JTextField();
        BotonRegistro = new javax.swing.JButton();
        CampoActualizar = new javax.swing.JButton();
        CampoSalida = new javax.swing.JLabel();
        BotonBuscar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("    Usuario RedFlixPro");

        jLabel2.setText("Usuario");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        jLabel5.setText("Contraseña");

        jLabel6.setText("email");

        jLabel7.setText("Fecha de nacimiento");

        jLabel8.setText("Celular");

        CampoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoUsuarioActionPerformed(evt);
            }
        });

        CampoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNombreActionPerformed(evt);
            }
        });

        CampoBorn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoBornActionPerformed(evt);
            }
        });

        BotonRegistro.setText("Registrarse");
        BotonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistroActionPerformed(evt);
            }
        });

        CampoActualizar.setText("Actualizar");
        CampoActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoActualizarActionPerformed(evt);
            }
        });

        CampoSalida.setText("...");

        BotonBuscar.setText("Buscar");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        BotonEliminar.setText("Eliminar Cuenta");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CampoSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 61, Short.MAX_VALUE)
                        .addComponent(CampoActualizar)
                        .addGap(56, 56, 56)
                        .addComponent(BotonRegistro)
                        .addGap(27, 27, 27)
                        .addComponent(BotonEliminar)))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(CampoBorn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CampoEmail)
                                    .addComponent(CampoContrasena)
                                    .addComponent(CampoApellidos)
                                    .addComponent(CampoNombre)
                                    .addComponent(CampoUsuario)
                                    .addComponent(CampoCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(BotonBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CampoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CampoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CampoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CampoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(CampoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(CampoBorn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonRegistro)
                    .addComponent(CampoActualizar)
                    .addComponent(BotonEliminar))
                .addGap(25, 25, 25)
                .addComponent(CampoSalida)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistroActionPerformed
        // TODO add your handling code here:
        if (CampoUsuario.getText().equals("") || CampoNombre.getText().equals("") || CampoApellidos.getText().equals("") || CampoContrasena.getText().equals("") || CampoEmail.getText().equals("") || CampoCelular.getText().equals("")|| CampoBorn.getText().equals("")){
            CampoSalida.setText("Falta información.");
        }else{
            crearUsuario();
        }   
    }//GEN-LAST:event_BotonRegistroActionPerformed

    private void CampoBornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoBornActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoBornActionPerformed

    private void CampoActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoActualizarActionPerformed
        // TODO add your handling code here
         if (CampoUsuario.getText().equals("") || CampoNombre.getText().equals("") || CampoApellidos.getText().equals("") || CampoContrasena.getText().equals("") || CampoEmail.getText().equals("") || CampoCelular.getText().equals("")|| CampoBorn.getText().equals("")){
            CampoSalida.setText("Falta información.");
        }else{
            cambioContrasena();
        }   
    }//GEN-LAST:event_CampoActualizarActionPerformed

    private void CampoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoUsuarioActionPerformed

    private void CampoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNombreActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        // TODO add your handling code here:
         if (CampoUsuario.getText().equals("")){
            CampoSalida.setText("Falta información.");
        }else{
            buscarPorId();
        }   
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        // TODO add your handling code here:
         if (CampoUsuario.getText().equals("") || CampoNombre.getText().equals("") || CampoApellidos.getText().equals("") || CampoContrasena.getText().equals("") || CampoEmail.getText().equals("") || CampoCelular.getText().equals("")|| CampoBorn.getText().equals("")){
            CampoSalida.setText("Falta información.");
        }else{
            eliminarCuenta();
        }   
    }//GEN-LAST:event_BotonEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(UsuarioVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonRegistro;
    private javax.swing.JButton CampoActualizar;
    private javax.swing.JTextField CampoApellidos;
    private javax.swing.JTextField CampoBorn;
    private javax.swing.JTextField CampoCelular;
    private javax.swing.JTextField CampoContrasena;
    private javax.swing.JTextField CampoEmail;
    private javax.swing.JTextField CampoNombre;
    private javax.swing.JLabel CampoSalida;
    private javax.swing.JTextField CampoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
    public void buscarPorId(){
        String Id_usuario = CampoUsuario.getText();
        String Nombre = CampoNombre.getText();
        String Apellido = CampoApellidos.getText();
        String Contraseña = CampoContrasena.getText();
        String Fecha_Nacimiento = CampoBorn.getText();
        String Email = CampoEmail.getText();
        String Celular = CampoCelular.getText();
        
        CampoSalida.setText("Buscando usuario.....");
        Optional<Usuarios> usuarioConsulta = usuariorepositorio.findById(Id_usuario);
        //select * from Usuarios where nom_usuario = "Laura";
        if(usuarioConsulta.isPresent()){
                CampoSalida.setText("Usuario Existente");
            }else{
                CampoSalida.setText("El Usuario no se encuentra registrado");
            }
    }
    
     public void cambioContrasena(){
        String Id_usuario = CampoUsuario.getText();
        String Nombre = CampoNombre.getText();
        String Apellido = CampoApellidos.getText();
        String Contraseña = CampoContrasena.getText();
        String Fecha_Nacimiento = CampoBorn.getText();
        String Email = CampoEmail.getText();
        String Celular = CampoCelular.getText();
        
        
        CampoSalida.setText("Buscando usuario.....");
        Optional<Usuarios> usuarioConsulta = usuariorepositorio.findById(Id_usuario);
        //select * from Usuarios where nom_usuario = "Laura";
        if(usuarioConsulta.isPresent()){
            Usuarios user = new Usuarios();
            user.setId_usuario(Id_usuario);
            user.setNombre(Nombre);
            user.setApellido(Apellido);
            user.setContraseña(Contraseña);
            user.setEmail(Email);
            user.setCelular(Celular);
            user.setFecha_nacimiento(Fecha_Nacimiento);
        
        usuariorepositorio.save(user);
            CampoSalida.setText("Actualización exitosa");
   
        }else{
            CampoSalida.setText("Usuario no existente.");
        }
    } 

        public void crearUsuario(){
        String Id_usuario = CampoUsuario.getText();
        String Nombre = CampoNombre.getText();
        String Apellido = CampoApellidos.getText();
        String Contraseña = CampoContrasena.getText();
        String Fecha_Nacimiento = CampoBorn.getText();
        String Email = CampoEmail.getText();
        String Celular = CampoCelular.getText();
        
        CampoSalida.setText("Buscando usuario.....");
        Optional<Usuarios> usuarioConsulta = usuariorepositorio.findById(Id_usuario);
        //select * from Usuarios where nom_usuario = "Laura";
        if(usuarioConsulta.isPresent()){
            CampoSalida.setText("Usuario ya existe.");
        }else{
             Usuarios user = new Usuarios();
            user.setId_usuario(Id_usuario);
            user.setNombre(Nombre);
            user.setApellido(Apellido);
            user.setContraseña(Contraseña);
            user.setEmail(Email);
            user.setCelular(Celular);
            user.setFecha_nacimiento(Fecha_Nacimiento);
        
            usuariorepositorio.save(user);
            CampoSalida.setText("Usuario creado con exito");
            
        }
    }
    
    public void eliminarCuenta(){
        String Id_usuario = CampoUsuario.getText();
        String Nombre = CampoNombre.getText();
        String Apellido = CampoApellidos.getText();
        String Contraseña = CampoContrasena.getText();
        String Fecha_Nacimiento = CampoBorn.getText();
        String Email = CampoEmail.getText();
        String Celular = CampoCelular.getText();
        
        CampoSalida.setText("Buscando usuario.....");
        Optional<Usuarios> usuarioConsulta = usuariorepositorio.findById(Id_usuario);
        //select * from Usuarios where nom_usuario = "Laura";
        if(usuarioConsulta.isPresent()){
            if (usuarioConsulta.get().getId_usuario().equals(Id_usuario)){
                usuariorepositorio.delete(usuarioConsulta.get());
                CampoSalida.setText("Cuenta eliminada con exito.");
            }else{
                CampoSalida.setText("Contraseña incorrecta");
            }
        }else{
            CampoSalida.setText("Usuario no existe.");
        }
    }
}


