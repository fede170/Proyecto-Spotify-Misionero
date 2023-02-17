package modelo;

import java.util.*;
import javax.persistence.*;

@Entity
public class Artista {
    
    @Id
    @SequenceGenerator(name = "sec_artista", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_artista")
    private Long id;
    
    private String nombre;
    
    @ManyToOne(cascade = CascadeType.REFRESH)
    private SpotifyMisionero spotifyMisionero;
    
    @OneToMany(mappedBy = "artista")
    private Set<Album> albumes;
    
    @OneToMany(mappedBy = "artista")
    private Set<Cancion> canciones;
    
    public Artista(){
        
    }

    public Set<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(Set<Cancion> canciones) {
        this.canciones = canciones;
    }
    
    public Artista(String nombre, SpotifyMisionero sm){
        this.nombre = nombre;
        this.spotifyMisionero = sm;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public Set<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(Set<Album> albumes) {
        this.albumes = albumes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarAlbum(Album al) {
        this.albumes.add(al);
    }
    
    @Override
    public String toString(){//muestra el nombre en la lista de artistas
        return this.nombre;
    }
}
