package vistas;

import modelo.SpotifyMisionero;

public class FormularioPrincipal extends javax.swing.JFrame {

    private SpotifyMisionero sm = null;
    
    public FormularioPrincipal(SpotifyMisionero sm) {
        this.sm = sm;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnCanciones = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Artistas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        desktopPane.add(jButton1);
        jButton1.setBounds(50, 260, 90, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\ZNOT\\Descargas\\descarga (1).png")); // NOI18N
        desktopPane.add(jLabel1);
        jLabel1.setBounds(90, 20, 220, 210);

        jLabel3.setBackground(new java.awt.Color(0, 255, 0));
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("Spotify Misionero");
        desktopPane.add(jLabel3);
        jLabel3.setBounds(150, 0, 100, 16);

        jLabel2.setText("jLabel2");
        desktopPane.add(jLabel2);
        jLabel2.setBounds(170, 190, 37, 16);

        jButton2.setText("Albumes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        desktopPane.add(jButton2);
        jButton2.setBounds(160, 260, 90, 23);

        btnCanciones.setText("Canciones");
        btnCanciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancionesActionPerformed(evt);
            }
        });
        desktopPane.add(btnCanciones);
        btnCanciones.setBounds(270, 260, 100, 23);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        FormularioArtistas artista = new FormularioArtistas(sm);
        artista.setVisible(true);
        artista.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FormularioAlbumes formAlbumes = new FormularioAlbumes(sm);
        formAlbumes.setVisible(true);
        formAlbumes.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCancionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancionesActionPerformed
                                            
        FormularioCanciones formCanciones = new FormularioCanciones(sm);
        formCanciones.setVisible(true);
        formCanciones.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCancionesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCanciones;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
