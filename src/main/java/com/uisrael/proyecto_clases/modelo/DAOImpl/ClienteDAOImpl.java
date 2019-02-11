/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.modelo.DAOImpl;

import com.requerimientos.requerimientospro.entidades.Cliente;
import com.uisrael.proyecto_clases.modelo.DAO.IClienteDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author
 */
public class ClienteDAOImpl extends GenericDAOImpl<Cliente> implements IClienteDAO {

    public ClienteDAOImpl() {
    }

    public ClienteDAOImpl(Class<Cliente> entityClass) {
        super(entityClass);
    }

    /*public void insertCliente(Cliente cliente) {
        System.out.println("DAO"+cliente.toString());
        this.beginTransaction();
        this.create(cliente);
        this.commit();
        this.closeTransaction();
        
    }*/
    @Override
    public boolean insertCliente(Cliente cliente) {
        try {
            EntityManagerFactory objFactory = Persistence.createEntityManagerFactory("com.requerimientos_requerimientospro_war_1.0-SNAPSHOTPU");

            EntityManager em = objFactory.createEntityManager();
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
            em.close();
            return true;

        } catch (Exception e) {
            return false;
        }

    }

    @Override
    public List<Cliente> findClienteid(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> findClientenombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
