package vistas;

import javax.swing.JOptionPane;
import modelo.*;

public class FormularioAlbumes extends javax.swing.JFrame {

    private SpotifyMisionero sm = null;
    
    public FormularioAlbumes(SpotifyMisionero sm) {
        this.sm = sm;
        initComponents();
        this.lstAlbumes.setListData(this.sm.getAlbumes().toArray());//muestra los artista en la lista cuando se abre la ventana
        
        //lleno el combo box de artista
        for( Artista a : this.sm.getArtistas()){
            this.cmbArtistas.addItem(a);
        }
        
        //le digo al combo que ningun elemento esteé seleccionado
        this.cmbArtistas.setSelectedItem(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstAlbumes = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmbArtistas = new javax.swing.JComboBox();
        lblCanciones = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Albumes");

        lstAlbumes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstAlbumes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstAlbumesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstAlbumes);

        jLabel1.setText("Nombre del album");

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

        jLabel2.setText("Artista");

        lblCanciones.setBackground(new java.awt.Color(0, 204, 51));
        lblCanciones.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar))
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbArtistas, javax.swing.GroupLayout.Alignment.LEADING, 0, 217, Short.MAX_VALUE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblCanciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbArtistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addComponent(lblCanciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        
        if(txtNombre.getText().equals("") || cmbArtistas.getSelectedItem() == null){//controla que los campos esten llenos
            JOptionPane.showMessageDialog(null, "¡Campo vacio!");
        }else if(this.lstAlbumes.isSelectionEmpty()){//si no hay ningun artista seleccionado
            this.sm.crearAlbum(this.txtNombre.getText(), (Artista)this.cmbArtistas.getSelectedItem());
            limpiar();
        }else{
            Album al = (Album) this.lstAlbumes.getSelectedValue();
            this.sm.modificarAlbum(al, this.txtNombre.getText(), (Artista)this.cmbArtistas.getSelectedItem());//edito el album
            limpiar();
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void lstAlbumesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstAlbumesValueChanged
        //cuando cambie la seleccion de la lista de aalbumes
        if(!this.lstAlbumes.isSelectionEmpty()){//si hay algo seleccionado en el listado
            Album al = (Album) this.lstAlbumes.getSelectedValue();
            this.txtNombre.setText(al.getNombre());
            this.cmbArtistas.setSelectedItem(al.getArtista());
            
            
            //con esto hago una cadena que me muestre las canciones de un album seleccionado de la lista
            String canciones = "<html>Canciones:<ul>";
            
            for (Cancion c : al.getCanciones()){
                canciones += "<li>" + c.getNombre() + "</li>";
            }
            
            canciones += "</ul></html>";
            
            this.lblCanciones.setText(canciones);
        }
    }//GEN-LAST:event_lstAlbumesValueChanged

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        if(!this.lstAlbumes.isSelectionEmpty()){//si la seleccion no es vacia(hay algo seleccionado)
            Album al = (Album) this.lstAlbumes.getSelectedValue();
            this.sm.eliminarAlbum(al);//elimino el album
        }
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox cmbArtistas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCanciones;
    private javax.swing.JList lstAlbumes;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void limpiar(){
        this.txtNombre.setText("");//limpia
        this.cmbArtistas.setSelectedIndex(-1);
        SpotifyMisionero.getPersistencia().refrescar(this.sm);//refresca la lista
        
        //cargo la lista de artistas
        this.lstAlbumes.setListData(this.sm.getAlbumes().toArray());
        this.lstAlbumes.clearSelection();
    }
    
}
