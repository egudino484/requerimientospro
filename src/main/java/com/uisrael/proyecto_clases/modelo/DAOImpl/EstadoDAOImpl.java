/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.modelo.DAOImpl;

import com.requerimientos.requerimientospro.entidades.Ciudad;
import com.requerimientos.requerimientospro.entidades.Cliente;
import com.requerimientos.requerimientospro.entidades.Estado;
import com.requerimientos.requerimientospro.entidades.Orden;
import com.uisrael.proyecto_clases.modelo.DAO.ICiudadDAO;
import com.uisrael.proyecto_clases.modelo.DAO.IClienteDAO;
import com.uisrael.proyecto_clases.modelo.DAO.IEstadoDAO;
import com.uisrael.proyecto_clases.modelo.DAO.IOrdenDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author esanchez
 */
public class EstadoDAOImpl extends GenericDAOImpl<Estado> implements IEstadoDAO {

    public EstadoDAOImpl() {
    }

    public EstadoDAOImpl(Class<Estado> entityClass) {
        super(entityClass);
    }

    @Override
    public boolean insertar(Estado objeto) {
        System.out.println("DAO" + objeto.toString());
        this.beginTransaction();
        this.create(objeto);
        this.commit();
        this.closeTransaction();
        return true;
    }

    @Override
    public List<Estado> findByid(int cod) {
        List<Estado> lista = entityManager.createQuery("SELECT o FROM Estado o where o.id=" + cod, Estado.class).getResultList();
        return lista;
    }

    @Override
    public List<Estado> findAll() {
        List<Estado> lista = entityManager.createQuery("SELECT o FROM Estado o", Estado.class).getResultList();
        return lista;

    }

    @Override
    public boolean eliminar(int code) {
        System.out.println("DAO" + code);
        this.beginTransaction();
        Estado objEliminar = entityManager.find(Estado.class, code);
        this.delete(objEliminar);
        this.commit();
        this.closeTransaction();
        return true;
    }

    @Override
    public boolean actualizar(Estado objeto) {
        System.out.println("DAO" + objeto.toString());
        this.beginTransaction();
        this.update(objeto);
        this.commit();
        this.closeTransaction();
        return true;
    }

}
