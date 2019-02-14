/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.requerimientos.requerimientospro.entidades.Estado;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Eddy
 */
@Named(value = "clienteManagedBean")
@Dependent
public class ClienteManagedBean {

    /**
     * Creates a new instance of ClienteManagedBean
     */
    public ClienteManagedBean() {
    }
    
    public String nombre(){
    return "juan";
    }
    public String ejecutardb(){
    try{
        
        return "iniciobien: "+ conectar();
    }catch(Exception e){
        
        return "fallo: "+e.getMessage();
    }
        
    
    }
    
        public static String conectar() {
        EntityManagerFactory objFactory = Persistence.createEntityManagerFactory("com.requerimientos_requerimientospro_war_1.0-SNAPSHOTPU2");
        EntityManager em = objFactory.createEntityManager();

        Estado classtypeItem = new Estado();
        //  classtypeItem.setId(1l);
        classtypeItem.setDescripcion("inactivo4");
        System.out.println("despues de crear entity");

        em.getTransaction().begin();
        em.persist(classtypeItem);

        em.getTransaction().commit();
        // em.flush();
        System.out.println("ENTIDAD: " + classtypeItem.toString());
        em.close();
        return "succes: " + classtypeItem.toString();

    }
}
