/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.modelo.DAOImpl;

import com.requerimientos.requerimientospro.entidades.Cliente;
import com.requerimientos.requerimientospro.entidades.Orden;
import com.uisrael.proyecto_clases.modelo.DAO.IClienteDAO;
import com.uisrael.proyecto_clases.modelo.DAO.IOrdenDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author esanchez
 */
public class OrdenDAOImpl extends GenericDAOImpl<Orden> implements IOrdenDAO {

    public OrdenDAOImpl() {
    }

    public OrdenDAOImpl(Class<Orden> entityClass) {
        super(entityClass);
    }

    @Override
    public boolean insertar(Orden objeto) {
        System.out.println("DAO: " + objeto.toString());
         this.beginTransaction();
        Orden orden = this.create(objeto);
        System.out.println("DAO after: " + orden.toString());

        this.commit();
        this.closeTransaction();
        return true;
    }

    @Override
    public List<Orden> findByid(int cod) {
        List<Orden> lista = entityManager.createQuery("SELECT o FROM Orden o where o.id=" + cod, Orden.class).getResultList();
        return lista;
    }

    @Override
    public List<Orden> findAll() {
        List<Orden> lista = entityManager.createQuery("SELECT o FROM Orden o", Orden.class).getResultList();
        return lista;

    }

    @Override
    public boolean eliminar(Long code) {
        System.out.println("DAO: " + code);
        this.beginTransaction();
        Orden objEliminar = entityManager.find(Orden.class, code);
        this.delete(objEliminar);
        this.commit();
        this.closeTransaction();
        return true;
    }

    @Override
    public boolean actualizar(Orden objeto) {
        System.out.println("DAO" + objeto.toString());
        this.beginTransaction();
        this.update(objeto);
        this.commit();
        this.closeTransaction();
        return true;
    }

}
