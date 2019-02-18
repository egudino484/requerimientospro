/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.modelo.DAOImpl;

import com.requerimientos.requerimientospro.entidades.Cliente;
import com.requerimientos.requerimientospro.entidades.Orden;
import com.requerimientos.requerimientospro.entidades.Usuario;
import com.uisrael.proyecto_clases.modelo.DAO.IClienteDAO;
import com.uisrael.proyecto_clases.modelo.DAO.IOrdenDAO;
import com.uisrael.proyecto_clases.modelo.DAO.IUsuarioDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author
 */
public class UsuarioDAOImpl extends GenericDAOImpl<Usuario> implements IUsuarioDAO {

    public UsuarioDAOImpl() {
    }

    public UsuarioDAOImpl(Class<Usuario> entityClass) {
        super(entityClass);
    }

    @Override
    public boolean insertar(Usuario objeto) {
        System.out.println("DAO: " + objeto.toString());
         this.beginTransaction();
        Usuario orden = this.create(objeto);
        System.out.println("DAO after: " + orden.toString());

        this.commit();
        this.closeTransaction();
        return true;
    }

    @Override
    public List<Usuario> findByid(int cod) {
        List<Usuario> lista = entityManager.createQuery("SELECT o FROM Usuario o where o.id=" + cod, Usuario.class).getResultList();
        return lista;
    }

    @Override
    public List<Usuario> findAll() {
        List<Usuario> lista = entityManager.createQuery("SELECT o FROM Usuario o", Usuario.class).getResultList();
        return lista;

    }

    @Override
    public boolean eliminar(Long code) {
        System.out.println("DAO: " + code);
        this.beginTransaction();
        Usuario objEliminar = entityManager.find(Usuario.class, code);
        this.delete(objEliminar);
        this.commit();
        this.closeTransaction();
        return true;
    }

    @Override
    public boolean actualizar(Usuario objeto) {
        System.out.println("DAO" + objeto.toString());
        this.beginTransaction();
        this.update(objeto);
        this.commit();
        this.closeTransaction();
        return true;
    }

}
