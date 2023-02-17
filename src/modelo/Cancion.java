package modelo;

import javax.persistence.*;

@Entity
public class Cancion {
    
    @Id
    @SequenceGenerator(name = "sec_album", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_album")
    private Long id;
    
    private String nombre;
    
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Artista artista;
    
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Album albumes;
    
    @ManyToOne(cascade = CascadeType.REFRESH)
    private SpotifyMisionero spotifyMisionero;
    
    public Cancion(){
        
    }
    
    public Cancion(String nombre, Artista artista, SpotifyMisionero sm, Album album){
        this.nombre = nombre;
        this.artista = artista;
        this.spotifyMisionero = sm;
        this.albumes = album;
    }

    public Album getAlbumes() {
        return albumes;
    }

    public void setAlbumes(Album albumes) {
        this.albumes = albumes;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    
    @Override
    public String toString(){//muestra el nombre en la lista de artistas
        return this.nombre;
    }
}
