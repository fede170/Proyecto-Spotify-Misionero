package modelo;

import java.util.*;
import javax.persistence.*;

@Entity
public class Album {
    
    @Id
    @SequenceGenerator(name = "sec_album", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_album")
    private Long id;
    
    private String nombre;
    
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Artista artista;
    
    @ManyToOne(cascade = CascadeType.REFRESH)
    private SpotifyMisionero spotifyMisionero;
    
    
    @OneToMany(mappedBy = "albumes")
    private Set<Cancion> canciones;

    public Set<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(Set<Cancion> canciones) {
        this.canciones = canciones;
    }
    
    public Album(){
        
    }
    
    public Album(String nombre, Artista artista, SpotifyMisionero sm){
        this.nombre = nombre;
        this.artista = artista;
        this.spotifyMisionero = sm;
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
