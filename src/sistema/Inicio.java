package sistema;

import modelo.SpotifyMisionero;
import vistas.FormularioPrincipal;

public class Inicio {
    
    public static void main(String[] args) {
        
        SpotifyMisionero sm = (SpotifyMisionero) SpotifyMisionero.getPersistencia().buscar(SpotifyMisionero.class, 1L);
        
        if(sm == null){
            sm = new SpotifyMisionero(1L, "Spotify_misionero");
        }
        
        FormularioPrincipal ventana = new FormularioPrincipal(sm);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);//muestra en el centro de la pantalla la ventana
    }
}
