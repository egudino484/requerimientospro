/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.modelo.DAOImpl;

import com.requerimientos.requerimientospro.entidades.Cliente;
import com.requerimientos.requerimientospro.entidades.Estado;
import com.requerimientos.requerimientospro.entidades.Orden;
import com.uisrael.proyecto_clases.modelo.DAO.IClienteDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author esanchez
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
    public boolean insertar(Cliente objeto) {
        System.out.println("DAO: " + objeto.toString());
        this.beginTransaction();
        Cliente obj = this.create(objeto);
        System.out.println("DAO after: " + obj.toString());

        this.commit();
        this.closeTransaction();
        return true;
        /*try {
            EntityManagerFactory objFactory = Persistence.createEntityManagerFactory("com.requerimientos_requerimientospro_war_1.0-SNAPSHOTPU");

            EntityManager em = objFactory.createEntityManager();
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
            em.close();
            return true;

        } catch (Exception e) {
            return false;
        }*/

    }

    @Override
    public List<Cliente> findById(int cod) {
        List<Cliente> lista = entityManager.createQuery("SELECT o FROM Cliente o where o.id=" + cod, Cliente.class).getResultList();
        return lista;
    }

    @Override
    public List<Cliente> findAll() {
        List<Cliente> lista = entityManager.createQuery("SELECT o FROM Cliente o", Cliente.class).getResultList();
        return lista;
    }

    @Override
    public boolean eliminar(int code) {
        System.out.println("DAO" + code);
        this.beginTransaction();
        Cliente objEliminar = entityManager.find(Cliente.class, code);
        this.delete(objEliminar);
        this.commit();
        this.closeTransaction();
        return true;
    }

    @Override
    public boolean actualizar(Cliente objeto) {
        System.out.println("DAO" + objeto.toString());
        this.beginTransaction();
        //update object with entity manager 
        this.update(objeto);

        this.commit();
        this.closeTransaction();
        return true;
    }

}
