/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.modelo.DAOImpl;

import com.requerimientos.requerimientospro.entidades.Cliente;
import com.uisrael.proyecto_clases.modelo.DAO.IGenericDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author fernanda
 * @param <T>
 */
public class GenericDAOImpl<T> implements IGenericDAO<T> {

    private Class<T> entityClass;

    protected static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.requerimientos_requerimientospro_war_1.0-SNAPSHOTPU2");
    protected EntityManager entityManager;

    public GenericDAOImpl() {
        entityManager = emf.createEntityManager();
    }

    public GenericDAOImpl(Class<T> entityClass) {
        this.entityClass = entityClass;
        this.entityManager = emf.createEntityManager();
    }

    @Override
    public T create(T t) {

        entityManager.persist(t);
        return t;

    }

    @Override
    public T read(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void beginTransaction() {
        if (!entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().begin();
        }
    }

    @Override
    public void commit() {
        entityManager.getTransaction().commit();
    }

    @Override
    public void rollback() {
        entityManager.getTransaction().rollback();
    }

    @Override
    public void closeTransaction() {
        entityManager.close();
    }

    @Override
    public void commitAndCloseTransaction() {
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void flush() {
        entityManager.flush();
    }

    @Override
    public List<T> findAll() {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
