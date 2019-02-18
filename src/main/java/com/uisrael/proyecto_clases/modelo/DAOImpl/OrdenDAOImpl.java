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
 * @author
 */
public class OrdenDAOImpl extends GenericDAOImpl<Orden> implements IOrdenDAO {

    public OrdenDAOImpl() {
    }

    public OrdenDAOImpl(Class<Orden> entityClass) {
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
    public boolean insert(Orden objeto) {
        System.out.println("DAO" + objeto.toString());
        this.beginTransaction();
        this.create(objeto);
        this.commit();
        this.closeTransaction();
        return true;
    }

    @Override
    public List<Orden> findByid(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Orden> findByDescripcion(String nombre) {
        List<Orden> lista = entityManager.createQuery("SELECT f FROM Orden ", Orden.class).getResultList();
        return lista;

    }

    @Override
    public boolean delete(int code) {
        System.out.println("DAO" + code);
        this.beginTransaction();
        this.delete(code);
        this.commit();
        this.closeTransaction();
        return true;
    }

    @Override
    public boolean update(Orden objeto) {
        System.out.println("DAO" + objeto.toString());
        this.beginTransaction();
        this.update(objeto);
        this.commit();
        this.closeTransaction();
        return true;
    }

}
