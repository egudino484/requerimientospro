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
 * @author
 */
public class RequerimientoDAOImpl extends GenericDAOImpl<Requerimiento> implements IRequerimientoDAO {

    public RequerimientoDAOImpl() {
    }

    public RequerimientoDAOImpl(Class<Requerimiento> entityClass) {
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
    public boolean delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Requerimiento obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(Requerimiento objeto) {
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
