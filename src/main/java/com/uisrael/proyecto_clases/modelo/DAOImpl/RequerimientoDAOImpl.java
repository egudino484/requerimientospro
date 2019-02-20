/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.modelo.DAOImpl;

import com.requerimientos.requerimientospro.entidades.Cliente;
import com.requerimientos.requerimientospro.entidades.Orden;
import com.requerimientos.requerimientospro.entidades.Requerimiento;
import com.uisrael.proyecto_clases.modelo.DAO.IClienteDAO;
import com.uisrael.proyecto_clases.modelo.DAO.IOrdenDAO;
import com.uisrael.proyecto_clases.modelo.DAO.IRequerimientoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author esanchez
 */
public class RequerimientoDAOImpl extends GenericDAOImpl<Requerimiento> implements IRequerimientoDAO {

    public RequerimientoDAOImpl() {
    }

    public RequerimientoDAOImpl(Class<Requerimiento> entityClass) {
        super(entityClass);
    }


    @Override
    public boolean eliminar(Long code) {
        System.out.println("DAO" + code);
        this.beginTransaction();
        Requerimiento objEliminar = entityManager.find(Requerimiento.class, code);
        this.delete(objEliminar);
        this.commit();
        this.closeTransaction();
        return true;
    }

    @Override
    public boolean actualizar(Requerimiento objeto) {
        System.out.println("DAO: " + objeto.toString());
        this.beginTransaction();
        //update object with entity manager 
        this.update(objeto);
        this.commit();
        this.closeTransaction();
        return true;
    }

    @Override
    public boolean insertar(Requerimiento objeto) {
        try {

            this.beginTransaction();
            this.create(objeto);
            this.commit();
            this.closeTransaction();
            return true;
        } catch (Exception e) {
            System.err.println("Error al insertar :" + e.getMessage());
            return false;
        }
    }

    @Override
    public List<Requerimiento> findId(int cod) {
        List<Requerimiento> lista = entityManager.createQuery("SELECT o FROM Requerimiento o where o.id=" + cod, Requerimiento.class).getResultList();
        return lista;
    }

    @Override
    public List<Requerimiento> findAll() {

        List<Requerimiento> lista;
        try {
            lista = entityManager.createQuery("SELECT c FROM Requerimiento c", Requerimiento.class).getResultList();
            return lista;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();

        }
    }

}
