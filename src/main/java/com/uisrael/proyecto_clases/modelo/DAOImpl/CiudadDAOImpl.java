/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.modelo.DAOImpl;

import com.requerimientos.requerimientospro.entidades.Ciudad;
import com.requerimientos.requerimientospro.entidades.Cliente;
import com.requerimientos.requerimientospro.entidades.Orden;
import com.uisrael.proyecto_clases.modelo.DAO.ICiudadDAO;
import com.uisrael.proyecto_clases.modelo.DAO.IClienteDAO;
import com.uisrael.proyecto_clases.modelo.DAO.IOrdenDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author
 */
public class CiudadDAOImpl extends GenericDAOImpl<Ciudad> implements ICiudadDAO {

    public CiudadDAOImpl() {
    }

    public CiudadDAOImpl(Class<Ciudad> entityClass) {
        super(entityClass);
    }

    @Override
    public boolean insertar(Ciudad objeto) {
        System.out.println("DAO" + objeto.toString());
        this.beginTransaction();
        this.create(objeto);
        this.commit();
        this.closeTransaction();
        return true;
    }

    @Override
    public List<Ciudad> findByid(int cod) {
        List<Ciudad> lista = entityManager.createQuery("SELECT o FROM Ciudad o where o.id=" + cod, Ciudad.class).getResultList();
        return lista;
    }

    @Override
    public List<Ciudad> findAll() {
        List<Ciudad> lista = entityManager.createQuery("SELECT o FROM Ciudad o", Ciudad.class).getResultList();
        return lista;

    }

    @Override
    public boolean eliminar(int code) {
        System.out.println("DAO" + code);
        this.beginTransaction();
        Ciudad objEliminar = entityManager.find(Ciudad.class, code);
        this.delete(objEliminar);
        this.commit();
        this.closeTransaction();
        return true;
    }

    @Override
    public boolean actualizar(Ciudad objeto) {
        System.out.println("DAO" + objeto.toString());
        this.beginTransaction();
        this.update(objeto);
        this.commit();
        this.closeTransaction();
        return true;
    }

}
