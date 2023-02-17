package vistas;

import javax.swing.JOptionPane;
import modelo.*;

public class FormularioCanciones extends javax.swing.JFrame {

    private SpotifyMisionero sm = null;
    
    public FormularioCanciones(SpotifyMisionero sm) {
        this.sm = sm;
        initComponents();
        this.lstCanciones.setListData(this.sm.getCanciones().toArray());//muestra los artista en la lista cuando se abre la ventana
        
        //lleno el combo box de artista
        for( Artista a : this.sm.getArtistas()){
            this.cmbArtistas.addItem(a);
        }
        
        //le digo al combo que ningun elemento esteé seleccionado
        this.cmbArtistas.setSelectedItem(null);
        
        
        //lleno el combo box de albumes
        for( Album al : this.sm.getAlbumes()){
            this.cmbAlbumes.addItem(al);
        }
        
        //le digo al combo que ningun elemento esteé seleccionado
        this.cmbAlbumes.setSelectedItem(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCanciones = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminarC = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmbArtistas = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cmbAlbumes = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Canciones");

        lstCanciones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstCanciones.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstCancionesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstCanciones);

        jLabel1.setText("Nombre de la cancion");

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

        btnEliminarC.setText("Eliminar");
        btnEliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCActionPerformed(evt);
            }
        });

        jLabel2.setText("Artista");

        cmbArtistas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbArtistasItemStateChanged(evt);
            }
        });
        cmbArtistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbArtistasActionPerformed(evt);
            }
        });

        jLabel3.setText("Album");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarC))
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cmbAlbumes, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbArtistas, javax.swing.GroupLayout.Alignment.LEADING, 0, 217, Short.MAX_VALUE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbArtistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbAlbumes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminarC))
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
       
        if(txtNombre.getText().equals("") || cmbArtistas.getSelectedItem() == null || cmbAlbumes.getSelectedItem() == null){//controla que los campos esten llenos
            JOptionPane.showMessageDialog(null, "¡Campo vacio!");
        }else if (this.lstCanciones.isSelectionEmpty()){//si no hay ningun artista seleccionado
            this.sm.crearCancion(this.txtNombre.getText(), (Artista)this.cmbArtistas.getSelectedItem(), (Album)this.cmbAlbumes.getSelectedItem());
            limpiar();
        }else{
            Cancion c = (Cancion) this.lstCanciones.getSelectedValue();
            this.sm.modificarCancion(c, this.txtNombre.getText(), (Artista)this.cmbArtistas.getSelectedItem(), (Album)this.cmbAlbumes.getSelectedItem());//edito la cancion
            limpiar();
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void lstCancionesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstCancionesValueChanged
        //cuando cambie la seleccion de la lista de canciones
        if(!this.lstCanciones.isSelectionEmpty()){//si hay algo seleccionado en el listado
            Cancion c = (Cancion) this.lstCanciones.getSelectedValue();
            this.txtNombre.setText(c.getNombre());
            this.cmbArtistas.setSelectedItem(c.getArtista());
            this.cmbAlbumes.setSelectedItem(c.getAlbumes());
        }
    }//GEN-LAST:event_lstCancionesValueChanged

    private void btnEliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCActionPerformed
        
        if(!this.lstCanciones.isSelectionEmpty()){//si la seleccion no es vacia(hay algo seleccionado)
            Cancion c = (Cancion) this.lstCanciones.getSelectedValue();
            this.sm.eliminarCancion(c);//elimino la cancion
        }
        limpiar();
    }//GEN-LAST:event_btnEliminarCActionPerformed

    private void cmbArtistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbArtistasActionPerformed
        
    }//GEN-LAST:event_cmbArtistasActionPerformed

    private void cmbArtistasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbArtistasItemStateChanged
        
        
        
        cmbAlbumes.removeAllItems();
        //lleno el combo box de albumes
        for( Album al : this.sm.getAlbumes()){
            if(al.getArtista() == cmbArtistas.getSelectedItem()){
                this.cmbAlbumes.addItem(al);
            }
        }
        
        //le digo al combo que ningun elemento esteé seleccionado
        this.cmbAlbumes.setSelectedItem(null);
        
    }//GEN-LAST:event_cmbArtistasItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarC;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox cmbAlbumes;
    private javax.swing.JComboBox cmbArtistas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstCanciones;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void limpiar(){
        this.txtNombre.setText("");//limpia
        this.cmbArtistas.setSelectedIndex(-1);
        this.cmbAlbumes.setSelectedIndex(-1);
        SpotifyMisionero.getPersistencia().refrescar(this.sm);//refresca la lista
        
        //cargo la lista de canciones
        this.lstCanciones.setListData(this.sm.getCanciones().toArray());
        this.lstCanciones.clearSelection();
    }
    
}
