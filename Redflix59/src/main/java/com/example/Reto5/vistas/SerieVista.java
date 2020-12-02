/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Reto5.vistas;
import com.example.Reto5.Reto5Application;
import com.example.Reto5.SpringContext;
import com.example.Reto5.modelos.Series;
import com.example.Reto5.repositorio.serieRepositorio;
import java.util.Optional;
/**
 *
 * @author yeimy
 */
public class SerieVista extends javax.swing.JFrame {
serieRepositorio  serierepositorio;
    /**
     * Creates new form SerieVista
     */
    public SerieVista() {
        initComponents();
        String [] args = {};
        Reto5Application.IniciarSpring();
         
        serierepositorio = SpringContext.getBean(serieRepositorio.class);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CampoIdSerie = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CampoTitulo = new javax.swing.JTextField();
        CampoTemp = new javax.swing.JTextField();
        CampoEpisodios = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JButton();
        BotonActualizar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonCrear = new javax.swing.JButton();
        CampoSalida = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CampoIdSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoIdSerieActionPerformed(evt);
            }
        });

        jLabel1.setText("Id Serie");

        jLabel2.setText("Título");

        jLabel3.setText("Número de Temporadas");

        jLabel4.setText("Número de Espisodios");

        CampoTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTituloActionPerformed(evt);
            }
        });

        CampoTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTempActionPerformed(evt);
            }
        });

        CampoEpisodios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEpisodiosActionPerformed(evt);
            }
        });

        BotonBuscar.setText("Buscar");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        BotonActualizar.setText("Actualizar");
        BotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarActionPerformed(evt);
            }
        });

        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        BotonCrear.setText("Crear");
        BotonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearActionPerformed(evt);
            }
        });

        CampoSalida.setText("...");

        jLabel6.setText("              Series  RedFLixPro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CampoIdSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(BotonBuscar))
                            .addComponent(CampoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoEpisodios, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonActualizar)
                                .addGap(32, 32, 32)
                                .addComponent(BotonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CampoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(CampoIdSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(BotonBuscar)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CampoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CampoEpisodios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CampoTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonActualizar)
                    .addComponent(BotonEliminar)
                    .addComponent(BotonCrear))
                .addGap(18, 18, 18)
                .addComponent(CampoSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoIdSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoIdSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoIdSerieActionPerformed

    private void CampoTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTituloActionPerformed

    private void CampoTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTempActionPerformed

    private void CampoEpisodiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEpisodiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEpisodiosActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        // TODO add your handling code here:
        if (CampoIdSerie.getText().equals("")){
            CampoSalida.setText("Falta información.");
        }else{
            buscarPorId();
        }   
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed
        // TODO add your handling code here:
        if (CampoIdSerie.getText().equals("") || CampoTitulo.getText().equals("") || CampoEpisodios.getText().equals("") || CampoTemp.getText().equals("")){
            CampoSalida.setText("Falta información.");
        }else{
            Actualizar();
        }   
    }//GEN-LAST:event_BotonActualizarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        // TODO add your handling code here:
        if (CampoIdSerie.getText().equals("") || CampoTitulo.getText().equals("") || CampoEpisodios.getText().equals("") || CampoTemp.getText().equals("")){
            CampoSalida.setText("Falta información.");
        }else{
            eliminarCuenta();
        }   
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearActionPerformed
        // TODO add your handling code here:
         if (CampoIdSerie.getText().equals("") || CampoTitulo.getText().equals("") || CampoEpisodios.getText().equals("") || CampoTemp.getText().equals("")){
            CampoSalida.setText("Falta información.");
        }else{
            crearPelicula();
        }   
    }//GEN-LAST:event_BotonCrearActionPerformed

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
            java.util.logging.Logger.getLogger(SerieVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SerieVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SerieVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SerieVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SerieVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonCrear;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JTextField CampoEpisodios;
    private javax.swing.JTextField CampoIdSerie;
    private javax.swing.JLabel CampoSalida;
    private javax.swing.JTextField CampoTemp;
    private javax.swing.JTextField CampoTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
   
    
    public void buscarPorId(){
        
        String id_serie = CampoIdSerie.getText();
        String Titulo = CampoTitulo.getText();
        String num_epidosios = CampoEpisodios.getText();
        String num_temporadas = CampoTemp.getText();
     
        CampoSalida.setText("Buscando Serie.....");
        Optional<Series> seriesConsulta = serierepositorio.findById(id_serie);
        //select * from Usuarios where nom_usuario = "Laura";
        if(seriesConsulta.isPresent()){
                CampoSalida.setText("Serie Existente");
            }else{
                CampoSalida.setText("La serie no existe");
            }
    }
    
       public void Actualizar(){
        String id_serie = CampoIdSerie.getText();
        String Titulo = CampoTitulo.getText();
        String num_episodios = CampoEpisodios.getText();
        String num_temporadas = CampoTemp.getText();
           
        CampoSalida.setText("Buscando Serie.....");
        Optional<Series> seriesConsulta = serierepositorio.findById(id_serie);
             
        if(seriesConsulta.isPresent()){
            Series serie = new Series();
            serie.setId_serie(id_serie);
            serie.setTitulo(Titulo);
            serie.setNum_episodios(num_episodios);
            serie.setNum_temporadas(num_temporadas);
          
            
        serierepositorio.save(serie);
            CampoSalida.setText("Actualización exitosa");
   
        }else{
            CampoSalida.setText("Serie no existente.");
        }
    } 
    
   public void crearPelicula(){
        String id_serie = CampoIdSerie.getText();
        String Titulo = CampoTitulo.getText();
        String num_episodios = CampoEpisodios.getText();
        String num_temporadas = CampoTemp.getText();
           
     
        CampoSalida.setText("Buscando pelicula.....");
         Optional<Series> seriesConsulta = serierepositorio.findById(id_serie);
        if(seriesConsulta.isPresent()){
            CampoSalida.setText("La película ya existe.");
        }else{
            Series serie = new Series();
            serie.setId_serie(id_serie);
            serie.setTitulo(Titulo);
            serie.setNum_episodios(num_episodios);
            serie.setNum_temporadas(num_temporadas);
          
            
        
            serierepositorio.save(serie);
            CampoSalida.setText("Serie creada con exito");
            
        }
    }
    
    public void eliminarCuenta(){
        String id_serie = CampoIdSerie.getText();
        String Titulo = CampoTitulo.getText();
        String num_episodios = CampoEpisodios.getText();
        String num_temporadas = CampoTemp.getText();
           
     
        CampoSalida.setText("Buscando pelicula.....");
        Optional<Series> seriesConsulta = serierepositorio.findById(id_serie);
        
        if(seriesConsulta.isPresent()){
            if (seriesConsulta.get().getId_serie().equals(id_serie)){
            serierepositorio.delete(seriesConsulta.get());
            CampoSalida.setText("Serie eliminada con exito.");
        }
           }else{
            CampoSalida.setText("La Serie no existe.");
        }
    }         
}
