package vistas;

import javax.swing.JOptionPane;
import modelo.*;

public class FormularioArtistas extends javax.swing.JFrame {

    private SpotifyMisionero sm = null;
    
    public FormularioArtistas(SpotifyMisionero sm) {
        this.sm = sm;
        initComponents();
        this.lstArtistas.setListData(this.sm.getArtistas().toArray());//muestra los artista en la lista cuando se abre la ventana
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstArtistas = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblAlbumes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Artistas");

        jPanel1.setToolTipText("");

        lstArtistas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstArtistas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstArtistasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstArtistas);

        jLabel1.setText("Nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblAlbumes.setBackground(new java.awt.Color(0, 204, 51));
        lblAlbumes.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar))
                    .addComponent(lblAlbumes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar))
                .addGap(44, 44, 44)
                .addComponent(lblAlbumes, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        
        if(txtNombre.getText().equals("")){//controla que los campos esten llenos
            JOptionPane.showMessageDialog(null, "¡Campo vacio!");
        }else if(this.lstArtistas.isSelectionEmpty()){//si no hay ningun artista seleccionado
            this.sm.crearArtista(this.txtNombre.getText());
            limpiar();
        }else{
            Artista a = (Artista) this.lstArtistas.getSelectedValue();
            this.sm.modificarArtista(a, this.txtNombre.getText());//edito el artista
            limpiar();
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void lstArtistasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstArtistasValueChanged
        //cuando cambie la seleccion de la lista de artistas
        if(!this.lstArtistas.isSelectionEmpty()){//si hay algo seleccionado en el listado
            Artista a = (Artista) this.lstArtistas.getSelectedValue();
            this.txtNombre.setText(a.getNombre());
            
            //con esto hago una cadena que me muestra los albumes de un artista seleccionado
            String albumes = "<html>Albumes:<ul>";
            
            for (Album al : a.getAlbumes()){
                albumes += "<li>" + al.getNombre() + "</li>";
            }
            
            albumes += "</ul></html>";
            
            this.lblAlbumes.setText(albumes);
        }
    }//GEN-LAST:event_lstArtistasValueChanged

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        if(!this.lstArtistas.isSelectionEmpty()){//si la seleccion no es vacia(hay algo seleccionado)
            Artista a = (Artista) this.lstArtistas.getSelectedValue();
            this.sm.eliminarArtista(a);//elimino el artista
        }
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlbumes;
    private javax.swing.JList lstArtistas;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void limpiar(){
        this.txtNombre.setText("");//limpia
        SpotifyMisionero.getPersistencia().refrescar(this.sm);//refresca la lista
        
        //cargo la lista de artistas
        this.lstArtistas.setListData(this.sm.getArtistas().toArray());
        this.lstArtistas.clearSelection();
    }
    
}
