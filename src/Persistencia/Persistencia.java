package Persistencia;

import javax.persistence.*;

public class Persistencia {
    
    /*Sirve para crear EntityManager*/
    private final EntityManagerFactory emf;
    
    private final EntityManager em;
    
    public Persistencia(){
        this.emf = Persistence.createEntityManagerFactory("Spotify_misioneroPU");
        this.em = emf.createEntityManager();
    }
    
    //Inserta un nuevo objeto en la BD
    public void insertar(Object o){
        this.em.getTransaction().begin();
        this.em.persist(o);
        this.em.getTransaction().commit();
    }
    
    
    public void modificar(Object o){
        this.em.getTransaction().begin();
        this.em.merge(o);
        this.em.getTransaction().commit();
    }
    
    
    public void eliminar(Object o){
        this.em.getTransaction().begin();
        this.em.remove(o);
        this.em.getTransaction().commit();
    }
    
    //recibe un objeto y una clase para buscarlo en la BD
    public Object buscar(Class clase, Object id){
        Object o = em.find(clase, id);//buscae en la BD un objeto puntual y lo guarda en la variable o, y devuelve
        return o;
    }
    
    //le paso un objeto y la persistencia lo busca en la BD  y me trae los valores actuales
    public void refrescar(Object o){
        this.em.refresh(o);
    }
}
