package modelo;

import Persistencia.Persistencia;
import java.util.*;
import javax.persistence.*;

@Entity
public class SpotifyMisionero {
    
    @Id
    private Long id;
    
    private String nombre;
    
    private static Persistencia persistencia;
    
    @OneToMany(mappedBy = "spotifyMisionero")
    private Set<Artista> artistas;
    
    @OneToMany(mappedBy = "spotifyMisionero")
    private Set<Album> albumes;
    
    @OneToMany(mappedBy = "spotifyMisionero")
    private Set<Cancion> canciones;

    public Set<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(Set<Cancion> canciones) {
        this.canciones = canciones;
    }

    public SpotifyMisionero(){
        
    }
    
    public SpotifyMisionero(Long id, String nombre){
        this.id = id;
        this.nombre = nombre;
        
        SpotifyMisionero.persistencia.insertar(this);
    }

    public Set<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(Set<Artista> artistas) {
        this.artistas = artistas;
    }
    
    public Set<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(Set<Album> albumes) {
        this.albumes = albumes;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //inicializador de la persistencia
    static {
        persistencia = new Persistencia();
    }
    
    public static Persistencia getPersistencia() {
        return persistencia;
    }
    
    public void crearArtista(String nombre){
        Artista a = new Artista(nombre, this );
        this.artistas.add(a);//añado al artista creado arriba
        SpotifyMisionero.getPersistencia().insertar(a);//Inserto el artista a la BD
    }
    
    public void modificarArtista(Artista a, String nombre){
        if(a != null){
            a.setNombre(nombre);
            SpotifyMisionero.getPersistencia().modificar(a);
        }
    }
    
    public void eliminarArtista(Artista a){
        if(a != null){
            SpotifyMisionero.getPersistencia().eliminar(a);//eliminar el artista de la BD
        }
    }
    
    
    public void crearAlbum(String nombre, Artista ar){
        Album al = new Album(nombre, ar, this );
        this.albumes.add(al);//añado al artista creado arriba
        SpotifyMisionero.getPersistencia().insertar(al);//Inserto el artista a la BD
        
        ar.agregarAlbum(al);
        SpotifyMisionero.getPersistencia().modificar(ar);
    }
    
    public void modificarAlbum(Album al, String nombre, Artista ar){
        if(al != null){
            al.setNombre(nombre);
            al.setArtista(ar);
            SpotifyMisionero.getPersistencia().modificar(al);
        }
    }
    
    public void eliminarAlbum(Album al){
        if(al != null){
            SpotifyMisionero.getPersistencia().eliminar(al);//eliminar el artista de la BD
        }
    }
    
    
    public void crearCancion(String nombre, Artista ar, Album al){
        Cancion c = new Cancion(nombre, ar, this , al);
        this.canciones.add(c);//añado la cancion creado arriba
        SpotifyMisionero.getPersistencia().insertar(c);//Inserto la cancion a la BD
    }
    
    public void modificarCancion(Cancion c, String nombre, Artista ar, Album al){
        if(c != null){
            c.setNombre(nombre);
            c.setArtista(ar);
            c.setAlbumes(al);
            SpotifyMisionero.getPersistencia().modificar(al);
        }
    }
    
    public void eliminarCancion(Cancion c){
        if(c != null){
            SpotifyMisionero.getPersistencia().eliminar(c);//eliminar el artista de la BD
        }
    }
}
